package com.nico.datastoreexample

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.nico.datastoreexample.datastore.SettingDataStore

class MainActivityViewModel(
    application: Application
) : AndroidViewModel(application) {

    @SuppressLint("StaticFieldLeak")
    private val context = getApplication<Application>().applicationContext

    private val dataStore = SettingDataStore(context)

    suspend fun incrementValue() {
        dataStore.incrementCounter()
    }

}