package com.knight.login

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.knight.librouter.Router
import com.knight.module.login.R

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.loginButton).setOnClickListener({
            Router.getInstance().startActivity(this, "/main/MainActivity")
        }
        )
    }
}
