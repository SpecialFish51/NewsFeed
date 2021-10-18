package com.example.newsfeed.features.main_screen.data.api

import com.example.newsfeed.features.main_screen.data.api.model.TopNewsModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getTopHeadLines(
        @Query("country") country: String = "ru",
        @Query("apiKey") apiKey: String = "838ef3dbe0ac493eb9ca8d2cb39e694c"
    ) : TopNewsModel
}