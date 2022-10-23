package com.example.jlquizapp

import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle


class Stats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val history : Button = findViewById(R.id.userhistory)
        val eCounter : TextView = findViewById(R.id.statCounter)
        val historyText : TextView = findViewById(R.id.readFile)
        eCounter.text = counter.toString()
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        val formatted = current.format(formatter)

        val score = "You got ${eCounter.text}/9 on $formatted"

        val outputStream = openFileOutput("QuizHistory.txt", MODE_APPEND)
        val writer = PrintWriter(outputStream)

        // Write each task on a separate line
        writer.println(score)

        writer.close()

        history.setOnClickListener {
            val inputStream = openFileInput("QuizHistory.txt")
            val reader = inputStream.bufferedReader()
            val stringBuilder = StringBuilder()
            val lineSeparator = System.getProperty("line.separator")

            // Append each task to stringBuilder
            reader.forEachLine { stringBuilder.append(it).append(lineSeparator) }

            historyText.text = stringBuilder.toString()
            inputStream.close()
        }
    }
    override fun onKeyDown(key_code: Int, key_event: KeyEvent?): Boolean {
        if (key_code == KeyEvent.KEYCODE_BACK) {
            super.onKeyDown(key_code, key_event)
            return true
        }
        return false
    }
    override fun onBackPressed() {

    }
}