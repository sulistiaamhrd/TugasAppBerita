package com.example.tugasappberita.retrofit

data class NewsDataFromJson(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)