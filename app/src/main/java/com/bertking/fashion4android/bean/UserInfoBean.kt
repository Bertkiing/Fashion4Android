package com.bertking.fashion4android.bean

import com.google.gson.annotations.SerializedName

data class UserInfoBean(
    @SerializedName("accountStatus")
    val accountStatus: Int, // 0
    @SerializedName("authLevel")
    val authLevel: Int, // 3
    @SerializedName("countryCode")
    val countryCode: String, // +86
    @SerializedName("email")
    val email: String, // w*********@163.com
    @SerializedName("gesturePwd")
    val gesturePwd: String,
    @SerializedName("googleStatus")
    val googleStatus: Int, // 0
    @SerializedName("id")
    val id: Int, // 23721
    @SerializedName("inviteCode")
    val inviteCode: String, // QWLQE
    @SerializedName("inviteUrl")
    val inviteUrl: String, // http://m.tokeneco.co/register?inviteCode=QWLQE
    @SerializedName("isOpenMobileCheck")
    val isOpenMobileCheck: Int, // 1
    @SerializedName("lastLoginIp")
    val lastLoginIp: String, // 124.204.37.115
    @SerializedName("lastLoginTime")
    val lastLoginTime: String, // 1541658254000
    @SerializedName("mobileNumber")
    val mobileNumber: String, // 186****6503
    @SerializedName("nickName")
    val nickName: String, // 186****6503
    @SerializedName("notPassReason")
    val notPassReason: String,
    @SerializedName("useFeeCoinOpen")
    val useFeeCoinOpen: Int, // 0
    @SerializedName("userAccount")
    val userAccount: String // 186****6503
)