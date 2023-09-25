package kr.ac.kumoh.ce.s20211391.s23w03lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.ce.s20211391.s23w03lotto.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    //C++ struct class 차이점 - default가 public, private
    private lateinit var main: ActivityMainBinding // port - 세로
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Lifecycle!!!", "onCreate()")
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnGenerate.setOnClickListener {
            main.num1.text = Random.nextInt(1, 46).toString()
            main.num2.text = Random.nextInt(1, 46).toString()
            main.num3.text = Random.nextInt(1, 46).toString()
            main.num4.text = Random.nextInt(1, 46).toString()
            main.num5.text = Random.nextInt(1, 46).toString()
            main.num6.text = Random.nextInt(1, 46).toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle!!!", "onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle!!!", "onPause()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle!!!", "onResume()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Lifecycle!!!", "onRestart()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle!!!", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle!!!", "onDestroy()")
    }
}