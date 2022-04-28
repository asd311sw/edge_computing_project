package com.example.project_cobuy.presentation.main

import com.example.project_cobuy.databinding.ActivityMainBinding
import com.example.project_cobuy.presentation.BaseActivity
import org.koin.android.ext.android.inject

internal class MainActivity : BaseActivity<MainViewModel,ActivityMainBinding>() {

    override val viewModel: MainViewModel by inject()

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)


    override fun observeData() {


        when(viewModel._mainstate.value){
            is MainState.UnInitalized -> {

            }


            is MainState.Loading -> {

            }

            is MainState.Success -> {


            }


            is MainState.Error -> {


            }
        }
    }



    private fun initViews(){


    }



    private fun bindViews(){



    }






}