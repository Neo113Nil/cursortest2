package com.ogury.ad.internal;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public abstract class gb {
    public static final String a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        String a = a((Object) activity);
        List split$default = StringsKt.split$default((CharSequence) a, new char[]{'.'}, false, 0, 6, (Object) null);
        if (split$default.size() <= 2) {
            return a;
        }
        return split$default.get(0) + "." + split$default.get(1) + ".";
    }

    public static final String a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String canonicalName = obj.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String name = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
