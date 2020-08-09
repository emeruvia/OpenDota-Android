package dev.emg.opendotaapi

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dev.emg.opendotaapi.ui.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class OpenDotaAppTest {

  @get:Rule
  val hiltRule = HiltAndroidRule(this)

  @Test
  fun helloWorld() {
    ActivityScenario.launch(MainActivity::class.java)
    onView(withId(R.id.button)).perform(click())
  }

}