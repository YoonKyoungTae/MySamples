package dev.diordna.thumbsup.data.photo

import dev.diordna.thumbsup.core.api.Api
import dev.diordna.thumbsup.data.photo.model.PhotoApiModel
import javax.inject.Inject

class PhotoRemoteDataSource @Inject constructor(
    private val api: Api
) {

    suspend fun getPhotoList(): ArrayList<PhotoApiModel> {
        val response = api.getPhotoApi().getPhotos()

        if (response.isSuccessful) {
            response.body()?.let {
                it.forEach { photo ->
                    photo.thumbnailUrl = "https://cdn.pixabay.com/photo/2021/01/24/19/05/crane-5946169_1280.jpg"
                }
                return it
            }
        }

        return response.body()!!

    }

}