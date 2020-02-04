package com.example.reglog

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LogActivity : AppCompatActivity()
{

    lateinit var edTlogin : EditText
    lateinit var edTpassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_activity)

        edTlogin = findViewById(R.id.edt_login)
        edTpassword = findViewById(R.id.edt_password)

    }

    fun OnClickLogin(view: View)
    {
        var ok : Boolean = false

        var db = DBHelper(this)

        var dt = db.readData()

        for(count in dt)
        {
            if((count.Login == edTlogin.text.toString()) && (count.Password == edTpassword.text.toString()))
            {
                ok = true
                break
            }
        }

        if(ok)
        {
            Toast.makeText(applicationContext, "Success!", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(applicationContext, "Failed!", Toast.LENGTH_SHORT).show()
        }

    }

}