package com.finnhub.api.infrastructure

import kotlinx.serialization.json.Json

object Serializer {

    @JvmStatic
    val json: Json = Json {
        ignoreUnknownKeys = true
        isLenient = true
    }
}