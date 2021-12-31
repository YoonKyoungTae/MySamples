package dev.androidblog.mysamples.api

import dev.androidblog.mysamples.data.model.Photo
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface APIs {

    @GET("photos")
    suspend fun getPhotos(): Response<ArrayList<Photo>>

}