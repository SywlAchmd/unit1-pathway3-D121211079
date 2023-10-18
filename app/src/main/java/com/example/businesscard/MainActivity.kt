/*
    Mohammad Syawal Achmad
    D121211079
    Unit 1 Pathway 3
 */

package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        stringResource(R.string.full_name),
                        stringResource(R.string.title),
                        stringResource(R.string.phone),
                        stringResource(R.string.socialMedia),
                        stringResource(R.string.email)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    fullName: String,
    title: String,
    phone: String,
    socialMedia: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Surface(color = Color(0xffc3f6c3)) {
        // Wrapper
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier.height(250.dp))

            // Kolom pertama untuk menampilkan logo, nama, dan judul
            Column {
                val image = modifier
                    .size(120.dp)
                    .background(Color.Black)
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(R.drawable.android_logo),
                        contentDescription = null,
                        modifier = image
                    )
                    Text(
                        text = fullName,
                        fontSize = 30.sp,
                        color = Color.Black,
                        modifier = modifier.padding(top = 4.dp)
                    )
                    Text(
                        text = title,
                        fontSize = 14.sp,
                        color = Color(0xFF116e11),
                        fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(top = 12.dp)
                    )
                }
            }

            // Kolom kedua untuk menampilkan detail kontak
            Column {
                Spacer(modifier.height(200.dp))
                Row {
                    Icon(
                        Icons.Rounded.Call,
                        contentDescription = null,
                        tint = Color(0xFF116e11),
                        modifier = modifier.padding(end = 12.dp)
                    )
                    Text(
                        text = phone,
                        color = Color.Black,
                    )
                }

                Spacer(modifier.height(10.dp))

                Row {
                    Icon(
                        Icons.Rounded.Share,
                        contentDescription = null,
                        tint = Color(0xFF116e11),
                        modifier = modifier.padding(end = 12.dp)
                    )
                    Text(
                        text = socialMedia,
                        color = Color.Black
                    )
                }

                Spacer(modifier.height(10.dp))

                Row {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = null,
                        tint = Color(0xFF116e11),
                        modifier = modifier.padding(end = 12.dp)
                    )
                    Text(
                        text = email,
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            stringResource(R.string.full_name), 
            stringResource(R.string.title),
            stringResource(R.string.phone),
            stringResource(R.string.socialMedia),
            stringResource(R.string.email)
        )
    }
}