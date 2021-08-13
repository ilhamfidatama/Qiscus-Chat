package com.ilhamfidatama.qiscus_chat.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilhamfidatama.qiscus_chat.R
import com.ilhamfidatama.qiscus_chat.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        viewBinding = ActivityLoginBinding.inflate(layoutInflater)

        viewBinding.loginBtn.setOnClickListener {
            viewBinding.apply {
                val userID = userIDEdt.text.toString()
                val displayName = displayNameEdt.text.toString()
                val userKey = userKeyEdt.text.toString()
                // TODO: 14/08/21 login to qiscus
            }
        }
    }
}