package space.doky.andadv1.network.repository.datasource.dto

data class UserRequest(
    val data: UserData,
    val support: UserSupport,
)

data class UserData(
    val id: Int,
    val email: String,
    val first_name: String,
    val last_name: String,
    val avatar: String,
)

data class UserSupport(
    val url: String,
    val text: String,
)