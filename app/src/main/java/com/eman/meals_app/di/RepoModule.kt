package com.eman.meals_app.di

import com.eman.data.remote.ApiService
import com.eman.data.repo.MealsRepoImpl
import com.eman.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideMealsRepo(apiService: ApiService):MealsRepo{
        return MealsRepoImpl(apiService)
    }
}