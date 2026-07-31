package sg.bigo.ads.dd;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.bh.c;

/* loaded from: classes3.dex */
public final class a {
    public static Handler a;
    private static ExecutorService b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));

    /* renamed from: sg.bigo.ads.dd.a$a, reason: collision with other inner class name */
    static class C1888a extends b {
        private Future c;

        C1888a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.dd.a.b
        protected final void a() {
            Runnable runnable = this.a;
            if (runnable != null) {
                this.c = a.a(runnable);
            }
        }
    }

    public static abstract class b implements Runnable {
        final Runnable a;
        final AtomicBoolean b = new AtomicBoolean(false);

        b(Runnable runnable) {
            this.a = runnable;
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        a = new Handler(handlerThread.getLooper());
    }

    public static Future a(final Runnable runnable) {
        return b.submit(new Runnable() { // from class: sg.bigo.ads.dd.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                try {
                    runnable.run();
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder("stat thread get exception:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.bn.a.a(0, "Stats", sb.toString());
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("stat thread get throwable:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.bn.a.a(0, "Stats", sb.toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j) {
        C1888a c1888a = new C1888a(runnable);
        a.postDelayed(c1888a, j);
        return c1888a;
    }

    public static void a(b bVar) {
        Future future;
        if (bVar != null) {
            bVar.b.set(true);
            if (bVar instanceof C1888a) {
                C1888a c1888a = (C1888a) bVar;
                if (c1888a.c != null && (future = c1888a.c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            a.removeCallbacks(bVar);
        }
    }
}
