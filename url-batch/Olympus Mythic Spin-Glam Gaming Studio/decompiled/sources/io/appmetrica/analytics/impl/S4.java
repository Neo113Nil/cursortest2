package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class S4 extends AbstractC5207ag {
    public final R4 a;

    public S4(N4 n4) {
        this.a = new R4(n4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5207ag
    public final AbstractC5615q9 a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC5798xb.a(i).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.a.a);
        } else if (ordinal == 14) {
            arrayList.add(this.a.b);
        } else if (ordinal == 34) {
            arrayList.add(this.a.c);
        }
        return new C5588p9(arrayList);
    }
}
