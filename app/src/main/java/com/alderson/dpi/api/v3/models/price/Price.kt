package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Price(
    @SerialName("cash_price")
    val cashPrice: String? = null,
    @SerialName("coupon_network")
    val couponNetwork: String? = null,
    val extras: String? = null,
    @SerialName("is_transfer_eligible")
    val isTransferEligible: Boolean? = null,
    val logo: String? = null,
    @SerialName("logo_secondary")
    val logoSecondary: String? = null,
    val note: String? = null,
    @SerialName("other_price_data")
    val otherPriceData: List<String?>? = null,
    @SerialName("other_price_fields")
    val otherPriceFields: List<List<String?>?>? = null,
    @SerialName("pharmacy_locations_object")
    val pharmacyLocationsObject: List<PharmacyLocationsObject?>? = null,
    @SerialName("pharmacy_object")
    val pharmacyObject: PharmacyObject? = null,
    val price: String? = null,
    @SerialName("pricing_params")
    val pricingParams: String? = null,
    val savings: String? = null,
    @SerialName("savings_percent")
    val savingsPercent: String? = null,
    @SerialName("show_discount_card")
    val showDiscountCard: Boolean? = null,
    @SerialName("special_discount")
    val specialDiscount: String? = null,
    @SerialName("transfer_region")
    val transferRegion: String? = null,
    val type: String? = null,
    @SerialName("type_display")
    val typeDisplay: String? = null
)