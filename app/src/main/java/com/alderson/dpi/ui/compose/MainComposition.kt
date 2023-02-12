package com.alderson.dpi.ui.compose

import android.view.KeyEvent
import androidx.appcompat.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainComposition(state: MainCompositionVM) {
    state.height = dimensionResource(id = R.dimen.abc_action_bar_default_height_material)
    val context = LocalContext.current
    val scope = LocalLifecycleOwner.current.lifecycleScope

    MaterialTheme {
        Scaffold(
            modifier = Modifier
                .semantics { contentDescription = "scaffold" }
                .fillMaxSize(),
            contentWindowInsets = WindowInsets(6.dp),
            topBar = {
                Row(
                    modifier = Modifier
                        .semantics { contentDescription = "topBar" }
                        .fillMaxWidth()
                        .height(state.height)
                        .background(color = Color.Yellow),
                ) {
                    AppHeading(state)
                }
            }
        ) { contentPadding ->
            BoxWithConstraints {
                val width = maxWidth
                Column(
                    modifier = Modifier
                        .semantics { contentDescription = "pressEnter" }
                        .padding(contentPadding)
                        .onKeyEvent {
                            if (it.nativeKeyEvent.keyCode == KeyEvent.KEYCODE_ENTER) {
                                scope.launch(IO) {
                                    state.getPrice(clear = true, context = context)
                                }
                                true
                            } else {
                                false
                            }
                        },

                    ) {
                    SearchText()
                    Row {
                        DrugNameTextInput(state, width)
                        SearchIcon(state)
                    }
                    Row {
                        ZipTextInput(state, width)
                        OrLabel(state)
                    }
                    CoordTextInput(state, width)
                    ShowDrugInfo(state)
                }
            }
        }
    }
}