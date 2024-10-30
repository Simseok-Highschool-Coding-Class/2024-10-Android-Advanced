package space.doky.andadv1.presenter

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import space.doky.andadv1.presenter.databinding.ActivityMainBinding
import space.doky.andadv1.presenter.viewmodel.MainViewModel
import space.doky.andadv1.util.AppLog

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppLog.e("=======", "onCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // 텍스트 박스에 입력한 수만큼 카운트 값을 올리고 내리고 싶다.

        // 상태 값 초기 업데이트
        binding.labelCount.text = "${viewModel.count}"

        // + 버튼 처리
        binding.buttonPlus.setOnClickListener {
            // try-catch 문으로 에러를 처리할 수 있습니다.
            try {
                val inputCount = binding.numberInput.text.toString().toInt()
                viewModel.addToCount(inputCount)
            } catch (e: Exception) { }

            binding.labelCount.text = "${viewModel.count}"
        }

        // - 버튼 처리
        binding.buttonMinus.setOnClickListener {
            try {
                val inputCount = binding.numberInput.text.toString().toInt()
                viewModel.addToCount(-inputCount)
            } catch (e: Exception) { }

            binding.labelCount.text = "${viewModel.count}"
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}