package dev.diordna.thumbsup.feature.home.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.diordna.thumbsup.feature.home.data.PhotoRepo
import dev.diordna.thumbsup.feature.home.data.model.Photo
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