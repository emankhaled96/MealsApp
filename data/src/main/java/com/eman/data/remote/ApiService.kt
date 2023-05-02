package com.eman.data.remote

import com.eman.domain.entity.CategoryResponse
import retrofit2.http.GET


interface ApiService {
    @GET("categories.php")
    fun getMeals(): CategoryResponse
}