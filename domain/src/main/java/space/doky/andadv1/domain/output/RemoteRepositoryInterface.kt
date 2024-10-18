package space.doky.andadv1.domain.output

interface RemoteRepositoryInterface {
    suspend fun getUserById(id: Int): Result<Unit>
    suspend fun enrollUser(name: String, job: String): Result<Unit>
}