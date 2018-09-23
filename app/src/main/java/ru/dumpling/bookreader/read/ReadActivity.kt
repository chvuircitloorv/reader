package ru.dumpling.bookreader.read

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import ru.dumpling.bookreader.R

class ReadActivity : AppCompatActivity() {

    private val line: TextView by lazy { findViewById<TextView>(R.id.textLine) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)
    }

}