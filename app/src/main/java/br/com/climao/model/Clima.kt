package br.com.climao.model

import com.google.gson.annotations.SerializedName


data class Clima (
    @SerializedName("main.temp")
    val temperatura: String = "",
    @SerializedName("wind.speed")
    val wind: String = ""
)