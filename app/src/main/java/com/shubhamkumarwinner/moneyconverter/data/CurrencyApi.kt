package com.shubhamkumarwinner.moneyconverter.data

import com.shubhamkumarwinner.moneyconverter.data.model.Currency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "YOUR API KEY"

interface CurrencyApi {
    @GET("/latest?access_key=$API_KEY")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<Currency>
}