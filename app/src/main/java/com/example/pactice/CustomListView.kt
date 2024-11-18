package com.example.pactice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.pactice.ui.theme.company

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomListView() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "Custom List View")
            })
        }
    ) { contentPadding ->
        LazyColumn(
            contentPadding = contentPadding,
        ) {
            itemsIndexed(company) { index, item ->
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .size(400.dp, 120.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = item.image),
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(20.dp))
                        )
                        Spacer(modifier = Modifier.padding(horizontal = 16.dp))
                        Column {
                            Text(text = item.name, fontSize = 20.sp)
                            Text(text = item.type, fontSize = 16.sp)
                        }
                    }
                }
            }
        }
    }
}
