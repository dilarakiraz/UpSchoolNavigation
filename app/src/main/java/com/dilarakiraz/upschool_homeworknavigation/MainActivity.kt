package com.dilarakiraz.upschool_homeworknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dilarakiraz.upschool_homeworknavigation.common.viewBinding
import com.dilarakiraz.upschool_homeworknavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}