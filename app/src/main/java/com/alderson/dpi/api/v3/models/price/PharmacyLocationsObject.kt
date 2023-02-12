package com.alderson.dpi.api.v3.models.price

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PharmacyLocationsObject(
    val address: String? = null,
    val city: String? = null,
    @SerialName("closed_door")
    val closedDoor: Boolean? = null,
    @SerialName("compoundingService")
    val compoundingService: Boolean? = null,
    @SerialName("dataQ")
    val dataQ: DataQ? = null,
    val deleted: Boolean? = null,
    @SerialName("deliveryService")
    val deliveryService: Boolean? = null,
    val description: String? = null,
    val disclaimer: String? = null,
    @SerialName("discountDescription")
    val discountDescription: String? = null,
    @SerialName("discountProgramActive")
    val discountProgramActive: Boolean? = null,
    @SerialName("discountProgramCost")
    val discountProgramCost: String? = null,
    @SerialName("discountProgramDisclaimer")
    val discountProgramDisclaimer: String? = null,
    @SerialName("discountProgramLength")
    val discountProgramLength: String? = null,
    @SerialName("discountProgramName")
    val discountProgramName: String? = null,
    @SerialName("drugErrorDisclaimer")
    val discountProgramUrl: String? = null,
    val distance: Double? = null,
    @SerialName("driveUpWindow")
    val driveUpWindow: Boolean? = null,
    @SerialName("executionDate")
    val executionDate: String? = null,
    val fax: String? = null,
    val hours: String? = null,
    val id: Int? = null,
    @SerialName("is24H")
    val is24H: Boolean? = null,
    @SerialName("isBlacklisted")
    val isBlacklisted: Boolean? = null,
    @SerialName("isValid")
    val isValid: Boolean? = null,
    val languages: String? = null,
    val latitude: Double? = null,
    val location: String? = null,
    val longitude: Double? = null,
    @SerialName("nabpApproved")
    val nabpApproved: Boolean? = null,
    @SerialName("nabpDisplayName")
    val nabpDisplayName: String? = null,
    val name: String? = null,
    val ncpdp: String? = null,
    val npi: String? = null,
    @SerialName("pharmacyId")
    val pharmacyId: Int? = null,
    val phone: String? = null,
    @SerialName("providerCodes")
    val providerCodes: String? = null,
    val state: String? = null,
    @SerialName("stateBlacklist")
    val stateBlacklist: String? = null,
    @SerialName("storeType")
    val storeType: String? = null,
    val url: String? = null,
    @SerialName("urlDisplay")
    val urlDisplay: String? = null,
    val version: String? = null,
    @SerialName("walkInClinic")
    val walkInClinic: Boolean? = null,
    val zipcode: String? = null
)