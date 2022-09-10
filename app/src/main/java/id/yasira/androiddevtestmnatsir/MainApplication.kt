package id.yasira.androiddevtestmnatsir

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
