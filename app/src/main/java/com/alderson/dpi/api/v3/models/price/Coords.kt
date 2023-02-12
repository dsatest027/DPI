package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.Serializable

@Serializable
data class Coords(
    val latitude: Double? = null,
    val longitude: Double? = null
)