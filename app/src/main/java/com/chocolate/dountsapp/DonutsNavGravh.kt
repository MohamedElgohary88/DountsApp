package com.chocolate.dountsapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chocolate.dountsapp.navigation.DonutsScreen
import com.chocolate.dountsapp.screens.details.DetailsScreen
import com.chocolate.dountsapp.screens.home.HomeScreen
import com.chocolate.dountsapp.screens.on_boarding.OnBoardingScreen

@Composable
fun DonutsApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = DonutsScreen.OnBoardingScreen.route) {
        composable(DonutsScreen.OnBoardingScreen.route) { OnBoardingScreen(navController) }
        composable(DonutsScreen.HomeScreen.route) { HomeScreen(navController) }
        composable(DonutsScreen.DetailsScreen.route) { DetailsScreen(/*navController*/) }
    }
}