package com.example.uts_184138

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewName: TextView = findViewById(R.id.textViewName)
        val textViewNim: TextView = findViewById(R.id.textViewNim)
        val textViewMajor: TextView = findViewById(R.id.textViewMajor)

        val name = intent.getStringExtra("EXTRA_NAME")
        val nim = intent.getStringExtra("EXTRA_NIM")
        val major = intent.getStringExtra("EXTRA_MAJOR")

        textViewName.text = "Nama: $name"
        textViewNim.text = "NIM: $nim"
        textViewMajor.text = "Jurusan: $major"
    }
}
