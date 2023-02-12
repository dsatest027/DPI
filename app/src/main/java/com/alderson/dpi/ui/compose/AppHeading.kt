package com.alderson.dpi.ui.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.alderson.dpi.R
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM

@Composable
fun AppHeading(state: MainCompositionVM) {
    Text(
        modifier = Modifier
            .semantics { contentDescription = "AppHeading" }
            .fillMaxWidth()
            .height(state.height)
            .wrapContentHeight(CenterVertically),
        text = stringResource(id = R.string.app_title),
        style = TextStyle(
            fontSize = 24.sp,
        ),
        textAlign = TextAlign.Center,
    )
}