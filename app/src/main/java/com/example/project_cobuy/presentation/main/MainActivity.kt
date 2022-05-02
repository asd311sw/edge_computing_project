package com.example.project_cobuy.presentation.main

import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.project_cobuy.R
import com.example.project_cobuy.databinding.ActivityMainBinding
import com.example.project_cobuy.presentation.BaseActivity
import org.koin.android.ext.android.inject

internal class MainActivity : BaseActivity<MainViewModel,ActivityMainBinding>() {

    override val viewModel: MainViewModel by inject()

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)


    private lateinit var navController:NavController
    private lateinit var appBarConfiguration:AppBarConfiguration

    override fun observeData() {


        viewModel._mainstate.observe(this) {

            when (it) {
                is MainState.UnInitalized -> {

                    initViews()

                    bindViews()
                }


                is MainState.Loading -> {

                }

                is MainState.Success -> {


                }


                is MainState.Error -> {


                }
            }
        }
    }



    private fun initViews() {


        setSupportActionBar(binding.toolBar)
        navController = binding.fragmentContainerView.findNavController()
        binding.bottomNavigationView.setupWithNavController(navController)

        binding.bottomNavigationView.menu.getItem(0).setChecked(true)
        binding.bottomNavigationView.itemIconTintList = null

    }


    private fun bindViews(){



    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }



}