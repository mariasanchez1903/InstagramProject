package com.example.instagramproject.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramproject.profile.components.ProfileAction
import com.example.instagramproject.profile.components.ProfileDescription
import com.example.instagramproject.profile.components.ProfileHeader
import com.example.instagramproject.profile.components.ProfileInformation
import com.example.instagramproject.profile.components.ProfilePost
import com.example.instagramproject.profile.components.ProfileStoryHighlight

@Composable
fun ProfileScreen() {
    val user = UserRepository.getUser()
    Column {
        ProfileHeader(
            backClick = {},
            notificationClick = {},
            optionClick = {},
            username = user.username
        )
        ProfileInformation(
            profileImageUrl = user.profileImageUrl,
            post = user.posts.size,
            followers = user.followers,
            following = user.following,
        )
        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                top = 4.dp,
                bottom = 4.dp
            )
        )
        ProfileAction(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        ProfileStoryHighlight(
            stories = user.stories,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        ProfilePost(images = user.posts, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}