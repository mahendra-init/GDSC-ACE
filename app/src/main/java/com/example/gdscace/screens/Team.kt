package com.example.gdscace.screens


import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.gdscace.model.TeamDataModel

@Composable
fun TeamScreen(dataModel: List<TeamDataModel>){
    LazyColumn{
        items(dataModel) {
                item -> TeamLeadCard(dataModel = item)
        }
    }
}

@Composable
fun TeamLeadCard(dataModel: TeamDataModel) {
    Card(modifier = Modifier.padding(16.dp), shape = RoundedCornerShape(12.dp), elevation = 14.dp) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .background(color = Color.Blue)) {

                }
                Box(Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(dataModel.imageResourceId),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(200.dp)
                        .border(4.dp, Color.LightGray, CircleShape),
                    contentScale = ContentScale.Crop
                )
                }
            }
            Column(Modifier.padding(15.dp)) {
                    Text(
                        text = LocalContext.current.getString(dataModel.nameResourceId),
                        style = MaterialTheme.typography.h6
                    )
                    Text(text = LocalContext.current.getString(dataModel.fieldResourceId),
                        style = MaterialTheme.typography.subtitle1,
                        textAlign = TextAlign.Justify,
                    )
            }
        }
    }
}