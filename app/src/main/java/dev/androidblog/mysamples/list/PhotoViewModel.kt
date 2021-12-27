package dev.androidblog.mysamples.list

import androidx.lifecycle.ViewModel
import dev.androidblog.mysamples.data.PhotoRepo

class PhotoViewModel: ViewModel() {

    fun getPhotoList() {
        PhotoRepo.getPhotoList()
    }

}