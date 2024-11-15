package com.example.instagramproject.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramproject.R

@Composable
fun InstagramToolBar() {
    Box(modifier = Modifier.background(MaterialTheme.colorScheme.background).padding(top = 8.dp)) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .height(56.dp)
        ) {
            Text(
                text = "Instagram",
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically),
                style = MaterialTheme.typography.headlineLarge
            )
            Image(
                painter = painterResource(id = R.drawable.ic_notification),
                modifier = Modifier
                    .size(32.dp)
                    .padding(end = 8.dp)
                    .align(Alignment.CenterVertically),
                contentDescription = "Icono notificaciones"
            )
            Image(
                painter = painterResource(id = R.drawable.ic_message),
                modifier = Modifier
                    .size(32.dp)
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically),
                contentDescription = "Icono mensajes "
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InstagramToolBarPreview() {
    InstagramToolBar()
}