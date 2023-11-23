package com.example.composepractise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class TextStylingExercise : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.ubuntu_bold, FontWeight.Bold),
            Font(R.font.ubuntu_light, FontWeight.Light),
            Font(R.font.ubuntu_bold_italic, FontWeight.SemiBold),
            Font(R.font.ubuntu_italic, FontWeight.ExtraBold),
            Font(R.font.ubuntu_medium, FontWeight.Medium),
            Font(R.font.ubuntu_regular, FontWeight.Normal),
        )
        setContent {
            Box(modifier= Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))) {
                Text(
                    text = buildAnnotatedString {
                                                withStyle(
                                                    style = SpanStyle(
                                                        color= Color.Green,
                                                        fontSize = 50.sp,

                                                    )
                                                ){
                                                    append("J")
                                                }
                        append("etpack")

                        withStyle(
                            style = SpanStyle(
                                color= Color.Green,
                                fontSize = 50.sp,

                                )
                        ){
                            append("C")
                        }
                        append("ompose")
                    },
                    //text = "Jetpack Compose",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontFamily=fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,

                )

            }
        }
    }
}