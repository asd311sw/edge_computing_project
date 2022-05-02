package com.example.project_cobuy.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ProductEntity(
    var id:Int,
    var category:String,
    var name:String,
    var price:String
):Parcelable
