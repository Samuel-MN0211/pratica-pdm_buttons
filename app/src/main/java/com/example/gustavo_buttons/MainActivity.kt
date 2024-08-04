package com.example.gustavo_buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    var message by remember { mutableStateOf("Pressione um botão") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = message, fontSize = 20.sp)

        Button(onClick = { message = "Botão padrão pressionado" }) {
            Text("Button")
        }

        ElevatedButton(onClick = { message = "Botão elevado pressionado" }) {
            Text("ElevatedButton")
        }

        FilledTonalButton(onClick = { message = "Botão tonal preenchido pressionado" }) {
            Text("FilledTonalButton")
        }

        OutlinedButton(onClick = { message = "Botão contornado pressionado" }) {
            Text("OutlinedButton")
        }

        TextButton(onClick = { message = "Botão de texto pressionado" }) {
            Text("TextButton")
        }
    }
}
