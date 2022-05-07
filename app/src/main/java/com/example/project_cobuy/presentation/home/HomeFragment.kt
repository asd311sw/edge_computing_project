package com.example.project_cobuy.presentation.home

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
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
                ProductEntity(3,"디지털/가전","무선이어폰","10000원")
            )


            binding.viewPager.adapter = viewPagerAdapter


            viewPagerAdapter.submitList(productList)
            viewPagerAdapter.notifyDataSetChanged()

        }


        private fun bindViews(){

            binding.cancelButton.setOnClickListener {

                binding.searchEditText.setText("")
            }



            binding.searchEditText.addTextChangedListener {



                it?.let {

                    if(it.length == 0)
                        binding.cancelButton.isVisible = false
                    else
                        binding.cancelButton.isVisible = true

                }
            }

            binding.searchEditText.setOnEditorActionListener { textView, i, keyEvent ->
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    binding.searchEditText.let {



                        val inputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                        inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
                        it.clearFocus()

                    }

                }


                return@setOnEditorActionListener true
            }


        }



}