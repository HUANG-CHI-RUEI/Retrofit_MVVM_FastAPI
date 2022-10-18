package com.ray.retrofitfastapi

import com.google.gson.annotations.SerializedName

data class UserList(val data: List<User>)
data class User(
    @SerializedName("id") val id: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("status") val status: String?,
    @SerializedName("gender") val gender: String?)
data class UserResponse(
    @SerializedName("code") val code: Int?,
    @SerializedName("meta") val meta: String?,
    @SerializedName("data") val data: User?)