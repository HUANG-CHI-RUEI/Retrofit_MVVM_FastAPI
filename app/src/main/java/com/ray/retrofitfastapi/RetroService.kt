package com.ray.retrofitfastapi

import retrofit2.Call
import retrofit2.http.*

interface RetroService {
    @GET("users")
    fun getUsersList(): Call<UserList>

    @GET("users")
    fun searchUsers(@Query("name") searchText: String): Call<UserList>

    @GET("users/{user_id}")
    fun getUser(@Path("user_id") user_id: String): Call<UserList>

    @POST("users")
    fun createUser(@Body params: User): Call<UserResponse>

    @PATCH("users/{user_id}")
    fun updateUser(@Path("user_id") user_id: String, @Body params: User): Call<UserResponse>

    @DELETE("users/{user_id}")
    fun deleteUser(@Path("user_id") user_id: String): Call<UserResponse>
}