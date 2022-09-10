package id.yasira.androiddevtestmnatsir.data.remote

import id.yasira.androiddevtestmnatsir.data.remote.request.AuthRequest
import id.yasira.androiddevtestmnatsir.data.remote.response.AuthResponse
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
interface ApiService {

    @POST("api/login")
    suspend fun loginUser(
        @Body loginRequest: AuthRequest
    ) : AuthResponse

}