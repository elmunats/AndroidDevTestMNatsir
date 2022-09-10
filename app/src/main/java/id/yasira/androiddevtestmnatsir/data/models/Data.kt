package id.yasira.androiddevtestmnatsir.data.models

import com.google.gson.annotations.SerializedName

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
data class Data (
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("first_name")
    var firstName: String? = null,
    @SerializedName("last_name")
    var lastName: String? = null,
    @SerializedName("avatar")
    var avatar: String? = null
)