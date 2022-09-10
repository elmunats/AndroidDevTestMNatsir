package id.yasira.androiddevtestmnatsir.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.rememberNavHostEngine
import dagger.hilt.android.AndroidEntryPoint
import id.yasira.androiddevtestmnatsir.presentation.ui.theme.AndroidDevTestMNatsirTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import id.yasira.androiddevtestmnatsir.common.Constants
import id.yasira.androiddevtestmnatsir.presentation.home_screen.HomeScreen
import id.yasira.androiddevtestmnatsir.presentation.login_screen.LoginScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidDevTestMNatsirTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Screen.LoginScreen.route
                    ) {
                        composable(
                            route = Screen.LoginScreen.route
                        ) {
                            LoginScreen(navController)
                        }
                        composable(
                            route = Screen.HomeScreen.route + "/{"+Constants.PARAM_EMAIL+"}"
                        ) {
                            HomeScreen()
                        }
                    }
                }
            }
        }
    }
}
