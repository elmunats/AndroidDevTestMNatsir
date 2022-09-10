package id.yasira.androiddevtestmnatsir.data.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
data class AuthResponse (
    @SerializedName("token")
    val token : String
)