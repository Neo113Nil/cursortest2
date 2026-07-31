package com.sglib.easymobile.androidnative.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.sglib.easymobile.androidnative.Helper;

/* loaded from: classes4.dex */
public class NotificationAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("NOTIF_DATA_KEY");
        if (stringExtra == null) {
            Helper.LogError("Couldn't get notification data key. Please check.");
        } else {
            NotificationManager.DeliverNotification(context, stringExtra);
        }
    }

    static void EnableReceiver(Context context) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) NotificationAlarmReceiver.class), 1, 1);
    }

    static void DisableReceiver(Context context) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) NotificationAlarmReceiver.class), 2, 1);
    }
}
