package com.example.pactice

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pactice.ui.theme.PacticeTheme

@Composable
fun CheckboxView() {
    val context = LocalContext.current
    var checkBox1 by remember { mutableStateOf(false) } // Correct state management
    var checkBox2 by remember { mutableStateOf(false) }
    var checkBox3 by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedCard(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkBox1,
                    onCheckedChange = {
                        checkBox1 = it
                        if (checkBox1) {
                            Toast.makeText(context, "CheckBox 1 is checked", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(context, "CheckBox 1 is unchecked", Toast.LENGTH_SHORT).show()
                        }
                    }
                )
                Text(text = "CheckBox 1")
            }
        }
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedCard(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkBox2,
                    onCheckedChange = {
                        checkBox2 = it
                        if (checkBox2) {
                            Toast.makeText(context, "CheckBox 2 is checked", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(context, "CheckBox 2 is unchecked", Toast.LENGTH_SHORT).show()
                        }
                    }
                )
                Text(text = "CheckBox 2")
            }
        }
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedCard(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkBox3,
                    onCheckedChange = {
                        checkBox3 = it
                        if (checkBox3) {
                            Toast.makeText(context, "CheckBox 3 is checked", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(context, "CheckBox 3 is unchecked", Toast.LENGTH_SHORT).show()
                        }
                    }
                )
                Text(text = "CheckBox 3")
            }
        }
    }
}


