package sg.bigo.ads.bh;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class e extends ThreadPoolExecutor {
    public final AtomicInteger a;

    public e(String str, int i, int i2) {
        super(i2, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(str, false));
        this.a = new AtomicInteger(0);
    }

    public e(String str, int i, boolean z) {
        super(0, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(str, z));
        this.a = new AtomicInteger(0);
    }

    public static void a(a aVar) {
        c.a(aVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        this.a.decrementAndGet();
        super.afterExecute(runnable, th);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.incrementAndGet();
        super.execute(runnable);
    }
}
