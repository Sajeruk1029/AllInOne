package com.example.reglog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.Cursor
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var but_log : Button
    lateinit var but_reg : Button
    lateinit var intenT : Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but_log = findViewById(R.id.but_log)
        but_reg = findViewById(R.id.but_reg)


    }

    fun OnClickButLog(view : View)
    {
        intenT = Intent(this, LogActivity::class.java)
        startActivity(intenT)
    }

    fun OnClickButReg(view: View)
    {
        intenT = Intent(this, RegActivity::class.java)
        startActivity(intenT)
    }

}
