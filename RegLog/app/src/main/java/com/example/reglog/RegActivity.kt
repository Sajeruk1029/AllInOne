package com.example.reglog

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.reg_layout.*

class RegActivity : AppCompatActivity()
{

    lateinit var edTname : EditText
    lateinit var edTlogin : EditText
    lateinit var edTpost : EditText
    lateinit var edTpassword : EditText
    lateinit var ToggRol : ToggleButton

    //val createteble = "create table " + TABLE_NAME + " (" + NAME_COL + " text, " + LOG_COL + " text, " + POST_COL + " text, " + ROL_COL + " text, " + PASSWORD_COL + " text)"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reg_layout)

        edTname = findViewById(R.id.edt_name)
        edTlogin = findViewById(R.id.edt_login)
        edTpost = findViewById(R.id.edt_post)
        edTpassword = findViewById(R.id.edt_password)
        ToggRol = findViewById(R.id.toggleRol)

    }

    fun OnClickCreate(view: View)
    {
        var user : Data = Data("", "", "", "", "")
        var db = DBHelper(this)

        var kol : Int = 0

        var dt = db.readData()

        var ok : Boolean = true

        if(edTname.text.length == 0)
        {
            Toast.makeText(applicationContext, "Name should not be empty!", Toast.LENGTH_SHORT).show()
            return
        }

        if(edTlogin.text.length == 0)
        {
            Toast.makeText(applicationContext, "Login should not be empty!", Toast.LENGTH_SHORT).show()
            return
        }

        if(edTpost.text.length == 0)
        {
            Toast.makeText(applicationContext, "Mail should not be empty!", Toast.LENGTH_SHORT).show()
            return
        }

        if(edTpassword.text.length < 8)
        {
            Toast.makeText(applicationContext, "Password must not be less than 8 characters!", Toast.LENGTH_SHORT).show()
            return
        }

        for(count in edTpost.text)
        {
            if(count == '@')
            {
                kol++
            }
        }

        if(kol != 1)
        {
            Toast.makeText(applicationContext, "Incorrect email!", Toast.LENGTH_SHORT).show()
            return
        }
        if(!(edTpost.text.contains("gmail.com") || (edTpost.text.contains("mail.ru"))|| (edTpost.text.contains("list.ru") || (edTpost.text.contains("yandex.ru")))))
        {
            Toast.makeText(applicationContext, "Incorrect email!", Toast.LENGTH_SHORT).show()
            return
        }

        if((edTpost.text.toString() == "@gmail.com" || (edTpost.text.toString() == "@mail.ru")) || (edTpost.text.toString() == "@list.ru") || (edTpost.text.toString() == "@yandex.ru"))
        {
            Toast.makeText(applicationContext, "Incorrect email!", Toast.LENGTH_SHORT).show()
            return
        }

        for(count in dt)
        {
            if(edTlogin.text.toString() == count.Login)
            {
                ok = false
            }
        }

        if(!ok)
        {
            Toast.makeText(applicationContext, "This login is already used!", Toast.LENGTH_SHORT).show()
            return
        }

        user = Data(edTname.text.toString(), edt_login.text.toString(), edt_post.text.toString(),toggleRol.text.toString() ,edTpassword.text.toString())

        db.insertData(user)

        //Toast.makeText(applicationContext, user.Rol, Toast.LENGTH_SHORT).show()
    }
}