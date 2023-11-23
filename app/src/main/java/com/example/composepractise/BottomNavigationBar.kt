package com.example.composepractise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composepractise.data.BottomNavItem
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationBar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "home") {
        composable("home") {
            HomeScreen()
        }

        composable("chat") {
            UIClass2()
        }

        composable("settings") {
            val painter = painterResource(id = R.drawable.luffy_wanted)
            val description = "Luffy becomes a Yonkou and have awakened the devil fruit power"
            val title = "New Wanted poster for luffy with 3000k Bounty"
            ImageCard(painter = painter, contentDescription = description, title = title)
        }
    }
}

@Composable
fun BottomNavigationBar(
    items : List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
     onItemClick : (BottomNavItem) -> Unit
) {


}

@Composable
fun HomeScreenBottomNav() {
    Box(
        modifier =Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Home Screen")
    }

}

@Composable
fun ChatScreenBottomNav() {
    Box(
        modifier =Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Chat Screen")
    }

}

@Composable
fun SettingsScreenBottomNav() {
    Box(
        modifier =Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Settings Screen")
    }

}
