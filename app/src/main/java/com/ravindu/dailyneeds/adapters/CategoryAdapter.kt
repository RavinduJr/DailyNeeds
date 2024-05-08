package com.ravindu.dailyneeds.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.ravindu.dailyneeds.MainActivity
import com.ravindu.dailyneeds.models.Category
import com.ravindu.dailyneeds.R

class CategoryAdapter(context: Context, resource: Int, categoryList: ArrayList<Category>) :
    ArrayAdapter<Category>(context, R.layout.category_item_row, categoryList) {
    private val mContext: Context
    private val mResource: Int
    private val categoryList: ArrayList<Category>

    init {
        mContext = context
        mResource = resource
        this.categoryList = categoryList
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater.inflate(R.layout.category_item_row, parent,false)

        val categoryName = view.findViewById<TextView>(R.id.categoryName)
        categoryName.text = categoryList[position].categoryName

        val categoryImage = view.findViewById<TextView>(R.id.categoryImage)
        categoryImage.text = categoryList[position].categoryImage

        return view
    }
}