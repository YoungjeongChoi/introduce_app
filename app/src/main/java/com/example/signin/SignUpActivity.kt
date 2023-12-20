package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.signin.SignInActivity.Companion.dataStore

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val createBtn = findViewById<ConstraintLayout>(R.id.btn_create)

        val editTextNewName = findViewById<EditText>(R.id.et_name)
        val editTextNewId = findViewById<EditText>(R.id.et_new_id)
        val editTextNewPw = findViewById<EditText>(R.id.et_new_pw)

        createBtn.setOnClickListener {

            val newName = editTextNewName.text.toString()
            val newId = editTextNewId.text.toString()
            val newPw = editTextNewPw.text.toString()


            //여러 개 비어있어도 메시지가 제일 위에 하나만 출력되는 게 아니라 뭔가 여러 개가 시간차 두고 순서대로 뜨거나 하면 좋을 것 같은데 어떻게 해야 될지 모르겠다
            //아니면 비어있는 거 있을 때 버튼 누르면 빨간색으로 바뀌면서 그 자리로 커서 옮기기...같은 거?
            when {
                newName.trim().isEmpty() -> {
                    Toast.makeText(this, "이름을 입력하세요", Toast.LENGTH_SHORT).show()
                }
                newId.trim().isEmpty() -> {
                    Toast.makeText(this, "ID를 입력하세요", Toast.LENGTH_SHORT).show()
                }
                newPw.trim().isEmpty() -> {
                    Toast.makeText(this, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    //AccountData.storeData(newName, newId, newPw)
                    //삽질 흔적...
                    val intent = Intent(this, SignInActivity::class.java).apply {
                        putExtra("name", newName)
                        putExtra("Id", newId)
                        putExtra("Pw", newPw)
                    }
                    Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
                    setResult(RESULT_OK, intent)
//                    startActivity(intent)

                    if (!isFinishing) finish()
                }
            }
        }

        //추가과제 resisterForActivityResult?로 회원가입 시 입력한 아이디 비번 자동입력?
        //따라치긴 했는데 코드 부분부분?은 잘 이해 못 하겠다... apply는 왜 쓰는 거지
    }
}