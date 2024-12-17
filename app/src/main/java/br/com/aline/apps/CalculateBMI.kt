package br.com.aline.apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class CalculateBMI : AppCompatActivity() {
    private lateinit var back: ImageView
    private lateinit var weightInput: EditText
    private lateinit var heightInput: EditText
    private lateinit var btnCalculate: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmi)
        setViews()
        setListeners()
    }

    private fun setViews() {
        back = findViewById(R.id.iv_back)
        weightInput = findViewById(R.id.et_weight)
        heightInput = findViewById(R.id.et_heigth)
        btnCalculate = findViewById(R.id.btn_calculate)
        result = findViewById(R.id.tv_result)
    }

    private fun setListeners() {
        back.setOnClickListener {
            finish()
        }

        btnCalculate.setOnClickListener {
            calculateBMI()
        }
    }

    private fun calculateBMI() {
        val weight = weightInput.text.toString().toFloat()
        val height = heightInput.text.toString().toFloat()
        val bmi = weight / (height * height)
        result.text = "%.2f".format(bmi)
    }
}