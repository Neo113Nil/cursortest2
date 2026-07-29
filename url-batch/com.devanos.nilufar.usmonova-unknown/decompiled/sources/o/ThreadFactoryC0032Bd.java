package o;

import java.util.concurrent.ThreadFactory;

/* renamed from: o.Bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0032Bd implements ThreadFactory {
    public final /* synthetic */ String a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setPriority(10);
        return thread;
    }
}
