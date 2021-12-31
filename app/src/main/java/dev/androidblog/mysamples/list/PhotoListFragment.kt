package dev.androidblog.mysamples.list

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dev.androidblog.mysamples.BaseFragment
import dev.androidblog.mysamples.R
import dev.androidblog.mysamples.databinding.FragmentPhotoListBinding

class PhotoListFragment : BaseFragment<FragmentPhotoListBinding>() {

    private val photoViewModel: PhotoViewModel by viewModels()
    private val photoListAdapter = PhotoListAdapter()

    override fun getBindingTargetLayoutId(): Int = R.layout.fragment_photo_list

    override fun initializeView() {
        initDataBinding()
        initRecyclerView()
        initViewModels()
    }

    private fun initDataBinding() {
        binding.photoViewModel = photoViewModel
    }

    private fun initRecyclerView() {
        with(binding.rvPhoto) {
            layoutManager = LinearLayoutManager(activity)
            adapter = photoListAdapter
        }
    }

    private fun initViewModels() {
        photoViewModel.photoList.observe(this) {
            photoListAdapter.photoList = it
        }
    }

}