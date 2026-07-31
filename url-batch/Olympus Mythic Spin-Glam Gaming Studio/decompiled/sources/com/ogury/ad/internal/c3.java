package com.ogury.ad.internal;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c3 {
    public static final c3 a = new c3();
    public static final Bundle b = new Bundle();

    public static Boolean a(String configurationKey) {
        Intrinsics.checkNotNullParameter(configurationKey, "key");
        Intrinsics.checkNotNullParameter(configurationKey, "configurationKey");
        Bundle bundle = b;
        if (bundle.containsKey(configurationKey)) {
            return Boolean.valueOf(bundle.getBoolean(configurationKey));
        }
        return null;
    }

    public static String b() {
        Intrinsics.checkNotNullParameter("AD_CONTENT_THRESHOLD", "key");
        Intrinsics.checkNotNullParameter("", "defaultValue");
        String string = b.getString("AD_CONTENT_THRESHOLD", "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static String a() {
        Intrinsics.checkNotNullParameter("AD_CONTENT_THRESHOLD", "key");
        return b.getString("AD_CONTENT_THRESHOLD", null);
    }
}
