package dev.androidblog.mysamples.list

import android.os.Bundle
import androidx.activity.viewModels
import dev.androidblog.mysamples.BaseActivity
import dev.androidblog.mysamples.R
import dev.androidblog.mysamples.databinding.ActivityMainListBinding

class PhotoListActivity : BaseActivity<ActivityMainListBinding>() {

    private val photoViewModel: PhotoViewModel by viewModels()

    override fun getBindingTargetLayoutId(): Int = R.layout.activity_main_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.photoViewModel = photoViewModel
    }

}