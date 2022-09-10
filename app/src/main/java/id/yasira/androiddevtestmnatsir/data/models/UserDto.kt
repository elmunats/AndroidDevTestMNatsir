package id.yasira.androiddevtestmnatsir.data.models

import com.google.gson.annotations.SerializedName

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
data class UserDto (
    @SerializedName("data")
    var data: Data? = Data(),
    @SerializedName("support")
    var support: Support? = Support()
)