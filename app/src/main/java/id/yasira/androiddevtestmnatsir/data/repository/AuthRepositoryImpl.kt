package id.yasira.androiddevtestmnatsir.data.repository

import id.yasira.androiddevtestmnatsir.common.Resource
import id.yasira.androiddevtestmnatsir.data.local.AuthPreferences
import id.yasira.androiddevtestmnatsir.data.remote.ApiService
import id.yasira.androiddevtestmnatsir.data.remote.request.AuthRequest
import id.yasira.androiddevtestmnatsir.domain.repository.AuthRepository
import retrofit2.HttpException
import java.io.IOException

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
class AuthRepositoryImpl (
    private val apiService: ApiService,
    private val preferences: AuthPreferences

) : AuthRepository {
    override suspend fun login(loginRequest: AuthRequest): Resource<Unit> {
        return try {
            val response = apiService.loginUser(loginRequest)
            preferences.saveAuthToken(response.token)
            Resource.Success(Unit)
        }catch (e: IOException){
            Resource.Error("${e.message}")
        }catch (e: HttpException){
            Resource.Error("${e.message}")
        }
    }


}