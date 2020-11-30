/*
    Copyright 2020 Komoldin Khuzhamberdiev


*/
package com.github.flickrsample.data.source.db

import android.arch.persistence.room.Room
import android.content.Context

import com.github.flickrsample.di.ApplicationContext
import com.github.flickrsample.di.DatabaseInfo

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class AppDbOpenHelper @Inject
constructor(@ApplicationContext context: Context, @DatabaseInfo name: String) {

    val database: AppDatabase = Room.databaseBuilder(context, AppDatabase::class.java, name)
            .build()

}
