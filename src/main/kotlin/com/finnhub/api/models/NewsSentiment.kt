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

import com.finnhub.api.models.CompanyNewsStatistics
import com.finnhub.api.models.Sentiment

import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param buzz 
 * @param companyNewsScore News score.
 * @param sectorAverageBullishPercent Sector average bullish percent.
 * @param sectorAverageNewsScore Sectore average score.
 * @param sentiment 
 * @param symbol Requested symbol.
 */

data class NewsSentiment (
    @Json(name = "buzz")
    val buzz: CompanyNewsStatistics? = null,
    /* News score. */
    @Json(name = "companyNewsScore")
    val companyNewsScore: kotlin.Float? = null,
    /* Sector average bullish percent. */
    @Json(name = "sectorAverageBullishPercent")
    val sectorAverageBullishPercent: kotlin.Float? = null,
    /* Sectore average score. */
    @Json(name = "sectorAverageNewsScore")
    val sectorAverageNewsScore: kotlin.Float? = null,
    @Json(name = "sentiment")
    val sentiment: Sentiment? = null,
    /* Requested symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null
) : Serializable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}
