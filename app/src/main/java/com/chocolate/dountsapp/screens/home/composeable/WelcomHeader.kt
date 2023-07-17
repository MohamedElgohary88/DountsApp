package com.chocolate.dountsapp.screens.home.composeable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Black60
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.Pink38
import com.chocolate.dountsapp.ui.theme.Pink87

@Composable
fun WelcomeHeader() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(top = 48.dp, start = 32.dp, end = 32.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = stringResource(R.string.let_s_gonuts),
                color = Pink87,
                fontFamily = Inter,
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Text(
                text = stringResource(R.string.order_donuts),
                color = Black60,
                fontFamily = Inter,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Image(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = stringResource(R.string.search_icon),
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .clickable { }
                .background(Pink38)
                .padding(12.dp)
        )
    }
}