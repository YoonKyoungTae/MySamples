package dev.androidblog.mysamples.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.androidblog.mysamples.data.model.Photo
import dev.androidblog.mysamples.databinding.ListItemPhotoBinding

class PhotoListAdapter : RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {

    var photoList: ArrayList<Photo> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(photoList[position])
    }

    override fun getItemCount(): Int = photoList.size

    class ViewHolder(private val binding: ListItemPhotoBinding) : RecyclerView.ViewHolder(binding.root) {

        fun binding(photo: Photo) {
            binding.photo = photo
//            Glide.with(binding.ivPhoto)
//                .load("https://via.placeholder.com/150/92c952")
//                .into(binding.ivPhoto)
        }
    }

}