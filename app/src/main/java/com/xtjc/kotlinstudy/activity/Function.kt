package com.xtjc.kotlinstudy.activity

/**
 *函数学习
 * @packageName com.xtjc.kotlinstudy.activity
 * @author Ge Hang
 * @Admonish   This is the ancestral code from Ge Hang, please check!
 * @time 2020/11/18 15:39
 */
class Function {


    fun main() {


        val str = fun11("gehan")

        println(str)
    }    //函数

    fun fun11(name: String): String {     //后面的string  是返回值类型

        return "string+$name"
    }


    fun fun22(name: String) {   //如果是返回值是Unit类型，则可以不写


        //单行函数

        fun sum(a: Int, b: Int) = a + b//a+b是返回值，可以写成单行函数


        println("sum:${sum(1,2)}")//则打印出 1+2的值，调用上面加法函数



    }
}