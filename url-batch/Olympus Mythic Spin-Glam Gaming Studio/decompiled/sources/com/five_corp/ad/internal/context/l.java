package com.five_corp.ad.internal.context;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class l {
    public static void a(k kVar) {
        kVar.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.P5, null, null));
    }

    public static void a(com.five_corp.ad.internal.time.a aVar, ArrayList arrayList, com.five_corp.ad.internal.cache.p pVar, j jVar, final k kVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.h hVar = (com.five_corp.ad.internal.ad.h) it.next();
            if (hVar.c) {
                arrayList2.add((com.five_corp.ad.internal.cache.n) pVar.a.get(hVar));
            }
        }
        if (arrayList2.isEmpty()) {
            jVar.a();
            return;
        }
        com.five_corp.ad.internal.time.c cVar = new com.five_corp.ad.internal.time.c(aVar, new com.five_corp.ad.internal.time.b() { // from class: com.five_corp.ad.internal.context.l$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.time.b
            public final void a() {
                l.a(k.this);
            }
        });
        cVar.c();
        m mVar = new m(arrayList2.size(), jVar, kVar, cVar);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((com.five_corp.ad.internal.cache.n) it2.next()).a(mVar);
        }
    }
}
