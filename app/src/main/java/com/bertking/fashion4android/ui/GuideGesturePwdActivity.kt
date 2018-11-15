package com.bertking.fashion4android.ui

import android.databinding.DataBindingUtil
import android.databinding.ObservableInt
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.bertking.fashion4android.R
import com.bertking.fashion4android.bean.UserInfoBean
import com.bertking.fashion4android.databinding.ActivityGuideGesturePwdBinding
import kotlinx.android.synthetic.main.activity_guide_gesture_pwd.*

/**
 * @date 2018-11-13
 * @author  Bertking
 * @description 手势引导(Guide 4 gesture password)
 *
 * 熟悉一下ConstraintLayout(约束布局)的使用
 * 参考链接:https://segmentfault.com/a/1190000014876944
 *
 */
class GuideGesturePwdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(activity_guide_gesture_pwd)


        val binding =
            DataBindingUtil.setContentView<ActivityGuideGesturePwdBinding>(this, R.layout.activity_guide_gesture_pwd)
        binding.user = UserInfoBean(
            ObservableInt(0),
            0,
            "+86",
            "bertking@163.com",
            null,
            0,
            110,
            "www.baidu.com",
            "www.google.com",
            0,
            "128.10.0.1",
            "12345678",
            "123456789",
            "bert",
            "none",
            0,
            "1234567"
        )
        initClick()
    }

    fun initClick() {

        /**
         * 取消
         */
        btn_cancel.setOnClickListener {
            finish()
        }
        /**
         * 立即设置
         */
        btn_now_set.setOnClickListener {
            Toast.makeText(this, "立即设置", Toast.LENGTH_SHORT).show()
        }
    }
}
