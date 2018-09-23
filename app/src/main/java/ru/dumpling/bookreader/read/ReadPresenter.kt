package ru.dumpling.bookreader.read

import java.util.concurrent.Executor

class ReadPresenter(
        override val view: ReadContract.View?,
        private val repository: ReadRepository,
        private val backgroundThread: Executor,
        private val mainThread: Executor
) : ReadContract.Presenter {


}