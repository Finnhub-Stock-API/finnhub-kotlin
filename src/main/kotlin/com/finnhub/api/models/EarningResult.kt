/**
* Finnhub API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.finnhub.api.models


import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param actual Actual earning result.
 * @param estimate Estimated earning.
 * @param period Reported period.
 * @param symbol Company symbol.
 */

data class EarningResult (
    /* Actual earning result. */
    @Json(name = "actual")
    val actual: kotlin.Float? = null,
    /* Estimated earning. */
    @Json(name = "estimate")
    val estimate: kotlin.Float? = null,
    /* Reported period. */
    @Json(name = "period")
    val period: kotlin.String? = null,
    /* Company symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null
) : Serializable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}

