package id.yasira.androiddevtestmnatsir.presentation.home_screen

import id.yasira.androiddevtestmnatsir.domain.model.User

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
data class HomeState (
    val isLoading: Boolean = false,
    val user: User? = null,
    val error: String = "",
    val email: String = ""
)