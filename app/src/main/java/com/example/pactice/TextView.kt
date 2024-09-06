package com.example.pactice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Textview() {
    var out by remember { mutableStateOf("Press a button") }
    var textFieldColor by remember { mutableStateOf(Color.White) }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    out = "Red button has clicked"
                    textFieldColor = Color.Red
                },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.size( height = 50.dp, width = 100.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "Red",fontSize = 16.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.padding(horizontal = 16.dp))
            Button(
                onClick = {
                    out = "Green button has clicked"
                    textFieldColor = Color.Green      },
                colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier.size( height = 50.dp, width = 100.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "Green",fontSize = 16.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(
            value = out,
            onValueChange = {},
            shape = RoundedCornerShape(16.dp),
            readOnly = true,
            modifier = Modifier.background(textFieldColor, RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            onClick = {
                out = "Press a button"
                textFieldColor = Color.White
            },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier.size( height = 50.dp, width = 100.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Clean",fontSize = 16.sp, color = Color.White)
        }
    }
}