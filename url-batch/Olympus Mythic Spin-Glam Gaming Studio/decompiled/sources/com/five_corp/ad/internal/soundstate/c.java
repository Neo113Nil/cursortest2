package com.five_corp.ad.internal.soundstate;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c {
    public a b;
    public final Object a = new Object();
    public final ArrayList c = new ArrayList();

    public c(d dVar) {
        this.b = new a(1, 1, 1, dVar);
    }

    public final void a(boolean z) {
        a aVar;
        ArrayList arrayList;
        synchronized (this.a) {
            a aVar2 = this.b;
            aVar = new a(aVar2.a, z ? 2 : 3, aVar2.c, aVar2.d);
            this.b = aVar;
            arrayList = new ArrayList(this.c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.f) ((b) it.next())).b(aVar);
        }
    }

    public final a a() {
        a aVar;
        synchronized (this.a) {
            aVar = this.b;
        }
        return aVar;
    }

    public final a a(com.five_corp.ad.f fVar) {
        a aVar;
        synchronized (this.a) {
            this.c.add(fVar);
            aVar = this.b;
        }
        return aVar;
    }
}
