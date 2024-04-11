package com.nextin.wheatherapp.models

import java.io.Serializable

data class WeatherResponse (
    val coord :Coord,
    val weather :List<Weather>,
    val base : String,
    val main :Main,
    val visibility :Int,
    val wind : Wind,
    val cloud :Clouds,
    val dt :Long,
    val sys :Sys,
    val timezone :Int,
    val id :Int,
    val name: String,
    val cod :Int
) : Serializable