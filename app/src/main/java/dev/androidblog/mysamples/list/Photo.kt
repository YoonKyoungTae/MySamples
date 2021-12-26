package dev.androidblog.mysamples.list

// Response API
// https://jsonplaceholder.typicode.com/photos

data class Photo(
    val id: String = "0",
    val title: String = "",
    val url: String = "",
    val thumbnailUrl: String = ""
)