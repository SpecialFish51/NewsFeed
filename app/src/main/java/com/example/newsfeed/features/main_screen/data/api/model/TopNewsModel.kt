package com.example.newsfeed.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

class TopNewsModel(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val articles: List<ArticleModel>
) {
}