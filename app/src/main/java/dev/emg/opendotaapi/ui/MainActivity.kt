package dev.emg.opendotaapi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.data.network.OpenDotaService
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button.setOnClickListener {
      GlobalScope.launch {
        withContext(Dispatchers.IO) {
          val retrofit = create()
          val service = retrofit.create(OpenDotaService::class.java)
          val test = service.getProMatches()
          for (i in test) {
            Log.d("MainActivity", i.toString())
          }
        }
      }
    }
  }

  fun create(): Retrofit {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.opendota.com/api/")
        .build()
    return retrofit
  }
}
