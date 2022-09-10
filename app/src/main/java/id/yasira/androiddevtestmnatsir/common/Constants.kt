package id.yasira.androiddevtestmnatsir.common

import androidx.datastore.preferences.core.stringSetPreferencesKey

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
object Constants {
    const val BASE_URL = "https://reqres.in/"
    const val AUTH_PREFERENCES = "AUTH_PREF"
    val AUTH_KEY = stringSetPreferencesKey("auth_key")
    const val PARAM_EMAIL = "email_user"
}