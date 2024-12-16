package com.example.meet9cruddengandb.repository

import com.example.meet9cruddengandb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>
}