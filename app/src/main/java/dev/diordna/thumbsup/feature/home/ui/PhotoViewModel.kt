package dev.diordna.thumbsup.feature.home.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.diordna.thumbsup.data.photo.PhotoRepository
import dev.diordna.thumbsup.data.photo.model.PhotoApiModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PhotoViewModel @Inject constructor(
    private val photoRepository: PhotoRepository
) : ViewModel() {

    private val _photoList: MutableLiveData<ArrayList<PhotoApiModel>> = MutableLiveData()
    val photoList
        get() = _photoList

    fun requestPhotoList() {
        viewModelScope.launch {
            val photoList = photoRepository.getPhotoList()
            _photoList.value = photoList
        }
    }

}