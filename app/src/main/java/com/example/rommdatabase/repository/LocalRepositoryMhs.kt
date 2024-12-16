package com.example.rommdatabase.repository

import com.example.rommdatabase.data.dao.MahasiswaDao
import com.example.rommdatabase.data.entity.Mahasiswa


class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao

) : RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}

