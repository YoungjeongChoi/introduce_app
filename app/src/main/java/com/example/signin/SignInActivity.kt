package com.example.signin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View.OnTouchListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

class SignInActivity : AppCompatActivity() {
//datastore 사용 시도
    companion object {
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore("accounts")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sgin_in)

        val signInBtn = findViewById<Button>(R.id.btn_sign_in)
        val signUpBtn = findViewById<Button>(R.id.btn_sign_up)

        val editTextId = findViewById<EditText>(R.id.et_id).text
//            editTextId.onTouchEvent(MotionEvent)
        //선택했을 때 커서가 생기고 hint글씨가 사라지면 좋겠는데... 모르겠다 괜히 자꾸 이상한 데로 빠지지 말자...
        val editTextPw = findViewById<EditText>(R.id.et_pw).text



        signInBtn.setOnClickListener {

            val myName = intent.getStringExtra("name")

            if (editTextId.trim().isEmpty() || editTextPw.trim().isEmpty()) {
                Toast.makeText(this, "아이디/패스워드 입력하세요", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                val id = editTextId.toString()
                val pw = editTextPw.toString()
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
                intent.putExtra("Id", id)
                intent.putExtra("Pw", pw)
                intent.putExtra("myname", myName)
                startActivity(intent)
            }


        }

        signUpBtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}