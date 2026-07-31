package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class r implements Runnable {
    public WeakReference a;

    public r(WeakReference runner) {
        Intrinsics.checkNotNullParameter(runner, "runner");
        this.a = runner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = (s) this.a.get();
        if (sVar != null) {
            sVar.a();
        }
    }
}
