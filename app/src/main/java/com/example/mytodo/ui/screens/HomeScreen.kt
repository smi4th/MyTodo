package com.example.mytodo.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytodo.ui.components.BottomBar
import com.example.mytodo.ui.components.NoteCard
import com.example.mytodo.ui.components.TopBar
import com.example.mytodo.viewModels.NotesViewModel
import com.example.mytodoz.ui.components.SearchBar

@Composable
fun HomeScreen(
    viewModel: NotesViewModel,
    onOpenNote: (Int) -> Unit,
    onOpenSettings: () -> Unit,
    folderName: String,
) {

    Surface {

        Box(contentAlignment = Alignment.BottomCenter) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
            ) {

                TopBar("Just Do It")

                Text(
                    "${viewModel.notes.size} Notes",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )

                SearchBar(
                    "",
                    onQueryChange = { },
                    onFilterClick = { },
                )

                Text("My Notes", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                ) {
                    items(viewModel.notes) { note ->
                        NoteCard(note) { }
                    }
                }
            }

            BottomBar({}, {}, {})

        }

    }
}