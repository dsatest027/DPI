package com.alderson.dpi.ui.compose

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import com.alderson.dpi.ui.compose.viewmodels.MainCompositionVM
import org.junit.Rule
import org.junit.Test

internal class MainCompositionKtTest {
    @get: Rule
    val composeTestRule =
        createComposeRule()   // compose rule is required to get access to the composable component

    @Test
    fun mainComposition() {
        val state = MainCompositionVM(
            drugName = mutableStateOf("amoxicillin"),
            zip = mutableStateOf("10069"),
            latitude = mutableStateOf(null),
            longitude = mutableStateOf(null),
        )
        composeTestRule.setContent {    // setting our composable as content for test
            MainComposition(state = state)

        }
        composeTestRule.onNodeWithContentDescription("scaffold").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("topBar").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Drug Name").assertIsFocused()
        composeTestRule.onNodeWithContentDescription("Drug Name").performClick()
    }
}