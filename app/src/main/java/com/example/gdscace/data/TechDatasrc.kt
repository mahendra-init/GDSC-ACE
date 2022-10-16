package com.example.gdscace.data

import com.example.gdscace.R
import com.example.gdscace.model.Techdatamodel

class TechDatasrc {
    fun loadDataModels(): List<Techdatamodel> {
        return listOf<Techdatamodel>(
            Techdatamodel(R.drawable.tech1, R.string.techtitle1, R.string.techdesc1),
            Techdatamodel(R.drawable.tech2, R.string.techtitle2, R.string.techdesc2),
            Techdatamodel(R.drawable.tech3, R.string.techtitle3, R.string.techdesc3),
            Techdatamodel(R.drawable.tech4, R.string.techtitle4, R.string.techdesc4),
            Techdatamodel(R.drawable.tech5, R.string.techtitle5, R.string.techdesc5),
            Techdatamodel(R.drawable.tech6, R.string.techtitle6, R.string.techdesc6),
            Techdatamodel(R.drawable.tech7, R.string.techtitle7, R.string.techdesc7)
        )
    }
}