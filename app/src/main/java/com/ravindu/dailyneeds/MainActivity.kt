package com.ravindu.dailyneeds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.ravindu.dailyneeds.adapters.CategoryAdapter
import com.ravindu.dailyneeds.models.Category

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.categoryList)
        val r = ArrayList<Category>()
        r.add(Category("R", "I"))
        r.add(Category("R", "I"))
        val categoryAdapter = CategoryAdapter(this, R.layout.category_item_row, r)

        listView.adapter = categoryAdapter

    }
}