package com.chocolate.dountsapp.screens.details.composeable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.ui.theme.Black60
import com.chocolate.dountsapp.ui.theme.Inter

@Composable
fun ClickAddAndMinus(
    text: String,
    textColor: Color = Color.Black,
    color: Color,
    textSize: Int
) {
    Surface(
        Modifier.shadow(
            elevation = 4.dp,
            shape = RoundedCornerShape(32),
            spotColor = Color.Black.copy(alpha = .1f)
        )
    ) {
        Box(
            Modifier
                .size(45.dp)
                .clip(RoundedCornerShape(32))
                .clickable {}
                .background(color),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = textColor,
                fontFamily = Inter,
                fontSize = textSize.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
            )
        }
    }
}