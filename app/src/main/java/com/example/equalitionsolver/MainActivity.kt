package com.example.equalitionsolver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.equalitionsolver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        var myEq = MyData(binding)

        binding.mydata = myEq





    }

}