package dev.diordna.thumbsup.feature.main

import dagger.hilt.android.AndroidEntryPoint
import dev.diordna.thumbsup.R
import dev.diordna.thumbsup.core.base.BaseActivity
import dev.diordna.thumbsup.databinding.ActivityPhotoListBinding

@AndroidEntryPoint
class PhotoListActivity : BaseActivity<ActivityPhotoListBinding>() {

    override fun getBindingTargetLayoutId(): Int = R.layout.activity_photo_list

    override fun initializeView() {
        //
    }

}