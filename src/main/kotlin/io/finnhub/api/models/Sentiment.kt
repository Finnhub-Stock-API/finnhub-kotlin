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
 * @param bearishPercent 
 * @param bullishPercent 
 */

@Serializable
data class Sentiment (
    /*  */
    @SerialName("bearishPercent")
    val bearishPercent: Long? = null,
    /*  */
    @SerialName("bullishPercent")
    val bullishPercent: Long? = null
) {
	companion object {
    }

}
