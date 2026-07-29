package o;

import java.util.concurrent.ThreadFactory;

/* renamed from: o.jn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1321jn implements ThreadFactory {
    public int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i = this.a;
        this.a = i + 1;
        sb.append(i);
        thread.setName(sb.toString());
        return thread;
    }
}
