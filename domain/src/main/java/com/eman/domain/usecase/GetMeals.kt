package com.eman.domain.usecase

import com.eman.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}