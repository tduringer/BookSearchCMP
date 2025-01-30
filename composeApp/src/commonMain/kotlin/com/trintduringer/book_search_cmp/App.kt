package com.trintduringer.book_search_cmp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.trintduringer.book_search_cmp.book.data.network.KtorRemoteBookDataSource
import com.trintduringer.book_search_cmp.book.data.repository.DefaultBookRepository
import com.trintduringer.book_search_cmp.book.presentation.book_list.BookListScreenRoot
import com.trintduringer.book_search_cmp.book.presentation.book_list.BookListViewModel
import com.trintduringer.book_search_cmp.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel(
            bookRepository = DefaultBookRepository(
                remoteBookDataSource = KtorRemoteBookDataSource(
                    httpClient = HttpClientFactory.create(engine)
                )
            )
        ) },
        onBookClick = {

        }
    )
}