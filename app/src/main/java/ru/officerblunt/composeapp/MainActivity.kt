package ru.officerblunt.composeapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
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
            //Image(bitmap = ImageBitmap.imageResource(R.drawable.back), contentDescription = "background") не работает /*TODO*/
            MainScreen()
        }
    }
}

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

                    Text(
                        text = "10^c",
                        textAlign = TextAlign.Center,
                        fontSize = 80.sp,
                        color = Color.White,
                        modifier = Modifier.padding(vertical = 40.dp)
                    )

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

@Composable
fun TopBar(onMenuClicked: () -> Unit) {
    TopAppBar(
        modifier = Modifier.height(100.dp)
            .background(Color.Transparent),
        Color(0),
        elevation = 0.dp

    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            IconButton(
                modifier = Modifier
                    .padding(start = 25.dp, top = 40.dp)
                    .size(30.dp),
                onClick = onMenuClicked
            ) {
                Icon(Icons.Rounded.Menu, contentDescription = "menu")
            }
            IconButton(
                modifier = Modifier
                    .padding(end = 25.dp, top = 40.dp)
                    .size(30.dp),
                onClick = { /*TODO*/ }
            ) {
                Icon(Icons.Rounded.Add, contentDescription = "add")
            }
        }
    }
}

@Composable
fun Drawer() {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        repeat(5) { item ->
            Text(text = "Item number $item", modifier = Modifier.padding(8.dp), color = Color.Black)
        }
    }
}

@Composable
fun MainScreen() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(onMenuClicked = { coroutineScope.launch { scaffoldState.drawerState.open() } })
        },
        content = { Body() },
        drawerContent = { Drawer() }
    )
}