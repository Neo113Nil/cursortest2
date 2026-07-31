package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda2;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes11.dex */
public abstract class m {
    public static final Handler a;
    public static final Executor b;
    public static final Executor c;
    public static final Executor d;
    public static final Executor e;
    public static final Executor f;
    private static final Executor g;
    private static final a h;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        a = handler;
        b = Executors.newSingleThreadExecutor();
        c = Executors.newSingleThreadExecutor();
        d = Executors.newSingleThreadExecutor();
        e = Executors.newSingleThreadExecutor();
        f = Executors.newSingleThreadExecutor();
        g = new DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda2(handler);
        h = new a();
    }

    public static void a(Runnable runnable) {
        b.execute(h.a(runnable));
    }

    public static void b(Runnable runnable) {
        c.execute(h.a(runnable));
    }

    public static void c(Runnable runnable) {
        d.execute(h.a(runnable));
    }

    public static void d(Runnable runnable) {
        e.execute(h.a(runnable));
    }

    public static void e(Runnable runnable) {
        f.execute(h.a(runnable));
    }

    public static void f(Runnable runnable) {
        Runnable a2 = h.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a2.run();
        } else {
            g.execute(a2);
        }
    }

    static final class a {
        private final ArrayDeque a = new ArrayDeque();

        /* renamed from: com.my.tracker.obfuscated.m$a$a, reason: collision with other inner class name */
        static final class RunnableC1686a implements Runnable {
            final a a;
            volatile Runnable b;

            RunnableC1686a(a aVar) {
                this.a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    try {
                        x2.b("RunnableThrowableDecorator: exception has been caught", th);
                        a aVar = this.a;
                        if (aVar != null) {
                            aVar.a(this);
                        }
                    } finally {
                        a aVar2 = this.a;
                        if (aVar2 != null) {
                            aVar2.a(this);
                        }
                    }
                }
            }
        }

        a() {
            for (int i = 0; i < 64; i++) {
                this.a.add(new RunnableC1686a(this));
            }
        }

        public Runnable a(Runnable runnable) {
            RunnableC1686a runnableC1686a;
            synchronized (this) {
                runnableC1686a = (RunnableC1686a) this.a.pollFirst();
            }
            if (runnableC1686a == null) {
                runnableC1686a = new RunnableC1686a(null);
            }
            runnableC1686a.b = runnable;
            return runnableC1686a;
        }

        void a(RunnableC1686a runnableC1686a) {
            synchronized (this) {
                runnableC1686a.b = null;
                this.a.add(runnableC1686a);
            }
        }
    }
}
