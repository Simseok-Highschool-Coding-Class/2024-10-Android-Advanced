package space.doky.andadv1.domain.interactor

import space.doky.andadv1.domain.output.AppPreferenceInterface
import javax.inject.Inject

class SetSampleTextCase @Inject constructor(
    private val appPreference: AppPreferenceInterface,
) {
    suspend operator fun invoke(text: String) {
        appPreference.setSampleText(text)
    }
}