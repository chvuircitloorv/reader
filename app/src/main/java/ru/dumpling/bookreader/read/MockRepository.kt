package ru.dumpling.bookreader.read

class MockRepository : ReadRepository {

    private val sampleText = arrayOf<CharSequence>(
            "Hello", "this", "is", "sample", "line", "for", "testing",
            "Hello", "this", "is", "sample", "line", "for", "testing",
            "Hello", "this", "is", "sample", "line", "for", "testing",
            "Hello", "this", "is", "sample", "line", "for", "testing",
            "Hello", "this", "is", "sample", "line", "for", "testing"
    )

    override fun words(): Array<CharSequence> {
        return sampleText
    }
}