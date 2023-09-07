package com.dilarakiraz.upschool_homeworknavigation.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Info(
    val name:String,
    val email: String?,
    val phone: String?,
    val question1: String = "",
    val question2: String = "",
    val question3: String = "",
):Parcelable