package com.eman.domain.repo

import com.eman.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote(): CategoryResponse
}