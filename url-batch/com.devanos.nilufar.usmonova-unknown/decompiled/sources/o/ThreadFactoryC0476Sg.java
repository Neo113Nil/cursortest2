package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0476Sg implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.a.getAndIncrement());
        return thread;
    }
}
