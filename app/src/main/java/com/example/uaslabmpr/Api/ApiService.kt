package com.example.uaslabmpr.Api

import com.example.uaslabmpr.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty(): Call<ResponseMorty>
}