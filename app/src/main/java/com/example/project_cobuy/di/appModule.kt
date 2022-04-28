package com.example.project_cobuy.di

import com.example.project_cobuy.data.repository.price.LowestPriceRepository
import com.example.project_cobuy.presentation.BaseViewModel
import com.example.project_cobuy.presentation.main.MainViewModel
import org.koin.androidx.compose.get
import org.koin.androidx.compose.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.scope.get
import org.koin.dsl.module

internal val appModule = module {


   viewModel { MainViewModel(get()) }

   single { LowestPriceRepository() }



}




