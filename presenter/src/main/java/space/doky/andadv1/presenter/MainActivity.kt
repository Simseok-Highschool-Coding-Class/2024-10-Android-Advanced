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


        // 1. 버튼을 눌렀을 때
        binding.button1.setOnClickListener {

            // 2. EditText에 입력한 값을 가져오기
            val inputText = binding.textBox.text

            // 3. 화면에 띄우기
            binding.title.text = inputText
            binding.button1.text = inputText
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}