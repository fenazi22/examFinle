package com.example.examfinle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    var colors = arrayListOf<String>();
    var prices = arrayListOf<Double>();

    lateinit var input: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val white = findViewById<Button>(R.id.white);
        val green = findViewById<Button>(R.id.green);
        val yellow = findViewById<Button>(R.id.yellow);
        val flamingo = findViewById<Button>(R.id.flamingo);
        input = findViewById(R.id.input)

        colors.add("white")
        colors.add("green")
        colors.add("yellow")
        colors.add("flamingo")

        prices.add(15.0)
        prices.add(22.5)
        prices.add(30.0)
        prices.add(45.5)

        white.setOnClickListener {
            var inp = input.text.toString().toInt()
            var full_price = get_price("white", inp)
            Toast.makeText(this, "the full price is :)" + full_price, Toast.LENGTH_SHORT).show()
        }


        green.setOnClickListener {
            var inp = input.text.toString().toInt()
            var full_price = get_price("green", inp)
            Toast.makeText(this, "the full price is :)" + full_price, Toast.LENGTH_SHORT).show()
        }

        yellow.setOnClickListener {
            var inp = input.text.toString().toInt()
            var full_price = get_price("yellow", inp)
            Toast.makeText(this, "the full price is :)" + full_price, Toast.LENGTH_SHORT).show()
        }


        flamingo.setOnClickListener {
            var inp = input.text.toString().toInt()
            var full_price = get_price("flamingo", inp)
            Toast.makeText(this, "the full price is :)" + full_price, Toast.LENGTH_SHORT).show()
        }

    }

    fun get_price(color: String, quantity: Int): Double {
        var price = 0.0;
        for (i in colors.indices) {
            if (colors[i].equals(color)) {
                price = prices[i]
            }
        }
        return price * quantity
    }
}