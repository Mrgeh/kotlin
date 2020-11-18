package com.xtjc.kotlinstudy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.xtjc.kotlinstudy.R

/**
 *
 *
 * @author Ge Hang
 * @Admonish   This is the ancestral code from Ge Hang, please check!
 * @time 2020/11/17 11:44
 */
//继承与实现用冒号
class MainActivity : AppCompatActivity() {

    //kotlin  类型声明
    //变量申明：   var/ val 变量名 ：类型  =初始值
    //var 修饰的变量代表
    //val 修饰的变量代表    如果写的东西不改变的话 尽量用这个 修饰变量。与java 中的final关键字类似
    //lateinit  延迟加载赋值
    lateinit var mTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView = findViewById(R.id.tv_01)

        mTextView.setText("你好")


        val a: Int = 0

        //  a=1 //a 只读  final  这里就不能再赋值

        var b: Int = 1 //可读可写

        b = 12

        val c = 12  //可以不写类型， 这里是类型推导知识，，自动推断  是静态语言，和动态语言不同，第一次可以自动推导，但是第二次则不行

        //c=2.3f

        //2.空安全问题

        //？  java中 经常需要去写if判断是否为空，在kotlin中设计成语法层面。  int != int?
        var a2: Int?
        var a3: Int
        //以上两者就不是同一种类型。
        //javaz=中的变量 没赋值的话，如果是成员变量的话，是有默认值的
                                    //如果是局部变量，是没有默认值的
        //kotlin是所有的都默认值，如果没有给变量设置可空的话，就要设置初始值，
                                //没设置？的话就要设置初始值/
        //kotlin的字符串
        //“dbajsdf”+"dsada"

        //kotlin中 ：
        val price =23
        var str1 :String ="今天的温度是：${price}"
        var str :String ="今天的温度是：${price},长度：${str1.length}"   //加上括号之后才可以在后面点出 表达式


        fun main(){
            val str2 = """
            打发士大夫
            发生发射点
            发生的fsd
        """.trimIndent() ///换行语法   三个引号
            println(str2)
        }

        //3
        var str3 :String?

       // str3="dsaklfdsfsdfsd"//如果没有定义值，则获取不到长度
       // str3.length

        fun strDisplay(str:String?){

            // str3="dsaklfdsfsdfsd"
            println("str的长度：${str!!.length}")     //    ！！  两个感叹号  断言运算符   肯定不为空

            //或者加上if判断
//            str3="dsaklfdsfsdfsd"
//            if (str3!=null){
//                println("str的长度：${str3.length}")
//
//
//            }
        }






    }
}
