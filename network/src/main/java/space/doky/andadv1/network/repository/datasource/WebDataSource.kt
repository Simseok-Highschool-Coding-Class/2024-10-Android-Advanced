package space.doky.andadv1.network.repository.datasource

import space.doky.andadv1.network.repository.datasource.dto.UserCreateRequest
import javax.inject.Inject

class WebDataSource @Inject constructor(
    private val webClientApi: WebClientApi,
) {
    private val headers = HashMap<String, String>()

    suspend fun getUserById(id: Int) =
        webClientApi.userGet(id)

    suspend fun accountRegister(name: String, job: String) =
        webClientApi.userCreate(UserCreateRequest(name, job))
}