package com.example.mytodo.repositories

import com.example.mytodo.models.Note
import com.example.mytodo.models.NoteColor

class NoteRepository {

    private val notes = mutableListOf<Note>(
        Note(1, "Hello World!", "Lorem Ipsum dolor sit amet, consectetur adipiscing elit...", colorIndex= NoteColor.PURPLE),
        Note(2, "Work Meeting Notes", "Discussed progress on project X, deadlines, and...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(3, "Class Notes", "Lecture on Biology: DNA structures and replication...", colorIndex= NoteColor.DARK_PURPLE),
        Note(4, "Project Plan", "Research, design, implementation, testing, deployements...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(5, "Hello World!", "Lorem Ipsum dolor sit amet, consectetur adipiscing elit...", colorIndex= NoteColor.PURPLE),
        Note(6, "Work Meeting Notes", "Discussed progress on project X, deadlines, and...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(7, "Class Notes", "Lecture on Biology: DNA structures and replication...", colorIndex= NoteColor.DARK_PURPLE),
        Note(8, "Project Plan", "Research, design, implementation, testing, deployements...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(9, "Hello World!", "Lorem Ipsum dolor sit amet, consectetur adipiscing elit...", colorIndex= NoteColor.PURPLE),
        Note(10, "Work Meeting Notes", "Discussed progress on project X, deadlines, and...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(1, "Hello World!", "Lorem Ipsum dolor sit amet, consectetur adipiscing elit...", colorIndex= NoteColor.PURPLE),
        Note(2, "Work Meeting Notes", "Discussed progress on project X, deadlines, and...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(3, "Class Notes", "Lecture on Biology: DNA structures and replication...", colorIndex= NoteColor.DARK_PURPLE),
        Note(4, "Project Plan", "Research, design, implementation, testing, deployements...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(5, "Hello World!", "Lorem Ipsum dolor sit amet, consectetur adipiscing elit...", colorIndex= NoteColor.PURPLE),
        Note(6, "Work Meeting Notes", "Discussed progress on project X, deadlines, and...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(7, "Class Notes", "Lecture on Biology: DNA structures and replication...", colorIndex= NoteColor.DARK_PURPLE),
        Note(8, "Project Plan", "Research, design, implementation, testing, deployements...", colorIndex= NoteColor.LIGHT_PURPLE),
        Note(9, "Hello World!", "Lorem Ipsum dolor sit amet, consectetur adipiscing elit...", colorIndex= NoteColor.PURPLE),
        Note(10, "Work Meeting Notes", "Discussed progress on project X, deadlines, and...", colorIndex= NoteColor.LIGHT_PURPLE),
    )

    fun addNote(note: Note) = notes.add(note)

    fun getAllNotes(): List<Note> = notes

    fun getById(id: Int): Note? = notes.find { it.id == id}

    fun deleteNote(note: Note) = notes.removeIf { it.id == note.id }

    fun update(updateNote: Note) {
        val index = notes.indexOfFirst { it.id == updateNote.id }
        if (index >= 0) {
            notes[index] = updateNote
        }
    }

}