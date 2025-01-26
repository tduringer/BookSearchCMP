package com.trintduringer.book_search_cmp.book.domain

import com.trintduringer.book_search_cmp.core.domain.DataError
import com.trintduringer.book_search_cmp.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}