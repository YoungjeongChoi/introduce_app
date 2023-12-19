package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logoutBtn = findViewById<Button>(R.id.btn_logout)
        val yourName = intent.getStringExtra("myname")
        val yourId = intent.getStringExtra("Id")

        var introId = findViewById<TextView>(R.id.tv_id_content)
        var introName = findViewById<TextView>(R.id.tv_name_content)

        introId.setText(yourId.toString())
        introName.setText(yourName.toString())

        //자기소개 사진 랜덤으로 출력

        logoutBtn.setOnClickListener {
            //로그아웃이니까 입력된 정보 초기화?는 안 해도 되나...
            finish()
        }
    }

}