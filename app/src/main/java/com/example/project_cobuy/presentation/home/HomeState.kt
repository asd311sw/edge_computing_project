package com.example.project_cobuy.presentation.home

import com.example.project_cobuy.data.entity.PriceEntity

sealed class HomeState {

    object UnInitalized:HomeState()

    object Loading:HomeState()



    data class Success(
        val priceList:List<PriceEntity>?
    ):HomeState()


    object Error:HomeState()



}