package br.com.climao.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    private val URL = "https://api.openweathermap.org/data/2.5/weather?q="

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getClimaService(): ClimaService{
        return  retrofitFactory.create(ClimaService::class.java)
    }
}