package com.example.gdscace.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.gdscace.model.FAQDataModel

@Composable
fun FAQScreen(dataModel: List<FAQDataModel>){
    LazyColumn{
        items(dataModel) {
                item -> FAQCard(dataModel = item)
        }
        item {
            Card(Modifier.fillMaxWidth()) {
            Text(text = "© 2022-2023 | All Rights Reserved.\n" +
                    "\n" +
                    "Feel free to drop us an email at\n" +
                    "we@gdscace.tech", modifier = Modifier.padding(10.dp),
            style = MaterialTheme.typography.subtitle2)
            }
        }
    }
}

@Composable
fun FAQCard(dataModel: FAQDataModel) {
    Card(modifier = Modifier.padding(16.dp), shape = RoundedCornerShape(12.dp), elevation = 14.dp) {
        Column(Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Text(
                text = LocalContext.current.getString(dataModel.quesResourceId),
                style = MaterialTheme.typography.h6
            )
            Text(
                text = LocalContext.current.getString(dataModel.ansResourceId),
                style = MaterialTheme.typography.body1
            )
        }
    }
}