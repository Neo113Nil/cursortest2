package com.five_corp.ad;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class u implements com.five_corp.ad.internal.adselector.b, com.five_corp.ad.internal.hub.ad_instance.b, com.five_corp.ad.internal.hub.ad_instance.j {
    public final /* synthetic */ FiveAdVideoReward a;

    public u(FiveAdVideoReward fiveAdVideoReward) {
        this.a = fiveAdVideoReward;
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.b
    public final void a() {
        synchronized (this.a.h) {
            FiveAdVideoReward fiveAdVideoReward = this.a;
            fiveAdVideoReward.j = null;
            fiveAdVideoReward.i = t.d;
        }
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.j
    public final void b() {
        synchronized (this.a.h) {
            FiveAdVideoReward fiveAdVideoReward = this.a;
            fiveAdVideoReward.j = null;
            fiveAdVideoReward.i = t.e;
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(final com.five_corp.ad.internal.context.h hVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.five_corp.ad.u$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                u.this.b(hVar);
            }
        });
    }

    public final void b(com.five_corp.ad.internal.context.h hVar) {
        FiveAdVideoReward fiveAdVideoReward;
        FiveAdVideoReward fiveAdVideoReward2 = this.a;
        f a = f.a(fiveAdVideoReward2.a, fiveAdVideoReward2.b, null, fiveAdVideoReward2.e, fiveAdVideoReward2.f, hVar, fiveAdVideoReward2.g, fiveAdVideoReward2.c);
        synchronized (this.a.h) {
            fiveAdVideoReward = this.a;
            fiveAdVideoReward.j = a;
            fiveAdVideoReward.i = t.c;
        }
        Iterator it = fiveAdVideoReward.c.f.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.hub.ad_instance.c) it.next()).b();
        }
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(FiveAdErrorCode fiveAdErrorCode) {
        FiveAdVideoReward fiveAdVideoReward;
        synchronized (this.a.h) {
            fiveAdVideoReward = this.a;
            fiveAdVideoReward.i = t.e;
        }
        fiveAdVideoReward.c.a(fiveAdErrorCode);
    }
}
