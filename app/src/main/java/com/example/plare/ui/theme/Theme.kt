package com.example.plare.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = darkColorScheme(
    primary = Red100,
    secondary = Red80,
    tertiary = Red50,

    surface = White,                    // 카드, 시트 등 표면 색
    onSurface = Black,
    error = Red,
    onError = White

)

@Composable
fun PlareTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}