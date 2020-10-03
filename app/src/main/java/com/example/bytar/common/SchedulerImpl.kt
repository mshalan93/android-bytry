package com.example.bytar.common

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.internal.schedulers.IoScheduler

object SchedulerImpl:  IScheduler{
    override val androidSchedulers: Scheduler
        get() = AndroidSchedulers.mainThread()
    override val ioScheduler: Scheduler
        get() = IoScheduler()
}