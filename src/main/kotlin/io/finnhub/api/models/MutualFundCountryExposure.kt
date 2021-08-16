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

import io.finnhub.api.models.MutualFundCountryExposureData

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param symbol Symbol.
 * @param countryExposure Array of countries and and exposure levels.
 */

data class MutualFundCountryExposure (

    /* Symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    /* Array of countries and and exposure levels. */
    @Json(name = "countryExposure")
    val countryExposure: kotlin.collections.List<MutualFundCountryExposureData>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
