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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.gdscace.R
import com.example.gdscace.model.Techdatamodel

@Composable
fun TechScreen(dataModel: List<Techdatamodel>){
    LazyColumn{
        items(dataModel) {
                item -> TechnologyScreen(dataModel = item)
        }
    }
}

@Composable
fun TechnologyScreen(dataModel: Techdatamodel) {
    Card(modifier = Modifier.padding(16.dp), shape = RoundedCornerShape(12.dp), elevation = 14.dp) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(10.dp)) {
            Image(
                painter = painterResource(dataModel.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
                    Text(
                        text = LocalContext.current.getString(dataModel.titlestringResourceId),
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.Start)
                    )
                    Text(
                        text = LocalContext.current.getString(dataModel.descstringResourceId),
                        style = MaterialTheme.typography.button,
                        textAlign = TextAlign.Justify,
                    )
            Button(onClick = { /*TODO*/ }, elevation = ButtonDefaults.elevation(10.dp),
                modifier = Modifier.padding(4.dp)) {
                Text(text = stringResource(id = R.string.codelab),
                    style = MaterialTheme.typography.button)
            }
        }
    }
}