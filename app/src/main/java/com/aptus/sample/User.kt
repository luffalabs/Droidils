package com.aptus.sample

import com.google.gson.annotations.SerializedName

data class User(@SerializedName("name") val name: String, @SerializedName("age") val age: String)