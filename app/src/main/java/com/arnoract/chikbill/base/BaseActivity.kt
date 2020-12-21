package com.arnoract.chikbill.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        bindView()
        onCreate()
        replaceFragment()
        initial()
    }
    open fun onCreate() {}

    open fun bindView() {}

    open fun initial() {

    }

    open  fun replaceFragment() {

    }

}