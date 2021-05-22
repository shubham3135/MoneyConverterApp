package com.shubhamkumarwinner.moneyconverter.data

import com.shubhamkumarwinner.moneyconverter.data.model.Currency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest?access_key=a61499f583b66451aadc94187c44f077")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<Currency>
}