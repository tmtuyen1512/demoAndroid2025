package com.delfi.demo2025

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.delfi.demo2025.ui.theme.DemoApplicationTheme
import com.delfi.feature1.HomeActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )

                    Button(onClick = {
                        val intent = Intent(this, HomeActivity::class.java)
                        startActivity(intent)
//        createFeatureHomeIntent();
                    }) {
                        Text(text = "Hello 1!", modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoApplicationTheme {
        Greeting("Android")
    }
}