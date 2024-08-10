package br.com.climao.service

import br.com.climao.model.Climao
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.Locale.IsoCountryCode

interface ClimaService {

    //https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
    @GET("weather")
    fun getClimaByName(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String = "8aa18e1ac0df505377a916a21724c0db"
    ): Call<Climao>

}