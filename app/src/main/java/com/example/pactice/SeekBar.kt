package com.example.pactice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pactice.ui.theme.PacticeTheme

@Composable
fun SeekBarView(){
    var sliderValue by remember {
        mutableFloatStateOf(40f)
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Volume ${sliderValue.toInt()}", fontSize = 26.sp, color = if(sliderValue<=40) Color.Green else if(sliderValue<=70) Color.Yellow else if(sliderValue<=90) Color(0xFFFF9800) else Color.Red)
        Spacer(modifier = Modifier.padding(16.dp))
        
        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            valueRange = 0f..100f,
            colors = SliderDefaults.colors(
                thumbColor = Color(0xFF043BE1),
                activeTrackColor = if(sliderValue<=40) Color.Green else if(sliderValue<=70) Color.Yellow else if(sliderValue<=90) Color(0xFFFF9800) else Color.Red,
                inactiveTickColor = Color.Gray
            )
        )
    }
}

