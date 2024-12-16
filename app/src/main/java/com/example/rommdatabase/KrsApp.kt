package com.example.rommdatabase

import android.app.Application
import com.example.rommdatabase.dependeciesinjection.ContainerApp
import com.example.rommdatabase.dependeciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // Fungsinya untuk mennyimpan

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) //membuat instance
        // Instance adalah object yang dibuat dari class
    }
}