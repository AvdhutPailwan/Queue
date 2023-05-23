package com.example.loops

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    lateinit var loop : ImageView
    lateinit var arrow : ImageView
    lateinit var output: TextView
    lateinit var outputWindow: CardView
    var outText : String = "Output : - \n"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loop = findViewById(R.id.loop)
        arrow = findViewById(R.id.cycle)
        output = findViewById(R.id.looptext)
        outputWindow = findViewById(R.id.looptextArea)

        animate()
    }

    private fun animate() {

        loop.visibility = View.VISIBLE
        arrow.visibility = View.VISIBLE
        outputWindow.visibility = View.VISIBLE
        output.visibility = View.VISIBLE
        output.text = outText


        arrow.animate().apply {
            duration = 1000
            rotation(360f)
        }.withEndAction{
            output.animate().apply {
                duration = 1000
                outText += "1\n2\n3\n4\n5\n"
                output.text = outText
            }
        }
    }
}