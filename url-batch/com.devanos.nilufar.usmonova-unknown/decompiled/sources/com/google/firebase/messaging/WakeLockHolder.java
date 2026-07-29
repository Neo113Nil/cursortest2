package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.E00;
import o.InterfaceC0764bG;
import o.MU;
import o.OU;
import o.Y20;
import o.p30;

/* loaded from: classes.dex */
final class WakeLockHolder {
    private static final String EXTRA_WAKEFUL_INTENT = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(1);
    private static final Object syncObject = new Object();
    private static E00 wakeLock;

    public static void acquireWakeLock(Intent intent, long j) {
        synchronized (syncObject) {
            try {
                if (wakeLock != null) {
                    setAsWakefulIntent(intent, true);
                    wakeLock.a(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void checkAndInitWakeLock(Context context) {
        if (wakeLock == null) {
            E00 e00 = new E00(context);
            wakeLock = e00;
            synchronized (e00.a) {
                e00.g = true;
            }
        }
    }

    public static void completeWakefulIntent(Intent intent) {
        synchronized (syncObject) {
            try {
                if (wakeLock != null && isWakefulIntent(intent)) {
                    setAsWakefulIntent(intent, false);
                    wakeLock.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void initWakeLock(Context context) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
        }
    }

    public static boolean isWakefulIntent(Intent intent) {
        return intent.getBooleanExtra(EXTRA_WAKEFUL_INTENT, false);
    }

    public static void reset() {
        synchronized (syncObject) {
            wakeLock = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static void sendWakefulServiceIntent(Context context, WithinAppServiceConnection withinAppServiceConnection, Intent intent) {
        synchronized (syncObject) {
            try {
                checkAndInitWakeLock(context);
                boolean isWakefulIntent = isWakefulIntent(intent);
                setAsWakefulIntent(intent, true);
                if (!isWakefulIntent) {
                    wakeLock.a(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
                }
                MU sendIntent = withinAppServiceConnection.sendIntent(intent);
                c cVar = new c(2, intent);
                p30 p30Var = (p30) sendIntent;
                p30Var.getClass();
                p30Var.b.e(new Y20((Executor) OU.a, (InterfaceC0764bG) cVar));
                p30Var.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void setAsWakefulIntent(Intent intent, boolean z) {
        intent.putExtra(EXTRA_WAKEFUL_INTENT, z);
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (syncObject) {
            try {
                checkAndInitWakeLock(context);
                boolean isWakefulIntent = isWakefulIntent(intent);
                setAsWakefulIntent(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!isWakefulIntent) {
                    wakeLock.a(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
