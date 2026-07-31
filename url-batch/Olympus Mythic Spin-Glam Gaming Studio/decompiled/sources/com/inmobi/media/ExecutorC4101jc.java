package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ExecutorC4101jc implements Executor {
    public final Handler a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.post(runnable);
    }
}
