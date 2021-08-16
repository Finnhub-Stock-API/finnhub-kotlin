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

import io.finnhub.api.models.InvestmentThemePortfolio

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param theme Investment theme
 * @param `data` Investment theme portfolio.
 */

data class InvestmentThemes (

    /* Investment theme */
    @Json(name = "theme")
    val theme: kotlin.String? = null,

    /* Investment theme portfolio. */
    @Json(name = "data")
    val `data`: kotlin.collections.List<InvestmentThemePortfolio>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

