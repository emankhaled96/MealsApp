package com.eman.meals_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.eman.meals_app.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val mealsViewModel:MealsViewModel by viewModels()
   private val mealsAdapter : MealsAdapter = MealsAdapter()
  private lateinit var mealsBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mealsBinding = ActivityMainBinding.inflate(layoutInflater)
        mealsViewModel.getMeals()
        lifecycleScope.launch {
        mealsViewModel.categories.collect {
            mealsAdapter.submitList(it?.categories)
            mealsBinding.categoryRv.adapter = mealsAdapter
        }
        }
    }
}