package com.arnoract.chikbill.custom_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import com.arnoract.chikbill.R

class CustomToolbar : LinearLayout, View.OnClickListener {

    var toolbarListener: ToolbarListener? = null

    lateinit var tvToolbar: TextView
    lateinit var imgToolbar: ImageButton


    constructor(context: Context) : super(context) {
        initial(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initial(context)
    }

    private fun initial(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as? LayoutInflater
        val view = inflater?.inflate(R.layout.custom_toolbar, this)
        bindingData(view)
        initialData()
    }

    private fun bindingData(view: View?) {
        tvToolbar = view?.findViewById(R.id.tv_toolbar)!!
        imgToolbar = view.findViewById(R.id.img_back)
    }

    private fun initialData() {
        imgToolbar.setOnClickListener(this)
    }

    fun setTitle(string: String) {
        tvToolbar.text = string
    }

    fun setImageBack(icon : Int) {
        imgToolbar.setBackgroundResource(icon);
    }


    interface ToolbarListener {
        fun <T> onClickedBack(value: T)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.img_back) toolbarListener?.onClickedBack("onClickedBack")
    }

}