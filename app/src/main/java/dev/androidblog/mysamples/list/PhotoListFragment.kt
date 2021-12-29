package dev.androidblog.mysamples.list

import androidx.fragment.app.viewModels
import dev.androidblog.mysamples.BaseFragment
import dev.androidblog.mysamples.R
import dev.androidblog.mysamples.databinding.FragmentPhotoListBinding

class PhotoListFragment : BaseFragment<FragmentPhotoListBinding>() {

    private val photoViewModel: PhotoViewModel by viewModels()

    override fun getBindingTargetLayoutId(): Int = R.layout.fragment_photo_list

    override fun initializeView() {
        initDataBinding()
        initRecyclerView()
    }

    private fun initDataBinding() {
        binding.photoViewModel = photoViewModel
    }

    private fun initRecyclerView() {
        //
    }

}