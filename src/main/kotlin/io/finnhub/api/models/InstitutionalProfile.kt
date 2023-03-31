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

import io.finnhub.api.models.InstitutionalProfileInfo

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param cik CIK.
 * @param `data` Array of investors.
 */

data class InstitutionalProfile (

    /* CIK. */
    @Json(name = "cik")
    val cik: kotlin.String? = null,

    /* Array of investors. */
    @Json(name = "data")
    val `data`: kotlin.collections.List<InstitutionalProfileInfo>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
