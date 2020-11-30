/*
    Copyright 2020 Komoldin Khuzhamberdiev


*/
package com.github.flickrsample.data.source.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

import com.github.flickrsample.data.models.local.PhotoItem


@Database(entities = [PhotoItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun imageItemDao(): PhotoItemDao

}
