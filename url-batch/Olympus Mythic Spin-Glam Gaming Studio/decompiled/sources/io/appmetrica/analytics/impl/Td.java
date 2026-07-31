package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class Td implements ThreadFactory {
    public static final AtomicInteger a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, ((String) null) + "-" + a.incrementAndGet());
    }
}
