package com.vpdevs.counterapp

import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterApp() {
    val counter = remember {
        mutableStateOf(0)
    }
    Scaffold {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            FloatingActionButton(
                modifier = Modifier
                    .width(75.dp)
                    .height(75.dp),
                onClick = {
                    incrementCounter(counter)
                },
            ) {
                Text(text = "+", fontSize = 40.sp)
            }

            Text(
                fontSize = 64.sp,
                text = "" + counter.value,
                modifier = Modifier
                    .wrapContentWidth(align = Alignment.CenterHorizontally)
                    .padding(16.dp)
            )

            FloatingActionButton(
                modifier = Modifier
                    .width(75.dp)
                    .height(75.dp),
                onClick = {
                    decrementCounter(counter)
                },
            ) {
                Text(text = "-", fontSize = 40.sp)
            }
        }
    }
}

private fun incrementCounter(counter: MutableState<Int>) {
    counter.value = counter.value + 1
}

private fun decrementCounter(counter: MutableState<Int>) {
    if (counter.value > 0) {
        counter.value = counter.value - 1
    }
}

@Preview(showBackground = true)
@Composable
fun CounterAppPreview() {
    CounterApp()
}