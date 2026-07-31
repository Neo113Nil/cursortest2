package com.five_corp.ad;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class s implements com.five_corp.ad.internal.adselector.b, com.five_corp.ad.internal.hub.ad_instance.b, com.five_corp.ad.internal.hub.ad_instance.j {
    public final /* synthetic */ FiveAdNative a;

    public s(FiveAdNative fiveAdNative) {
        this.a = fiveAdNative;
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.b
    public final void a() {
        synchronized (this.a.i) {
            FiveAdNative fiveAdNative = this.a;
            fiveAdNative.k = null;
            fiveAdNative.j = t.d;
        }
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.j
    public final void b() {
        synchronized (this.a.i) {
            this.a.j = t.e;
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(final com.five_corp.ad.internal.context.h hVar) {
        this.a.n.post(new Runnable() { // from class: com.five_corp.ad.s$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                s.this.b(hVar);
            }
        });
    }

    public final void b(com.five_corp.ad.internal.context.h hVar) {
        FiveAdNative fiveAdNative;
        FiveAdNative fiveAdNative2;
        com.five_corp.ad.internal.ad.custom_layout.c cVar = hVar.d.b;
        if (cVar == null || cVar.a == 0 || cVar.b == 0) {
            synchronized (this.a.i) {
                fiveAdNative = this.a;
                fiveAdNative.j = t.e;
            }
            com.five_corp.ad.internal.m mVar = com.five_corp.ad.internal.m.I4;
            fiveAdNative.h.b(new com.five_corp.ad.internal.beacon.c(hVar.a, fiveAdNative.d, new com.five_corp.ad.internal.l(mVar, null, null), fiveAdNative.f.a(), 0L, null, null));
            this.a.c.a(mVar.b);
            return;
        }
        FiveAdNative fiveAdNative3 = this.a;
        f a = f.a(fiveAdNative3.a, fiveAdNative3.b, fiveAdNative3.g, fiveAdNative3.e, fiveAdNative3.f, hVar, fiveAdNative3.h, fiveAdNative3.c);
        synchronized (this.a.i) {
            fiveAdNative2 = this.a;
            fiveAdNative2.k = a;
            fiveAdNative2.j = t.c;
        }
        fiveAdNative2.m.setConfigHeightToWidthRatio(cVar.b / cVar.a);
        Iterator it = this.a.c.f.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.hub.ad_instance.c) it.next()).b();
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(FiveAdErrorCode fiveAdErrorCode) {
        FiveAdNative fiveAdNative;
        synchronized (this.a.i) {
            fiveAdNative = this.a;
            fiveAdNative.j = t.e;
        }
        fiveAdNative.c.a(fiveAdErrorCode);
    }
}
