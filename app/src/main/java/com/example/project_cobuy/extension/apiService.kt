package com.example.project_cobuy.extension

import androidx.viewbinding.BuildConfig
import com.example.project_cobuy.data.service.LowestPriceService
import com.example.project_cobuy.data.service.Url
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun getPriceApiService() = Retrofit.Builder()
    .baseUrl(Url.TMAP_BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .client(buildOkHttpClient())
    .build()
    .create(LowestPriceService::class.java)


fun buildOkHttpClient(): OkHttpClient {


    return OkHttpClient.Builder()
        .addInterceptor(
            HttpLoggingInterceptor().apply {
                level = if(BuildConfig.DEBUG)
                    HttpLoggingInterceptor.Level.BODY
                else
                    HttpLoggingInterceptor.Level.NONE
            }
        ).build()


}