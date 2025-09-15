package com.example.plare.ui.screen.community

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MusicCard() {
    Scaffold() { inner ->
        Card {
            Row {
                Text("카드")
            }
        }
    }
}