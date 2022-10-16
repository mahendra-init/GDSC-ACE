package com.example.gdscace.data

import com.example.gdscace.R
import com.example.gdscace.model.EventDataModel

class EventDataSource {
    fun loadDataModels(): List<EventDataModel> {
        return listOf<EventDataModel>(
            EventDataModel(R.drawable.event1, R.string.eventtitle1, R.string.eventtitlefor1),
        )
    }
}