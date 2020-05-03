package com.example.eduardstimer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.eduardstimer.util.NotificationUtil
import com.example.eduardstimer.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
