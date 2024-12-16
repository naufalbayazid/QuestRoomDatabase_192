package com.example.rommdatabase.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.rommdatabase.data.entity.Mahasiswa
@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}

//Get All Mahasiswa
@Query("SELECT * FROM mahasiswa ORDER by nama ASC")