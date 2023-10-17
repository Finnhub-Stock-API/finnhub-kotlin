/**
 * Finnhub API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.finnhub.api.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param eventName Holiday's name.
 * @param atDate Date.
 * @param tradingHour Trading hours for this day if the market is partially closed only.
 */

data class MarketHolidayData (

    /* Holiday's name. */
    @Json(name = "eventName")
    val eventName: kotlin.String? = null,

    /* Date. */
    @Json(name = "atDate")
    val atDate: kotlin.String? = null,

    /* Trading hours for this day if the market is partially closed only. */
    @Json(name = "tradingHour")
    val tradingHour: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

