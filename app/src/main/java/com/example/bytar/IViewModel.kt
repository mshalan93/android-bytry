package com.example.bytar

import androidx.lifecycle.LifecycleObserver
import com.example.bytar.common.IOTransformer

interface IViewModel : LifecycleObserver {

    fun <T> getIoTransformer(): IOTransformer<T> = IOTransformer()
}