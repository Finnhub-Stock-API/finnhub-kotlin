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
 * @param name Speaker's name
 * @param speech Speaker's speech
 * @param session Earnings calls section (management discussion or Q&A)
 */

data class TranscriptContent (

    /* Speaker's name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Speaker's speech */
    @Json(name = "speech")
    val speech: kotlin.collections.List<kotlin.String>? = null,

    /* Earnings calls section (management discussion or Q&A) */
    @Json(name = "session")
    val session: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

