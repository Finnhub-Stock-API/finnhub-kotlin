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

import io.finnhub.api.models.MutualFundSectorExposureData

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param symbol Mutual symbol.
 * @param sectorExposure Array of sector and exposure levels.
 */

data class MutualFundSectorExposure (

    /* Mutual symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    /* Array of sector and exposure levels. */
    @Json(name = "sectorExposure")
    val sectorExposure: kotlin.collections.List<MutualFundSectorExposureData>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

