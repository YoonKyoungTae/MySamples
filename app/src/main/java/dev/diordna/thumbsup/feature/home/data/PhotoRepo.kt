package dev.diordna.thumbsup.feature.home.data

import dev.diordna.thumbsup.core.api.RetrofitProvider
import dev.diordna.thumbsup.feature.home.data.model.Photo

object PhotoRepo {

    suspend fun getPhotoList(): ArrayList<Photo>? {
        val response = RetrofitProvider.api.getPhotos()

        if (response.isSuccessful) {
            response.body()?.let {
                it.forEach { photo ->
                    photo.thumbnailUrl = "https://cdn.pixabay.com/photo/2021/01/24/19/05/crane-5946169_1280.jpg"
                }
                return it
            }
        }

        return response.body()
    }
}