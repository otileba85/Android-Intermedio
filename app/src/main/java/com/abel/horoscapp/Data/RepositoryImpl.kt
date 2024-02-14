package com.abel.horoscapp.Data

import android.util.Log
import com.abel.horoscapp.Data.network.HoroscopeApiService
import com.abel.horoscapp.domain.Repository
import com.abel.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sing: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sing) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Abel", "Ha ocurrido un error ${it.message}") }
        return null
    }
}