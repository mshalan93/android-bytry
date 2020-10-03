package com.example.bytar.common

import io.reactivex.rxjava3.core.*
import org.reactivestreams.Publisher

class IOTransformer<T> : ObservableTransformer<T, T>, SingleTransformer<T, T>,
    FlowableTransformer<T, T>, CompletableTransformer {
    override fun apply(upstream: Observable<T>): ObservableSource<T> =
        upstream.subscribeOn(SchedulerImpl.ioScheduler).observeOn(SchedulerImpl.androidSchedulers)

    override fun apply(upstream: Single<T>): SingleSource<T> =
        upstream.subscribeOn(SchedulerImpl.ioScheduler).observeOn(SchedulerImpl.androidSchedulers)

    override fun apply(upstream: Flowable<T>): Publisher<T> =
        upstream.subscribeOn(SchedulerImpl.ioScheduler).observeOn(SchedulerImpl.androidSchedulers)

    override fun apply(upstream: Completable): CompletableSource =
        upstream.subscribeOn(SchedulerImpl.ioScheduler).observeOn(SchedulerImpl.androidSchedulers)
}