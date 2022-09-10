package id.yasira.androiddevtestmnatsir.data.local

import androidx.datastore.core.DataStore
import id.yasira.androiddevtestmnatsir.common.Constants.AUTH_KEY
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
class AuthPreferences(private val dataStore: DataStore<Preferences>) {

    suspend fun saveAuthToken(loginToken:String){
        dataStore.edit { pref ->
            pref[AUTH_KEY] = setOf(loginToken)
        }
    }

}