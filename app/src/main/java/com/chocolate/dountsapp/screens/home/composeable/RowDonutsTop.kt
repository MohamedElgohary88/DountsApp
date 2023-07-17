package com.chocolate.dountsapp.screens.home.composeable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.repeat
import com.chocolate.dountsapp.ui.theme.Black
import com.chocolate.dountsapp.ui.theme.BlueSky
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.Pink38
import com.chocolate.dountsapp.ui.theme.Pink67

@Composable
fun RowDonutsTop(modifier: Modifier = Modifier) {
    data class DonutItem(
        val imageRes: Int,
        val title: String,
        val description: String,
        val color: Color
    )

    val imageList = listOf(
        DonutItem(
            R.drawable.donut_strawberry_4,
            stringResource(R.string.strawberry_wheel),
            stringResource(R.string.donut_description1),
            BlueSky
        ),
        DonutItem(
            R.drawable.donut_chocolate_1, stringResource(R.string.chocolate_glaze),
            stringResource(R.string.donut_description2),
            Pink38
        ),
    )
    val repeatedImageList = imageList.repeat(6)
    Text(
        modifier = modifier.padding(start = 32.dp, top = 48.dp),
        text = stringResource(R.string.today_offers),
        color = Black,
        fontFamily = Inter,
        fontSize = 19.sp,
        fontWeight = FontWeight.Bold
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(48.dp),
        contentPadding = PaddingValues(32.dp)
    ) {
        items(repeatedImageList.size) { index ->
            val item = repeatedImageList[index]
            DonutItemTop(item.imageRes, item.title, item.description, item.color)
        }
    }
}