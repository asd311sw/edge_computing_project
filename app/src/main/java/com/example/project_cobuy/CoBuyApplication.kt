package com.example.project_cobuy

import android.app.Application
import com.example.project_cobuy.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import java.util.logging.Level
import org.koin.core.context.startKoin

class CoBuyApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(org.koin.core.logger.Level.ERROR)
            androidContext(this@CoBuyApplication)

            modules(appModule)

        }

    }

}