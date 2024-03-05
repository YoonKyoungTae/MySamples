package dev.diordna.thumbsup.core.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {

    private val okHttpClient = OkHttpClient.Builder()

    private val retrofit: Retrofit = Retrofit.Builder()
            .client(okHttpClient.build())
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getPhotoApi(): PhotoApi {
        return retrofit.create(PhotoApi::class.java)
    }

//    val api: APIs = retrofit.create(APIs::class.java)

}