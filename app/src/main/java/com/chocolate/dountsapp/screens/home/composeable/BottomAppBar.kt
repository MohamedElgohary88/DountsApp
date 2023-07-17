package com.chocolate.dountsapp.screens.home.composeable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Pink87
import com.chocolate.dountsapp.ui.theme.White

@Composable
fun BottomAppBarRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = White)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = modifier.padding(start = 24.dp),
            painter = painterResource(id = R.drawable.ic_home),
            contentDescription = stringResource(R.string.home),
            tint = Pink87
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_heart_2),
            contentDescription = stringResource(R.string.search),
            tint = Pink87
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_notification),
            contentDescription = stringResource(R.string.notifications),
            tint = Pink87
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_buy),
            contentDescription = stringResource(R.string.cart),
            tint = Pink87
        )
        Icon(
            modifier = modifier.padding(end = 24.dp),
            painter = painterResource(id = R.drawable.ic_user),
            contentDescription = stringResource(R.string.profile),
            tint = Pink87
        )
    }
}