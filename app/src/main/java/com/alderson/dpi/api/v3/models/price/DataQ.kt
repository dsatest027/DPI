package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DataQ(
    @SerialName("compounding_service")
    val compoundingService: Boolean? = null,
    @SerialName("delivery_service")
    val deliveryService: Boolean? = null,
    @SerialName("drive_up_window")
    val driveUpWindow: Boolean? = null,
    val fax: String? = null,
    @SerialName("has_features")
    val hasFeatures: Boolean? = null,
    val hours: List<List<String?>?>? = null,
    val languages: List<String?>? = null,
    @SerialName("open_24")
    val open24: Boolean? = null,
    val phone: String? = null,
    @SerialName("provider_codes")
    val providerCodes: List<String?>? = null,
    @SerialName("walk_in_clinic")
    val walkInClinic: Boolean? = null
)