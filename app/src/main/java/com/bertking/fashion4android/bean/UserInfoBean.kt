package com.bertking.fashion4android.bean

import android.databinding.ObservableInt

data class UserInfoBean(
    val accountStatus: ObservableInt, // 0
    val authLevel: Int, // 3
    val countryCode: String, // +86
    val email: String, // w*********@163.com
    val gesturePwd: String?,
    val googleStatus: Int, // 0
    val id: Int, // 23721
    val inviteCode: String, // QWLQE
    val inviteUrl: String, // http://m.tokeneco.co/register?inviteCode=QWLQE
    val isOpenMobileCheck: Int, // 1
    val lastLoginIp: String, // 124.204.37.115
    val lastLoginTime: String, // 1541658254000
    val mobileNumber: String, // 186****6503
    val nickName: String, // 186****6503
    val notPassReason: String,
    val useFeeCoinOpen: Int, // 0
    val userAccount: String // 186****6503
)