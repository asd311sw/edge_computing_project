package com.example.project_cobuy.presentation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.Job

internal abstract class BaseActivity<VM:BaseViewModel,VB: ViewBinding>:AppCompatActivity() {

    abstract val viewModel:VM

    abstract fun getViewBinding():VB

    protected lateinit var binding:VB

    private lateinit var fetchJob: Job


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = getViewBinding()
        setContentView(binding.root)


        fetchJob = viewModel.fetchData()


        observeData()

    }

    abstract fun observeData()

    override fun onDestroy() {

        if(fetchJob.isActive)
            fetchJob.cancel()

        super.onDestroy()
    }


}