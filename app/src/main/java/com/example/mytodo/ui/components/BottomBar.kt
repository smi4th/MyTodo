package com.example.mytodo.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar(
    onHome: () -> Unit,
    onAdd: () -> Unit,
    onProfile: () -> Unit,
) {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(16.dp),
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(horizontal = 30.dp)
                .clip(RoundedCornerShape(32.dp))
                .background(Color(0xFFE6D3F8)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            IconButton(onClick = onHome) {
                Icon(
                    Icons.Outlined.Home,
                    contentDescription = "Home Button",
                    tint = Color(0xFFAF97FF),
                    modifier = Modifier.size(35.dp)
                )
            }

            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF4A0CF8)),
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = onAdd) {
                    Icon(
                        Icons.Outlined.Add,
                        contentDescription = "Add Button",
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }

            IconButton(onClick = onProfile) {
                Icon(
                    Icons.Outlined.Person,
                    contentDescription = "Profile Button",
                    tint = Color(0xFF4A0CF8),
                    modifier = Modifier.size(35.dp),
                )
            }
        }

    }

}

@Composable
@Preview
fun BottomBarPreview() {
    BottomBar({}, {}, {})
}