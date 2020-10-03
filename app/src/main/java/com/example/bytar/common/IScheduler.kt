package com.example.bytar.common
import io.reactivex.rxjava3.core.Scheduler

interface IScheduler {

    val androidSchedulers: Scheduler

    val ioScheduler: Scheduler
}