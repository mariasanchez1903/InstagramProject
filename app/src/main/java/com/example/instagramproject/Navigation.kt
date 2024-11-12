package com.example.instagramproject

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.instagramproject.home.HomeScreen
import com.example.instagramproject.profile.ProfileScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "profile") {
        composable("profile") {
            ProfileScreen(navController = navController)
        }
        composable("home") {
            HomeScreen()
        }
    }
}