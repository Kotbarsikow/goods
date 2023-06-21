package com.example.stanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val itemsList = findViewById<RecyclerView>(R.id.itemslist)
        val items = arrayListOf<Item>()

        items.add(Item(1, "","Sofa", "Диван","lorem",100))
        items.add(Item(2, "","Light", "Світло","lorem",100))
        items.add(Item(3, "","kitchen", "Кухня","lorem",100))
        items.add(Item(4, "","toilet", "Туалет","lorem",100))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}