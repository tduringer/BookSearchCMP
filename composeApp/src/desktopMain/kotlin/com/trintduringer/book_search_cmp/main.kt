package com.trintduringer.book_search_cmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "BookSearchCMP",
    ) {
        App()
    }
}