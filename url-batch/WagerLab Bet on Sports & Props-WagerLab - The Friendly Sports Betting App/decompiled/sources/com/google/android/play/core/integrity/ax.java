package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f733a;

    static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            if (f733a == null) {
                u uVar = new u(null);
                uVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f733a = uVar.b();
            }
            awVar = f733a;
        }
        return awVar;
    }
}
