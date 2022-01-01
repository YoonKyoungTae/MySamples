package dev.androidblog.mysamples.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

object CommonBindingAdapter {

    @BindingAdapter("app:loadUrl", "app:loadUrlRound")
    @JvmStatic
    fun loadImage(imageView: ImageView, url: String, round: Int) {
        Glide.with(imageView)
            .load(url)
            .transform(CenterCrop(), RoundedCorners(round))
            .into(imageView)
    }
}