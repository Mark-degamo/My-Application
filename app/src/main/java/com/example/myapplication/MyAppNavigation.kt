package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.SplashScreen

@Composable
fun MyAppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.splashscreen, builder = {
        composable(Routes.splashscreen,){
            SplashScreen(navController)
        }
        composable(Routes.homescreen,){
            HomeScreen()
        }
    })
}