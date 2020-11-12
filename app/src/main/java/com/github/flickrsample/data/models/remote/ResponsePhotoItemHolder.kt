
package com.github.flickrsample.data.models.remote

import com.github.flickrsample.data.models.local.PhotoItem

import java.util.ArrayList


data class PhotoResult(
        val page: Int,
        val pages: Int,
        val perpage: Int,
        val total: String,
        val photo: ArrayList<PhotoItem>)

data class ResponsePhotoItemHolder(
        val stat: String,
        val photos: PhotoResult)