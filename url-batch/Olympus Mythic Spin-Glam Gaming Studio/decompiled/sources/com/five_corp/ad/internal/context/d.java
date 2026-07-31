package com.five_corp.ad.internal.context;

import com.five_corp.ad.FiveAdConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d {
    public final FiveAdConfig a;
    public final com.five_corp.ad.internal.cache.o b;
    public final com.five_corp.ad.internal.time.a c;
    public final com.five_corp.ad.internal.soundstate.e d;
    public final com.five_corp.ad.internal.http.auxcache.h e;

    public d(FiveAdConfig fiveAdConfig, com.five_corp.ad.internal.cache.o oVar, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.soundstate.e eVar, com.five_corp.ad.internal.http.auxcache.h hVar) {
        this.a = fiveAdConfig;
        this.b = oVar;
        this.c = aVar;
        this.d = eVar;
        this.e = hVar;
    }

    public final void a(com.five_corp.ad.internal.ad.a aVar, String str, s sVar, f fVar, final b bVar, final c cVar) {
        com.five_corp.ad.internal.util.b bVar2;
        com.five_corp.ad.internal.cache.p pVar;
        com.five_corp.ad.internal.ad.format_config.a a = com.five_corp.ad.internal.ad.a.a(aVar, sVar.a.b);
        if (a == null) {
            cVar.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.H5, null, null));
            return;
        }
        int ordinal = fVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (a.b == null) {
                cVar.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.T5, null, null));
                return;
            }
        } else if ((ordinal == 2 || ordinal == 3) && a.c == null) {
            cVar.a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.U5, null, null));
            return;
        }
        int i = a.a[aVar.a.ordinal()];
        if (i == 1) {
            bVar2 = new com.five_corp.ad.internal.util.b(true, null, com.five_corp.ad.internal.beacon.f.NOT_MOVIE);
        } else if (i != 2) {
            bVar2 = new com.five_corp.ad.internal.util.b(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.I5, "CreativeType: " + aVar.a.value, null), null);
        } else {
            bVar2 = aVar.d == 1 ? new com.five_corp.ad.internal.util.b(true, null, com.five_corp.ad.internal.beacon.f.FULL_CACHE_PLAYER) : new com.five_corp.ad.internal.util.b(true, null, com.five_corp.ad.internal.beacon.f.STREAMING_PLAYER);
        }
        if (!bVar2.a) {
            cVar.a(bVar2.b);
            return;
        }
        com.five_corp.ad.internal.beacon.f fVar2 = (com.five_corp.ad.internal.beacon.f) bVar2.c;
        com.five_corp.ad.internal.cache.o oVar = this.b;
        ArrayList arrayList = aVar.B;
        synchronized (oVar) {
            pVar = new com.five_corp.ad.internal.cache.p(oVar.a.a(arrayList));
            oVar.b.a.add(new WeakReference(pVar));
        }
        final h hVar = new h(aVar, str, sVar, a, fVar, pVar, fVar2);
        com.five_corp.ad.internal.http.auxcache.h hVar2 = this.e;
        hVar2.a.post(new com.five_corp.ad.internal.http.auxcache.a(hVar2, hVar));
        com.five_corp.ad.internal.time.a aVar2 = this.c;
        ArrayList arrayList2 = aVar.B;
        j jVar = new j() { // from class: com.five_corp.ad.internal.context.d$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.context.j
            public final void a() {
                b.this.a(hVar);
            }
        };
        Objects.requireNonNull(cVar);
        l.a(aVar2, arrayList2, pVar, jVar, new k() { // from class: com.five_corp.ad.internal.context.d$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.context.k
            public final void a(com.five_corp.ad.internal.l lVar) {
                c.this.a(lVar);
            }
        });
    }
}
