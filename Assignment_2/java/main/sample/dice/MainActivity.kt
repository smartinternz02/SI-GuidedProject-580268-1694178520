package main.sample.dice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import main.sample.dice.ui.theme.DiceTheme
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var RAtextView: TextView
    private lateinit var FRrollButton: Button
    private lateinit var FPimageView: ImageView
    private lateinit var imageViewR: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RAtextView = findViewById(R.id.RAtextView)
        FPimageView = findViewById(R.id.FPimageView)
        FRrollButton = findViewById(R.id.FRrollButton)
        imageViewR = findViewById(R.id.FPimageView)

        FRrollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice(){
        val random = Random()
        val randomNumber = random.nextInt( 6) + 1

        val diceside = when (randomNumber) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_full
        }

        FPimageView.setImageResource(diceside)
        val resultText = "You rolled a $randomNumber"
        RAtextView.text = resultText


    }
}