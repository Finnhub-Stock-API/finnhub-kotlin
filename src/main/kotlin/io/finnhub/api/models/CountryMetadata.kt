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
 * @param country Country name
 * @param code2 Alpha 2 code
 * @param code3 Alpha 3 code
 * @param codeNo UN code
 * @param currency Currency name
 * @param currencyCode Currency code
 * @param region Region
 * @param subRegion Sub-Region
 * @param rating Moody's credit risk rating.
 * @param defaultSpread Default spread
 * @param countryRiskPremium Country risk premium
 * @param equityRiskPremium Equity risk premium
 */

data class CountryMetadata (

    /* Country name */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* Alpha 2 code */
    @Json(name = "code2")
    val code2: kotlin.String? = null,

    /* Alpha 3 code */
    @Json(name = "code3")
    val code3: kotlin.String? = null,

    /* UN code */
    @Json(name = "codeNo")
    val codeNo: kotlin.String? = null,

    /* Currency name */
    @Json(name = "currency")
    val currency: kotlin.String? = null,

    /* Currency code */
    @Json(name = "currencyCode")
    val currencyCode: kotlin.String? = null,

    /* Region */
    @Json(name = "region")
    val region: kotlin.String? = null,

    /* Sub-Region */
    @Json(name = "subRegion")
    val subRegion: kotlin.String? = null,

    /* Moody's credit risk rating. */
    @Json(name = "rating")
    val rating: kotlin.String? = null,

    /* Default spread */
    @Json(name = "defaultSpread")
    val defaultSpread: kotlin.Float? = null,

    /* Country risk premium */
    @Json(name = "countryRiskPremium")
    val countryRiskPremium: kotlin.Float? = null,

    /* Equity risk premium */
    @Json(name = "equityRiskPremium")
    val equityRiskPremium: kotlin.Float? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

