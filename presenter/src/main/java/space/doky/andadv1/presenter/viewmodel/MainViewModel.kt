package space.doky.andadv1.presenter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import space.doky.andadv1.domain.interactor.GetSampleTextCase
import space.doky.andadv1.domain.interactor.SetSampleTextCase
import space.doky.andadv1.util.di.IODispatcher
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val getSampleTextCase: GetSampleTextCase,
    private val setSampleTextCase: SetSampleTextCase,
): ViewModel() {
    private val _sampleTextSharedFlow = MutableSharedFlow<String>()
    val sampleTextSharedFlow = _sampleTextSharedFlow

    private val _sampleTextStateFlow = MutableStateFlow<String>("init")
    val sampleTextStateFlow = _sampleTextStateFlow

    init {
        viewModelScope.launch {
            getSampleTextCase().collectLatest {
                _sampleTextStateFlow.emit(it)
                _sampleTextSharedFlow.emit(it)
            }
        }
    }

    fun setSampleText(text: String) {
        viewModelScope.launch {
            withContext(ioDispatcher) {
                setSampleTextCase(text)
            }
        }
    }
}