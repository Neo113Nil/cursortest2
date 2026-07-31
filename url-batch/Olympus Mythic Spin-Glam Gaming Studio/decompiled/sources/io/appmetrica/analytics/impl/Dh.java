package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes6.dex */
public final class Dh extends AbstractC5208ah {
    public Dh(C5532n5 c5532n5) {
        super(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        Uk uk;
        ((A5) this.a.p).e();
        C5470kl c5470kl = this.a.j;
        synchronized (c5470kl) {
            try {
                if (c5470kl.g == 0) {
                    uk = c5470kl.c.a();
                    Uk a = c5470kl.d.a();
                    long j = -1;
                    long j2 = uk == null ? -1L : uk.d;
                    if (a != null) {
                        j = a.d;
                    }
                    if (j2 <= j) {
                        uk = a;
                    }
                } else {
                    uk = c5470kl.f;
                }
                if (uk != null) {
                    uk.b();
                    if (uk.h) {
                        uk.h = false;
                        C5574ol c5574ol = uk.b;
                        c5574ol.a(C5574ol.j, Boolean.FALSE);
                        c5574ol.a();
                    }
                    c5470kl.g = 0;
                }
            } finally {
            }
        }
        return true;
    }
}
