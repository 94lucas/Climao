package br.com.climao.ui.components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ButtonPadrao(
    modifier: Modifier,
    texto: String = "",
) {
    Box (
        Modifier.border(
            0.8.dp,
            Color(0x6AEFEFEF),
            shape = RoundedCornerShape(80.dp)
        )
    ){
        Row(
            modifier = modifier
                .width(229.dp)
                .height(70.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = texto,
                fontWeight = FontWeight.Normal,
                fontSize = 21.sp,
                color = Color(0xC9FFFFFF)
            )
        }
    }
}
/*
* modifier = modifier
            .width(229.dp)
            .height(70.dp),
        border = BorderStroke(0.8.dp, Color(0x6AEFEFEF))
* */
@Preview()
@Composable
private fun ButtonPadraoPreview() {
    ButtonPadrao(modifier = Modifier, "Butao")
}