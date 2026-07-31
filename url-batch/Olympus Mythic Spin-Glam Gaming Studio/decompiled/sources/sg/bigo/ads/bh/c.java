package sg.bigo.ads.bh;

import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class c implements ThreadFactory {
    private static a e;
    private final String a;
    private final AtomicInteger b;
    private final ThreadFactory c;
    private final boolean d;

    public c(String str) {
        this(str, false);
    }

    public c(String str, boolean z) {
        this.a = "BGAd-".concat(String.valueOf(str));
        this.b = new AtomicInteger(1);
        this.c = Executors.defaultThreadFactory();
        this.d = z;
    }

    protected static void a(a aVar) {
        e = aVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(runnable);
        newThread.setName(this.a + "-" + this.b.getAndIncrement());
        if (this.d) {
            newThread.setPriority(10);
        }
        newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: sg.bigo.ads.bh.c.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
                if (c.e != null) {
                    c.e.a(th);
                }
            }
        });
        return newThread;
    }
}
