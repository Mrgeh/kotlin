package com.xtjc.kotlinstudy.activity

import android.os.Bundle
import com.xtjc.kotlinstudy.R
import com.xtjc.kotlinstudy.activity.base.BaseActivity

/**
 *
 * LoginActivity
 * @author Ge Hang
 * @Admonish   This is the ancestral code from Ge Hang, please check!
 * @time 2020/11/17 11:48
 */
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_login)
    }

//    override fun getLayoutId(): Int {
//       return R.layout.activity_login
//    }

    override fun getLayoutId() = R.layout.activity_login

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun initData() {
        TODO("Not yet implemented")
    }
}
