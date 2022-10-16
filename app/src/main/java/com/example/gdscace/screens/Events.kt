package com.example.gdscace.screens


import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gdscace.model.EventDataModel

@Composable
fun EventScreen(dataModel: List<EventDataModel>){
    LazyColumn{
        items(dataModel) {
                item -> EventCard(dataModel = item)
        }
    }
}

@Composable
fun EventCard(dataModel: EventDataModel) {
    Card(modifier = Modifier.padding(16.dp), shape = RoundedCornerShape(12.dp), elevation = 14.dp) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Image(
                painter = painterResource(dataModel.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp),
                contentScale = ContentScale.Crop
            )
                Column(Modifier.padding(10.dp)) {
                    Text(
                        text = LocalContext.current.getString(dataModel.titlestringResourceId),
                        style = MaterialTheme.typography.h6
                    )
                    Text(text = LocalContext.current.getString(dataModel.tagResourceId),
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.Start)
                    )
            }
        }
    }
}