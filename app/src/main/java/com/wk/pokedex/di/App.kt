package com.wk.pokedex.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import androidx.appcompat.app.AppCompatDelegate
@HiltAndroidApp
class App:Application() {
    override fun onCreate() {
        super.onCreate()

       AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
}