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
 * @param country Country name
 * @param code2 Alpha 2 code
 * @param code3 Alpha 3 code
 * @param codeNo UN code
 * @param currency Currency name
 * @param currencyCode Currency code
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
    val currencyCode: kotlin.String? = null
) : Serializable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}
