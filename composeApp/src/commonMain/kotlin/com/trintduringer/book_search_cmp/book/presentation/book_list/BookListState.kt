package com.trintduringer.book_search_cmp.book.presentation.book_list

import com.trintduringer.book_search_cmp.book.domain.Book
import com.trintduringer.book_search_cmp.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
