package com.vungle.ads.internal.executor;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class e extends com.vungle.ads.internal.task.j {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public e(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return ((com.vungle.ads.internal.task.j) this.a).a();
    }

    @Override // com.vungle.ads.internal.task.j, java.lang.Comparable
    public final int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof com.vungle.ads.internal.task.j)) {
            return 0;
        }
        return Intrinsics.compare(((com.vungle.ads.internal.task.j) other).a(), a());
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = j.b;
        Runnable runnable = this.a;
        Runnable runnable2 = this.b;
        try {
            runnable.run();
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }
}
