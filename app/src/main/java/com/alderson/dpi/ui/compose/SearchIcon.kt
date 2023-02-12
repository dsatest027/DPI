package com.alderson.dpi.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun SearchIcon(state: MainCompositionVM) {
    val context = LocalContext.current
    val scope = LocalLifecycleOwner.current.lifecycleScope

    Icon(
        imageVector = Icons.Outlined.Search,
        contentDescription = null,
        modifier = Modifier
            .height(state.height)
            .wrapContentHeight(Alignment.CenterVertically)
            .size(40.dp)
            .clickable(
                onClick = {
                    scope.launch(Dispatchers.IO) {
                        state.getPrice(clear = true, context = context)
                    }
                }
            )
    )
}
