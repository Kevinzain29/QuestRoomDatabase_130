package com.example.meet9cruddengandb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.meet9cruddengandb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Query("select * from mahasiswa")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}