package com.example.pactice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun ExpandableListView() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Expandable List View") })
        }
    ) { contentPadding ->
        val context = LocalContext.current
        val expandableItems = remember {
            mutableStateListOf(
                ExpandableItem(
                    title = "Tech",
                    children = listOf(
                        Company("Google", "Tech", R.drawable.google),
                        Company("Microsoft", "Tech", R.drawable.microsoft),
                        Company("NVIDIA", "tech", R.drawable.nvidia)
                    )
                ),
                ExpandableItem(
                    title = "Car",
                    children = listOf(
                        Company("Tesla", "Car", R.drawable.tesla),
                    )
                ),
                ExpandableItem(
                    title = "Bank",
                    children = listOf(
                        Company("HDFC", "Bank", R.drawable.hdfc),
                    )
                ),
                ExpandableItem(
                    title = "Electronics",
                    children = listOf(
                        Company("Samsung", "Electronics", R.drawable.samsung),
                    )
                )
            )
        }

        LazyColumn(
            contentPadding = contentPadding,
            modifier = Modifier.padding(16.dp)
        ) {
            expandableItems.forEach { item ->
                item {
                    ExpandableItemView(item)
                }
            }
        }
    }
}

@Composable
fun ExpandableItemView(expandableItem: ExpandableItem) {
    var isExpanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.primary)
                .padding(16.dp)
                .clickable { isExpanded = !isExpanded }
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = expandableItem.title,
                    color = Color.White,
                    fontSize = 18.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.img_2),
                    contentDescription = "" ,
                    modifier = Modifier.size(25.dp)
                )
            }
        }

        if (isExpanded) {
            Spacer(modifier = Modifier.height(8.dp))
            expandableItem.children.forEach { child ->
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .size(400.dp, 120.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 8.dp),
                        verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = child.image),
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(20.dp))
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Text(text = child.name, fontSize = 20.sp)
                            Text(text = child.type, fontSize = 16.sp)
                        }
                    }
                }
            }
        }
    }
}

data class ExpandableItem(
    val title: String,
    val children: List<Company>
)

data class Company(
    val name: String,
    val type: String,
    val image: Int
)
