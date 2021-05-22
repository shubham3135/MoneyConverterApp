package com.shubhamkumarwinner.moneyconverter.data.model

data class Currency(
    val base: String,
    val date: String,
    val rates: Rates,
    val success: Boolean,
    val timestamp: Int
)