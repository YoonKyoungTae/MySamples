package dev.diordna.thumbsup.core.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T: ViewBinding> : AppCompatActivity() {

    lateinit var binding: T

    abstract fun getBindingTargetLayoutId(): Int

    abstract fun initializeView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getBindingTargetLayoutId())
        initializeView()
    }

}