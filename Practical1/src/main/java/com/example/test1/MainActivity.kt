package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val rollButton1: Button = findViewById(R.id.roll_button1)
        rollButton1.setOnClickListener { countup() }

    }

    private fun countup() {
        val result1: TextView = findViewById(R.id.result_text)
        val result2: ImageView = findViewById(R.id.dice_image1)
        val result3: ImageView = findViewById(R.id.dice_image2)

        if (result1.text.toString().toInt() <= 5) {
            var resultInt = result1.text.toString().toInt()
            resultInt++
            result1.text = resultInt.toString()
        }
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val diceImage1: ImageView = findViewById(R.id.dice_image1)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)

        //Coding Challenges for 1.2
        resultText.text = "1"

//        val randomInt = Random().nextInt(6) + 1
//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        diceImage.setImageResource(drawableResource)
//
        val randomInt1 = Random().nextInt(6) + 1
        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage1.setImageResource(drawableResource1)


        val randomInt2 = Random().nextInt(6) + 1
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableResource2)

    }
}
