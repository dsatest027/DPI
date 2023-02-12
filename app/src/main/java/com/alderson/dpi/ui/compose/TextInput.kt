package com.alderson.dpi.ui.compose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alderson.dpi.ui.compose.viewmodels.TextInputVM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(state: TextInputVM) {
    LaunchedEffect(Unit) {
        state.focusRequester?.requestFocus()
    }

    MaterialTheme {
        Row(
            modifier = state.modifier
                .border(width = 1.dp, shape = RoundedCornerShape(6.dp), color = Color.Black),
        ) {
            TextField(
                modifier = state.textInputModifier
                    .focusRequester(state.focusRequester ?: FocusRequester()),
                value = state.textInput.value ?: "",
                shape = state.textInputShape,
                singleLine = true,
                label = { Text(state.label) },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                ),
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        state.doneEvent(state.textInput.value ?: "")
                    },
                ),
                onValueChange = { value ->
                    state.textInput.value = value
                },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTextInput() {
    val state = TextInputVM(
        textInput = remember { mutableStateOf("amoxicillin") }
    )
    state.doneEvent = { state.textInput.value = "DONE" }

    TextInput(state = state)
}