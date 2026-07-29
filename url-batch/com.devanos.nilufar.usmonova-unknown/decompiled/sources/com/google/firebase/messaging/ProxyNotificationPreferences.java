package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import o.ExecutorC2280yJ;
import o.InterfaceC1224iG;

/* loaded from: classes.dex */
final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    private static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    public static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z;
    }

    public static void setProxyNotificationsInitialized(Context context, boolean z) {
        SharedPreferences.Editor edit = getPreference(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }

    public static void setProxyRetention(final Context context, GmsRpc gmsRpc, final boolean z) {
        if (Build.VERSION.SDK_INT < 29 || isProxyNotificationRetentionSet(getPreference(context), z)) {
            return;
        }
        gmsRpc.setRetainProxiedNotifications(z).c(new ExecutorC2280yJ(), new InterfaceC1224iG() { // from class: com.google.firebase.messaging.g
            @Override // o.InterfaceC1224iG
            public final void c(Object obj) {
                ProxyNotificationPreferences.setProxyRetentionPreferences(context, z);
            }
        });
    }

    public static void setProxyRetentionPreferences(Context context, boolean z) {
        SharedPreferences.Editor edit = getPreference(context).edit();
        edit.putBoolean("proxy_retention", z);
        edit.apply();
    }
}
