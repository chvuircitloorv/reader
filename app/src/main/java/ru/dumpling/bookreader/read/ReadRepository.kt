package ru.dumpling.bookreader.read

interface ReadRepository {
    fun words(): Array<CharSequence>
}