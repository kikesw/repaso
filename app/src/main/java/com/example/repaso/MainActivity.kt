package com.example.repaso


import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)
        val editT = findViewById<EditText>(R.id.edit)
        val foto = findViewById<ImageView>(R.id.foto)
        val padre = findViewById<LinearLayout>(R.id.padre)

        boton.setOnClickListener(){
            if(editT.visibility==View.VISIBLE){
                boton.text = "FINALIZAR"
                editT.visibility = View.VISIBLE
            }else{
                boton.text = "COMENZAR"
                editT.visibility = View.VISIBLE
            }
        }

        editT.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
            override fun afterTextChanged(s: Editable?) {
                s?.let{
                    if(it.contains("Wayne")){
                        foto.visibility = View.VISIBLE
                    }else if(it.contains( "Joker")){
                        editT.setTextColor(Color.YELLOW)
                        boton.setTextColor(Color.YELLOW)
                        padre.setBackgroundColor(Color.CYAN)
                    }
                }
            }
        })



    }
}

