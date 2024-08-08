package br.com.climao.service

import br.com.climao.model.Clima
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.Locale.IsoCountryCode

interface ClimaService {

    //https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
    @GET("{city name}&appid=8aa18e1ac0df505377a916a21724c0db")
    fun getClimaByName(
        @Path("city name") cityName: String
    ): Call<Clima>

}