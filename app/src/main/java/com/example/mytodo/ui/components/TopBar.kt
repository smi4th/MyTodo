package com.example.mytodo.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(
    title: String,
    showBackButton: Boolean = false,
    onBackClick: () -> Unit = {},
    onSettingClick: () -> Unit = {},
) {

    Surface {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {

                if (showBackButton) {
                    IconButton(onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                }

                Text(title, fontSize = 28.sp, fontWeight = FontWeight.Bold)

            }

            IconButton(onSettingClick) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Settings")
            }
        }

    }

}

@Composable
@Preview
fun TopBarPreview() {
    TopBar("Just Do It!", showBackButton = true, onBackClick = {}, onSettingClick = {})
}