package com.alderson.dpi.ui.compose

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.alderson.dpi.R
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM
import com.alderson.dpi.ui.compose.viewmodels.TextInputVM
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

@Composable
fun DrugNameTextInput(state: MainCompositionVM, width: Dp) {
    val drugNameText = stringResource(R.string.drug_name_text)
    val context = LocalContext.current
    val scope = LocalLifecycleOwner.current.lifecycleScope

    TextInput(
        state = remember {
            TextInputVM(
                modifier = Modifier
                    .padding(horizontal = 4.dp, vertical = 2.dp)
                    .width(
                        width
                            .times(2)
                            .div(3)
                            .coerceAtLeast(200.dp)
                    )
                    .height(state.height),
                textInputModifier = Modifier
                    .semantics { contentDescription = drugNameText },
                textInputShape = RoundedCornerShape(6.dp),
                label = drugNameText,
                textInput = state.drugName,
                focusRequester = FocusRequester(),
                doneEvent = {
                    state.drugName.value = it
                    scope.launch(IO) {
                        state.getPrice(clear = true, context = context)
                    }
                }
            )
        }
    )
}