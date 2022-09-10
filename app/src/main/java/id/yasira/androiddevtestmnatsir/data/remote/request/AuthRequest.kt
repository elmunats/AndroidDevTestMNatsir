package id.yasira.androiddevtestmnatsir.data.remote.request

import com.google.gson.annotations.SerializedName

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
data class AuthRequest (
    @SerializedName("email")
    var email: String,
    @SerializedName("password")
    var password: String
)