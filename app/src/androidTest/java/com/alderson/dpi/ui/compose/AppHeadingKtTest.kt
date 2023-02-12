package com.alderson.dpi.ui.compose

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM
import org.junit.Rule
import org.junit.Test

internal class AppHeadingKtTest {
    @get: Rule
    val composeTestRule =
        createComposeRule()   // compose rule is required to get access to the composable component

    @Test
    fun appHeading() {
        val state = MainCompositionVM(
            drugName = mutableStateOf("amoxicillin"),
            zip = mutableStateOf("10069"),
            latitude = mutableStateOf(null),
            longitude = mutableStateOf(null),
        )
        composeTestRule.setContent {    // setting our composable as content for test
            AppHeading(state = state)

        }
        composeTestRule.onNodeWithContentDescription("AppHeading").assertIsDisplayed()
    }
}