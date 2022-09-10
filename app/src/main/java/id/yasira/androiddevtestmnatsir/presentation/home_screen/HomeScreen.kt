package id.yasira.androiddevtestmnatsir.presentation.home_screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Text(text = "Login by : "+"${state.email}")
}