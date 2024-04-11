package com.nextin.wheatherapp.models

import java.io.Serializable

data class Main (
    val temp : Double,
    val feel_like : Double,
    val temp_min :Double,
    val temp_max : Double,
    val pressure :Int,
    val humidity : Int,
    val sea_level :Double,
    val grnd_level :Double
): Serializable