package com.example.mytodo.ui.screens

import android.view.Surface
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytodo.models.Note
import com.example.mytodo.ui.components.TopBar
import com.example.mytodo.viewModels.NotesViewModel
import java.util.Date

@Composable
fun NoteDetailScreen(
    noteId: Int,
    viewModel: NotesViewModel,
    onBackClick: () -> Unit,
    folderName: String,
    onSettingClick: () -> Unit,
) {

    val note: Note? = viewModel.getNoteById(noteId)
    if (note == null) {
        Surface {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("La note est introuvable")
                Button(onClick = onBackClick) {
                    Text("Retour")
                }
            }
        }
        return
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column (
            modifier = Modifier.fillMaxSize(),
        ){

            TopBar("test", true)

            Column(
                modifier = Modifier.fillMaxSize().padding(14.dp)
            ) {

                Text(
                    Date(note.createdAt).toString(),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    note.title,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                Surface(
                    color = Color(0xFFF5C6F9),
                    shape = RoundedCornerShape(12.dp),
                    shadowElevation = 2.dp,
                ) {
                    Text(
                        folderName,
                        modifier = Modifier.padding(16.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                Spacer(modifier = Modifier.height(36.dp))

                Text(
                    note.content,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )

            }


        }

    }


}

@Composable
@Preview
fun NoteDetailScreenPreview1() {
    NoteDetailScreen(
        1,
        viewModel = NotesViewModel(),
        onBackClick = {},
        folderName = "My Notes",
        onSettingClick = {}
    )
}

@Composable
@Preview
fun NoteDetailScreenPreview2() {
    NoteDetailScreen(
        99999,
        viewModel = NotesViewModel(),
        onBackClick = {},
        folderName = "My Notes",
        onSettingClick = {}
    )

}