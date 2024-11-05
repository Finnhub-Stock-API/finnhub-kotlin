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
 * @param totalESGScore Total ESG Score
 * @param environmentScore Environment Score
 * @param governanceScore Governance Score
 * @param socialScore Social Score
 * @param `data` 
 * @param period Period
 */

data class CompanyESG2 (

    /* Total ESG Score */
    @Json(name = "totalESGScore")
    val totalESGScore: kotlin.Float? = null,

    /* Environment Score */
    @Json(name = "environmentScore")
    val environmentScore: kotlin.Float? = null,

    /* Governance Score */
    @Json(name = "governanceScore")
    val governanceScore: kotlin.Float? = null,

    /* Social Score */
    @Json(name = "socialScore")
    val socialScore: kotlin.Float? = null,

    @Json(name = "data")
    val `data`: kotlin.Any? = null,

    /* Period */
    @Json(name = "period")
    val period: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
