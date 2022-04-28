package com.example.project_cobuy.data.repository.price

import com.example.project_cobuy.data.entity.PriceEntity

interface PriceRepository {


    suspend fun getPriceList(searchKeyword:String,centerLat:Double,centerLon:Double): List<PriceEntity>?

    suspend fun getLocalPriceList(): List<PriceEntity>

    suspend fun insertPriceItem(PriceItem: PriceEntity): Long

    suspend fun insertPriceList(PriceList: List<PriceEntity>)

    suspend fun updatePriceItem(PriceItem: PriceEntity)

    suspend fun getPriceItem(itemId: Long): PriceEntity?

    suspend fun deleteAll()

    suspend fun deletePriceItem(id: Long)

}