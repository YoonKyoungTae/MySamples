package dev.diordna.thumbsup.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.diordna.thumbsup.core.api.Api
import dev.diordna.thumbsup.data.photo.PhotoRemoteDataSource
import dev.diordna.thumbsup.data.photo.PhotoRepository
import dev.diordna.thumbsup.data.photo.PhotoRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun providePhotoRepository(): PhotoRepository {
        return PhotoRepositoryImpl(PhotoRemoteDataSource(Api()))
    }

//    @Provides
//    fun providePhotoRemoteDataSource(): PhotoRemoteDataSource {
//        return PhotoRemoteDataSource()
//    }


}