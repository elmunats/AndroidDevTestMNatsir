package id.yasira.androiddevtestmnatsir.domain.use_case

import id.yasira.androiddevtestmnatsir.data.remote.request.AuthRequest
import id.yasira.androiddevtestmnatsir.domain.model.AuthResult
import id.yasira.androiddevtestmnatsir.domain.repository.AuthRepository
import javax.inject.Inject

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
class LoginUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(
        email:String,
        password:String
    ): AuthResult {

        val emailError = if (email.isBlank()) "Username tidak boleh kosong" else null
        val passwordError = if (password.isBlank()) "Password tidak boleh kosong" else null

        if (emailError != null){
            return AuthResult(
                emailError = emailError
            )
        }

        if (passwordError!=null){
            return AuthResult(
                passwordError = passwordError
            )
        }

        val loginRequest = AuthRequest(
            email = email.trim(),
            password = password.trim()
        )

        return AuthResult(
            result = repository.login(loginRequest)
        )
    }
}