package com.chocolate.dountsapp.navigation

sealed class DonutsScreen(val route: String) {
    object OnBoardingScreen : DonutsScreen("OnBoardingScreen")
    object HomeScreen : DonutsScreen("HomeScreen")
    object DetailsScreen : DonutsScreen("DetailsScreen")
}