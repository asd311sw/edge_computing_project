package com.example.project_cobuy.data.repository.price

import com.example.project_cobuy.data.entity.PriceEntity

class LowestPriceRepository:PriceRepository {
    override suspend fun getPriceList(
        searchKeyword: String,
        centerLat: Double,
        centerLon: Double
    ): List<PriceEntity>? {
        TODO("Not yet implemented")
    }

    override suspend fun getLocalPriceList(): List<PriceEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun insertPriceItem(PriceItem: PriceEntity): Long {
        TODO("Not yet implemented")
    }

    override suspend fun insertPriceList(PriceList: List<PriceEntity>) {
        TODO("Not yet implemented")
    }

    override suspend fun updatePriceItem(PriceItem: PriceEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun getPriceItem(itemId: Long): PriceEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAll() {
        TODO("Not yet implemented")
    }

    override suspend fun deletePriceItem(id: Long) {
        TODO("Not yet implemented")
    }


}