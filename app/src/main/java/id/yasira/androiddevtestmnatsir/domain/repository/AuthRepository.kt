package id.yasira.androiddevtestmnatsir.domain.repository

import id.yasira.androiddevtestmnatsir.common.Resource
import id.yasira.androiddevtestmnatsir.data.remote.request.AuthRequest

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
interface AuthRepository {
    suspend fun login(loginRequest: AuthRequest): Resource<Unit>
}