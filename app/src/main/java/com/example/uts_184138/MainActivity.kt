package com.example.uts_184138

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName: EditText = findViewById(R.id.editTextName)
        val editTextNim: EditText = findViewById(R.id.editTextNim)
        val radioGroupMajor: RadioGroup = findViewById(R.id.radioGroupMajor)
        val buttonSave: Button = findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener {
            val name = editTextName.text.toString()
            val nim = editTextNim.text.toString()
            val selectedRadioButtonId = radioGroupMajor.checkedRadioButtonId

            val major = when (selectedRadioButtonId) {
                R.id.radioButtonComputerEngineering -> "Teknik Komputer"
                R.id.radioButtonSystemInformation -> "Sistem Informasi"
                else -> ""
            }

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_NIM", nim)
                putExtra("EXTRA_MAJOR", major)
            }
            startActivity(intent)
        }
    }
}
