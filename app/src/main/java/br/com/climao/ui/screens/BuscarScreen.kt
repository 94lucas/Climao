package br.com.climao.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.climao.ui.components.ButtonPadrao
import br.com.climao.ui.components.Cabecalho
import br.com.climao.ui.components.Titulo

@Composable
fun BuscarScreen(navController: NavHostController ) {
    var search by remember {
        mutableStateOf("")
    }

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
        Column {
            Cabecalho()
            Titulo("Buscar")
            Spacer(modifier = Modifier.heightIn(99.dp, 103.dp ))
            OutlinedTextField(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                value = search,
                onValueChange = { search = it },
                singleLine = true,
                label = {Text(
                    text = "Search",
                    fontWeight = FontWeight.Light,
                    style = TextStyle(fontSize = 20.sp),
                    color = Color(0xFFFFFFFF)
                    )},
                leadingIcon = {Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color(0x95FFFFFF)
                )},
                colors =  OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFFFFFFF),
                    unfocusedBorderColor = Color(0xBFFFFFFF)
                ),
                shape = RoundedCornerShape(30.dp)
            )

            Spacer(modifier = Modifier.height(50.dp))

            ButtonPadrao(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                texto = "Buscar",
                rota = "resultado",
                navController
            )

        }
    }
}
//
//@Preview
//@Composable
//private fun BuscarScreenPreview() {
//    BuscarScreen(navController)
//}