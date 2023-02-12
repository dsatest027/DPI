package com.alderson.dpi.ui.compose

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
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

@Composable
fun ZipTextInput(state: MainCompositionVM, width: Dp) {
    val zipText = stringResource(id = R.string.zip_text)

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
                    .semantics { contentDescription = zipText },
                textInputShape = RoundedCornerShape(6.dp),
                label = zipText,
                textInput = state.zip,
                doneEvent = {
                    state.zip.value = it
                }
            )
        }
    )
}
