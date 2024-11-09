package com.example.instagramproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramproject.home.HomeScreen
import com.example.instagramproject.home.InstagramToolBar
import com.example.instagramproject.profile.ProfileScreen
import com.example.instagramproject.ui.theme.InstagramProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramProjectTheme {
               ProfileScreen()
                //HomeScreen()
            }
        }
    }
}

