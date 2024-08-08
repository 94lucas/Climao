package br.com.climao.ui.components

import android.text.Layout
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Titulo(
    texto: String,

) {

    Text(
        text = texto,
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color(0xFF344A53),
        modifier = Modifier
            .offset(x = (-90).dp)
            .width(312.dp)
            .height(100.dp)
            .background(
                Color(0xFFE0F7FA),
                shape = RoundedCornerShape(50.dp)
            )
            .padding(top = 30.dp, end = 40.dp),
        textAlign = TextAlign.End
    )
    /*
    Row(
        Modifier
            .background(Color(0xFFD7E8F0))
            .height(120.dp)
            .width(220.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {

    }*/
}

@Preview
@Composable
private fun TituloPreview() {
    Titulo("Buscar")
}