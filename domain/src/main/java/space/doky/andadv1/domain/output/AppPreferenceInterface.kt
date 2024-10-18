package space.doky.andadv1.domain.output

import kotlinx.coroutines.flow.Flow

interface AppPreferenceInterface {
    fun getSampleText(): Flow<String>
    suspend fun setSampleText(text: String)

    suspend fun clearAll()
}