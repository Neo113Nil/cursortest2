package com.five_corp.ad.internal.http.auxcache;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k {
    public final long a;
    public final ArrayDeque b = new ArrayDeque();
    public HashSet c = new HashSet();

    public k(long j) {
        this.a = j;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            jVar.i++;
            Iterator it2 = jVar.f.iterator();
            while (it2.hasNext()) {
                jVar.e.addLast((com.five_corp.ad.internal.ad.h) it2.next());
            }
            jVar.f = new ArrayList();
            this.b.addLast(jVar);
        }
        this.c = new HashSet();
    }
}
