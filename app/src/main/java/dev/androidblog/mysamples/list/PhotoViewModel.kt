package dev.androidblog.mysamples.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.androidblog.mysamples.data.PhotoRepo
import dev.androidblog.mysamples.data.model.Photo
import kotlinx.coroutines.launch

class PhotoViewModel : ViewModel() {

    private val _photoList: MutableLiveData<ArrayList<Photo>> = MutableLiveData()
    val photoList
        get() = _photoList

    fun requestPhotoList() {
        viewModelScope.launch {
            val photoList = PhotoRepo.getPhotoList()
            _photoList.value = photoList
        }
    }

}