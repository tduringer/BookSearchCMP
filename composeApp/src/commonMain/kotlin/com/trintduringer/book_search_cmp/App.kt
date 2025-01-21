package com.trintduringer.book_search_cmp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.trintduringer.book_search_cmp.book.presentation.book_list.BookListScreenRoot
import com.trintduringer.book_search_cmp.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        }
    )
}