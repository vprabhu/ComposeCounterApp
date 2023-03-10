package com.vpdevs.counterapp

import CounterAppTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterAppTheme {
                // A surface container using the 'background' color from the theme
                CounterApp()
            }
        }
    }
}