package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class Zb implements InterfaceC5242c {
    public final InterfaceC5398i0 a;
    public final Vn b = new Vn();

    public Zb(@NotNull InterfaceC5398i0 interfaceC5398i0) {
        this.a = interfaceC5398i0;
    }

    public static final void a(Zb zb, X x) {
        zb.a.a(x);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5242c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Vn vn = this.b;
        Thread a = vn.a.a();
        try {
            stackTraceElementArr = vn.a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        final X x = new X((On) vn.b.apply(a, stackTraceElementArr), vn.a(a, null), vn.c.a());
        ((U9) C5661s4.l().c.a()).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.Zb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Zb.a(Zb.this, x);
            }
        });
    }
}
