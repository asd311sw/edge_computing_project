package com.example.project_cobuy.presentation.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.project_cobuy.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class ProfileViewModel:BaseViewModel() {


    val _profileState = MutableLiveData<ProfileState>(ProfileState.Uninitialized)

    private val prfileState: LiveData<ProfileState> = _profileState



    override fun fetchData(): Job = viewModelScope.launch{



    }



    fun setState(state:ProfileState){

        _profileState.postValue(state)

    }



}