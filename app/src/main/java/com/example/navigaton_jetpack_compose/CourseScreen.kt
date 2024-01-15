package com.example.navigaton_jetpack_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun CourseScreen(modifier: Modifier, navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()){

        
        Text(text = "This is Course Screem ", color = Color.DarkGray)

        Spacer(modifier = Modifier.size(20.dp))

        Button(onClick = {
            navController.navigate("CourseDetail")
        }) {
            Text(text = "go to the course  detail screen ")
        }
        Button(onClick = {
            navController.navigate("HomeScreen")
        }) {
            Text(text = "go to the course  home screen ")
        }
        
    }
}

