package dev.emg.opendotaapi.data.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.emg.opendotaapi.ui.fragments.LiveMatchesFragment
import dev.emg.opendotaapi.ui.fragments.ProMatchesFragment
import dev.emg.opendotaapi.ui.fragments.ProPlayersFragment

@Module
abstract class FragmentBuildersModule {

  @ContributesAndroidInjector
  abstract fun contributeLiveMatchesFragment(): LiveMatchesFragment

  @ContributesAndroidInjector
  abstract fun contributeProMatchesFragment(): ProMatchesFragment

  @ContributesAndroidInjector
  abstract fun contributeProPlayersFragment(): ProPlayersFragment
}