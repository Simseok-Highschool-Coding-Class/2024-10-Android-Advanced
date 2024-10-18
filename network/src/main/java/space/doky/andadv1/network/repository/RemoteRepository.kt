package space.doky.andadv1.network.repository

import space.doky.andadv1.network.repository.datasource.WebDataSource
import space.doky.andadv1.domain.output.RemoteRepositoryInterface
import javax.inject.Inject

class RemoteRepository @Inject constructor(
    private val webDataSource: WebDataSource
) : RemoteRepositoryInterface {

    override suspend fun getUserById(id: Int): Result<Unit> =
        webDataSource.getUserById(id).map { }

    override suspend fun enrollUser(name: String, job: String): Result<Unit> =
        webDataSource.accountRegister(name, job).map { }

    companion object {
        val TAG = RemoteRepository::class.java.simpleName
    }
}