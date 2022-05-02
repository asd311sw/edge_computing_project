package com.example.project_cobuy.presentation.profile

sealed class ProfileState {

    object Uninitialized:ProfileState()

    object Loading:ProfileState()

    data class Success(
        val a:Int
    ):ProfileState()

    object Error:ProfileState()

}