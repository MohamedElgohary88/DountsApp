package com.chocolate.dountsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Black
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.Pink38
import com.chocolate.dountsapp.ui.theme.Pink67
import com.chocolate.dountsapp.ui.theme.Pink87
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Preview(showSystemUi = true)
@Composable
fun OnBoardingScreen() {

    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()
    DisposableEffect(systemUiController, useDarkIcons) {
        systemUiController.setSystemBarsColor(color = Pink38, darkIcons = useDarkIcons)
        onDispose {}
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Pink38)
    ) {
        val (boxDonuts, textTitle, textDescription, getStartedButton) = createRefs()
        Box(
            modifier = Modifier
                .wrapContentSize()
                .constrainAs(boxDonuts) {}
        ) {
            Box(
                Modifier
                    .fillMaxHeight(.43f)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.donut_group),
                    contentDescription = stringResource(R.string.doughnut_group),
                    modifier = Modifier
                        .matchParentSize()
                        .rotate(20f)
                        .scale(1.7f, 1.7f)
                        .offset(y = 40.dp, x = 17.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.donut_eaten),
                    contentDescription = stringResource(R.string.doughnut_strawberry),
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .scale(.9f)
                        .offset(x = 90.dp, y = 232.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.donut_strawberry_3),
                    contentDescription = stringResource(R.string.doughnut_strawberry),
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(x = (-35).dp, y = (25).dp)
                        .scale(.85f)
                )

                Image(
                    painter = painterResource(id = R.drawable.donut_strawberry_3),
                    contentDescription = stringResource(R.string.doughnut_strawberry),
                    modifier = Modifier
                        .scale(.4f)
                        .rotate(65f)
                        .align(Alignment.BottomStart)
                        .offset(y = 120.dp, x = 80.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.donut_move),
                    contentDescription = stringResource(R.string.doughnut_move),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .scale(.9f)
                        .offset(x = (-30).dp, y = (-42).dp)
                )
            }
        }
        Text(
            modifier = Modifier.constrainAs(textTitle) {
                top.linkTo(boxDonuts.bottom, margin = 56.dp)
                start.linkTo(parent.start, margin = 32.dp)
            },
            text = stringResource(R.string.gonuts_with_donuts),
            fontFamily = Inter,
            fontSize = 54.sp,
            fontWeight = FontWeight.Bold,
            color = Pink87,
        )
        Text(
            modifier = Modifier.constrainAs(textDescription) {
                top.linkTo(textTitle.bottom, margin = 16.dp)
                start.linkTo(parent.start, margin = 32.dp)
            },
            text = stringResource(R.string.description),
            style = MaterialTheme.typography.bodyLarge,
            color = Pink67
        )
        Button(
            modifier = Modifier
                .constrainAs(getStartedButton) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom, margin = 24.dp)
                }, onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Black
            )
        ) {
            Text(
                text = stringResource(R.string.get_started),
                textAlign = TextAlign.Center,
                fontFamily = Inter,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 88.dp)
            )
        }
    }
}