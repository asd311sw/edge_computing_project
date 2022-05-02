package com.example.project_cobuy.data.repository.price

import com.example.project_cobuy.data.entity.PriceEntity
import com.example.project_cobuy.data.service.LowestPriceService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class LowestPriceRepository(
    val ioDispatcher: CoroutineDispatcher,
    val getPriceApiService:LowestPriceService
):PriceRepository {
    override suspend fun getPriceList(
        searchKeyword: String,
        centerLat: Double,
        centerLon: Double
    ): List<PriceEntity>? = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }

    override suspend fun getLocalPriceList(): List<PriceEntity> = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }

    override suspend fun insertPriceItem(PriceItem: PriceEntity): Long = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }

    override suspend fun insertPriceList(PriceList: List<PriceEntity>) = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }

    override suspend fun updatePriceItem(PriceItem: PriceEntity) = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }

    override suspend fun getPriceItem(itemId: Long): PriceEntity? = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }

    override suspend fun deleteAll() = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }

    override suspend fun deletePriceItem(id: Long) = withContext(ioDispatcher){
        TODO("Not yet implemented")
    }


}