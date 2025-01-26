package com.trintduringer.book_search_cmp.book.data.repository

import com.trintduringer.book_search_cmp.book.data.mappers.toBook
import com.trintduringer.book_search_cmp.book.data.network.RemoteBookDataSource
import com.trintduringer.book_search_cmp.book.domain.Book
import com.trintduringer.book_search_cmp.book.domain.BookRepository
import com.trintduringer.book_search_cmp.core.domain.DataError
import com.trintduringer.book_search_cmp.core.domain.Result
import com.trintduringer.book_search_cmp.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map {
                    it.toBook()
                }
            }
    }
}