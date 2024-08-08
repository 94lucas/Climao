package br.com.climao.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.com.climao.ui.components.ButtonPadrao
import br.com.climao.ui.components.Cabecalho
import br.com.climao.ui.components.Cartao
import br.com.climao.ui.components.Titulo

@Composable
fun ResultadoBusca(navController: NavHostController) {
    val tamanhoState by remember {
        mutableStateOf("")
    }
    val ventoState by remember {
        mutableStateOf("")
    }
    Box (
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
    ){
        Column {
            Cabecalho()
            Titulo("Forecast")
            Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 50.dp),
            ){
                Cartao(titulo = "Tamanho", resultado = ("$tamanhoState m"))
                Spacer(modifier = Modifier.height(20.dp))
                Cartao(titulo = "Velocidade do Vento", resultado = ("$ventoState m/s"))
                Spacer(modifier = Modifier.height(70.dp))
                ButtonPadrao(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    texto = "Voltar",
                    rota = "inicial",
                    navController,
                    onClick
                )
            }



        }

    }
}
//
//@Preview
//@Composable
//private fun ResultadoBuscaPreview() {
//    ResultadoBusca(navController)
//}