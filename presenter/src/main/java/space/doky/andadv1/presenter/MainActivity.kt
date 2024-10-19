package space.doky.andadv1.presenter

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import space.doky.andadv1.presenter.databinding.ActivityMainBinding
import space.doky.andadv1.presenter.viewmodel.MainViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.textBox.addTextChangedListener {
//            AppLog.e(TAG, "onCreate", "text changed: $it")
//            viewModel.setSampleText(it.toString())
//        }
//
//        lifecycleScope.launch {
//            viewModel.sampleTextSharedFlow.collectLatest {
//                AppLog.e(TAG, "onCreate", "shared flow: $it")
//                binding.title.text = it
//            }
//        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}