package ru.officerblunt.composeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

    @Composable
    fun TopBar(onMenuClicked: () -> Unit) {
        TopAppBar(
            modifier = Modifier
                .height(100.dp)
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
