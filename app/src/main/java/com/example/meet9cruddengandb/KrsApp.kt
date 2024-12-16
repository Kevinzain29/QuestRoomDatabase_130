package com.example.meet9cruddengandb

import android.app.Application
import com.example.meet9cruddengandb.dependeciesinjection.ContainerApp

class KrsApp : Application() {
    //fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        //Membuat instance ContainerApp
        super.onCreate()
        // instance adalah object yang dibuat dari class
        containerApp = ContainerApp(this)
    }
}