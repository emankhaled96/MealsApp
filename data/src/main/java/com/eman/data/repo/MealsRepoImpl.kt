package com.eman.data.repo

import com.eman.data.remote.ApiService
import com.eman.domain.entity.CategoryResponse
import com.eman.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()

}