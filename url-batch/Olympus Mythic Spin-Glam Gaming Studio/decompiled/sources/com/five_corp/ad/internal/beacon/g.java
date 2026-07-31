package com.five_corp.ad.internal.beacon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class g {
    public final ArrayList a;

    public g(com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.hub.ad_instance.e eVar, final com.five_corp.ad.f fVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e(eVar, aVar.w.b, new d() { // from class: com.five_corp.ad.internal.beacon.g$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.beacon.d
            public final void a(long j, com.five_corp.ad.internal.ad.beacon.a aVar2) {
                h.this.a(j, aVar2);
            }
        }, aVar.b));
        arrayList.add(new e(eVar, aVar.x.b, new d() { // from class: com.five_corp.ad.internal.beacon.g$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.beacon.d
            public final void a(long j, com.five_corp.ad.internal.ad.beacon.a aVar2) {
                h.this.c(j, aVar2);
            }
        }, aVar.b));
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = aVar.y;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.five_corp.ad.internal.ad.beacon.a aVar2 = ((com.five_corp.ad.internal.ad.beacon.f) it.next()).b;
                if (aVar2 != null) {
                    hashSet2.add(aVar2);
                }
            }
        }
        Iterator it2 = aVar.u.iterator();
        while (it2.hasNext()) {
            com.five_corp.ad.internal.ad.beacon.a aVar3 = ((com.five_corp.ad.internal.ad.beacon.d) it2.next()).c;
            if (aVar3 != null) {
                hashSet2.add(aVar3);
            }
        }
        hashSet.addAll(hashSet2);
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            arrayList.add(new e(eVar, (com.five_corp.ad.internal.ad.beacon.a) it3.next(), new d() { // from class: com.five_corp.ad.internal.beacon.g$$ExternalSyntheticLambda2
                @Override // com.five_corp.ad.internal.beacon.d
                public final void a(long j, com.five_corp.ad.internal.ad.beacon.a aVar4) {
                    h.this.b(j, aVar4);
                }
            }, aVar.b));
        }
        this.a = arrayList;
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (!eVar.f) {
                com.five_corp.ad.internal.ad.beacon.a aVar = eVar.b;
                if (aVar.a == 1 && eVar.e) {
                    if (aVar.b == 2) {
                        eVar.d = 0L;
                    }
                    eVar.e = false;
                }
            }
        }
    }
}
