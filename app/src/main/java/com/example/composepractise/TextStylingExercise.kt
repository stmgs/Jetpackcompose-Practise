package com.example.composepractise

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composepractise.ui.theme.ComposePractiseTheme

class TextStylingExercise : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.Ubuntu_Bold, FontWeight.Bold),
            Font(R.font.Ubuntu_Light, FontWeight.Light)
        )
        setContent {
            Box(modifier= Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))) {
                Text(text = "Jetpack Compose",
                    color = Color.White,
                    fontSize = 16.sp,


                )

            }
        }
    }
}