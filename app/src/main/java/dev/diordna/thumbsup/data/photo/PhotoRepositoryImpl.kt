package dev.diordna.thumbsup.data.photo

import dev.diordna.thumbsup.data.photo.model.PhotoApiModel
import javax.inject.Inject

class PhotoRepositoryImpl @Inject constructor(
    private val photoRemoteDataSource: PhotoRemoteDataSource
)  : PhotoRepository {

    override suspend fun fetchPhotoList(): ArrayList<PhotoApiModel> {
        return photoRemoteDataSource.getPhotoList()
    }
}