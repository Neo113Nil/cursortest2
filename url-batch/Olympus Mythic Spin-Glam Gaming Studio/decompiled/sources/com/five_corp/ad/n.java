package com.five_corp.ad;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class n implements com.five_corp.ad.internal.adselector.b, com.five_corp.ad.internal.hub.ad_instance.b, com.five_corp.ad.internal.hub.ad_instance.j {
    public final /* synthetic */ FiveAdInterstitial a;

    public n(FiveAdInterstitial fiveAdInterstitial) {
        this.a = fiveAdInterstitial;
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.b
    public final void a() {
        synchronized (this.a.h) {
            FiveAdInterstitial fiveAdInterstitial = this.a;
            fiveAdInterstitial.j = null;
            fiveAdInterstitial.i = t.d;
        }
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.j
    public final void b() {
        synchronized (this.a.h) {
            FiveAdInterstitial fiveAdInterstitial = this.a;
            fiveAdInterstitial.j = null;
            fiveAdInterstitial.i = t.e;
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(final com.five_corp.ad.internal.context.h hVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.five_corp.ad.n$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                n.this.b(hVar);
            }
        });
    }

    public final void b(com.five_corp.ad.internal.context.h hVar) {
        FiveAdInterstitial fiveAdInterstitial;
        FiveAdInterstitial fiveAdInterstitial2 = this.a;
        f a = f.a(fiveAdInterstitial2.a, fiveAdInterstitial2.b, null, fiveAdInterstitial2.e, fiveAdInterstitial2.f, hVar, fiveAdInterstitial2.g, fiveAdInterstitial2.c);
        synchronized (this.a.h) {
            fiveAdInterstitial = this.a;
            fiveAdInterstitial.j = a;
            fiveAdInterstitial.i = t.c;
        }
        Iterator it = fiveAdInterstitial.c.f.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.hub.ad_instance.c) it.next()).b();
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(FiveAdErrorCode fiveAdErrorCode) {
        FiveAdInterstitial fiveAdInterstitial;
        synchronized (this.a.h) {
            fiveAdInterstitial = this.a;
            fiveAdInterstitial.i = t.e;
        }
        fiveAdInterstitial.c.a(fiveAdErrorCode);
    }
}
