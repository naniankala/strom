package com.example.sample1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import database.Item
import database.ItemDao
import database.ItemRoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first

class HomeActivity : AppCompatActivity() {
    lateinit var dao: ItemDao
    lateinit var tvHome:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        tvHome = findViewById(R.id.tvHome)
        var  database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()

    }

    override fun onStart() {
        super.onStart()
    }


    fun insertDb(view: View) {
        GlobalScope.launch {
            val item = Item(777,"fruits",111.0,22)
            dao.insert(item)

        }
    }

    fun findItemDb(view: View) {
        GlobalScope.launch(Dispatchers.Main) {
            val item = dao.getItem(777).first()
            tvHome.setText(item.itemName)
        }
    }
}