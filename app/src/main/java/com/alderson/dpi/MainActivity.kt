package com.alderson.dpi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.alderson.dpi.ui.compose.MainComposition
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM

class MainActivity : ComponentActivity() {
    private val mainCompositionVM by lazy {
        MainCompositionVM(
            drugName = mutableStateOf("amoxicillin"),
            zip = mutableStateOf("10069"),
            latitude = mutableStateOf(null),
            longitude = mutableStateOf(null),
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainComposition(
                state = remember { mainCompositionVM }
            )
        }
    }
}