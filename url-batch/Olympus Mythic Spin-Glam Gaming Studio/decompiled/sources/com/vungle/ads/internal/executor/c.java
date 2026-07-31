package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c implements ThreadFactory {
    public final String a;
    public final ThreadFactory b;
    public final AtomicInteger c;

    public c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        Thread t = this.b.newThread(r);
        t.setName(this.a + "-th-" + this.c.incrementAndGet());
        Intrinsics.checkNotNullExpressionValue(t, "t");
        return t;
    }
}
