package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center){
                CircleButton()
            }
        }
    }
}

@Composable
fun CircleButton() {
    val counter = remember {
        mutableIntStateOf(0)
    }
    val color = remember {
        mutableStateOf(Color.Red)
    }
    Box(modifier = Modifier
        .size(100.dp)
        .background(color.value, shape = CircleShape)
        .clickable {
            when (++counter.intValue) {
                10 -> color.value = Color.Blue
                20 -> color.value = Color.Green
            }
        },
        contentAlignment = Alignment.Center){
        Text(text = counter.intValue.toString(),
            style = TextStyle(color = Color.White, fontSize = 20.sp)
        )
    }


}