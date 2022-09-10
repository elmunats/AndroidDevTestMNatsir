package id.yasira.androiddevtestmnatsir.domain.model

import id.yasira.androiddevtestmnatsir.common.Resource

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
data class AuthResult (
    val passwordError: String? = null,
    val emailError : String? = null,
    val result: Resource<Unit>? = null
)