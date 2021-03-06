package com.technologies.zenlight.daggerinmodule

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class AlertHelper @Inject constructor(private val appContext: Context) {

    fun showTestAlert() {
        Toast.makeText(appContext, "Constructor Successful", Toast.LENGTH_SHORT).show()
    }
}