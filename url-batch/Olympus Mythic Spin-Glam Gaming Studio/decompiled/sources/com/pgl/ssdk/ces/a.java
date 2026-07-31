package com.pgl.ssdk.ces;

import android.content.Context;

/* loaded from: classes13.dex */
public final class a {
    public static native Object meta(int i, Context context, Object obj);

    public static Object njss(int i, Object obj) {
        try {
            b e = b.e();
            if (e != null) {
                return e.a(i, obj);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
