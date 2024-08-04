package com.knight.cash_component

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.knight.librouter.Router


class StartActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        findViewById<Button>(R.id.startButton).setOnClickListener({
//            Router.getInstance().startActivity(this, "/login/LoginActivity")
            ARouter.getInstance().build("/login/LoginActivity").navigation()
        })
    }
}
