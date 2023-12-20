package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import java.lang.Math.random
import java.util.Random

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logoutBtn = findViewById<Button>(R.id.btn_logout)
        val yourName = intent.getStringExtra("name")
        val yourId = intent.getStringExtra("Id")

        //팀원분이 만드신 것처럼 이미지뷰 아이디 리스트로 만들어놓으면 더 깔끔할 것 같다 고치기
        val rand = Random()
        val num = rand.nextInt(5)

        //작동에는 문제가 없는데 drawable에 있는 이미지 빨간줄은 왜 생긴 거지 모르겠다...
        val randImg1 = findViewById<ImageView>(R.id.img_home_logo)
        val randImg2 = findViewById<ImageView>(R.id.img_home_logo2)
        val randImg3 = findViewById<ImageView>(R.id.img_home_logo3)
        val randImg4 = findViewById<ImageView>(R.id.img_home_logo4)
        val randImg5 = findViewById<ImageView>(R.id.img_home_logo5)
        val introId = findViewById<TextView>(R.id.tv_id_content)
        val introName = findViewById<TextView>(R.id.tv_name_content)

        when(num) {
            0 -> {
                randImg1.isVisible = true
            }
            1 -> {
                randImg2.isVisible = true
            }
            2 -> {
                randImg3.isVisible = true
            }
            3 -> {
                randImg4.isVisible = true
            }
            4 -> {
                randImg5.isVisible = true
            }
        }
        introId.setText(yourId.toString())
        introName.setText(yourName.toString())


        logoutBtn.setOnClickListener {
            //로그아웃이니까 입력된 정보 초기화?는 안 해도 되나...?
            finish()
        }
    }

}