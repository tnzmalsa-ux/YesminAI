package com.yesmin.ai.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val YesminDarkColorScheme = darkColorScheme(
    primary = NeonCyan,
    onPrimary = Color(0xFF041316),
    primaryContainer = DarkSurfaceElevated,
    onPrimaryContainer = NeonCyan,
    secondary = NeonPurple,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFF2B174D),
    onSecondaryContainer = Color(0xFFE7CCFF),
    tertiary = NeonBlue,
    onTertiary = Color.White,
    background = DarkSpaceBg,
    onBackground = DarkTextPrimary,
    surface = DarkSurface,
    onSurface = DarkTextPrimary,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = DarkTextSecondary,
    outline = DarkOutline,
    error = DangerCrimson,
    onError = Color.White
)

private val YesminLightColorScheme = lightColorScheme(
    primary = NeonBlue,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFDDE8FF),
    onPrimaryContainer = Color(0xFF08225A),
    secondary = NeonPurple,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFF1E2FF),
    onSecondaryContainer = Color(0xFF390B63),
    tertiary = Color(0xFF00A896),
    onTertiary = Color.White,
    background = LightBg,
    onBackground = LightTextPrimary,
    surface = LightSurface,
    onSurface = LightTextPrimary,
    surfaceVariant = LightSurfaceVariant,
    onSurfaceVariant = LightTextSecondary,
    outline = LightOutline,
    error = DangerCrimson,
    onError = Color.White
)

@Composable
fun YesminTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) YesminDarkColorScheme else YesminLightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = YesminTypography,
        content = content
    )
}
