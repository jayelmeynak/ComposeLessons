package com.example.compose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.compose.ui.theme.CardNewBg

@Composable
fun ListItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 3.dp),
        colors = CardDefaults.cardColors(
            containerColor = CardNewBg
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Column(modifier = Modifier.padding(start = 6.dp, top = 4.dp, bottom = 6.dp)) {
                Text(text = "00:00",
                    fontSize = 16.sp,
                    color = Color.White
                    )
                Text(text = "Cloud",
                    fontSize = 16.sp,
                    color = Color.Black)
            }
            Text(text = "16°C",
                fontSize = 24.sp,
                color = Color.White)
            AsyncImage(model = "https://cdn.weatherapi.com/weather/64x64/day/116.png",
                contentDescription = "condition",
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(35.dp))
        }

    }
}