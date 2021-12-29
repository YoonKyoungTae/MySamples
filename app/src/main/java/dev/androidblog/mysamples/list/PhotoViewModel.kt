package dev.androidblog.mysamples.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.androidblog.mysamples.data.PhotoRepo
import dev.androidblog.mysamples.data.model.Photo
import okhttp3.internal.EMPTY_HEADERS

class PhotoViewModel : ViewModel() {

    private val _photoList: MutableLiveData<ArrayList<Photo>> = MutableLiveData()
    val photoList
        get() = _photoList

    fun requestPhotoList() {
        PhotoRepo.getPhotoList()
    }

}