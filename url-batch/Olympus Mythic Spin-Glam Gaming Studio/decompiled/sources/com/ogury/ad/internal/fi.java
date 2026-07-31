package com.ogury.ad.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes9.dex */
public abstract class fi {
    public static String a() {
        int ordinal = b().ordinal();
        if (ordinal == 0) {
            return a("sdk-ads-monitoring", "am", com.moloco.sdk.internal.services.init.i.a);
        }
        if (ordinal == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("https://%s.staging.cloud.ogury.io/%s/sdk-ads-monitoring", Arrays.copyOf(new Object[]{"ms-ads-monitoring-events", com.moloco.sdk.internal.services.init.i.a}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        if (ordinal != 3) {
            throw new IllegalArgumentException();
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("https://%s.devc.cloud.ogury.io/%s/sdk-ads-monitoring", Arrays.copyOf(new Object[]{"ms-ads-monitoring-events", com.moloco.sdk.internal.services.init.i.a}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static di b() {
        Object obj;
        Iterator<E> it = di.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((di) obj).name(), "PROD")) {
                break;
            }
        }
        di diVar = (di) obj;
        return diVar == null ? di.a : diVar;
    }

    public static String b(String str, String str2, String str3) {
        String str4;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int ordinal = b().ordinal();
        if (ordinal == 0) {
            str4 = "https://%s.presage.io/%s";
        } else if (ordinal == 1) {
            str4 = "https://%s.staging.cloud.ogury.io/%s";
        } else if (ordinal == 2) {
            str4 = "https://%s.deva.cloud.ogury.io/%s";
        } else if (ordinal != 3) {
            str4 = "https://%s-%s.presage.io/%s";
        } else {
            str4 = "https://%s.devc.cloud.ogury.io/%s";
        }
        String format = String.format(str4 + "/" + str, Arrays.copyOf(new Object[]{str2, str3, str3}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static String a(String str, String str2, String str3) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int ordinal = b().ordinal();
        String str4 = "https://%s-%s.presage.io/%s";
        if (ordinal != 0) {
            if (ordinal == 1) {
                str4 = "https://%s-%s.staging.presage.io/%s";
            } else if (ordinal == 2) {
                str4 = "https://%s-%s.deva.cloud.ogury.io/%s";
            } else if (ordinal == 3) {
                str4 = "https://%s-%s.devc.cloud.ogury.io/%s";
            }
        }
        String format = String.format(str4 + "/" + str, Arrays.copyOf(new Object[]{str2, str3, str3}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
