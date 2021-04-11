package dev.emg.opendotaapi.data.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dev.emg.opendotaapi.OpenDotaApp
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuildersModule::class,
    FragmentBuildersModule::class,
    NetworkModule::class,
    DatabaseModule::class,
    ViewModelBuilder::class
  ]
)
interface AppComponent : AndroidInjector<OpenDotaApp> {

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance context: Context): AppComponent
  }
}