package com.example.sample1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler() {
        Log.i("MainActivity-clickhandler","button clicked")
        val dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9789023677"))  //intent= intention
        startActivity(dialIntent)
    }
}
