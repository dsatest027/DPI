package com.alderson.dpi.ui.compose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.alderson.dpi.ui.compose.viewmodels.TextOutputVM

@Composable
fun TextOutput(state: TextOutputVM) {
    Column(
        modifier = Modifier
            .semantics { contentDescription = state.label ?: "" }
            .padding(horizontal = 4.dp, vertical = 2.dp)
            .fillMaxWidth()
            .wrapContentHeight(CenterVertically)
            .border(width = Dp.Hairline, color = Color.Black, shape = RoundedCornerShape(6.dp)),
    ) {
        if (!state.label.isNullOrBlank()) {
            Text(
                modifier = Modifier.padding(start = 6.dp, end = 6.dp, top = 4.dp),
                text = state.label,
                textAlign = TextAlign.Start,
            )
        }
        Text(
            modifier = Modifier.padding(
                start = 6.dp,
                end = 6.dp,
                top = if (state.label.isNullOrBlank()) 4.dp else 0.dp,
                bottom = 4.dp
            ),
            text = state.text ?: "",
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold,
        )
    }
}