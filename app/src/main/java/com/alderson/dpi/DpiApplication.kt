package com.alderson.dpi

import android.app.Application
import com.alderson.dpi.api.service.ApiService

class DpiApplication : Application() {
    private val _apiService: ApiService = ApiService.create()
    val apiService
        get() = _apiService
}