package com.trintduringer.book_search_cmp.book.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponseDto(
    @SerialName("docs")
    val results: List<SearchBookDto>
)
