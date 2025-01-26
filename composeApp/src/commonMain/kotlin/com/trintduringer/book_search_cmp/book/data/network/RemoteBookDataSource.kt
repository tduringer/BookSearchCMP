package com.trintduringer.book_search_cmp.book.data.network

import com.trintduringer.book_search_cmp.book.data.dto.SearchResponseDto
import com.trintduringer.book_search_cmp.core.domain.DataError
import com.trintduringer.book_search_cmp.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ) : Result<SearchResponseDto, DataError.Remote>
}