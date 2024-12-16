package com.example.meet9cruddengandb.dependeciesinjection

import android.content.Context
import com.example.meet9cruddengandb.data.database.KrsDatabase
import com.example.meet9cruddengandb.repository.LocalRepositoryMhs
import com.example.meet9cruddengandb.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}