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
 * @param earningsCalendar Array of earnings release.
 */

data class EarningsCalendar (
    /* Array of earnings release. */
    @Json(name = "earningsCalendar")
    val earningsCalendar: kotlin.collections.List<kotlin.Any>? = null
) : Serializable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}
