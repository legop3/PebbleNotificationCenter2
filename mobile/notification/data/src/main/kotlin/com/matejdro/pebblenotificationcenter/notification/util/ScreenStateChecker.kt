package com.matejdro.pebblenotificationcenter.notification.util

import android.content.Context
import android.os.PowerManager
import androidx.core.content.getSystemService
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesBinding

interface ScreenStateChecker {
   fun isScreenOn(): Boolean
}

@ContributesBinding(AppScope::class)
class ScreenStateCheckerImpl(private val context: Context) : ScreenStateChecker {
   override fun isScreenOn(): Boolean {
      return context.getSystemService<PowerManager>()!!.isInteractive
   }
}
