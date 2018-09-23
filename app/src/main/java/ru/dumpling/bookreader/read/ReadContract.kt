package ru.dumpling.bookreader.read

interface ReadContract {

    interface View {
        fun showWord(word: CharSequence)
    }

    interface Presenter {
        val view: View?
    }
}