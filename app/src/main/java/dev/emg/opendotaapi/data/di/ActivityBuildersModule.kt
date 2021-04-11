package dev.emg.opendotaapi.data.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.emg.opendotaapi.ui.MainActivity

@Module
abstract class ActivityBuildersModule {

  @ContributesAndroidInjector
  abstract fun contributeMainActivity(): MainActivity
}