package sg.bigo.ads.ct;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.bh.c;

/* loaded from: classes14.dex */
public final class b {
    public static Handler a;
    private static final ExecutorService b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));

    static class a extends AbstractRunnableC1882b {
        private Future c;

        a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.ct.b.AbstractRunnableC1882b
        protected final void a() {
            Runnable runnable = this.a;
            if (runnable != null) {
                this.c = b.a(runnable);
            }
        }
    }

    /* renamed from: sg.bigo.ads.ct.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC1882b implements Runnable {
        final Runnable a;
        final AtomicBoolean b = new AtomicBoolean(false);

        AbstractRunnableC1882b(Runnable runnable) {
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
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        a = new Handler(handlerThread.getLooper());
    }

    public static Future<?> a(final Runnable runnable) {
        return b.submit(new Runnable() { // from class: sg.bigo.ads.ct.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                try {
                    runnable.run();
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder("callback thread get exception:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.ct.a.a(sb.toString());
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("callback thread get throwable:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.ct.a.a(sb.toString());
                }
            }
        });
    }

    public static AbstractRunnableC1882b a(Runnable runnable, long j) {
        a aVar = new a(runnable);
        a.postDelayed(aVar, j);
        return aVar;
    }

    public static void a(AbstractRunnableC1882b abstractRunnableC1882b) {
        Future future;
        if (abstractRunnableC1882b != null) {
            abstractRunnableC1882b.b.set(true);
            if (abstractRunnableC1882b instanceof a) {
                a aVar = (a) abstractRunnableC1882b;
                if (aVar.c != null && (future = aVar.c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            a.removeCallbacks(abstractRunnableC1882b);
        }
    }
}
