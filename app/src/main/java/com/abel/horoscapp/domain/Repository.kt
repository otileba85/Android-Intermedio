package com.abel.horoscapp.domain

interface Repository {
    suspend fun getPrediction(sing:String)
}