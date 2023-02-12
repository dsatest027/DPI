package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DrugObject (
    val display: String? = null,
    val dosage: String? = null,
    @SerialName("dosage_display")
    val dosageDisplay: String? = null,
    @SerialName("dosage_form_display")
    val dosageFormDisplay: String? = null,
    @SerialName("dosage_form_display_short")
    val dosageFormDisplayShort: String? = null,
    @SerialName("drug_display")
    val drugDisplay: DrugDisplay? = null,
    @SerialName("drug_market_type")
    val drugMarketType: String? = null,
    @SerialName("drug_page_type")
    val drugPageType: String? = null,
    @SerialName("drug_slug")
    val drugSlug: String? = null,
    val form: String? = null,
    @SerialName("form_display")
    val formDisplay: String? = null,
    @SerialName("form_plural")
    val formPlural: String? = null,
    val id: Int? = null,
    @SerialName("is_default")
    val isDefault: Boolean? = null,
    val label: String? = null,
    val name: String? = null,
    val quantity: Int? = null,
    val type: String? = null
)