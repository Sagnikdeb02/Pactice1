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
import com.example.pactice.ui.theme.PacticeTheme
import com.example.pactice.ui.theme.SwitchView

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
                        startDestination = "login"
                    ) {
                        composable("login"){ LoginPage(navController)}
                        composable("home") { HomePage(navController) }
                        composable("imageView") { Imageview() }
                        composable("textView") { Textview() }
                        composable("checkbox"){ CheckboxView() }
                        composable("radiobutton"){ RadioButtonView() }
                        composable("ratingbar") { RatingBarView() }
                        composable("seekbar") { SeekBarView() }
                        composable("switch") { SwitchView() }
                        composable("custom") { CustomListView() }
                        composable("expandable") { ExpandableListView() }
                    }
                }
            }
        }
    }
}




