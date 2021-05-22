package com.shubhamkumarwinner.moneyconverter.main

import com.shubhamkumarwinner.moneyconverter.data.model.Currency
import com.shubhamkumarwinner.moneyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<Currency>
}