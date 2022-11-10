package com.paneschidos.lab7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.paneschidos.lab7.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
    }
    fun mySchedule(view: View){
        var intent = Intent(this@MainActivity,MainActivity2::class.java)
        intent.putExtra("name",name.text.toString())
        intent.putExtra("address",address.text.toString())
        intent.putExtra("city",city.text.toString())
        intent.putExtra("state",state.text.toString())
        intent.putExtra("postal",code.text.toString())
        intent.putExtra("country",country.text.toString())
        startActivity(intent)
    }
}