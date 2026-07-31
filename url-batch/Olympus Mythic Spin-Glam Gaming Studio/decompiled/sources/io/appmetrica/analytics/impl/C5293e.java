package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5293e {
    public static final long g = TimeUnit.SECONDS.toMillis(1);
    public static final String h = "WatchDog-" + Td.a.incrementAndGet();
    public final CopyOnWriteArrayList a;
    public final AtomicInteger b;
    public final Handler c;
    public C5268d d;
    public final AtomicBoolean e;
    public final Runnable f;

    public C5293e(Zb zb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        this.b = new AtomicInteger();
        this.c = new Handler(Looper.getMainLooper());
        this.e = new AtomicBoolean();
        this.f = new Runnable() { // from class: io.appmetrica.analytics.impl.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C5293e.this.a();
            }
        };
        copyOnWriteArrayList.add(zb);
    }

    public final /* synthetic */ void a() {
        this.e.set(true);
    }

    public final synchronized void b() {
        C5268d c5268d = this.d;
        if (c5268d != null) {
            c5268d.a.set(false);
            this.d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i) {
        AtomicInteger atomicInteger = this.b;
        int i2 = 5;
        if (i >= 5) {
            i2 = i;
        }
        atomicInteger.set(i2);
        if (this.d == null) {
            C5268d c5268d = new C5268d(this);
            this.d = c5268d;
            try {
                c5268d.setName(h);
            } catch (SecurityException unused) {
            }
            this.d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }
}
