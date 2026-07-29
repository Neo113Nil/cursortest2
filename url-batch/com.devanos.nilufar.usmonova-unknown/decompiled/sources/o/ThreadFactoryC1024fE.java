package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: o.fE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1024fE implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public ThreadFactoryC1024fE(String str) {
        AbstractC1473m3.o(str, "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new RunnableC2154wP(runnable, 1));
        newThread.setName(this.a);
        return newThread;
    }
}
