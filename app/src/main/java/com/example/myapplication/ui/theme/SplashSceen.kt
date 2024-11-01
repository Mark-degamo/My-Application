package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.Routes

@Composable
fun SplashScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Welcome to",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Image(painter = painterResource(id = R.drawable.a), contentDescription = "SplashScreen image",
            modifier = Modifier.size(300.dp))


        Text(text = "Rent Motorcycle that suites your need",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(Routes.homescreen)
        }) {
            Text(text = "Get Started")
        }
    }
}