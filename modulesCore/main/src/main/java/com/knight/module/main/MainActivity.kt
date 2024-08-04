package com.knight.module.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.knight.librarybase.User

@Route(path = "/main/MainActivity")
public class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"

    @Autowired(name = "key1")
    @JvmField
    var key1Value: Long? = 1L

    @Autowired(name = "key2")
    @JvmField
    var key2Value: String? = ""

    @Autowired(name = "key3")
    @JvmField
    var key3Value: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "------1 ${key1Value}")
        Log.d(TAG, "------2 ${key1Value}")
        Log.d(TAG, "------3 ${key3Value?.userName}")
    }
}
