package com.abel.horoscapp.domain

import com.abel.horoscapp.Data.network.response.PredictionResponse
import com.abel.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing:String):PredictionModel?
}