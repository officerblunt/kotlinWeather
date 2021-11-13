package ru.officerblunt.composeapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val count = remember { mutableStateOf(0) }
            Column()
            {
                Box(modifier = Modifier.background(Color.Red).fillMaxWidth().weight(2f))
                Box(modifier = Modifier.background(Color.Yellow).fillMaxWidth().weight(3f))
                Box(modifier = Modifier.background(Color.Green).fillMaxWidth().weight(2f))
                Text(
                    "Clicks: ${count.value}",
                    fontSize = 28.sp,
                    modifier = Modifier
                        .clickable(onClick = { count.value += 1 })
                        .align(Alignment.CenterHorizontally)
                )
            }

        }
    }

}