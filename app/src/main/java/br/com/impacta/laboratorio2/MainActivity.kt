package br.com.impacta.laboratorio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var editText: EditText? = null
    var button: Button? = null
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editTextTextPersonName)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        textView?.text = ""

        button?.setOnClickListener {
            var nome = editText?.text
            textView?.text = "Seja bem vindo, ${nome}!"
        }
    }
}