package dev.diordna.thumbsup.core.api

import dev.diordna.thumbsup.feature.home.data.model.Photo
import retrofit2.Response
import retrofit2.http.GET

interface APIs {

    @GET("photos")
    suspend fun getPhotos(): Response<ArrayList<Photo>>

}