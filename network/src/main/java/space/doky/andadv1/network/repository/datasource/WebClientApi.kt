package space.doky.andadv1.network.repository.datasource

import space.doky.andadv1.network.repository.datasource.dto.UserCreateRequest
import space.doky.andadv1.network.repository.datasource.dto.UserCreateResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface WebClientApi {
    @GET("api/users/{id}")
    suspend fun userGet(
        @Path("id") id: Int
    ): Result<UserCreateRequest>

    @POST("api/users")
    suspend fun userCreate(
        @Body body: UserCreateRequest
    ): Result<UserCreateResponse>
}