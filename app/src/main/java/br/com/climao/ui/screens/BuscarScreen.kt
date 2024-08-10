package br.com.climao.ui.screens

import android.util.Log
import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.climao.model.Climao
import br.com.climao.service.RetrofitFactory
import br.com.climao.ui.components.ButtonPadrao
import br.com.climao.ui.components.Cabecalho
import br.com.climao.ui.components.Titulo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import kotlin.math.roundToLong

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuscarScreen(navController: NavHostController ) {
    var search by remember {
        mutableStateOf("")
    }
    var listSearch by remember {
        mutableStateOf(Climao())
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

            OutlinedButton(
                onClick = {

                    if(search.isNotEmpty()){
                        val call = RetrofitFactory()
                            .getClimaService()
                            .getClimaByName(cityName = search)
                        call.enqueue(object : Callback<Climao>{
                            override fun onResponse(
                                call: Call<Climao>,
                                response: Response<Climao>
                            ) {
                                Log.i("Atenção", "onResponse: ${response.body()}")
                                listSearch = response.body()!!
                                val teste: Climao = listSearch

                                val tempKel: Double? =  teste.main?.temp
                                val tempCel: Long = (tempKel?.minus(273.15))!!.roundToLong()

                                navController.navigate(
                                    "resultado/${tempCel}/${teste.wind?.speed}"
                                )
                            }

                            override fun onFailure(call: Call<Climao>, t: Throwable) {
                                Log.i("Atenção", "Erro na busca: ${t.message}")
                            }
                        })

                        //Climao(main=Main(temp=302.8), wind=Wind(speed=4.63))

                    }
                },
                content = {
                    ButtonPadrao(
                        modifier = Modifier,
                        texto = "Buscar",

                    )
                },
               modifier = Modifier
                   .align(Alignment.CenterHorizontally),
                border = BorderStroke(0.8.dp, Color(0x00EFEFEF))
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