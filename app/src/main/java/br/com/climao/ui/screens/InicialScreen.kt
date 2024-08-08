package br.com.climao.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.com.climao.R


@Composable
fun InicialScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colorStops = arrayOf(
                        0.05f to Color(0xFF344A53),
                        0.92f to Color(0xFF74A0B2),
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_wave), // substitua pelo seu ID de recurso
                contentDescription = "Logo",
                modifier = Modifier
                    .padding(top = 150.dp)
                    .size(250.dp) // ajuste o tamanho conforme necessário
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedButton(
                onClick = { navController.navigate("busca") },
                modifier = Modifier
                    .width(229.dp)
                    .height(70.dp),
                border = BorderStroke(0.8.dp, Color(0x6AEFEFEF))
            ) {
                Text(
                    text = "Iniciar",
                    fontWeight = FontWeight.Normal,
                    fontSize = 21.sp,
                    color = Color(0xC9FFFFFF)
                    )
            }
        }
    }
}


//@Preview
//@Composable
//private fun InicialScreenPreview() {
//    InicialScreen( )
//}