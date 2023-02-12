package com.alderson.dpi.ui.compose.viewmodels

import android.graphics.drawable.Icon
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class TextInputVM(
    val modifier: Modifier = Modifier,
    val textInputModifier: Modifier = Modifier,
    val textInputShape: Shape = RectangleShape,
    val label: String = "",
    val textInput: MutableState<String?> = mutableStateOf(null),
    val focusRequester: FocusRequester? = null,
    var doneEvent: (String) -> Unit = { },
)