package com.ptz.tempo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ptz.tempo.ui.theme.TempoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TempoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
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
    TempoTheme {
        Greeting("Android")
    }
}

@Composable
@Preview(showBackground = true, widthDp = 390, heightDp = 800)
fun HomeScreen()
{
    Column(){
    NavegacaoEPesquisaComponent()
    wellcomeMessageComponent()
    ImagePreviewComponent()
    SavenDaysForecastComponent()
    }
}
@Composable
@Preview(showBackground = true, widthDp = 390)
fun NavegacaoEPesquisaComponent(): Unit {
    Row( modifier = Modifier
        .fillMaxWidth()
        .padding(15,dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
    }
}

@Composable
fun wellcomeMessageComponent(): Unit {

}

@Composable
fun ImagePreviewComponent(): Unit {

}

@Composable
fun SavenDaysForecastComponent(): Unit {

}