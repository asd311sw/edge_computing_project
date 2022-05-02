package com.example.project_cobuy.presentation.home

import com.example.project_cobuy.data.entity.ProductEntity
import com.example.project_cobuy.databinding.FragmentHomeBinding
import com.example.project_cobuy.presentation.BaseFragment
import org.koin.android.ext.android.inject

internal class HomeFragment: BaseFragment<HomeViewModel,FragmentHomeBinding>(){

    override val viewModel: HomeViewModel by inject()

    private val viewPagerAdapter = HomeAdatper(){}



    override fun getViewBinding() = FragmentHomeBinding.inflate(layoutInflater)



    override fun observeData() {
        viewModel._homeState.observe(this) {
            when (it) {
                is HomeState.UnInitalized -> {

                    initViews()
                    bindViews()

                }

                is HomeState.Loading -> {

                }

                is HomeState.Success -> {

                }

                is HomeState.Error -> {


                }
            }
        }


    }


    private fun initViews(){


        val productList = listOf(
            ProductEntity(1,"음료","제로콜라","6000원"),
            ProductEntity(2,"식품","목살 10kg","8000원"),
            ProductEntity(3,"디지털/가전","무선이어폰","10000원"),
        )


        binding.viewPager.adapter = viewPagerAdapter


        viewPagerAdapter.submitList(productList)
        viewPagerAdapter.notifyDataSetChanged()

    }




    private fun bindViews(){


    }



}