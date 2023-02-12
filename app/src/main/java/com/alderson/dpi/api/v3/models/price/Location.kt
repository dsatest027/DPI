package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val city: String? = null,
    val coords: Coords? = null,
    val distance: Int? = null,
    @SerialName("formatted_address")
    val formattedAddress: String? = null,
    @SerialName("full_state")
    val fullState: String? = null,
    val neighborhood: String? = null,
    val source: String? = null,
    val state: String? = null,
    val zip: String? = null
)