package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    TitleCard()
    DetailsCard()

}

@Composable
fun TitleCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
        )
        Text(
            text = stringResource(R.string.name_details),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(R.string.message),
            color = Color(0xFF3ddc84)
        )
    }
}

@Composable
fun DetailsCard() {
    val phoneIcon = Icons.Filled.Phone
    val shareIcon = Icons.Filled.Share
    val emailIcon = Icons.Filled.Email
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .wrapContentSize(Alignment.BottomCenter)
            .padding(bottom = 70.dp)
    ) {
        Divider(color = Color.Gray, thickness = 1.dp)
        Row(
            modifier = Modifier
                //.border(BorderStroke(1.dp, Color.White))
                .padding(10.dp)
        ) {
            Icon(
                imageVector = phoneIcon,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                text = stringResource(R.string.contact_number),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start)
                    .padding(start = 10.dp)
            )
        }
        Divider(color = Color.Gray, thickness = 1.dp)
        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Icon(
                imageVector = shareIcon,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                text = "@AndroidDev",
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start)
                    .padding(start = 10.dp)
            )
        }
        Divider(color = Color.Gray, thickness = 1.dp)
        Row(
            modifier = Modifier
                //.border(BorderStroke(1.dp, Color.White))
                .padding(10.dp)
        ) {
            Icon(
                imageVector = emailIcon,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                text = stringResource(R.string.email_details),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start)
                    .padding(start = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    ComposeAppTheme {
        BusinessCard()
    }
}