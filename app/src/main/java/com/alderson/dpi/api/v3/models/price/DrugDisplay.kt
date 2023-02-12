package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DrugDisplay(
    @SerialName("header_title")
    val headerTitle: String? = null,
    @SerialName("header_title_html")
    val headerTitleHtml: String? = null,
    @SerialName("primary_title")
    val primaryTitle: String? = null,
    @SerialName("primary_title_html")
    val primaryTitleHtml: String? = null,
    @SerialName("secondary_title")
    val secondaryTitle: String? = null,
    @SerialName("secondary_title_html")
    val secondaryTitleHtml: String? = null
)