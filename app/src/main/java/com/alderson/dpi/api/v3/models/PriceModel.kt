package com.alderson.dpi.api.v3.models

import com.alderson.dpi.api.v3.models.price.DrugObject
import com.alderson.dpi.api.v3.models.price.Location
import com.alderson.dpi.api.v3.models.price.Price
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PriceModel(
    val banner: String? = null,
    @SerialName("drug_error_disclaimer")
    val drugErrorDisclaimer: String? = null,
    @SerialName("drug_id")
    val drugId: Int? = null,
    @SerialName("drug_object")
    val drugObject: DrugObject? = null,
    @SerialName("formatted_average_price")
    val formattedAveragePrice: String? = null,
    @SerialName("formatted_low_price")
    val formattedLowPrice: String? = null,
    @SerialName("formatted_percent_saved")
    val formattedPercentSaved: String? = null,
    @SerialName("gold_promotion")
    val goldPromotion: String? = null,
    val location: Location? = null,
    @SerialName("low_price")
    val lowPrice: String? = null,
    @SerialName("no_price_disclaimer")
    val noPriceDisclaimer: String? = null,
    @SerialName("price_disclaimer_text")
    val priceDisclaimerText: String? = null,
    val prices: List<Price?>? = null,
    val quantity: Double? = null,
    @SerialName("seo_savings")
    val seoSavings: Int? = null,
    @SerialName("sponsored_listing")
    val sponsoredListing: String? = null
)