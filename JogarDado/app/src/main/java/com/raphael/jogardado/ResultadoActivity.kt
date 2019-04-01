package com.raphael.jogardado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resultado.*
import java.util.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        when(Random().nextInt(7)){
            1-> {
                textoResultado.text = "Dado 1"
                imagemResultado.setImageResource(R.drawable.dado1)
            }
            2-> {
                textoResultado.text = "Dado 2"
                imagemResultado.setImageResource(R.drawable.dado2)
            }
            3-> {
                textoResultado.text = "Dado 3"
                imagemResultado.setImageResource(R.drawable.dado3)
            }
            4-> {
                textoResultado.text = "Dado 4"
                imagemResultado.setImageResource(R.drawable.dado4)
            }
            5-> {
                textoResultado.text = "Dado 5"
                imagemResultado.setImageResource(R.drawable.dado5)
            }
            6-> {
                textoResultado.text = "Dado 6"
                imagemResultado.setImageResource(R.drawable.dado6)
            }
            0-> {
                textoResultado.text = "Dado 1"
                imagemResultado.setImageResource(R.drawable.dado1)
            }
        }
    }

    fun voltar(view: View){
        finish()
    }
}
