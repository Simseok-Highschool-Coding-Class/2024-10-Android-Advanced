package space.doky.andadv1.domain.interactor

import space.doky.andadv1.domain.output.AppPreferenceInterface
import javax.inject.Inject

class GetSampleTextCase @Inject constructor(
    private val appPreference: AppPreferenceInterface,
) {
    operator fun invoke() =
        appPreference.getSampleText()
}