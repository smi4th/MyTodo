package com.example.mytodo.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytodo.ui.components.TopBar

@Composable
fun SettingScreen() {

    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Red)
    ){
        TopBar(
            "Settings",
            true,
            {}
        ) {}
    }

}

@Composable
@Preview
fun SettingScreenPreview() {
    SettingScreen()
}