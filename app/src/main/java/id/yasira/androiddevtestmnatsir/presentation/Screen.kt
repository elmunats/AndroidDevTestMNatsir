package id.yasira.androiddevtestmnatsir.presentation

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
sealed class Screen(val route: String) {
    object LoginScreen: Screen("login_screen")
    object HomeScreen: Screen("home_screen")
}