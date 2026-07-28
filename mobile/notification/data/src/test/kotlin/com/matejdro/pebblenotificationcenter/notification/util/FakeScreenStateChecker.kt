package com.matejdro.pebblenotificationcenter.notification.util

class FakeScreenStateChecker : ScreenStateChecker {
   var setIsScreenOn: Boolean = false

   override fun isScreenOn(): Boolean {
      return setIsScreenOn
   }
}
