package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* loaded from: classes10.dex */
public final class Ec {
    public int a = 5;
    public final C5293e b;

    public Ec(InterfaceC5398i0 interfaceC5398i0) {
        this.b = new C5293e(new Zb(interfaceC5398i0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C5293e c5293e = this.b;
        c5293e.a.add(new InterfaceC5242c() { // from class: io.appmetrica.analytics.impl.Ec$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC5242c
            public final void onAppNotResponding() {
                Ec.b(AnrListener.this);
            }
        });
    }
}
