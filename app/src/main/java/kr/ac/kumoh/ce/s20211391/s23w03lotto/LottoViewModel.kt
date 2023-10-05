package kr.ac.kumoh.ce.s20211391.s23w03lotto

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class LottoViewModel : ViewModel( ) {
    //private var _numbers = intArrayOf(0, 0, 0, 0, 0, 0)
    private var _numbers = MutableLiveData<IntArray>(IntArray(6) { 0 })
    val numbers: LiveData<IntArray>
        get() = _numbers
    fun generate() {
        var num = 0
        val newNumbers = IntArray(6){0}
        for (i in newNumbers.indices) {
//            _numbers[i] = Random.nextInt(1, 46)
            // 중복 검사
            do {
                num = Random.nextInt(1, 46)
            } while (newNumbers.contains(num))
            newNumbers[i] = num

            Log.i("Number!!!", newNumbers[i].toString())
        }

        // 정렬
        newNumbers.sort()

        _numbers.value = newNumbers
    }
}