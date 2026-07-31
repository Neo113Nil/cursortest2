package com.five_corp.ad.internal;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.ad.FiveAdErrorCode;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdLoadListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r implements com.five_corp.ad.internal.hub.ad_instance.c {
    public final FiveAdInterface a;
    public final com.five_corp.ad.internal.hub.ad_instance.e f;
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(null);
    public final AtomicReference d = new AtomicReference(null);
    public final AtomicReference e = new AtomicReference(null);
    public final Handler g = new Handler(Looper.getMainLooper());

    public r(FiveAdInterface fiveAdInterface, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        this.a = fiveAdInterface;
        this.f = eVar;
    }

    public final void a() {
        p pVar = (p) this.d.get();
        if (pVar != null) {
            pVar.c();
        }
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.c
    public final void b() {
        this.g.post(new Runnable() { // from class: com.five_corp.ad.internal.r$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                r.this.d();
            }
        });
    }

    public final void c() {
        p pVar = (p) this.d.get();
        if (pVar != null) {
            pVar.b();
        }
    }

    public final /* synthetic */ void d() {
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) this.b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoad(this.a);
        }
    }

    public final void e() {
        this.f.f.add(this);
        this.f.g.add(this);
    }

    public final void a(final FiveAdErrorCode fiveAdErrorCode) {
        this.g.post(new Runnable() { // from class: com.five_corp.ad.internal.r$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                r.this.b(fiveAdErrorCode);
            }
        });
    }

    public final /* synthetic */ void b(FiveAdErrorCode fiveAdErrorCode) {
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) this.b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(this.a, fiveAdErrorCode);
        }
    }
}
