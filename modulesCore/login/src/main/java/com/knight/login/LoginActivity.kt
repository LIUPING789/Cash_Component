package com.knight.login

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.knight.librarybase.User
import com.knight.module.login.R

@Route(path = "/login/LoginActivity")
class LoginActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.loginButton).setOnClickListener {
//            Router.getInstance().startActivity(this, "/main/MainActivity")

            ARouter.getInstance().build("/main/MainActivity")
                .withLong("key1", 666L)
                .withString("key2", "888")
                .withSerializable("key3", User("Knight", "1111"))
                .navigation()
        }
    }
}
