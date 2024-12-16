package com.example.rommdatabase.ui.viewmodel

import android.text.Editable.Factory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.rommdatabase.KrsApp


object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            MahasiswaViewModel(
                KrsApp().containerApp.repositoryMhs
            )
        }
    }
}

fun CreationExtras.KrsApp(): KrsApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KrsApp)