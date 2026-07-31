package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC5705tm {
    public static final Set a = SetsKt.setOf((Object[]) new String[]{"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID});
    public static final SystemTimeProvider b = new SystemTimeProvider();
    public static final T3 c = new T3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C5783wm c5783wm, Collection collection, Map map, Function0 function0) {
        boolean a2;
        if (collection == null || collection.isEmpty() || collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1367801046:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                        if (c5783wm.w) {
                            break;
                        } else {
                            if (b.currentTimeSeconds() > c5783wm.o + c5783wm.z.a) {
                                break;
                            }
                        }
                    } else {
                        a2 = a(c5783wm.d);
                        if (a2) {
                            break;
                        }
                    }
                case 155670667:
                    if (str.equals("appmetrica_get_ad_url")) {
                        a2 = a(c5783wm.i);
                        if (a2) {
                        }
                    } else if (c5783wm.w) {
                    }
                    break;
                case 299713912:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                        a2 = a(c5783wm.b);
                        if (a2) {
                        }
                    } else if (c5783wm.w) {
                    }
                    break;
                case 530949152:
                    if (str.equals("appmetrica_clids")) {
                        T3 t3 = c;
                        Q3 q3 = (Q3) function0.mo4828invoke();
                        t3.getClass();
                        a2 = T3.a(map, c5783wm, q3);
                        if (a2) {
                        }
                    } else if (c5783wm.w) {
                    }
                    break;
                case 703740463:
                    if (str.equals("appmetrica_report_ad_url")) {
                        a2 = a(c5783wm.j);
                        if (a2) {
                        }
                    } else if (c5783wm.w) {
                    }
                    break;
                case 1117383061:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                        a2 = a(c5783wm.a);
                        if (a2) {
                        }
                    } else if (c5783wm.w) {
                    }
                    break;
                default:
                    if (c5783wm.w) {
                    }
                    break;
            }
            return true;
        }
        return true;
    }
}
