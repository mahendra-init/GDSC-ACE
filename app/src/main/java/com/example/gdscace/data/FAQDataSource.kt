package com.example.gdscace.data

import com.example.gdscace.R
import com.example.gdscace.model.FAQDataModel

class FAQDataSource {
    fun loadDataModels(): List<FAQDataModel> {
        return listOf<FAQDataModel>(
            FAQDataModel(R.string.ques1, R.string.ans1),
            FAQDataModel(R.string.ques2, R.string.ans2),
            FAQDataModel(R.string.ques3, R.string.ans3),
            FAQDataModel(R.string.ques4, R.string.ans4)
        )
    }
}