package com.example.project_cobuy.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.Job

internal abstract class BaseFragment<VM:BaseViewModel,VB : ViewBinding>: Fragment() {

    abstract val viewModel:VM
    abstract fun getViewBinding():VB
    protected lateinit var binding:VB
    private lateinit var fetchJob:Job


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding()

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        fetchJob = viewModel.fetchData()

        observeData()
    }


    abstract fun observeData()


    override fun onDestroyView() {
        super.onDestroyView()


        if (fetchJob.isActive == true)
            fetchJob.cancel()

        super.onDestroy()
    }




}