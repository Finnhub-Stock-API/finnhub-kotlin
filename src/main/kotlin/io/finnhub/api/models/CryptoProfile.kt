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
 * @param longName Long name.
 * @param name Name.
 * @param description Description.
 * @param website Project's website.
 * @param marketCap Market capitalization.
 * @param totalSupply Total supply.
 * @param maxSupply Max supply.
 * @param circulatingSupply Circulating supply.
 * @param logo Logo image.
 * @param launchDate Launch date.
 * @param proofType Proof type.
 */

data class CryptoProfile (

    /* Long name. */
    @Json(name = "longName")
    val longName: kotlin.String? = null,

    /* Name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Description. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Project's website. */
    @Json(name = "website")
    val website: kotlin.String? = null,

    /* Market capitalization. */
    @Json(name = "marketCap")
    val marketCap: kotlin.Float? = null,

    /* Total supply. */
    @Json(name = "totalSupply")
    val totalSupply: kotlin.Float? = null,

    /* Max supply. */
    @Json(name = "maxSupply")
    val maxSupply: kotlin.Float? = null,

    /* Circulating supply. */
    @Json(name = "circulatingSupply")
    val circulatingSupply: kotlin.Float? = null,

    /* Logo image. */
    @Json(name = "logo")
    val logo: kotlin.String? = null,

    /* Launch date. */
    @Json(name = "launchDate")
    val launchDate: kotlin.String? = null,

    /* Proof type. */
    @Json(name = "proofType")
    val proofType: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

