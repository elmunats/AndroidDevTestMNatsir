package id.yasira.androiddevtestmnatsir.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import id.yasira.androiddevtestmnatsir.common.Constants.AUTH_PREFERENCES
import id.yasira.androiddevtestmnatsir.common.Constants.BASE_URL
import id.yasira.androiddevtestmnatsir.data.local.AuthPreferences
import id.yasira.androiddevtestmnatsir.data.remote.ApiService
import id.yasira.androiddevtestmnatsir.data.repository.AuthRepositoryImpl
import id.yasira.androiddevtestmnatsir.domain.repository.AuthRepository
import id.yasira.androiddevtestmnatsir.domain.use_case.LoginUseCase
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePreferenceDataStore(@ApplicationContext context: Context) : DataStore<Preferences> =
        PreferenceDataStoreFactory.create(
            produceFile = {
                context.preferencesDataStoreFile(AUTH_PREFERENCES)
            }
        )

    @Provides
    @Singleton
    fun provideAuthPreferences(dataStore: DataStore<Preferences>) =
        AuthPreferences(dataStore)


    @Provides
    @Singleton
    fun providesApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun providesAuthRepository(
        apiService: ApiService,
        preferences: AuthPreferences
    ): AuthRepository {
        return AuthRepositoryImpl(
            apiService = apiService,
            preferences = preferences
        )
    }

    @Provides
    @Singleton
    fun providesLoginUseCase(repository: AuthRepository): LoginUseCase {
        return LoginUseCase(repository)
    }
}