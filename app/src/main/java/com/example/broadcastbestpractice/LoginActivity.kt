package com.example.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.broadcastbestpractice.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {
    private lateinit var activityLoginBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(activityLoginBinding.root)
        activityLoginBinding.Login.setOnClickListener {
            val account = activityLoginBinding.accountEdit.text.toString()
            val password = activityLoginBinding.passwordEdit.text.toString()
            if(account == "admin" && password == "123456") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else {
                Toast.makeText(this, "account or password is invalid", Toast.LENGTH_SHORT).show()
            }
        }
    }
}