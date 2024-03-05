package dev.diordna.thumbsup.data.photo.model

data class PhotoApiModel(
    val id: String = "0",
    val title: String = "",
    val url: String = "",
    var thumbnailUrl: String = ""
)