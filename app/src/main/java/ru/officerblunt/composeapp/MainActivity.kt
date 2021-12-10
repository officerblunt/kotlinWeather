package ru.officerblunt.composeapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            @Composable
            fun Body() {
                Box {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Top,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                IconButton(modifier = Modifier
                                    .padding(start = 25.dp, top = 40.dp)
                                    .size(30.dp),
                                    onClick = { /*TODO*/ }) {
                                    Icon(Icons.Rounded.Menu, contentDescription = "")
                                }
                                Text(
                                    text = "10^c",
                                    textAlign = TextAlign.Center,
                                    fontSize = 80.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(vertical = 40.dp)
                                )
                                IconButton(
                                    modifier = Modifier
                                        .padding(end = 25.dp, top = 40.dp)
                                        .size(30.dp),
                                    onClick = { /*TODO*/ }
                                ) {
                                    Icon(
                                        Icons.Rounded.Add,
                                        contentDescription = "add",
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                }
                            }
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "today's date",
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }

        }
    }
}