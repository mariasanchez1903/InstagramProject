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
import com.example.instagramproject.profile.components.ProfileStoryHighlight

@Composable
fun ProfileScreen() {
    val user = User(
        username = "mafe_1903",
        profileImageUrl = "https://avatar.iran.liara.run/public/91",
        post = 15,
        followers = 368,
        following = 365,
        name = "Mafe sánchez",
        description = "Mi gran descripción",
        stories = listOf(
            Story(image = "https://loremflickr.com/cache/resized/65535_53117703609_dcbcf906c7_n_320_240_g.jpg", text = "Paris"),
            Story(image = "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg", text = "Playa"),
            Story(image = "https://avatar.iran.liara.run/public/job/farmer/female", text = "Trabajo"),
            Story(image = "https://loremflickr.com/cache/resized/65535_53154913438_e7200b56d0_320_240_nofilter.jpg", text = ":)"),
            Story(image = "https://loremflickr.com/cache/resized/65535_52735999455_63c6d612bd_320_240_nofilter.jpg", text = "gato"),
            Story(image = "https://loremflickr.com/cache/resized/65535_53117703609_dcbcf906c7_n_320_240_g.jpg", text = "Recuerdos"),
            Story(image = "https://loremflickr.com/cache/resized/65535_51441326592_d0f11a924e_320_240_nofilter.jpg", text = "<3"),
            Story(image = "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg", text = "Alegria"),
        )
    )
    Column {
        ProfileHeader(
            backClick = {},
            notificationClick = {},
            optionClick = {},
            username = user.username
        )
        ProfileInformation(
            profileImageUrl = user.profileImageUrl,
            post = user.post,
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
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}