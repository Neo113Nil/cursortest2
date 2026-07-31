package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5229bc {
    public final C5220b3 a;
    public final C5685t2 b;
    public final ArrayList c;

    public C5229bc(C5220b3 c5220b3, C5685t2 c5685t2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = c5220b3;
        arrayList.add(c5220b3);
        this.b = c5685t2;
        arrayList.add(c5685t2);
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Ck) it.next()).onCreate();
        }
    }

    public final synchronized void a(Ja ja) {
        this.c.add(ja);
    }
}
