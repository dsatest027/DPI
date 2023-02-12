package com.alderson.dpi.ui.compose

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.alderson.dpi.R
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM

@Composable
fun OrLabel(state: MainCompositionVM) {
    Text(
        modifier = Modifier
            .padding(start = 20.dp)
            .height(state.height)
            .wrapContentHeight(Alignment.CenterVertically),
        text = stringResource(id = R.string.or_text),
        fontWeight = FontWeight.Bold,
    )
}
