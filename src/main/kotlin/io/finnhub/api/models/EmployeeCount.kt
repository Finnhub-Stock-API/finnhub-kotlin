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
 * @param atDate Date of the reading
 * @param employee Value
 */

data class EmployeeCount (

    /* Date of the reading */
    @Json(name = "atDate")
    val atDate: kotlin.String? = null,

    /* Value */
    @Json(name = "employee")
    val employee: kotlin.Float? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

