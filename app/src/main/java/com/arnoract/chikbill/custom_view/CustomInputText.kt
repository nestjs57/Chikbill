package com.arnoract.chikbill.custom_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.arnoract.chikbill.R

class CustomInputText :  LinearLayout{

    constructor(context: Context) : super(context) {
        initial(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initial(context)
    }

    private fun initial(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as? LayoutInflater
        val view = inflater?.inflate(R.layout.custom_input_text, this)
        bindingData(view)
        initialData()
    }

    private fun bindingData(view: View?) {


    }

    private fun initialData() {

    }
}