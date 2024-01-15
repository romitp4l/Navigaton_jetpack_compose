package com.example.navigaton_jetpack_compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeScreen" ){
        composable(route ="HomeScreen"){
            HomeScreen(modifier = Modifier , navController)
        }


        composable(route ="CourseScreen"){
            CourseScreen(modifier = Modifier , navController)
        }


        composable(route="CourseDetail"){
            CourseDetail(modifier = Modifier, navController)
        }
    }
}