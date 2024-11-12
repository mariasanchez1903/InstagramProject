package com.example.instagramproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.instagramproject.profile.ProfileScreen
import com.example.instagramproject.ui.theme.InstagramProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramProjectTheme {
                AppNavigation()
            }
        }
    }
}

