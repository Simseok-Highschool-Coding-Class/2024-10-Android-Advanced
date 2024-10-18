package space.doky.andadv1

import android.app.Application
import space.doky.andadv1.util.AppLog
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        AppLog.i(TAG, "onCreate", "app start")
    }

    companion object {
        private val TAG: String = MainApplication::class.java.simpleName
    }
}