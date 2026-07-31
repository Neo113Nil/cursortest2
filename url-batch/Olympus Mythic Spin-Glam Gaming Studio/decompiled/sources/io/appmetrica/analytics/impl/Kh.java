package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public abstract class Kh implements Callable {

    @NotNull
    public static final Jh d = new Jh();
    public final C5631r0 a;
    public final InterfaceC5704tl b;
    public boolean c;

    public Kh(C5631r0 c5631r0, InterfaceC5704tl interfaceC5704tl) {
        this.a = c5631r0;
        this.b = interfaceC5704tl;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(@Nullable Throwable th) {
    }

    @NotNull
    public final C5631r0 b() {
        return this.a;
    }

    public boolean c() {
        C5631r0 c5631r0 = this.a;
        synchronized (c5631r0) {
            try {
                if (c5631r0.d == null) {
                    c5631r0.e = new CountDownLatch(1);
                    T1 t1 = c5631r0.h;
                    Context context = c5631r0.a;
                    t1.getClass();
                    Intent a = T1.a(context);
                    try {
                        c5631r0.g.b(c5631r0.a);
                        c5631r0.a.bindService(a, c5631r0.j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.INSTANCE;
    }

    public final boolean d() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            int i = 0;
            do {
                C5631r0 c5631r0 = this.a;
                synchronized (c5631r0) {
                    iAppMetricaService = c5631r0.d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC5704tl interfaceC5704tl = this.b;
                        if (interfaceC5704tl != null && !((C5753vi) interfaceC5704tl).a()) {
                            return;
                        }
                        this.a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c() || C5219b2.e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
