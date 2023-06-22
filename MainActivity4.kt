package com.example.stanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val title = findViewById<TextView>(R.id.activity_item_list_title)
        val text = findViewById<TextView>(R.id.activity_item_list_dress)
        val price = findViewById<TextView>(R.id.activity_item_list_price)


        title.text = intent.getStringExtra("itemTitle")
        text.text = intent.getStringExtra("itemText")
        price.text = intent.getStringExtra("itemPrice")
    }
}