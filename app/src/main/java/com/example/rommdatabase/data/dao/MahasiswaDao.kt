package com.example.rommdatabase.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.rommdatabase.data.entity.Mahasiswa
import com.example.rommdatabase.repository.RepositoryMhs
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    abstract fun getAllMahasiswa(): Flow<List<Mahasiswa>>
    abstract fun getMahasiswa(nim: String): Flow<Mahasiswa>
    abstract fun deleteMahasiswa(mahasiswa: Mahasiswa)
}

class LocalRepositoryMhs
    (private val mahasiswaDao: MahasiswaDao)  : RepositoryMhs
{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    override fun getAllMhs(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }
    override fun getMhs(nim: String): Flow<Mahasiswa> {
        return mahasiswaDao.getMahasiswa(nim)
    }
    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }




  