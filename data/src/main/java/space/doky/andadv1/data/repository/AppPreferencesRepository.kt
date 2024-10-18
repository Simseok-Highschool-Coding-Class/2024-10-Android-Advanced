package space.doky.andadv1.data.repository

import androidx.datastore.core.DataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import space.doky.andadv1.AppPreferences
import space.doky.andadv1.domain.output.AppPreferenceInterface
import javax.inject.Inject

class AppPreferencesRepository @Inject constructor(
    private val appPreferences: DataStore<AppPreferences>
): AppPreferenceInterface {
    private val appPreferencesFlow: Flow<AppPreferences> = appPreferences.data

    override fun getSampleText(): Flow<String> =
        appPreferencesFlow.map { it.sampleText }

    override suspend fun setSampleText(text: String) {
        appPreferences.updateData {
            it.toBuilder()
                .setSampleText(text)
                .build()
        }
    }

    override suspend fun clearAll() {
        appPreferences.updateData {
            it.toBuilder().clear().build()
        }
    }
}