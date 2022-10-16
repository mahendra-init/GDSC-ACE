package com.example.gdscace


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Overview : BottomBarScreen(
        route = "overview",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Technologies : BottomBarScreen(
        route = "technologies",
        title = "Domain",
        icon = Icons.Default.Search
    )

    object Events : BottomBarScreen(
        route = "events",
        title = "Events",
        icon = Icons.Default.List
    )

    object Teams : BottomBarScreen(
        route = "teams",
        title = "Teams",
        icon = Icons.Default.Person
    )
    object FAQs : BottomBarScreen(
        route = "faqs",
        title = "FAQs",
        icon = Icons.Default.Info
    )
}