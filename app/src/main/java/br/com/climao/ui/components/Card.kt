package br.com.climao.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Cartao(titulo: String = "Tiutlo", resultado: String = "0.0") {
    Card (
        modifier = Modifier
            .padding(horizontal = 0.dp)
            .size(340.dp, 115.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFCAE8EF)),
        elevation =  CardDefaults.cardElevation(50.dp)
    ){
        Row (Modifier
            .fillMaxWidth()
            .padding(
            start = 26.dp,
            top = 12.dp
        )){
            Text(
                text = titulo,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp
            )
        }
        Row (
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom

        ){
            Text(
                text = resultado,
                modifier = Modifier.padding(bottom = 20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Preview
@Composable
private fun CartaoPreview() {
    Cartao()
}