package br.com.climao.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
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

@SuppressLint("DefaultLocale")
@Composable
fun ResultadoBusca(navController: NavHostController, temp: String, speed: String) {
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
                Cartao(titulo = "temperature", resultado = ("${temp}ºC"))
                Spacer(modifier = Modifier.height(20.dp))
                Cartao(titulo = "Velocidade do Vento", resultado = ("$speed m/s"))
                Spacer(modifier = Modifier.height(70.dp))

                OutlinedButton(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    border = BorderStroke(0.8.dp, Color(0x00EFEFEF)),
                    onClick = {
                        navController.navigate("inicial")
                    },
                    content = {
                        ButtonPadrao(
                            modifier = Modifier,
                            texto = "Voltar"
                        )
                    }
                )

            }



        }

    }
}

//@Preview
//@Composable
//private fun ResultadoBuscaPreview() {
//    ResultadoBusca(navController = rememberNavController(), listaPesquisa = String)
//}