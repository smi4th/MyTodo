package com.example.mytodo

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mytodo.ui.screens.HomeScreen
import com.example.mytodo.ui.screens.NoteDetailScreen
import com.example.mytodo.viewModels.NotesViewModel

@Composable
fun NavGraph(viewModel: NotesViewModel) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Destinations.HOME
    ) {

        composable(Destinations.HOME) {
            HomeScreen(
                viewModel = viewModel,
                onOpenNote = { noteId -> navController.navigate("${Destinations.DETAIL}/$noteId") },
                onOpenSettings = { /* TODO: Create settings screen */ },
                folderName = "My Notes Pro"
            )
        }

        composable(
            "${Destinations.DETAIL}/{noteId}",
            arguments = listOf(navArgument("noteId", builder = { type = NavType.IntType }))
        ) { backStackEntry ->
            val noteId: Int = backStackEntry.arguments?.getInt("noteId") ?: 0

            NoteDetailScreen(
                noteId,
                viewModel,
                onBackClick = { navController.popBackStack() },
                folderName = "My Notes Pro",
                onSettingClick = {}
            )

        }

    }

}