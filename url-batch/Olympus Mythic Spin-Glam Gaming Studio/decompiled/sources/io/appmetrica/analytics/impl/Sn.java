package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Sn implements Un {
    @Override // io.appmetrica.analytics.impl.Un
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.Un
    public final StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Un
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}
