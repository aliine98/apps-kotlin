package br.com.aline.apps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private var counter = 0
    private lateinit var counterView: TextView
    private lateinit var fab: FloatingActionButton
    private lateinit var gotoBMI: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViews()
        setListeners()
    }

    private fun setViews() {
        counterView = findViewById(R.id.tv_counter)
        fab = findViewById(R.id.floatingActionButton)
        gotoBMI = findViewById(R.id.btn_goto_imc)
    }

    private fun setListeners() {
        fab.setOnClickListener {
            counter++
            counterView.text = counter.toString()
        }

        gotoBMI.setOnClickListener{
            startActivity(Intent(this, CalculateBMI::class.java))
        }
    }
}