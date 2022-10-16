package com.example.gdscace

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gdscace.data.EventDataSource
import com.example.gdscace.data.FAQDataSource
import com.example.gdscace.data.TeamDataSource
import com.example.gdscace.data.TechDatasrc
import com.example.gdscace.model.FAQDataModel
import com.example.gdscace.screens.*

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Overview.route
    ) {
        composable(route = BottomBarScreen.Overview.route) {
            OverviewScreen()
        }
        composable(route = BottomBarScreen.Technologies.route) {
            TechScreen(dataModel = TechDatasrc().loadDataModels())
        }
        composable(route = BottomBarScreen.Events.route) {
            EventScreen(dataModel = EventDataSource().loadDataModels())
        }
        composable(route = BottomBarScreen.Teams.route) {
            TeamScreen(dataModel = TeamDataSource().loadDataModels())
        }
        composable(route = BottomBarScreen.FAQs.route) {
            FAQScreen(dataModel = FAQDataSource().loadDataModels())
        }
    }
}