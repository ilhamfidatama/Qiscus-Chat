package com.ilhamfidatama.qiscus_chat

import android.app.Application
import com.qiscus.sdk.chat.core.QiscusCore
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyChatApp: Application(){
    override fun onCreate() {
        super.onCreate()

        QiscusCore.setup(this, BuildConfig.QISCUS_APP_ID)

        QiscusCore.getChatConfig()
            .enableDebugMode(true)
    }
}