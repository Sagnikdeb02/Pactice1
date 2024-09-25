package com.example.pactice

import android.widget.RatingBar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pactice.ui.theme.PacticeTheme

@Composable
fun RatingBarView(){
    var currentRating by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Your rating", fontSize = 26.sp)
        Spacer(modifier = Modifier.padding(8.dp))

        Row {
            for(i in 1..5){
                Icon(
                    painter = painterResource(id = if(i <= currentRating) R.drawable.img else R.drawable.img_1),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(3.dp)
                        .size(35.dp)
                        .clickable {
                            currentRating = i
                        },
                    tint = if(i <= currentRating) Color(0xFFF2D422) else Color.Red
                )
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = if(currentRating==0)"" else "$currentRating", fontSize = 50.sp)
    }
}
