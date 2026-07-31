package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5605q {
    public final WeakHashMap a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC5578p enumC5578p) {
        if (activity != null && this.a.get(activity) == enumC5578p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.a.put(activity, enumC5578p);
        return true;
    }
}
