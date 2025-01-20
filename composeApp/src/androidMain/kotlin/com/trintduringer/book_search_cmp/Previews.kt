package com.trintduringer.book_search_cmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.trintduringer.book_search_cmp.book.presentation.book_list.components.BookSearchBar
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun BookSearchBarPreview() {
    BookSearchBar(
        searchQuery = "Kotlin",
        onSearchQueryChange = {},
        onImeSearch = {},
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    )
}