package com.example.rommdatabase.dependeciesinjection

import android.content.Context
import com.example.rommdatabase.data.database.KrsDatabase
import com.example.rommdatabase.repository.LocalRepositoryMhs
import com.example.rommdatabase.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs : RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}