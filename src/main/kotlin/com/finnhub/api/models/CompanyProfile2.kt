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


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 * @param country Country of company's headquarter.
 * @param currency Currency used in company filings.
 * @param exchange Listed exchange.
 * @param name Company name.
 * @param ticker Company symbol/ticker as used on the listed exchange.
 * @param ipo IPO date.
 * @param marketCapitalization Market Capitalization.
 * @param shareOutstanding Number of oustanding shares.
 * @param logo Logo image.
 * @param phone Company phone number.
 * @param weburl Company website.
 * @param finnhubIndustry Finnhub industry classification.
 */

@Serializable
data class CompanyProfile2 (
    /* Country of company's headquarter. */
    @SerialName("country")
    val country: String? = null,
    /* Currency used in company filings. */
    @SerialName("currency")
    val currency: String? = null,
    /* Listed exchange. */
    @SerialName("exchange")
    val exchange: String? = null,
    /* Company name. */
    @SerialName("name")
    val name: String? = null,
    /* Company symbol/ticker as used on the listed exchange. */
    @SerialName("ticker")
    val ticker: String? = null,
    /* IPO date. */
    @SerialName("ipo")
    val ipo: String? = null,
    /* Market Capitalization. */
    @SerialName("marketCapitalization")
    val marketCapitalization: Float? = null,
    /* Number of oustanding shares. */
    @SerialName("shareOutstanding")
    val shareOutstanding: Float? = null,
    /* Logo image. */
    @SerialName("logo")
    val logo: String? = null,
    /* Company phone number. */
    @SerialName("phone")
    val phone: String? = null,
    /* Company website. */
    @SerialName("weburl")
    val weburl: String? = null,
    /* Finnhub industry classification. */
    @SerialName("finnhubIndustry")
    val finnhubIndustry: String? = null
) {
	companion object {
    }

}

