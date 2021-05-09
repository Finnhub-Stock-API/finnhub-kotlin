package io.finnhub.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Metric(
    @SerialName("10DayAverageTradingVolume")
    val tenDayAverageTradingVolume: Double? = null,
    @SerialName("52WeekHigh")
    val fiftyTwoWeekHigh: Double? = null,
    @SerialName("52WeekLow")
    val fiftyTwoWeekLow: Double? = null,
    @SerialName("52WeekLowDate")
    val fiftyTwoWeekLowDate: String? = null,
    @SerialName("52WeekPriceReturnDaily")
    val fiftyTwoWeekPriceReturnDaily: Double? = null,
    val beta: Double? = null,
)
