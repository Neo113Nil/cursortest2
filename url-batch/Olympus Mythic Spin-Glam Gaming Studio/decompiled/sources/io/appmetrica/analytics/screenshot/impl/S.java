package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class S {
    public final List a;

    public S(InterfaceC5872i interfaceC5872i) {
        this.a = interfaceC5872i.a();
    }

    public final void a(C5875l c5875l) {
        for (P p : this.a) {
            C5876m c5876m = null;
            if (c5875l != null) {
                C5875l c5875l2 = c5875l.a ? c5875l : null;
                if (c5875l2 != null) {
                    c5876m = c5875l2.b;
                }
            }
            p.a(c5876m);
        }
    }
}
