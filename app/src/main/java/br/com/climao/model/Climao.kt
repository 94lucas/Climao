package br.com.climao.model

import com.google.gson.annotations.SerializedName

data class Climao(
    @SerializedName("main")
    val main: Main? = null,
    @SerializedName("wind")
    val wind: Wind? = null
)