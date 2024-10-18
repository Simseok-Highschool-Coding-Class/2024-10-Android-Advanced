package space.doky.andadv1.network.repository.datasource.dto

import com.google.gson.annotations.SerializedName

data class UserCreateResponse (
    @SerializedName("name") val name: String,
    @SerializedName("job") val job: String,
    @SerializedName("id") val id: String,
    @SerializedName("createdAt") val createdAt: String,
)