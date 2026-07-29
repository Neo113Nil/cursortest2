package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;
import o.DY;
import o.ExecutorC2280yJ;
import o.MU;
import o.NU;

/* loaded from: classes.dex */
final class ProxyNotificationInitializer {
    private static final String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    private static boolean allowedToUse(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static void initialize(Context context) {
        if (ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            return;
        }
        setEnableProxyNotification(new ExecutorC2280yJ(), context, shouldEnableProxyNotification(context));
    }

    public static boolean isProxyNotificationEnabled(Context context) {
        String notificationDelegate;
        if (Build.VERSION.SDK_INT >= 29) {
            if (!allowedToUse(context)) {
                Log.e(Constants.TAG, "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if ("com.google.android.gms".equals(notificationDelegate)) {
                if (!Log.isLoggable(Constants.TAG, 3)) {
                    return true;
                }
                Log.d(Constants.TAG, "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Platform doesn't support proxying.");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setEnableProxyNotification$0(Context context, boolean z, NU nu) {
        String notificationDelegate;
        try {
            if (!allowedToUse(context)) {
                Log.e(Constants.TAG, "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            nu.d(null);
        }
    }

    @TargetApi(29)
    public static MU setEnableProxyNotification(Executor executor, final Context context, final boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            return DY.i(null);
        }
        final NU nu = new NU();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.f
            @Override // java.lang.Runnable
            public final void run() {
                ProxyNotificationInitializer.lambda$setEnableProxyNotification$0(context, z, nu);
            }
        });
        return nu.a;
    }

    private static boolean shouldEnableProxyNotification(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
