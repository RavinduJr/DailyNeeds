package com.ravindu.dailyneeds.models

class Category(categoryName: String, categoryImage: String) {
    private val categoryName: String;
    private val categoryImage: String;

    init {
        this.categoryName = categoryName
        this.categoryImage = categoryImage
    }
}