package com.example.mytodo.models

import java.time.Instant

enum class NoteColor {
    PURPLE,
    LIGHT_PURPLE,
    DARK_PURPLE
}

data class Note(
    val id: Int,
    val title: String,
    val content: String,
    val createdAt: Long = Instant.now().epochSecond,
    val colorIndex: NoteColor = NoteColor.PURPLE,
) {

}
