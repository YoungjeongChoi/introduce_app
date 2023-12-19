package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.signin.SignInActivity.Companion.dataStore

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val createBtn = findViewById<Button>(R.id.btn_create)

        val editTextNewName = findViewById<EditText>(R.id.et_name)
        val editTextNewId = findViewById<EditText>(R.id.et_new_id)
        val editTextNewPw = findViewById<EditText>(R.id.et_new_pw)

        val newName = editTextNewName.text.toString()
        val newId = editTextNewId.text.toString()
        val newPw = editTextNewPw.text.toString()
//text.toString()까지 한번에 붙여서 쓰면 안될까... 위젯 부른거만 따로 쓸 일이 있어서?

        createBtn.setOnClickListener {


            if (newName.trim().isEmpty()) {
                  Toast.makeText(this, "이름을 입력하세요", Toast.LENGTH_SHORT).show()

            }else if (newId.isEmpty()) {
                Toast.makeText(this, "ID를 입력하세요", Toast.LENGTH_SHORT).show()
            }else if (newPw.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
            }
//            when {
////                newName.trim().isEmpty() -> {
////                    Toast.makeText(this, "이름을 입력하세요", Toast.LENGTH_SHORT).show()
////                }
//                newId.isEmpty() -> {
//                    Toast.makeText(this, "ID를 입력하세요", Toast.LENGTH_SHORT).show()
//                }
//                newPw.isEmpty() -> {
//                    Toast.makeText(this, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
//                }
//                else -> {
//                    //AccountData.storeData(newName, newId, newPw)
//                    //삽질 흔적...
//                    Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
//                    var intent = Intent(this, HomeActivity::class.java)
//                    intent.putExtra("name", newName)
//                    finish()
//                }
//            }
        }

        //추가과제 resisterForActivityResult?로 회원가입 시 입력한 아이디 비번 자동입력
    }
}