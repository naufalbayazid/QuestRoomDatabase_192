package com.example.rommdatabase.data.database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rommdatabase.data.dao.MahasiswaDao
import com.example.rommdatabase.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {
    //mendefinisikan fungsi untuk mengakses data mahasiswa

    abstract fun mahasiswaDao() : MahasiswaDao

    companion object {
        @Volatile //Memastikan bahwa nilai variabel Instance selalu sama di se
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context) : KrsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java,// Class database
                    "KrsDatabase" // Nama Database
                )
                    .build().also { Instance = it }
            })
        }
    }
}