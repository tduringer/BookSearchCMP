package com.trintduringer.book_search_cmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.trintduringer.book_search_cmp.book.domain.Book
import com.trintduringer.book_search_cmp.book.presentation.book_list.BookListScreen
import com.trintduringer.book_search_cmp.book.presentation.book_list.BookListState
import com.trintduringer.book_search_cmp.book.presentation.book_list.components.BookListItem
import com.trintduringer.book_search_cmp.book.presentation.book_list.components.BookSearchBar
import com.trintduringer.book_search_cmp.book.presentation.book_list.testBooks1
import org.jetbrains.compose.ui.tooling.preview.Preview



@androidx.compose.ui.tooling.preview.Preview
@Composable
fun BookSearchBarPreview() {
    BookSearchBar(
        searchQuery = "Kotlin",
        onSearchQueryChange = {},
        onImeSearch = {},
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    )
}

//@Composable
//fun BookListItemPreview(
//    modifier: Modifier = Modifier
//) {
//    BookListItem(
//        book = Book(
//
//        ),
//        on
//    )
//}

@androidx.compose.ui.tooling.preview.Preview
@Composable
fun BookListPreview(modifier: Modifier = Modifier) {
    BookListScreen(
        state = BookListState(
            searchResults = testBooks1
        ),
        onAction = {}
    )
}

@androidx.compose.ui.tooling.preview.Preview
@Composable
fun AppAndroidPreview2() {
    App()
}