package com.example.sample1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickhandler","button clicked")

        var hIntent:Intent = Intent(this,newpage::class.java)
        hIntent.putExtra("mykey","android-sample1")
        startActivity(hIntent)
    }
}


fun main(){
    val output = {a: Double -> a%2.0 ==0.0 }
    print(output(4.0))
}