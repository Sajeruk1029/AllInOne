package com.example.reglog

class Data
{

    var Name : String = ""
    var Login : String = ""
    var Post : String = ""
    var Rol : String = ""
    var Password : String = ""

    constructor(Name : String, Login : String, Post : String, Rol : String, Password : String)
    {
        this.Name = Name
        this.Login = Login
        this.Post = Post
        this.Rol = Rol
        this.Password = Password
    }

    constructor()
    {

    }

}