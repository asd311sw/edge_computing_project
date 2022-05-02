package com.example.project_cobuy.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_cobuy.data.repository.price.LowestPriceRepository
import com.example.project_cobuy.presentation.BaseViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class MainViewModel:BaseViewModel() {


    val _mainstate = MutableLiveData<MainState>(MainState.UnInitalized)
    private val mainState: LiveData<MainState> = _mainstate

    override fun fetchData():Job = viewModelScope.launch{




    }



    fun setState(state: MainState) {

        _mainstate.postValue(state)

    }


}