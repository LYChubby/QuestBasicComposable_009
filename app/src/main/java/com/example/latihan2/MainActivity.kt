package com.example.latihan2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihan2.ui.theme.Latihan2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Latihan2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(

                        Disney = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(Disney: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Indonesia", modifier = Disney,
            fontSize = 70.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Versus",
            style = TextStyle(
                fontSize = 50.sp,
                color = Color.Blue,
                fontStyle = FontStyle.Italic
            )
        )
        Image(painter = painterResource(id = R.drawable.afc),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )

        Text(
            text = "Nama"
        )

        Text(
            text = "Fauzi Taufik"
        )

        Text(
            text = "20220140009"
        )

        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = null
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Latihan2Theme {
        Greeting("Android")
    }
}