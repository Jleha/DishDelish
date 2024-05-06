package com.example.dishdelish.models


import com.google.gson.annotations.SerializedName

data class FoodJoke(
    @SerializedName("text")
    val text: String
)