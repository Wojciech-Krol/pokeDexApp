package com.wk.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wk.pokedex.ui.theme.PokeDexTheme

class MainActivity : ComponentActivity() {
    var clicks by mutableStateOf(0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeDexTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    ClickCounter(clicks){clicks++}
                    Pokemon()
                }
            }
        }
    }
    @Composable
    fun ClickCounter(clicks: Int, onClick: () -> Unit) {
        Button(onClick = onClick) {
            clicks.let {
                if (it == 0) {
                    Text("Click me!")
                } else {
                    Text("I've been clicked $clicks times")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokeDexTheme {
        Greeting("Android")
    }
}
@Composable
fun Pokemon() {
    //val pokeApi=
}
