package com.mazouri.solo.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View


import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(v:View) {
        toast("U click the button")
    }

    /*如何定义一个类*/
    class Person

    class Human(name: String, surname:String)

    class Bird(name: String) {
        init {
            print(name)
        }
    }

    /*类继承*/
    class Animal(name: String)

    //class Bull(name: String) : Animal(name) //This type is final, so it cannot be inherited from

    open class OpenAnimal(name: String)

    class Bull(name: String): OpenAnimal(name)  //This type has a contructor, and thus must be initialized here

    abstract class Base

    class Concrete: Base()

    /*函数*/
    fun printHelloWorld() : Unit { //Java void
        print("Hello World!")
    }

    fun printHW2() {
        print("Hello World!")
    }

    fun printHW3() = print("Hello World!")

    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun add2(x: Int, y:Int): Int = x + y

    fun add3(x: Int, y: Int) = x + y


    /*构造方法和函数参数*/
    fun myLog(msg:String, className:String = "MainActivity") {
        Log.d(className, msg)
    }

    fun testLog() {
        myLog("msg")
        myLog("msg", "MyClassName")
        myLog(msg = "msg")
    }

}
