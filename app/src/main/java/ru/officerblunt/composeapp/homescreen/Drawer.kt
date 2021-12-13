package ru.officerblunt.composeapp.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
            fontSize = 23.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Row(
            modifier = Modifier
                .padding(top = 40.dp, start = 22.dp)
                .fillMaxWidth(),
        ) {
            Icon(
                Icons.Rounded.Settings,
                contentDescription = "settings",
                modifier = Modifier.size(20.dp)
            )
            Text(
                "Настройки",
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 40.dp, start = 22.dp)
                .fillMaxWidth(),
        ) {
            Icon(
                Icons.Rounded.Favorite,
                contentDescription = "settings",
                modifier = Modifier.size(20.dp)
            )
            Text(
                "Избранное",
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 40.dp, start = 22.dp)
                .fillMaxWidth(),
        ) {
            Icon(
                Icons.Rounded.Person,
                contentDescription = "settings",
                modifier = Modifier.size(20.dp)
            )
            Text(
                "О приложении",
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}
