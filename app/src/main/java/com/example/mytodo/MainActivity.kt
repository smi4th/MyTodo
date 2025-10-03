package com.example.mytodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.mytodo.ui.theme.MyTodoTheme
import com.example.mytodo.viewModels.NotesViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: NotesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTodoTheme {
                Scaffold { innerPadding ->

                    Surface(
                        modifier = Modifier.padding(innerPadding)
                    ) {

                        NavGraph(
                            viewModel = viewModel
                        )

                    }
                }
            }
        }
    }
}