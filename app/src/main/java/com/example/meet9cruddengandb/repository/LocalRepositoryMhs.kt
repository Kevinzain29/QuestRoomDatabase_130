package com.example.meet9cruddengandb.repository

import com.example.meet9cruddengandb.data.dao.MahasiswaDao
import com.example.meet9cruddengandb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    override fun getAllMahasiswa(): Flow<List<Mahasiswa>>{
        return mahasiswaDao.getAllMahasiswa()
    }
}
