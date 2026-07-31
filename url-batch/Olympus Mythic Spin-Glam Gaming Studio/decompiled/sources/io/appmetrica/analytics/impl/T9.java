package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class T9 implements Bg {
    public final Bg a;
    public final ICommonExecutor b;

    public T9(@NotNull Bg bg, @NotNull ICommonExecutor iCommonExecutor) {
        this.a = bg;
        this.b = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    @NotNull
    public final String a() {
        return this.a.a();
    }

    @Override // io.appmetrica.analytics.impl.Bg
    public final void a(@NotNull final InterfaceC5803xg interfaceC5803xg) {
        this.b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.T9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                T9.a(T9.this, interfaceC5803xg);
            }
        });
    }

    public static final void a(final T9 t9, final InterfaceC5803xg interfaceC5803xg) {
        final Thread currentThread = Thread.currentThread();
        t9.a.a(new InterfaceC5803xg() { // from class: io.appmetrica.analytics.impl.T9$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.impl.InterfaceC5803xg
            public final void a(Eg eg) {
                T9.a(currentThread, interfaceC5803xg, t9, eg);
            }
        });
    }

    public static final void a(Thread thread, final InterfaceC5803xg interfaceC5803xg, T9 t9, final Eg eg) {
        if (Intrinsics.areEqual(Thread.currentThread(), thread)) {
            interfaceC5803xg.a(eg);
        } else {
            t9.b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.T9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    T9.a(InterfaceC5803xg.this, eg);
                }
            });
        }
    }

    public static final void a(InterfaceC5803xg interfaceC5803xg, Eg eg) {
        interfaceC5803xg.a(eg);
    }
}
