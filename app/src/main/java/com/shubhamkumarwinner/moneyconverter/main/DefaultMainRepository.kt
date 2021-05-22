package com.shubhamkumarwinner.moneyconverter.main

import com.shubhamkumarwinner.moneyconverter.data.CurrencyApi
import com.shubhamkumarwinner.moneyconverter.data.model.Currency
import com.shubhamkumarwinner.moneyconverter.util.Resource
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository{
    override suspend fun getRates(base: String): Resource<Currency> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if (response.isSuccessful && result != null){
                Resource.Success(result)
            }else{
                Resource.Error(response.message())
            }
        }catch (e: Exception){
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}