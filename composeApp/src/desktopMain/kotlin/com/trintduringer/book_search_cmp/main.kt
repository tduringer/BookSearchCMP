package com.trintduringer.book_search_cmp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.ktor.client.engine.okhttp.OkHttp

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "BookSearchCMP",
    ) {
        App(
            engine =  remember { OkHttp.create() }
        )
    }
}