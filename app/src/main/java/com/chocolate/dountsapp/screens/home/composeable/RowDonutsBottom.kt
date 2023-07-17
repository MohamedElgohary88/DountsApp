package com.chocolate.dountsapp.screens.home.composeable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.repeat
import com.chocolate.dountsapp.ui.theme.Black
import com.chocolate.dountsapp.ui.theme.Inter

@Composable
fun RowDonutsBottom(modifier: Modifier = Modifier) {
    data class DonutItem(val imageRes: Int, val title: String)
    val imageList = listOf(
        DonutItem(R.drawable.donut_chocolate_2, stringResource(R.string.chocolate_cherry)),
        DonutItem(R.drawable.donut_strawberry_2, stringResource(R.string.strawberry_rain)),
        DonutItem(R.drawable.donut_strawberry_1, stringResource(R.string.strawberry_choc))
    )
    val repeatedImageList = imageList.repeat(6)
    Text(
        modifier = modifier.padding(start = 32.dp, top = 16.dp),
        text = stringResource(R.string.donuts_bottom_row),
        color = Black,
        fontFamily = Inter,
        fontSize = 19.sp,
        fontWeight = FontWeight.Bold
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy((16).dp),
        contentPadding = PaddingValues(24.dp)
    ) {
        items(repeatedImageList.size) { index ->
            val item = repeatedImageList[index]
            DonutItemBottom(item.imageRes, item.title)
        }
    }
}
