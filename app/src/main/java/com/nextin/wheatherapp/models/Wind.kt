package com.nextin.wheatherapp.models

import java.io.Serializable

data class Wind(
    val speed :Double,
    val deg :Int,
    val gust :Double
) :Serializable