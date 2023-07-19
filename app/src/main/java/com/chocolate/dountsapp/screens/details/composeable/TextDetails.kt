package com.chocolate.dountsapp.screens.details.composeable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Black60
import com.chocolate.dountsapp.ui.theme.Black80
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.Pink87

@Composable
fun TextDetails(){
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
}