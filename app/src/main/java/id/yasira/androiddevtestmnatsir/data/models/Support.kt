package id.yasira.androiddevtestmnatsir.data.models

import com.google.gson.annotations.SerializedName

/**
 * Created by Muhammad Natsir on 10/09/2022.
 */
data class Support(
    @SerializedName("url"  )
    var url  : String? = null,
    @SerializedName("text" )
    var text : String? = null
)