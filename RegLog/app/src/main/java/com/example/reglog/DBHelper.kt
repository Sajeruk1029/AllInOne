package com.example.reglog

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import androidx.core.content.contentValuesOf
import java.util.jar.Attributes
import kotlin.coroutines.coroutineContext

val DATABASE_NAME = "Data_User"
val TABLE_NAME = "Accounts"

val NAME_COL = "Name"
val LOG_COL = "Login"
val POST_COL = "Post"
val ROL_COL = "Rol"
val PASSWORD_COL = "Password"

class DBHelper(var context : Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1)
{

    override fun onCreate(db: SQLiteDatabase?) {

        val createteble = "create table " + TABLE_NAME + " (" + NAME_COL + " text, " + LOG_COL + " text, " + POST_COL + " text, " + ROL_COL + " text, " + PASSWORD_COL + " text)"

        db?.execSQL(createteble)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    fun insertData(user : Data)
    {
        val db = this.writableDatabase

        var cv = ContentValues()

        cv.put(NAME_COL, user.Name)
        cv.put(LOG_COL, user.Login)
        cv.put(POST_COL, user.Post)
        cv.put(ROL_COL, user.Rol)
        cv.put(PASSWORD_COL, user.Password)

        var result_req = db.insert(TABLE_NAME, null, cv)

        if(result_req == -1.toLong())
        {
            Toast.makeText(context, "Failed connect!", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(context, "Data has been added!", Toast.LENGTH_SHORT).show()
        }
    }

    fun readData() : MutableList<Data>
    {
        var list : MutableList<Data> = ArrayList()

        val db = this.readableDatabase

        val query = "select * from " + TABLE_NAME

        val result = db.rawQuery(query, null)

        if(result.moveToFirst())
        {
            do {
                var user = Data()

                user.Name = result.getString(result.getColumnIndex(NAME_COL))
                user.Login = result.getString(result.getColumnIndex(LOG_COL))
                user.Post = result.getString(result.getColumnIndex(POST_COL))
                user.Rol = result.getString(result.getColumnIndex(ROL_COL))
                user.Password = result.getString(result.getColumnIndex(PASSWORD_COL))

                list.add(user)
            }
                while (result.moveToNext())
        }

        result.close()
        db.close()



        return list

    }

}