package com.example.rommdatabase.repository

import com.example.rommdatabase.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}