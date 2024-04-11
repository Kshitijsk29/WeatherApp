package com.nextin.wheatherapp.networks

import com.nextin.wheatherapp.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherServices {
    @GET("2.5/weather")
    fun getWeather(
        @Query("lat")lat :Double,
        @Query("lon")lon :Double,
        @Query("units")units :String,
        @Query("aapid")aapid :String
    ): Call<WeatherResponse>
}