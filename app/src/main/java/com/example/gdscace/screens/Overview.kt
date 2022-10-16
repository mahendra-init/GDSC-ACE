package com.example.gdscace.screens

import android.content.Intent
import android.net.Uri
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gdscace.R

@Composable
fun OverviewScreen(){
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://gdsc.community.dev/atharva-college-of-engineering-mumbai/")) }

    Column(modifier = Modifier
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Image(painter = painterResource(id = R.drawable.gdsc_overpage_img),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop)
        Text(text = stringResource(id = R.string.gdsc_desc), Modifier.padding(12.dp),
        style = MaterialTheme.typography.button)
        Button(onClick = { context.startActivity(intent) }, elevation = ButtonDefaults.elevation(10.dp),
            modifier = Modifier.padding(4.dp)) {
            Text(text = stringResource(id = R.string.member),
                style = MaterialTheme.typography.button)
        }
        Text(text = stringResource(id = R.string.Opp),
            modifier = Modifier.padding(horizontal = 10.dp),
        style = MaterialTheme.typography.h5)
        OverviewScreenCard(R.drawable.connect, R.string.connect_title, R.string.connect_desc)
        OverviewScreenCard(R.drawable.learn, R.string.learn_title, R.string.learn_desc)
        OverviewScreenCard(R.drawable.grow, R.string.grow_title, R.string.grow_desc)
        Spacer(modifier = Modifier.height(5.dp))
        }
}

@Composable
fun OverviewScreenCard(@DrawableRes imageId: Int, @StringRes title: Int, @StringRes desc: Int) {
    Card(modifier = Modifier.padding(horizontal = 20.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 14.dp,
        backgroundColor = MaterialTheme.colors.surface) {
            Column(modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = imageId),
                    contentDescription = stringResource(id = title),
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop)
                Text(text = stringResource(id = title),
                style = MaterialTheme.typography.h6)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = stringResource(id = desc),
                    style = MaterialTheme.typography.button,
                    modifier = Modifier.padding(horizontal = 10.dp).fillMaxWidth())
            }
        }
}
@Composable
@Preview
fun OverviewScreenPreview() {
    OverviewScreen()
}