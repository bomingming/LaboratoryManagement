package com.example.laboratorymanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        startLoading()
    }
    
    // 화면 로딩 메소드
    private fun startLoading(){
        Handler(Looper.getMainLooper()).postDelayed({}, 3000)
    }
}