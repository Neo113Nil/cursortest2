package com.five_corp.ad;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class l implements com.five_corp.ad.internal.adselector.b, com.five_corp.ad.internal.hub.ad_instance.b, com.five_corp.ad.internal.hub.ad_instance.j {
    public final /* synthetic */ FiveAdCustomLayout a;

    public l(FiveAdCustomLayout fiveAdCustomLayout) {
        this.a = fiveAdCustomLayout;
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.b
    public final void a() {
        synchronized (this.a.j) {
            FiveAdCustomLayout fiveAdCustomLayout = this.a;
            fiveAdCustomLayout.l = null;
            fiveAdCustomLayout.k = t.d;
        }
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.j
    public final void b() {
        synchronized (this.a.j) {
            this.a.k = t.e;
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(final com.five_corp.ad.internal.context.h hVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.five_corp.ad.l$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l.this.b(hVar);
            }
        });
    }

    public final void b(com.five_corp.ad.internal.context.h hVar) {
        FiveAdCustomLayout fiveAdCustomLayout;
        FiveAdCustomLayout fiveAdCustomLayout2 = this.a;
        f a = f.a(fiveAdCustomLayout2.b, fiveAdCustomLayout2.c, fiveAdCustomLayout2.h, fiveAdCustomLayout2.f, fiveAdCustomLayout2.g, hVar, fiveAdCustomLayout2.i, fiveAdCustomLayout2.d);
        synchronized (this.a.j) {
            fiveAdCustomLayout = this.a;
            fiveAdCustomLayout.l = a;
            fiveAdCustomLayout.k = t.c;
        }
        Iterator it = fiveAdCustomLayout.d.f.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.hub.ad_instance.c) it.next()).b();
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(FiveAdErrorCode fiveAdErrorCode) {
        FiveAdCustomLayout fiveAdCustomLayout;
        synchronized (this.a.j) {
            fiveAdCustomLayout = this.a;
            fiveAdCustomLayout.k = t.e;
        }
        fiveAdCustomLayout.d.a(fiveAdErrorCode);
    }
}
