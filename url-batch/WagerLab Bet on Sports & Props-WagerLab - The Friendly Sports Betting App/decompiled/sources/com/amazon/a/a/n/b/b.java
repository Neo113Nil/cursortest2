package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SimpleTaskPipeline.java */
/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f577a = new com.amazon.a.a.o.c("SimpleTaskPipeline");
    private final Handler b;
    private final Set<Runnable> c;
    private final String d;

    private b(HandlerThread handlerThread) {
        this.c = Collections.synchronizedSet(new HashSet());
        this.d = handlerThread.getName();
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    private b(String str) {
        this.c = Collections.synchronizedSet(new HashSet());
        this.d = str;
        this.b = new Handler();
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static b b(String str) {
        return new b(str);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f599a) {
            f577a.a("Scheduling task: " + aVar);
        }
        this.b.post(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f599a) {
            f577a.a(this.d + ": Scheduling task immediately: " + aVar);
        }
        this.b.postAtFrontOfQueue(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long a2 = a(date);
        if (com.amazon.a.a.o.c.f599a) {
            f577a.a(this.d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + a2);
        }
        this.b.postAtTime(c(aVar), a2);
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j) {
        if (com.amazon.a.a.o.c.f599a) {
            f577a.a(this.d + ": Scheduling task: " + aVar + ", with delay: " + j);
        }
        this.b.postDelayed(c(aVar), j);
    }

    private Runnable c(final com.amazon.a.a.n.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.remove(this);
                try {
                    if (com.amazon.a.a.o.c.f599a) {
                        b.f577a.a(b.this.d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                } catch (Throwable th) {
                    try {
                        if (com.amazon.a.a.o.c.b) {
                            b.f577a.b("Task Failed with unhandled exception: " + th, th);
                        }
                        if (com.amazon.a.a.o.c.f599a) {
                            b.f577a.a(b.this.d + ": Task finished executing: " + aVar);
                        }
                    } finally {
                        if (com.amazon.a.a.o.c.f599a) {
                            b.f577a.a(b.this.d + ": Task finished executing: " + aVar);
                        }
                    }
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.c.add(runnable);
        return runnable;
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        for (Runnable runnable : this.c) {
            if (com.amazon.a.a.o.c.f599a) {
                f577a.a(this.d + ": Removing callback: " + runnable);
            }
            this.b.removeCallbacks(runnable);
        }
        this.c.clear();
        if (this.b.getLooper() == Looper.getMainLooper() || !this.b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = f577a;
        cVar.a("Interrupting looper thread!");
        this.b.getLooper().getThread().interrupt();
        cVar.a("Quitting looper: " + this.b.getLooper().getThread() + ", " + this.b.getLooper().getThread().isAlive());
        this.b.getLooper().quit();
    }
}
