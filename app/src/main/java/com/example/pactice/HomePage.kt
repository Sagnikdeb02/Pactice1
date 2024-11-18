package com.example.pactice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomePage(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    navController.navigate("textView")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "Text View",fontSize = 16.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Button(
                onClick = {
                    navController.navigate("imageView")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "Image View",fontSize = 16.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    navController.navigate("checkbox")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "CheckBox",fontSize = 16.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Button(
                onClick = {
                    navController.navigate("radiobutton")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "RadioButton",fontSize = 16.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    navController.navigate("ratingbar")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "RatingBar",fontSize = 16.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Button(
                onClick = {
                    navController.navigate("seekbar")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "SeekBarView",fontSize = 16.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    navController.navigate("custom")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "CustomList",fontSize = 16.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Button(
                onClick = {
                    navController.navigate("expandable")
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.height(50.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "Expandable",fontSize = 16.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            onClick = {
                navController.navigate("switch")
            },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.height(50.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "SwitchView",fontSize = 16.sp, color = Color.White)
        }
    }
}

