package com.alderson.dpi.ui.compose.viewmodels

import android.content.Context
import android.content.ContextWrapper
import androidx.activity.ComponentActivity
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.alderson.dpi.DpiApplication
import com.alderson.dpi.api.v3.models.PriceModel
import java.math.BigDecimal

class MainCompositionVM(
    val drugName: MutableState<String?> = mutableStateOf(null),
    val zip: MutableState<String?> = mutableStateOf(null),
    val latitude: MutableState<BigDecimal?> = mutableStateOf(null),
    val longitude: MutableState<BigDecimal?> = mutableStateOf(null),
) {
    var height: Dp = 60.dp

    val prices = mutableStateListOf<PriceModel>()

    suspend fun getPrice(
        clear: Boolean = false,
        context: Context,
    ) {
        if (clear) {
            prices.clear()
        }

        val list =
            (context.getActivity()?.application as? DpiApplication)?.apiService?.getPrice(this)
                ?: emptyList()
        prices.addAll(list)
    }
}

private fun Context.getActivity(): ComponentActivity? = when (this) {
    is ComponentActivity -> this
    is ContextWrapper -> baseContext.getActivity()
    else -> null
}