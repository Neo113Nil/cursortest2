package com.sglib.easymobile.androidnative.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sglib.easymobile.androidnative.Helper;

/* loaded from: classes13.dex */
public class NotificationBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || context == null) {
            return;
        }
        String action = intent.getAction();
        if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.QUICKBOOT_POWERON")) {
            Helper.Log("onReceive: BOOT_COMPLETED");
            for (NotificationRequest notificationRequest : NotificationManager.GetPendingNotificationRequests(context)) {
                NotificationManager.ScheduleLocalNotification(context, notificationRequest);
            }
        }
    }
}
