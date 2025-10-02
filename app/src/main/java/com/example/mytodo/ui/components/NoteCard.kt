package com.example.mytodo.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytodo.models.Note
import com.example.mytodo.models.NoteColor

@Composable
fun NoteCard(
    note: Note,
    onClick: () -> Unit,
) {

    val bg: Color = when(note.colorIndex) {
        NoteColor.PURPLE -> Color(0xFFDCCBFF)
        NoteColor.LIGHT_PURPLE -> Color(0xFFD9CBEF)
        NoteColor.DARK_PURPLE -> Color(0xFF7655ED)
    }

    Surface (
        onClick = onClick,
        modifier = Modifier
            .padding(8.dp)
            .size(width = 160.dp, height = 120.dp),
        shape = RoundedCornerShape(16.dp),
        color = bg,
        shadowElevation = 4.dp
    ) {
        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        ) {

            Text(note.title, fontSize = 16.sp, fontWeight = FontWeight.Bold)

            Text(note.content, fontSize = 10.sp)

        }
    }

}

@Composable
@Preview
fun NoteCardPreview() {

    NoteCard(Note(409, "New Note #409", "Contenu de la note 409.\nAjoute du texte Ici.", colorIndex=NoteColor.DARK_PURPLE), {})

}