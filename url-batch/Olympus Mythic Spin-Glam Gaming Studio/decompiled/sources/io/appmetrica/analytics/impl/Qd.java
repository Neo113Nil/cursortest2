package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Qd {
    public static R9 a;

    public static final synchronized R9 a(Context context) {
        R9 r9;
        synchronized (Qd.class) {
            r9 = a;
            if (r9 == null) {
                r9 = new R9(context, "uuid.dat");
                a = r9;
            }
        }
        return r9;
    }
}
