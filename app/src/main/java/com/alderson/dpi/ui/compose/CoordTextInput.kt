package com.alderson.dpi.ui.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.alderson.dpi.R
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM
import com.alderson.dpi.ui.compose.viewmodels.TextInputVM
import java.math.BigDecimal

@Composable
fun CoordTextInput(state: MainCompositionVM, width: Dp) {
    val latitudeText = stringResource(id = R.string.latitude_text)
    val longitudeText = stringResource(id = R.string.longitude_text)

    Row {
        TextInput(
            state = remember {
                TextInputVM(
                    modifier = Modifier
                        .padding(horizontal = 4.dp, vertical = 2.dp)
                        .width(
                            width
                                .div(3)
                                .coerceAtLeast(100.dp)
                        )
                        .height(state.height),
                    textInputModifier = Modifier
                        .semantics { contentDescription = latitudeText },
                    textInputShape = RoundedCornerShape(6.dp),
                    label = latitudeText,
                    textInput = mutableStateOf(state.latitude.value?.toString()),
                    doneEvent = {
                        state.latitude.value = BigDecimal(it)
                    }
                )
            }
        )
        Text(text = ", ")
        TextInput(
            state = remember {
                TextInputVM(
                    modifier = Modifier
                        .padding(horizontal = 4.dp, vertical = 2.dp)
                        .width(
                            width
                                .div(3)
                                .coerceAtLeast(100.dp)
                        )
                        .height(state.height),
                    textInputModifier = Modifier
                        .semantics { contentDescription = longitudeText },
                    textInputShape = RoundedCornerShape(6.dp),
                    label = longitudeText,
                    textInput = mutableStateOf(state.longitude.value?.toString()),
                    doneEvent = {
                        state.longitude.value = BigDecimal(it)
                    }
                )
            }
        )
    }
}
