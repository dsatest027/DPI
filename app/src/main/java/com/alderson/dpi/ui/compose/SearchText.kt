package com.alderson.dpi.ui.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alderson.dpi.R

@Composable
fun SearchText() {
    Text(
        stringResource(id = R.string.search_text),
        fontSize = 32.sp,
        modifier = Modifier.padding(start = 4.dp)
    )
}