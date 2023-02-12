package com.alderson.dpi.ui.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.alderson.dpi.R
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM
import com.alderson.dpi.ui.compose.viewmodels.TextOutputVM

@Composable
fun ShowDrugInfo(state: MainCompositionVM) {
    state.prices.firstOrNull()?.let { price ->
        Column {
            TextOutput(
                state = TextOutputVM(
                    height = state.height,
                    text = price.drugObject?.drugDisplay?.primaryTitle,
                    label = stringResource(id = R.string.drug_name_text),
                )
            )
            TextOutput(
                state = TextOutputVM(
                    height = state.height,
                    text = price.prices?.firstOrNull()?.pharmacyObject?.name,
                    label = stringResource(id = R.string.pharmacy_name_text),
                )
            )
            TextOutput(
                state = TextOutputVM(
                    height = state.height,
                    text = price.formattedLowPrice,
                    label = stringResource(id = R.string.price_text),
                )
            )
            TextOutput(
                state = TextOutputVM(
                    height = state.height,
                    text = price.prices?.firstOrNull()?.typeDisplay,
                    label = stringResource(id = R.string.price_type_text),
                )
            )
            if (state.zip.value != null || state.latitude.value != null && state.longitude.value != null) {
                TextOutput(
                    state = TextOutputVM(
                        height = state.height,
                        text = state.zip.value
                            ?: "${state.latitude}, ${state.longitude}",
                        label = state.zip.value?.let {
                            stringResource(id = R.string.zip_text)
                        } ?: stringResource(id = R.string.coordinates_text)
                    )
                )
            }
        }
    }
}
