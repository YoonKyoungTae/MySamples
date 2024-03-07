package dev.diordna.thumbsup.core.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.diordna.thumbsup.data.photo.PhotoRepository
import dev.diordna.thumbsup.data.photo.PhotoRepositoryImpl
import dev.diordna.thumbsup.data.user.UserRepository
import dev.diordna.thumbsup.data.user.UserRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

//    @Provides
//    fun providePhotoRepository(): PhotoRepository {
//        return PhotoRepositoryImpl(PhotoRemoteDataSource(Api()))
//    }

    @Binds
    @Singleton
    abstract fun bindPhotoRepository(repo: PhotoRepositoryImpl): PhotoRepository

    @Binds
    @Singleton
    abstract fun bindUserRepository(repo: UserRepositoryImpl): UserRepository


}