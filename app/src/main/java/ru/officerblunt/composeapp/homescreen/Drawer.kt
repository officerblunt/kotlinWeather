package ru.officerblunt.composeapp.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Drawer() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val coroutineScope = rememberCoroutineScope()
    Column(
        Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Text(
            "Weather app",
            modifier = Modifier.padding(top = 32.dp, start = 20.dp),
            fontSize = 23.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, start = 22.dp)
        ) {
            Icon(
                Icons.Rounded.Settings,
                contentDescription = "settings",
                modifier = Modifier.size(20.dp)
            )
            Text(
                "Настройки",
                fontSize = 18.sp,
                textAlign = TextAlign.Justify
            )
        }
    }
}
