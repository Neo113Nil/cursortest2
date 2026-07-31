package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes11.dex */
public final class Kb {
    public final Handler a;
    public final V2 b;
    public final Lb c;

    public Kb(Handler handler, V2 v2) {
        this.a = handler;
        this.b = v2;
        this.c = new Lb(handler, v2);
    }

    public static void a(Handler handler, V2 v2, Runnable runnable) {
        handler.removeCallbacks(runnable, v2.b.b.getApiKey());
        handler.postAtTime(runnable, v2.b.b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(v2.b.b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
