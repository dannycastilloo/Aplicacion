package com.example.aplicacion

import android.app.Application
import com.instana.android.Instana
import com.instana.android.core.InstanaConfig

class Aplicacion : Application() {
    override fun onCreate() {
        super.onCreate()
        val instanaConfig = InstanaConfig(
            key = "pdOARZ6KS52HFMA01Y3UZA",
            reportingURL = "https://eum-coral-saas.instana.io/mobile"
        )
        Instana.setup(this, instanaConfig)
    }
}