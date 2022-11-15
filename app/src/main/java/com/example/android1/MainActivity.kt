package com.example.android1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colorSelector = findViewById<RadioGroup>(R.id.ColorSelect)
        val priceSelector = findViewById<RadioGroup>(R.id.PriceSelect)
        val submitButton = findViewById<Button>(R.id.button)
        val textOutput = findViewById<TextView>(R.id.TextOutput)
        submitButton.setOnClickListener {
            var colorChoice = findViewById<RadioButton>(colorSelector.checkedRadioButtonId)
            var priceChoice = findViewById<RadioButton>(priceSelector.checkedRadioButtonId)
            textOutput.text = "Ви бажаєте замовити квіти, що мають " + colorChoice.text +
                    " колір в діапазоні цін " + priceChoice.text
        }
    }
}