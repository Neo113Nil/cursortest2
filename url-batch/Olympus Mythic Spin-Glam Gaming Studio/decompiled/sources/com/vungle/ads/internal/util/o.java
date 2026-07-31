package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class o {
    public final Handler a = new Handler(Looper.getMainLooper());

    public final void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.postAtTime(runnable, SystemClock.uptimeMillis() + j);
    }
}
