package com.eman.meals_app.di

import com.eman.domain.repo.MealsRepo
import com.eman.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo):GetMeals{
        return GetMeals(mealsRepo)
    }
}