package space.doky.andadv1.network.repository.di

import space.doky.andadv1.network.repository.RemoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import space.doky.andadv1.domain.output.RemoteRepositoryInterface
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindRemoteRepository(remoteRepository: RemoteRepository): RemoteRepositoryInterface
}