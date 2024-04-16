package com.nextin.wheatherapp.networks

import com.nextin.wheatherapp.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherServices {
    @GET("weather")
    fun getWeather(
        @Query("lat")lat :Double,
        @Query("lon")lon :Double,
        @Query("appid")appid :String,
        @Query("units")units :String
    ): Call<WeatherResponse>
}