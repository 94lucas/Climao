package br.com.climao.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ButtonPadrao(
    modifier: Modifier,
    texto: String = "",
    rota: String = "",
    navController: NavController
) {

    OutlinedButton(
        onClick = {

            if (rota.isNotEmpty()){
                navController.navigate(rota)
            }
        },
        modifier = modifier
            .width(229.dp)
            .height(70.dp),
        border = BorderStroke(0.8.dp, Color(0x6AEFEFEF))
    ) {
        Text(
            text = texto,
            fontWeight = FontWeight.Normal,
            fontSize = 21.sp,
            color = Color(0xC9FFFFFF)
        )
    }
}
//
//@Preview
//@Composable
//private fun ButtonPadraoPreview() {
//    ButtonPadrao(modifier = Modifier)
//}