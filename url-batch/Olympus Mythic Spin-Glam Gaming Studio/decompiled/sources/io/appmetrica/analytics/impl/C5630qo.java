package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.qo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5630qo extends Q4 {
    public final W6 b;

    public C5630qo(@NonNull N4 n4, @NonNull W6 w6) {
        super(n4);
        this.b = w6;
    }

    @Override // io.appmetrica.analytics.impl.Q4
    public final boolean a(@NonNull C5326f6 c5326f6, @NonNull L4 l4) {
        F4 f4 = l4.b.d.a;
        this.b.a(f4.i);
        InterfaceC5358gc m = Ka.I.m();
        if (Boolean.TRUE.equals(f4.b)) {
            m.a(true);
        } else {
            if (Boolean.FALSE.equals(f4.b)) {
                m.a(false);
            }
        }
        m.a(f4.c);
        Boolean bool = f4.n;
        Ka.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
