package dev.androidblog.mysamples.data

import android.util.Log
import dev.androidblog.mysamples.api.RetrofitProvider
import dev.androidblog.mysamples.data.model.Photo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object PhotoRepo {

    fun getPhotoList() {
        RetrofitProvider.api.getPhotos().enqueue(object: Callback<ArrayList<Photo>> {
            override fun onResponse(call: Call<ArrayList<Photo>>, response: Response<ArrayList<Photo>>) {
                Log.d("TEST", "onResponse : ${response.body()}")
            }

            override fun onFailure(call: Call<ArrayList<Photo>>, t: Throwable) {
                Log.d("TEST", "onFailure : ${t.message}")
            }
        })
    }


}