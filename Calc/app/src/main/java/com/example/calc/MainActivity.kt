package com.example.calc

import android.app.Activity
import android.app.ActivityOptions
import android.app.Application
import android.app.Notification
import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Display
import android.view.View
import android.widget.AbsListView
import android.widget.Toast
import android.view.View.OnClickListener;
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.core.content.getSystemService
import org.w3c.dom.Text
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    lateinit var but1 : Button
    lateinit var but2 : Button
    lateinit var but3 : Button
    lateinit var but4 : Button
    lateinit var but5 : Button
    lateinit var but6 : Button
    lateinit var but7 : Button
    lateinit var but8 : Button
    lateinit var but9 : Button
    lateinit var but10 : Button
    lateinit var but11 : Button
    lateinit var but12 : Button
    lateinit var but13 : Button
    lateinit var but14 : Button
    lateinit var but15 : Button
    lateinit var but16 : Button

    lateinit var res : TextView
    lateinit var otobr : TextView

    var rezervnost : String = "Rezerv"
    var rezervnost1 : String = "Rezerv1"
    lateinit var textotobr : String
    lateinit var textrez : String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textotobr = ""
        textrez = ""

        if(savedInstanceState != null)
        {
            textotobr = savedInstanceState.getString(rezervnost).toString()
            textrez = savedInstanceState.getString(rezervnost1).toString()
            //Toast.makeText(applicationContext, textotobr, Toast.LENGTH_SHORT).show()
        }

        but1 = findViewById(R.id.but1)
        but2 = findViewById(R.id.but2)
        but3 = findViewById(R.id.but3)
        but4 = findViewById(R.id.but4)
        but5 = findViewById(R.id.but5)
        but6 = findViewById(R.id.but6)
        but7 = findViewById(R.id.but7)
        but8 = findViewById(R.id.but8)
        but9 = findViewById(R.id.but9)
        but10 = findViewById(R.id.but10)
        but11 = findViewById(R.id.but11)
        but12 = findViewById(R.id.but12)
        but13 = findViewById(R.id.but13)
        but14 = findViewById(R.id.but14)
        but15 = findViewById(R.id.but15)
        but16 = findViewById(R.id.but16)

        res = findViewById(R.id.Result)
        otobr = findViewById(R.id.Otobrajenie)


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(rezervnost, otobr.text.toString())
        outState.putString(rezervnost1, res.text.toString())

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        otobr.setText(textotobr)
        res.setText(textrez)

    }

    fun OnClick0(view: View) {


        otobr.setText(otobr.text.toString() + "0")

    }

    fun OnClick1(view: View)
    {
        otobr.setText(otobr.text.toString() + "1")
    }

    fun OnClick2(view: View)
    {
        otobr.setText(otobr.text.toString() + "2")
    }

    fun OnClick3(view: View)
    {
        otobr.setText(otobr.text.toString() + "3")
    }

    fun OnClick4(view: View)
    {
        otobr.setText(otobr.text.toString() + "4")
    }

    fun OnClick5(view: View)
    {
        otobr.setText(otobr.text.toString() + "5")
    }

    fun OnClick6(view: View)
    {
        otobr.setText(otobr.text.toString() + "6")
    }

    fun OnClick7(view: View)
    {
        otobr.setText(otobr.text.toString() + "7")
    }

    fun OnClick8(view: View)
    {
        otobr.setText(otobr.text.toString() + "8")
    }

    fun OnClick9(view: View)
    {
        otobr.setText(otobr.text.toString() + "9")
    }

    fun OnClickPlus(view: View)
    {
        otobr.setText(otobr.text.toString() + "+")
    }

    fun OnClickMinus(view: View)
    {
        otobr.setText(otobr.text.toString() + "-")
    }

    fun OnClickUmnojit(view: View)
    {
        otobr.setText(otobr.text.toString() + "*")
    }

    fun OnClickRazdelit(view: View)
    {
        otobr.setText(otobr.text.toString() + "/")
    }

    fun OnClickLog(view: View)
    {
        otobr.setText(otobr.text.toString() + "Log(")
    }

    fun OnClickSqrt(view: View)
    {
        otobr.setText(otobr.text.toString() + "Sqrt(")
    }

    fun OnClickSin(view: View)
    {
        otobr.setText(otobr.text.toString() + "Sin(")
    }

    fun OnClickCos(view: View)
    {
        otobr.setText(otobr.text.toString() + "Cos(")
    }

    fun OnClickResult(view: View)
    {
        if(otobr.text.toString().indexOf('+') >= 0)
        {

            try
            {
                res.setText((otobr.text.toString().split('+')[0].toInt() + otobr.text.toString().split('+')[1].toInt()).toString())
            }
            catch(e : Exception)
            {
                Toast.makeText(applicationContext, e.toString(), Toast.LENGTH_SHORT).show()
            }


            }

        if(otobr.text.toString().indexOf('-') >= 0)
        {
            res.setText((otobr.text.toString().split('-')[0].toInt() - otobr.text.toString().split('-')[1].toInt()).toString())
        }

        if(otobr.text.toString().indexOf('*') >= 0)
        {
            res.setText((otobr.text.toString().split('*')[0].toInt() * otobr.text.toString().split('*')[1].toInt()).toString())
        }

        if(otobr.text.toString().indexOf('/') >= 0)
        {
            try {
                res.setText((otobr.text.toString().split('/')[0].toInt() / otobr.text.toString().split('/')[1].toInt()).toString()
                )
            }
            catch (e : Exception)
            {
                Toast.makeText(applicationContext, e.toString(), Toast.LENGTH_SHORT).show()
            }

            }

        if(otobr.text.toString().indexOf("Log") >= 0)
        {

            res.setText((log10(otobr.text.toString().split("Log(")[1].trim('(').toFloat()).toString()))
            //Toast.makeText(applicationContext, otobr.text.toString().split("Log(")[1], Toast.LENGTH_SHORT).show()
        }

        if(otobr.text.toString().indexOf("Sqrt") >= 0)
        {
            res.setText(sqrt(otobr.text.toString().split("Sqrt(")[1].trim('(').toFloat()).toString())
        }

        if(otobr.text.toString().indexOf("Sin") >= 0)
        {
            res.setText(sin(otobr.text.toString().split("Sin(")[1].trim('(').toFloat()).toString())
        }

        if(otobr.text.toString().indexOf("Cos") >= 0)
        {
            res.setText(cos(otobr.text.toString().split("Cos(")[1].trim('(').toFloat()).toString())
        }
    }

    fun OnClickC(view: View)
    {
        otobr.setText("")
        res.setText("")
    }


}
