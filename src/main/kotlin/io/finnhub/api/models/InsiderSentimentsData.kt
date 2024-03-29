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
 * @param symbol Symbol.
 * @param year Year.
 * @param month Month.
 * @param change Net buying/selling from all insiders' transactions.
 * @param mspr Monthly share purchase ratio.
 */

data class InsiderSentimentsData (

    /* Symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    /* Year. */
    @Json(name = "year")
    val year: kotlin.Long? = null,

    /* Month. */
    @Json(name = "month")
    val month: kotlin.Long? = null,

    /* Net buying/selling from all insiders' transactions. */
    @Json(name = "change")
    val change: kotlin.Long? = null,

    /* Monthly share purchase ratio. */
    @Json(name = "mspr")
    val mspr: kotlin.Float? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

