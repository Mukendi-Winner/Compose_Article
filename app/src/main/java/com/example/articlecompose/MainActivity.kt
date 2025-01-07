package com.example.articlecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articlecompose.ui.theme.ArticleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticleComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column {
                        WelcomeImage()
                        TextArticle()
                    }
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

@Composable
fun WelcomeImage( modifier : Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Box (modifier){
        Image(
            painter = image,
            contentDescription = null,

            alpha = 0.5F
        )
    }
}

@Composable
fun TextArticle (modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(R.string.article_title),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp,


        )

        Text (
            text = stringResource(R.string.first_paragraph),
            modifier = Modifier.padding(16.dp),
            fontSize = 16.sp,
            lineHeight = 24.sp,
            textAlign = Justify

        )

        Text (
            text = stringResource(R.string.second_paragraph),
            modifier = Modifier.padding(16.dp),
            fontSize = 16.sp,
            lineHeight = 24.sp,
            textAlign = Justify
        )
    }
}

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
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleComposeTheme {
        WelcomeImage()
        TextArticle()

    }
}