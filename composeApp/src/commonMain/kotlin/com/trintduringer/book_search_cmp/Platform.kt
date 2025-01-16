package com.trintduringer.book_search_cmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform