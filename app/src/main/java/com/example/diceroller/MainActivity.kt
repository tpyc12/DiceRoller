package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.ivDice)
        val buttonRoll: Button = findViewById(R.id.buttonRoll)
        buttonRoll.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val result = Random().nextInt(6) + 1
        val image = when(result){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(image)
        Toast.makeText(this, "Dice rolled, result $result", Toast.LENGTH_SHORT).show()
    }
}