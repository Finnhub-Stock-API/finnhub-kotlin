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

import io.finnhub.api.models.ExcerptResponse

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param documentId AlphaResearch internal document id.
 * @param title Title for this document.
 * @param hits Number of hit in this document
 * @param url Link to render this document
 * @param format Format of this document (can be html or pdf)
 * @param excerpts Highlighted excerpts for this document
 */

data class DocumentResponse (

    /* AlphaResearch internal document id. */
    @Json(name = "documentId")
    val documentId: kotlin.String? = null,

    /* Title for this document. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Number of hit in this document */
    @Json(name = "hits")
    val hits: kotlin.String? = null,

    /* Link to render this document */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* Format of this document (can be html or pdf) */
    @Json(name = "format")
    val format: kotlin.String? = null,

    /* Highlighted excerpts for this document */
    @Json(name = "excerpts")
    val excerpts: kotlin.collections.List<ExcerptResponse>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

