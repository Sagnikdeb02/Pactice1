package com.example.pactice.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import com.example.pactice.SeekBarView

@Composable
fun SwitchView(){
    var switch by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .background(if(switch) Color.White else Color.Black)
            .fillMaxSize()
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Night Mode",
            fontSize = 26.sp,
            color = if(switch) Color.Black else Color.White
        )
        Spacer(modifier = Modifier.padding(8.dp))

        Switch(
            checked = switch,
            onCheckedChange = {switch = it},
            colors = SwitchDefaults.colors(
                uncheckedBorderColor = Color.Black,
                checkedBorderColor = Color.Black,
                uncheckedThumbColor = Color.Black,
                checkedThumbColor = Color.LightGray,
                checkedTrackColor = Color.Black,
                uncheckedTrackColor = Color.White

            )
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    PacticeTheme {
        SwitchView()
    }
}