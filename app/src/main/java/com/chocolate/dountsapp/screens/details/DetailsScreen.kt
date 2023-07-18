package com.chocolate.dountsapp.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.screens.details.composeable.ClickAddAndMinus
import com.chocolate.dountsapp.screens.details.composeable.HeaderDetails
import com.chocolate.dountsapp.ui.theme.Black
import com.chocolate.dountsapp.ui.theme.Black60
import com.chocolate.dountsapp.ui.theme.Black80
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.Pink38
import com.chocolate.dountsapp.ui.theme.Pink87
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun DetailsScreen(navController: NavController) {

    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()
    DisposableEffect(systemUiController, useDarkIcons) {
        systemUiController.setSystemBarsColor(color = Color.Transparent, darkIcons = useDarkIcons)
        onDispose {
            // Restore the default system bars color when the composable is disposed
            systemUiController.setSystemBarsColor(color = Color.Transparent, darkIcons = useDarkIcons)
        }
    }


    Box(modifier = Modifier.fillMaxSize()) {
        HeaderDetails()
        Box(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(.60f)
                .align(Alignment.BottomCenter)
        ) {
            Column(
                Modifier
                    .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                    .fillMaxWidth()
                    .fillMaxHeight(.88f)
                    .background(color = Color.White)
                    .align(Alignment.BottomCenter)
                    .padding(top = 35.dp, start = 40.dp, end = 40.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.strawberry_wheel),
                    color = Pink87,
                    fontFamily = Inter,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = stringResource(R.string.about_gonut),
                    color = Black80,
                    fontFamily = Inter,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 32.dp)
                )
                Text(
                    text = stringResource(R.string.these_soft_cake),
                    color = Black60,
                    fontFamily = Inter,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(
                    text = stringResource(R.string.quantity),
                    color = Black80,
                    fontFamily = Inter,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    modifier = Modifier.padding(top = 20.dp)
                ) {
                    ClickAddAndMinus(stringResource(R.string.minus), Black, Color.White, 32)
                    ClickAddAndMinus(stringResource(R.string._1), Black, Color.White, 22)
                    ClickAddAndMinus(stringResource(R.string.plus), Color.White, Color.Black, 32)
                }
                Box(Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "£16",
                            color = Black,
                            fontFamily = Inter,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults
                                .buttonColors(Pink87),
                            modifier = Modifier.fillMaxWidth()

                        ) {
                            Text(
                                text = "Add to Cart",
                                color = Color.White,
                                fontFamily = Inter,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier.padding(vertical = 12.dp)
                            )
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 32.dp, top = 26.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_heart),
                    contentDescription = stringResource(R.string.add_to_favourite_icon),
                    modifier = Modifier
                        .shadow(
                            elevation = 4.dp,
                            shape = RoundedCornerShape(32),
                            spotColor = Color.Black.copy(alpha = .1f)
                        )
                        .size(48.dp)
                        .clip(shape)

                        .background(color = Color.White)
                        .padding(8.dp)
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.ic_arrow_back),
            contentDescription = stringResource(R.string.back_icon),
            modifier = Modifier
                .clickable { navController.popBackStack() }
                .align(Alignment.TopStart)
                .padding(35.dp)
        )
    }
}