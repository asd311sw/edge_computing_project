package com.example.project_cobuy.presentation.profile

import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.viewbinding.ViewBinding
import com.example.project_cobuy.databinding.FragmentProfileBinding
import com.example.project_cobuy.presentation.BaseFragment
import com.example.project_cobuy.presentation.BaseViewModel
import org.koin.android.ext.android.inject

internal class ProfileFragment : BaseFragment<ProfileViewModel, FragmentProfileBinding>() {

    override val viewModel: ProfileViewModel by inject()
    override fun getViewBinding(): FragmentProfileBinding =
        FragmentProfileBinding.inflate(layoutInflater)

    override fun observeData() {
        viewModel._profileState.observe(this) {

            when (it) {
                is ProfileState.Uninitialized -> {

                    initViews()
                    bindViews()

                }

                is ProfileState.Loading -> {


                }


                is ProfileState.Success -> {


                }


                is ProfileState.Error -> {

                }


            }

        }


    }


    private fun initViews() {


    }


    private fun bindViews() {


    }


}