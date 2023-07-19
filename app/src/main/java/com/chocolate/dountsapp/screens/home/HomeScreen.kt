package com.chocolate.dountsapp.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.chocolate.dountsapp.navigation.DonutsScreen
import com.chocolate.dountsapp.screens.home.composeable.BottomAppBarRow
import com.chocolate.dountsapp.screens.home.composeable.RowDonutsBottom
import com.chocolate.dountsapp.screens.home.composeable.RowDonutsTop
import com.chocolate.dountsapp.screens.home.composeable.WelcomeHeader
import com.chocolate.dountsapp.ui.theme.White87
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen(navController: NavController) {
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()
    DisposableEffect(systemUiController, useDarkIcons) {
        systemUiController.setSystemBarsColor(color = Color.Transparent, darkIcons = useDarkIcons)
        onDispose {
            // Restore the default system bars color when the composable is disposed
            systemUiController.setSystemBarsColor(color = Color.Transparent, darkIcons = useDarkIcons)
        }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val (columnScreen, bottomBar) = createRefs()
        LazyColumn(
            Modifier
                .background(color = White87)
                .fillMaxSize()
                .constrainAs(columnScreen) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            item {
                WelcomeHeader()
            }
            item{
                RowDonutsTop({ navController.navigate(DonutsScreen.DetailsScreen.route) })
            }
            item {
                RowDonutsBottom()
            }
        }

        BottomAppBarRow(modifier = Modifier.constrainAs(bottomBar) {
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
    }
}