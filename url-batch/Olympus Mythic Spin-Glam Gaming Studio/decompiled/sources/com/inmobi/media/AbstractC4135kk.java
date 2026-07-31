package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4135kk {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static C4109jk b;
    public static boolean c;

    public static void a(String str) {
        Context context = AbstractC4002fj.a;
        if (context != null) {
            F5.a.getClass();
            if (!F5.r() || !Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                ConcurrentHashMap concurrentHashMap = a;
                if (concurrentHashMap.get(str) == null) {
                    C4083ik c4083ik = new C4083ik();
                    concurrentHashMap.put(str, c4083ik);
                    N3.a(context, c4083ik, new IntentFilter(str));
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                C4109jk c4109jk = new C4109jk();
                b = c4109jk;
                connectivityManager.registerDefaultNetworkCallback(c4109jk);
            }
        }
    }

    public static void b() {
        Intrinsics.checkNotNullExpressionValue("kk", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        F5.a.getClass();
        if (F5.y()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (F5.r()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context context = AbstractC4002fj.a;
        if (context != null) {
            F5.a.getClass();
            if (F5.r() && Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str) && b != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    C4109jk c4109jk = b;
                    Intrinsics.checkNotNull(c4109jk);
                    connectivityManager.unregisterNetworkCallback(c4109jk);
                    b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = a;
            if (concurrentHashMap.get(str) != null) {
                context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a() {
        Intrinsics.checkNotNullExpressionValue("kk", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        F5.a.getClass();
        if (F5.y()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (F5.r()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        a.clear();
    }

    public static void a(Context context, Intent intent) {
        Intrinsics.checkNotNullExpressionValue("kk", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            Intrinsics.checkNotNullExpressionValue("kk", "TAG");
            intent.getAction();
            boolean z = false;
            if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z = true;
                        }
                        c = z;
                        Intrinsics.checkNotNullExpressionValue("kk", "TAG");
                        ((Kc) AbstractC4002fj.e.getValue()).b(new N2(10, 4, c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (StringsKt.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    F5.a.getClass();
                    if (F5.y()) {
                        z = powerManager.isDeviceIdleMode();
                    }
                }
                if (z != c) {
                    F5.a.getClass();
                    if (F5.y()) {
                        Intrinsics.checkNotNullExpressionValue("kk", "TAG");
                        ((Kc) AbstractC4002fj.e.getValue()).b(new N2(11, 4, String.valueOf(z)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.USER_PRESENT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("kk", "TAG");
                ((Kc) AbstractC4002fj.e.getValue()).b(new N2(100, 6, (String) null));
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("kk", "TAG");
                ((Kc) AbstractC4002fj.e.getValue()).b(new N2(1, 6, (String) null));
                Iterator it = a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                a.clear();
                b = null;
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.REBOOT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("kk", "TAG");
                ((Kc) AbstractC4002fj.e.getValue()).b(new N2(2, 6, (String) null));
                Iterator it2 = a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                a.clear();
                b = null;
                return;
            }
            Intrinsics.checkNotNullExpressionValue("kk", "TAG");
            ((Kc) AbstractC4002fj.e.getValue()).b(new N2(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
