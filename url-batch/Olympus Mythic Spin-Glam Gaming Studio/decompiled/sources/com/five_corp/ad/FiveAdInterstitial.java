package com.five_corp.ad;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: classes5.dex */
public class FiveAdInterstitial implements FiveAdInterface {
    public static final String m = FiveAdInterstitial.class.toString();
    public final Context a;
    public final k b;
    public final com.five_corp.ad.internal.hub.ad_instance.e c;
    public final com.five_corp.ad.internal.context.g d;
    public final com.five_corp.ad.internal.r e;
    public final com.five_corp.ad.internal.soundstate.c f;
    public final com.five_corp.ad.internal.hub.global.b g;
    public final Object h;
    public t i;
    public f j;
    public final n k;
    public String l;

    @Deprecated
    public FiveAdInterstitial(@NonNull Activity activity, String str) {
        this(activity.getApplicationContext(), str);
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.f.a(z);
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @NonNull
    public CreativeType getCreativeType() {
        f fVar;
        synchronized (this.h) {
            fVar = this.j;
        }
        return fVar != null ? fVar.l.a.a : CreativeType.NOT_LOADED;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @Nullable
    public String getFiveAdTag() {
        return this.l;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @NonNull
    public String getSlotId() {
        return this.d.b;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.f.a().a();
    }

    @Deprecated
    public void loadAdAsync() {
        boolean z;
        synchronized (this.h) {
            try {
                if (this.i == t.a) {
                    this.i = t.b;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.b.f.a(this.d, com.five_corp.ad.internal.context.f.INTERSTITIAL, this.f.a(), this.k);
        } else {
            this.c.a(FiveAdErrorCode.INVALID_STATE);
            Log.e(m, "Invalid state, loadAdAsync is ignored.");
        }
    }

    public void setEventListener(@NonNull FiveAdInterstitialEventListener fiveAdInterstitialEventListener) {
        com.five_corp.ad.internal.r rVar = this.e;
        rVar.c.set(new com.five_corp.ad.internal.c(fiveAdInterstitialEventListener, this));
        com.five_corp.ad.internal.r rVar2 = this.e;
        rVar2.d.set(new com.five_corp.ad.internal.n(fiveAdInterstitialEventListener, this));
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setFiveAdTag(@NonNull String str) {
        this.l = str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @Deprecated
    public void setLoadListener(@NonNull FiveAdLoadListener fiveAdLoadListener) {
        this.e.b.set(fiveAdLoadListener);
    }

    @Deprecated
    public boolean show() {
        f fVar;
        synchronized (this.h) {
            fVar = this.j;
        }
        if (fVar != null) {
            return fVar.o();
        }
        com.five_corp.ad.internal.r rVar = this.e;
        FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.internal.f fVar2 = (com.five_corp.ad.internal.f) rVar.c.get();
        if (fVar2 != null) {
            fVar2.a(fiveAdErrorCode);
        }
        Log.e(m, "Invalid state, showAd is ignored.");
        return false;
    }

    public void showAd() {
        f fVar;
        synchronized (this.h) {
            fVar = this.j;
        }
        if (fVar != null) {
            fVar.o();
            return;
        }
        com.five_corp.ad.internal.r rVar = this.e;
        FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.internal.f fVar2 = (com.five_corp.ad.internal.f) rVar.c.get();
        if (fVar2 != null) {
            fVar2.a(fiveAdErrorCode);
        }
        Log.e(m, "Invalid state, showAd is ignored.");
    }

    public FiveAdInterstitial(Context context, k kVar, com.five_corp.ad.internal.context.h hVar) {
        this.h = new Object();
        this.l = null;
        this.b = kVar;
        com.five_corp.ad.internal.hub.ad_instance.e eVar = new com.five_corp.ad.internal.hub.ad_instance.e();
        this.c = eVar;
        this.a = context;
        this.d = hVar.c.a;
        com.five_corp.ad.internal.r rVar = new com.five_corp.ad.internal.r(this, eVar);
        this.e = rVar;
        rVar.e();
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(kVar.i.a());
        this.f = cVar;
        com.five_corp.ad.internal.hub.global.b bVar = kVar.a;
        this.g = bVar;
        this.i = t.c;
        n nVar = new n(this);
        this.k = nVar;
        this.j = f.a(context, kVar, null, rVar, cVar, hVar, bVar, eVar);
        eVar.h.add(nVar);
        eVar.i.add(nVar);
    }

    @Deprecated
    public boolean show(@NonNull Activity activity) {
        f fVar;
        synchronized (this.h) {
            fVar = this.j;
        }
        if (fVar != null) {
            return fVar.o();
        }
        com.five_corp.ad.internal.r rVar = this.e;
        FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.internal.f fVar2 = (com.five_corp.ad.internal.f) rVar.c.get();
        if (fVar2 != null) {
            fVar2.a(fiveAdErrorCode);
        }
        Log.e(m, "Invalid state, showAd is ignored.");
        return false;
    }

    @Deprecated
    public FiveAdInterstitial(@NonNull Context context, String str) {
        this.h = new Object();
        this.l = null;
        k a = AdLoader.a();
        this.b = a;
        this.a = context;
        com.five_corp.ad.internal.hub.ad_instance.e eVar = new com.five_corp.ad.internal.hub.ad_instance.e();
        this.c = eVar;
        com.five_corp.ad.internal.context.d dVar = a.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str2 = dVar.a.appId;
        this.d = new com.five_corp.ad.internal.context.g(uuid, str);
        com.five_corp.ad.internal.r rVar = new com.five_corp.ad.internal.r(this, eVar);
        this.e = rVar;
        rVar.e();
        this.f = new com.five_corp.ad.internal.soundstate.c(a.i.a());
        this.g = a.a;
        this.i = t.a;
        n nVar = new n(this);
        this.k = nVar;
        this.j = null;
        eVar.h.add(nVar);
        eVar.i.add(nVar);
    }
}
