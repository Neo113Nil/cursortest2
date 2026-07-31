package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5631r0 {
    public static final long k = TimeUnit.SECONDS.toMillis(10);
    public final Context a;
    public final ICommonExecutor b;
    public boolean c;
    public IAppMetricaService d;
    public CountDownLatch e;
    public final Object f;
    public final S1 g;
    public final T1 h;
    public final RunnableC5579p0 i;
    public final ServiceConnectionC5606q0 j;

    public C5631r0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C5661s4.l().e(), new T1());
    }

    public final synchronized boolean a() {
        return this.d != null;
    }

    public final void b() {
        synchronized (this.f) {
            this.b.remove(this.i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.b;
        synchronized (this.f) {
            try {
                iCommonExecutor.remove(this.i);
                if (!this.c) {
                    iCommonExecutor.executeDelayed(this.i, k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Long l) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public C5631r0(Context context, ICommonExecutor iCommonExecutor, S1 s1, T1 t1) {
        this.d = null;
        this.f = new Object();
        this.i = new RunnableC5579p0(this);
        this.j = new ServiceConnectionC5606q0(this);
        this.a = context.getApplicationContext();
        this.b = iCommonExecutor;
        this.c = false;
        this.g = s1;
        this.h = t1;
    }
}
