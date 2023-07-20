package com.chocolate.dountsapp.screens.home.composeable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Black
import com.chocolate.dountsapp.ui.theme.Black10
import com.chocolate.dountsapp.ui.theme.Black67
import com.chocolate.dountsapp.ui.theme.BlueSky
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.White

@Composable
fun DonutItemTop(
    imageRes: Int,
    title: String,
    description: String,
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isPressed by remember { mutableStateOf(false) }
    Box(
        contentAlignment = Alignment.CenterEnd,
        modifier = modifier
            .clickable {
                isPressed = false
                onClick()
            }
            .height(320.dp)
            .width(193.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .matchParentSize()
                .shadow(
                    ambientColor = Black10,
                    elevation = 4.dp,
                    spotColor = Color.Black.copy(alpha = .1f),
                    shape = RoundedCornerShape(20.dp),
                    clip = true,
                )
                .clip(RoundedCornerShape(20.dp))
                .background(color = color)
                .padding(16.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_heart),
                contentDescription = stringResource(R.string.favourite),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
                    .background(White)
                    .padding(8.dp)
            )
            Column {
                Text(
                    text = title,
                    fontFamily = Inter,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Black,
                )
                Text(
                    text = description,
                    maxLines = 3,
                    fontFamily = Inter,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = Black67,
                )
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(R.string._20),
                        fontFamily = Inter,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Black67
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = stringResource(R.string._16),
                        fontFamily = Inter,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Black,
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = stringResource(R.string.doughnut),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight(.60f)
                .graphicsLayer {
                    translationX = 165f
                    translationY = -120f
                }
        )
    }
}