package com.example.pactice

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pactice.ui.theme.PacticeTheme

@Composable
fun RadioButtonView(){
    val context = LocalContext.current
    var gender by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Choose an option",
            fontSize = 26.sp
        )
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedCard(
            colors = CardDefaults.cardColors()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = gender == "Male",
                    onClick = {
                        gender = "Male"
                        Toast.makeText(context, "You have choose male", Toast.LENGTH_SHORT).show()
                    }
                )
                Text(text = "Male")
            }
        }
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedCard(
            colors = CardDefaults.cardColors()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = gender == "Female",
                    onClick = {
                        gender = "Female"
                        Toast.makeText(context, "You have choose female", Toast.LENGTH_SHORT).show()
                    }
                )
                Text(text = "Female")
            }
        }
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedCard(
            colors = CardDefaults.cardColors()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = gender == "Other",
                    onClick = {
                        gender = "Other"
                        Toast.makeText(context, "You have choose others", Toast.LENGTH_SHORT).show()
                    }
                )
                Text(text = "Other")
            }
        }
    }
}