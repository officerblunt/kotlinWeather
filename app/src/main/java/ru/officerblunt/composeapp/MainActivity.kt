package ru.officerblunt.composeapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            val scope = rememberCoroutineScope()
            val items = listOf("Главная", "Контакты", "О приложении")
            Box() {

                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.back),
                    contentDescription = "background",
                    contentScale = ContentScale.FillHeight,
                )
                Scaffold(scaffoldState = scaffoldState,
                    drawerBackgroundColor = Color(0xFFE1F5FE),
                    drawerContentColor = Color(0xFF0277BD),
                    drawerScrimColor = Color(0x99E0F7FA),
                    drawerContent = {
                        items.forEach { item -> Text(item, fontSize = 28.sp) }

                    }) {
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
                                    .size(30.dp), onClick = {/*TODO*/ }) {
                                    Icon(Icons.Rounded.Menu, contentDescription = "")
                                }
                                Text(
                                    text = "10^c",
                                    textAlign = TextAlign.Center,
                                    fontSize = 80.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(vertical = 40.dp)
                                )
                                Button(
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