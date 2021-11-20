package ru.officerblunt.composeapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(modifier = Modifier
                        .size(30.dp)
                        .padding(vertical = 40.dp), onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.Menu,
                            contentDescription = "Menu",
                            modifier = Modifier.size(30.dp)
                                .padding(vertical = 40.dp)
                        )
                    }
                    Text(
                        text = "10^c",
                        textAlign = TextAlign.Center,
                        fontSize = 80.sp,
                        color = Color.White,
                        modifier = Modifier.padding(vertical = 40.dp)
                    )
                    Button(modifier = Modifier
                        .padding(vertical = 40.dp)
                        .size(30.dp), onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.Add,
                            contentDescription = "add",
                            modifier = Modifier.size(30.dp)
                                .padding(vertical = 40.dp)
                        )
                    }
                }
            }
        }
    }
}

