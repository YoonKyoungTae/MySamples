package dev.androidblog.mysamples.list

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dev.androidblog.mysamples.R
import dev.androidblog.mysamples.databinding.ActivityMainListBinding

class PhotoListActivity : AppCompatActivity() {

    private val photoViewModel: PhotoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainListBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_list)
        binding.photo = Photo(id = "1231", thumbnailUrl = "Test!")
    }

}