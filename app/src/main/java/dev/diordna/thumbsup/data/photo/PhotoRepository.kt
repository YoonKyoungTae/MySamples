package dev.diordna.thumbsup.data.photo

import dev.diordna.thumbsup.data.photo.model.PhotoApiModel

interface PhotoRepository {

    suspend fun fetchPhotoList(): ArrayList<PhotoApiModel>

}