package com.chocolate.dountsapp.screens.home.composeable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Black
import com.chocolate.dountsapp.ui.theme.Black60
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.Pink87
import com.chocolate.dountsapp.ui.theme.White

@Composable
fun DonutItemBottom(imageRes: Int, title: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .height(180.dp)
        .width(140.dp)) {
        Column(
            Modifier
                .padding(top = 24.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    )
                )
                .fillMaxHeight()
                .background(color = White), verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                textAlign = TextAlign.Center,
                fontFamily = Inter,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Black60,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 10.dp)
            )
            Text(
                text = stringResource(R.string._22),
                textAlign = TextAlign.Center,
                fontFamily = Inter,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Pink87,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp)
            )
        }
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = stringResource(R.string.doughnut_image),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .graphicsLayer {
                    translationY = -120f
                }
                .scale(.7f)
        )
    }
}