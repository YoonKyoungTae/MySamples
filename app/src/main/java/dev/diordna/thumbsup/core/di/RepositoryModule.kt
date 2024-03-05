package dev.diordna.thumbsup.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.diordna.thumbsup.data.photo.PhotoRepository
import dev.diordna.thumbsup.data.photo.PhotoRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun providePhotoRepository(): PhotoRepository {
        return PhotoRepositoryImpl()
    }

}