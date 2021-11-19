package ru.officerblunt.composeapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val (value, setValue) = remember {
                mutableStateOf("click me!")
            }
            Text(
                text = value,
                fontSize = 50.sp,
                color = Color.White,
                modifier = Modifier.clickable(onClick = {setValue("fuck you!")})
            )
        }
    }

}