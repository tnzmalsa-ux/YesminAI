package com.yesmin.ai

import android.app.Application
import com.yesmin.ai.di.AppContainer

class YesminApplication : Application() {
    lateinit var container: AppContainer
        private set

    override fun onCreate() {
        super.onCreate()
        container = AppContainer(this)
    }
}
