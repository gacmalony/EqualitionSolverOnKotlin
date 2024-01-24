package com.example.equalitionsolver


import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.equalitionsolver.databinding.ActivityMainBinding

class MyData(var binding: ActivityMainBinding): BaseObservable() {

    @Bindable
    var input1:String = ""
        set(value){
            field=value
            notifyPropertyChanged(BR.input1)
        }
    @Bindable
    var input2:String = ""
        set(value){
            field=value
            notifyPropertyChanged(BR.input2)
        }
    @Bindable
    var input3:String = ""
        set(value){
            field=value
            notifyPropertyChanged(BR.input3)
        }


    fun solverEq(view: View){

        var input11 = input1.toInt()
        var input12 = input2.toInt()
        var input13 = input3.toInt()

        var disc = ((input12 * input12) - (4 * input11 * input13))

        var x1: Double
        var x2: Double

        if (disc > 0) {
            x1 = (-input12 + Math.sqrt(disc.toDouble())) / (2 * input11)
            x2 = (-input12 - Math.sqrt(disc.toDouble())) / (2 * input11)
            binding.output1.text = "$x1"
            binding.output2.text = "$x2"

        }else{
            binding.output1.text = "NO REAL ROOTS"
            binding.output2.text = "NO REAL ROOTS"

        }


    }

    }