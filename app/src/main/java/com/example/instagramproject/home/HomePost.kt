package com.example.instagramproject.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.instagramproject.R

data class Post(
    val username: String,
    val profileImageUrl: String,
    val postImageUrl: String,
    val description: String
)

@Composable
fun HomePost(posts: List<Post>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxWidth()) {
        items(posts){ post ->
            HomePostItem(post = post, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
private fun HomePostItem(
    post: Post,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // Header: Profile picture and username
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        ) {
            AsyncImage(
                model = post.profileImageUrl,
                contentDescription = "User profile picture",
                modifier = Modifier
                    .size(40.dp)
                    .padding(4.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Text(
                text = post.username,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        AsyncImage(
            model = post.postImageUrl,
            contentDescription = "Post image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                IconButton(onClick = { /* Acción de me gusta */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_like),
                        contentDescription = "Like"
                    )
                }
                IconButton(onClick = { /* Acción de comentar */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_comment),
                        contentDescription = "Comment"
                    )
                }
                IconButton(onClick = { /* Acción de compartir */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_share),
                        contentDescription = "Share"
                    )
                }
            }
        }

        // Post Description
        Text(
            text = post.description,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomePostPreview() {
    HomePost(
        posts = listOf(
            Post(
                username = "mafe_1903",
                profileImageUrl = "https://avatar.iran.liara.run/public/91",
                postImageUrl = "https://loremflickr.com/cache/resized/65535_53174334269_ce2ed9d834_320_240_nofilter.jpg",
                description = "Una linda vista al mar 🌊"
            )
        )
    )
}
