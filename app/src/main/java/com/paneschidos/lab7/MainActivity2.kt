package com.paneschidos.lab7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Sname.text = intent.getStringExtra("name")
        Saddress.text = intent.getStringExtra("address")
        Scity.text = intent.getStringExtra("city")
        Sstate.text = intent.getStringExtra("state")
        Spostal.text = intent.getStringExtra("postal")
        Scountry.text = intent.getStringExtra("country")
    }
    fun Accept(view: View){
        var agree = Intent(this,ThankYou::class.java)
        startActivity(agree)
    }
    fun Edit(view: View){
        onBackPressed()
    }
}