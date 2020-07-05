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
 * @param symbol Company symbol.
 * @param transcript Transcript content.
 * @param participant Participant list
 * @param audio Audio link.
 * @param id Transcript's ID.
 * @param title Title.
 * @param time Time of the event.
 * @param year Year of earnings result in the case of earnings call transcript.
 * @param quarter Quarter of earnings result in the case of earnings call transcript.
 */

data class EarningsCallTranscripts (
    /* Company symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,
    /* Transcript content. */
    @Json(name = "transcript")
    val transcript: kotlin.collections.List<kotlin.Any>? = null,
    /* Participant list */
    @Json(name = "participant")
    val participant: kotlin.collections.List<kotlin.Any>? = null,
    /* Audio link. */
    @Json(name = "audio")
    val audio: kotlin.String? = null,
    /* Transcript's ID. */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* Title. */
    @Json(name = "title")
    val title: kotlin.String? = null,
    /* Time of the event. */
    @Json(name = "time")
    val time: kotlin.String? = null,
    /* Year of earnings result in the case of earnings call transcript. */
    @Json(name = "year")
    val year: kotlin.Long? = null,
    /* Quarter of earnings result in the case of earnings call transcript. */
    @Json(name = "quarter")
    val quarter: kotlin.Long? = null
) : Serializable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}
