package com.arnoract.chikbill.features.share_with_food_delivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arnoract.chikbill.R
import com.arnoract.chikbill.base.BaseActivity
import kotlinx.android.synthetic.main.activity_food_delivery.*

class FoodDeliveryActivity : BaseActivity(R.layout.activity_food_delivery) {

    override fun replaceFragment() {
        super.replaceFragment()
        val fragment = FoodDeliveryFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(fl_container.id, fragment).commit()
    }

}