package com.xtjc.kotlinstudy.study

/**
 *定义javabean
 * @packageName com.xtjc.kotlinstudy.study
 * @author Ge Hang
 * @Admonish   This is the ancestral code from Ge Hang, please check!
 * @time 2020/11/18 16:09
 */
class classStudy(id: Int) {//加了括号之后 变成主构造函数  则次构造函数需要调用this函数

    /**
     * 使用 lateinit的限制
     *
     * 1，lateinit只能修饰var修饰的属性
     * 2，lateinit修饰的属性不能有自定义的getter或者setter
     * 3,lateinit修饰的属性必须是非空类型
     * 4，lateinit修饰的属性不能是原生类型（java的8种基本类型对应的类型）
     *
     * 零位kotlin不会为属性执行默认初始化" lateinit property name has not been initalized"
     */


    //    val  id :Int
////
////    val name :String
////    init {
////        id=0
////
////        name=""
////    }
    var id: Int = 0//字段 和属性  是两个不同的概念   这里是一个属性

        //以下是重写setget .
        get() = 0
        set(value) {

            field = value//   field  幕后字段 属性是public
        }
    var name: String
//初始块  用init关键字  java中的初始块  直接用{},init可以写  多个。  会按顺序执行

    init {
    this.id=id
    this.name=""

}
    init {
        this.id = id
        println(2)

    }

    init {
        this.name = ""

        println("这是一个初始块")
    }

    //构造函数  也可以用快捷键
//与java定义的构造函数
    constructor(id: Int, name: String) : this(id) {//次构造函数 ，有次就会有主构造函数
        this.id = id
        this.name = name
    }


    //kotlin中 get  set

    //字段 和属性  是两个不同的概念


}