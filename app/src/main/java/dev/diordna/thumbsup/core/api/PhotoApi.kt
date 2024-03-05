package dev.diordna.thumbsup.core.api

import dev.diordna.thumbsup.data.photo.model.PhotoApiModel
import retrofit2.Response
import retrofit2.http.GET

interface PhotoApi {

    @GET("photos")
    suspend fun getPhotos(): Response<ArrayList<PhotoApiModel>>

}