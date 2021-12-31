package dev.androidblog.mysamples.data

import dev.androidblog.mysamples.api.RetrofitProvider
import dev.androidblog.mysamples.data.model.Photo

object PhotoRepo {

    suspend fun getPhotoList(): ArrayList<Photo>? {
        val response = RetrofitProvider.api.getPhotos()

        if (response.isSuccessful) {
            response.body()?.let {
                return it
            }
        }

        return response.body()
    }
}