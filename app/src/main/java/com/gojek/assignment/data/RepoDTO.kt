package com.gojek.assignment.data

import com.google.gson.annotations.SerializedName

data class RepoDTO(
    @SerializedName("author") val author: String,
    @SerializedName("name") val name: String,
    @SerializedName("avatar") val avatar: String,
    @SerializedName("url") val url: String,
    @SerializedName("language") val language: String,
    @SerializedName("languageColor") val languageColor: String,
    @SerializedName("stars") val stars: String,
    @SerializedName("forks") val forks: String,
    val expanded: Boolean? = false
)