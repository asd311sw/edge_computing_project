package com.example.project_cobuy.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.project_cobuy.data.repository.price.LowestPriceRepository
import com.example.project_cobuy.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class HomeViewModel:BaseViewModel() {


    val _homeState = MutableLiveData<HomeState>(HomeState.UnInitalized)
    private val homeState: LiveData<HomeState> = _homeState

    override fun fetchData():Job = viewModelScope.launch {



    }



    fun setState(state:HomeState){

        _homeState.postValue(state)
    }


}