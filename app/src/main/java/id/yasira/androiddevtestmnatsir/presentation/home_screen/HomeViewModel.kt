package id.yasira.androiddevtestmnatsir.presentation.home_screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import id.yasira.androiddevtestmnatsir.common.Constants
import javax.inject.Inject

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel() {

    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_EMAIL)?.let { email ->
            getUserDetail(email)
        }
    }

    private fun getUserDetail(email: String) {
        _state.value = HomeState(email = email)
    }
}