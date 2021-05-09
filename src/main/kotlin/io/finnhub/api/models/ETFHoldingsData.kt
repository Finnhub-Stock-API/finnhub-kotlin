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
package io.finnhub.api.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 * @param symbol Symbol description
 * @param share Number of shares owned by the ETF.
 * @param percent Portfolio's percent
 */

@Serializable
data class ETFHoldingsData (
    /* Symbol description */
    @SerialName("symbol")
    val symbol: String? = null,
    /* Number of shares owned by the ETF. */
    @SerialName("share")
    val share: Float? = null,
    /* Portfolio's percent */
    @SerialName("percent")
    val percent: Float? = null
) {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}
