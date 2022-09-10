package id.yasira.androiddevtestmnatsir.common

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
sealed class UiEvents {
    data class SnackbarEvent(val message : String) : UiEvents()
    data class NavigateEvent(val route: String) : UiEvents()
}