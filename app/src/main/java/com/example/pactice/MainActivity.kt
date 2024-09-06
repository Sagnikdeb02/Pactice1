package com.example.pactice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pactice.ui.theme.Imageview
import com.example.pactice.ui.theme.PacticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PacticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    Spacer(modifier = Modifier.padding(innerPadding))

                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable("home") { HomePage(navController) }
                        composable("imageView") { Imageview() }
                        composable("textView") { Textview() }
                    }
                }
            }
        }
    }
}




