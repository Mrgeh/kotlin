package com.xtjc.kotlinstudy.activity.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

/**
 *
 * @packageName com.xtjc.kotlinstudy.activity
 * @author Ge Hang
 * @Admonish   This is the ancestral code from Ge Hang, please check!
 * @time 2020/11/18 15:52
 */
abstract class BaseActivity:AppCompatActivity() { //设置open  则可以被继承        或者改成 abstract   默认可以被继承,不加则是final
                                                // 加上（）括号，默认调用构造函数

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    /**
     * 加入抽象方法获取布局
     */
    abstract fun getLayoutId():Int

    /**
     * 初始化布局
     */
    abstract  fun initView()

    /**
     * 初始化数据
     */
    abstract  fun initData()



}