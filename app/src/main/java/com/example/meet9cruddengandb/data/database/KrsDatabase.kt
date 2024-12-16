package com.example.meet9cruddengandb.data.database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.meet9cruddengandb.data.dao.MahasiswaDao
import com.example.meet9cruddengandb.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase:RoomDatabase() {

    //mendefinisikan fungsi untuk mengakses data mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile //memastikan bahwa nilai variabel instance selali sama di semua thread
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java, //Class database
                    "KrsDatabase" //Nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}