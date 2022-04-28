package com.example.project_cobuy.presentation.main

import com.example.project_cobuy.data.entity.PriceEntity

sealed class MainState {

    object UnInitalized:MainState()

    object Loading:MainState()



    data class Success(
        val priceList:List<PriceEntity>?
    ):MainState()


    object Error:MainState()



}
