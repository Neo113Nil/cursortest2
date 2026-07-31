package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class P4 {
    public final C5229bc a;

    public P4() {
        this(Ka.k().l());
    }

    public static U4 a(N4 n4) {
        return new U4(new S4(n4), n4);
    }

    public P4(C5229bc c5229bc) {
        this.a = c5229bc;
    }

    public final Bn a(N4 n4, Rm rm) {
        Bn bn = new Bn(n4, new Rg(rm));
        C5229bc c5229bc = this.a;
        synchronized (c5229bc) {
            c5229bc.c.add(bn);
        }
        return bn;
    }
}
