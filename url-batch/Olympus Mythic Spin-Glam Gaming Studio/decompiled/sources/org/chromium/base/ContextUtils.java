package org.chromium.base;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.preference.PreferenceManager;
import internal.org.chromium.build.BuildConfig;

/* loaded from: classes11.dex */
public abstract class ContextUtils {
    private static Context sApplicationContext;

    private static class Holder {
        private static SharedPreferences sSharedPreferences = ContextUtils.fetchAppSharedPreferences();
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static void initApplicationContext(Context context) {
        initJavaSideApplicationContext(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences fetchAppSharedPreferences() {
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return defaultSharedPreferences;
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static SharedPreferences getAppSharedPreferences() {
        return Holder.sSharedPreferences;
    }

    private static void initJavaSideApplicationContext(Context context) {
        if (BuildConfig.ENABLE_ASSERTS && (context instanceof Application)) {
            context = new ContextWrapper(context);
        }
        sApplicationContext = context;
    }

    public static boolean isSdkSandboxProcess() {
        boolean isSdkSandbox;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        isSdkSandbox = Process.isSdkSandbox();
        return isSdkSandbox;
    }

    public static Intent registerProtectedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent registerNonExportedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 4);
    }

    private static Intent registerBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        Intent registerReceiver;
        if (Build.VERSION.SDK_INT >= 26) {
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }
}
