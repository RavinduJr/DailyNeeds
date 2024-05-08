package com.ravindu.dailyneeds.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.ravindu.dailyneeds.models.Category

class CategoryAdapter(context: Context, resource: Int, categoryList: ArrayList<Category>): ArrayAdapter<Category>(context, resource, categoryList) {
    private val mContext: Context
    private val mResource: Int

    init {
        mContext = context
        mResource = resource
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(mContext)
        val rowMain = layoutInflater.inflate(mResource, parent, false)
        return rowMain
    }
}