package com.example.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practice.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeTheme {
                var count by remember {
                    mutableStateOf(0)
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = count.toString(),
                        fontSize = 30.sp,
                    )
                    Button(onClick = { count++ }) {
                        Text(text = "Click me")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(10) { i ->
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "Add",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PracticeTheme {
        Greeting("Android")
    }
}