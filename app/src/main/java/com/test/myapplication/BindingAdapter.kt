package com.test.myapplication

import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

//livedatayic int@ vercnum enq u mer view-i visibilityn dnum enq
@BindingAdapter("app:hideIfZero")
    fun hideIfZero(view : View, number : Int ){
        if(number==0){
            view.visibility = View.GONE;
        }
        else {
            view.visibility = View.VISIBLE;
        }
    }

//function@ 3 argument a @ndunum progressbar@ henc mer view a , number@ liveDatayic enq vercnum
//isk max@ android:max um set enq anum 100
@BindingAdapter(value = ["app:progressScaled","android:max"], requireAll = true)
    fun setProgress(progressBar : ProgressBar, number : Int, max : Int){
    progressBar.progress = (number*max/5).coerceAtMost(max)
}