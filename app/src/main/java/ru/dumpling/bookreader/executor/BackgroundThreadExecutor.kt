package ru.dumpling.bookreader.executor

import android.os.AsyncTask
import java.util.concurrent.Executor

class BackgroundThreadExecutor : Executor {
    override fun execute(command: Runnable?) {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(command)
    }
}