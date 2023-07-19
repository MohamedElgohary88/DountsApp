package com.chocolate.dountsapp.screens.details.composeable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Pink38

@Composable
fun HeaderDetails(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f)
            .background(color = Pink38),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.donut_strawberry_4),
            contentDescription = stringResource(R.string.dougnut_image),
            modifier = Modifier.scale(2.8f)
        )
    }
}