package com.example.rommdatabase.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.rommdatabase.repository.RepositoryMhs

class DetailMhsViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoryMhs: RepositoryMhs,
) : ViewModel() {

}
data class DetailUiState(
    val detailUiEvent: MahasiswaEvent = MahasiswaEvent(),
    val isLoading: Boolean = false,
    val isError : Boolean = false,
    val errorMessage: String = ""
)