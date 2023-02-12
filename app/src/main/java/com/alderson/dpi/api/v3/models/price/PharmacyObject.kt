package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PharmacyObject(
    @SerialName("alternate_logo")
    val alternateLogo: String? = null,
    @SerialName("block_cash_price")
    val blockCashPrice: Boolean? = null,
    @SerialName("block_drug_name")
    val blockDrugName: Boolean? = null,
    @SerialName("block_logo")
    val blockLogo: Boolean? = null,
    @SerialName("block_pharmacy_name")
    val blockPharmacyName: Boolean? = null,
    @SerialName("closest_location")
    val closestLocation: Double? = null,
    val disclaimer: String? = null,
    @SerialName("has_24hr")
    val has24Hr: Boolean? = null,
    val id: Int? = null,
    val info: String? = null,
    val name: String? = null,
    @SerialName("number_of_locations")
    val numberOfLocations: Int? = null,
    @SerialName("popularity_rank")
    val popularityRank: Int? = null,
    val type: String? = null,
    @SerialName("use_discount_noun")
    val useDiscountNoun: Boolean? = null
)