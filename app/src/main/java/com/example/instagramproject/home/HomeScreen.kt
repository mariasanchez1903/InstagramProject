package com.example.instagramproject.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramproject.profile.ProfileScreen
import com.example.instagramproject.profile.UserRepository
import com.example.instagramproject.profile.components.ProfileStoryHighlight

@Composable
fun HomeScreen(){
    val user = UserRepository.getUser()

    val posts = user.posts.map { postUrl ->
        Post(
            username = user.username,
            profileImageUrl = user.profileImageUrl,
            postImageUrl = postUrl,
            description = "Una linda vista al mar 🌊"
        )
    }
    Column {
        InstagramToolBar()
        ProfileStoryHighlight(
            stories = user.stories,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        HomePost(posts = posts)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}