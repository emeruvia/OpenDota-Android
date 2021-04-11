package dev.emg.opendotaapi

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dev.emg.opendotaapi.data.di.DaggerAppComponent
import timber.log.Timber
import timber.log.Timber.DebugTree

open class OpenDotaApp : DaggerApplication() {

  override fun onCreate() {
    super.onCreate()
    Timber.plant(DebugTree())
  }

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerAppComponent.factory().create(applicationContext)
  }

}