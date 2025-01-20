package com.trintduringer.book_search_cmp.book.presentation.book_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import booksearchcmp.composeapp.generated.resources.Res
import booksearchcmp.composeapp.generated.resources.search_hint
import com.trintduringer.book_search_cmp.core.presentation.DarkBlue
import com.trintduringer.book_search_cmp.core.presentation.SandYellow
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun BookSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onImeSearch: () -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,
        shape = RoundedCornerShape(100),
        colors = OutlinedTextFieldDefaults.colors(
            cursorColor = DarkBlue,
            focusedBorderColor = SandYellow
        ),
        placeholder = {
            Text(
                text = stringResource(Res.string.search_hint)
            )
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface.copy(
                    alpha = 0.66f
                )
            )
        }
    )
}