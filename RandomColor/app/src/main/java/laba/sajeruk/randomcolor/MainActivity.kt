package laba.sajeruk.randomcolor

import android.graphics.Color
import android.graphics.ColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.lang.*
import java.util.Random

lateinit var pole: TextView
lateinit var color: ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pole = findViewById(R.id.answer)
        color = findViewById(R.id.exampleimg)
    }

    fun OnClickGenerate(view: View) {

        color.setColorFilter(Color.WHITE)
        pole.setTextColor(Color.BLACK)

        var num1: Int
        var num2: Int
        var num3: Int
        var number: String
        var random: Random = Random()

        num1 = random.nextInt(191 - 73) + 73
        num2 = random.nextInt(153 - 73) + 73
        num3 = random.nextInt(153 - 73) + 73
//695763

        color.setColorFilter(Color.rgb(num1, num2, num3))

        number = Integer.toHexString(num1) + Integer.toHexString(num2) + Integer.toHexString(num3)

        pole.setText(number)
        pole.setTextColor(Color.rgb(num1, num2, num3))
    }
}
