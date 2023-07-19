package com.chocolate.dountsapp.screens.details.composeable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chocolate.dountsapp.R
import com.chocolate.dountsapp.ui.theme.Inter
import com.chocolate.dountsapp.ui.theme.Pink87

@Composable
fun AddToCart(){
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults
            .buttonColors(Pink87),
        modifier = Modifier.fillMaxWidth()

    ) {
        Text(
            text = stringResource(R.string.add_to_cart),
            color = Color.White,
            fontFamily = Inter,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 12.dp)
        )
    }
}