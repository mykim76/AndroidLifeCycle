package com.example.androidlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면","onCreate 실행됨")
        btnGoToOther.setOnClickListener {

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun onResume() {
        super.onResume()
        //onCreate 가 실행 된 후 onResume 실행 함
        //화면 이동 후 돌아올 때 onCreate는 실행되지 않지만 onResume을 실행 함=>가려졌다가 다시 나타날 때 실행됨
        Log.d("메인화면","onResume 실행됨")
    }
}
