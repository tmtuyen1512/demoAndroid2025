package com.delfi.feature1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.delfi.feature1.ui.main.HomeFragment2

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment2.newInstance())
                .commitNow()
        }
    }

    fun Context.createFeatureHomeIntent(): Intent {
        return Intent(this, HomeActivity::class.java)
    }
}