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
 * @param o Open price of the day
 * @param h High price of the day
 * @param l Low price of the day
 * @param c Current price
 * @param pc Previous close price
 */

data class Quote (
    /* Open price of the day */
    @Json(name = "o")
    val o: kotlin.Float? = null,
    /* High price of the day */
    @Json(name = "h")
    val h: kotlin.Float? = null,
    /* Low price of the day */
    @Json(name = "l")
    val l: kotlin.Float? = null,
    /* Current price */
    @Json(name = "c")
    val c: kotlin.Float? = null,
    /* Previous close price */
    @Json(name = "pc")
    val pc: kotlin.Float? = null
) : Serializable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}
