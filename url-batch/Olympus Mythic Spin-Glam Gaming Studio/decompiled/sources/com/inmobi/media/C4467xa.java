package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4467xa extends AbstractC3924cl {
    public static final /* synthetic */ int j = 0;
    public C4415va h;
    public boolean i;

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void a() {
        this.d.post(new Runnable() { // from class: com.inmobi.media.xa$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4467xa.a(C4467xa.this);
            }
        });
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.a = (byte) 0;
        this.b = null;
        C4415va c4415va = this.h;
        if (c4415va != null) {
            c4415va.d();
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
    }

    public final void b(PublisherCallbacks callbacks) {
        C4415va c4415va;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (this.c == null) {
            this.c = callbacks;
        }
        if (Intrinsics.areEqual(this.b, Boolean.FALSE)) {
            C4415va c4415va2 = this.h;
            if (c4415va2 != null) {
                c4415va2.b((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C4493y9 c4493y9 = this.f;
            if (c4493y9 != null) {
                c4493y9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Xb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.i) {
            C4415va c4415va3 = this.h;
            if (c4415va3 != null) {
                c4415va3.b((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                c4493y92.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Xb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.b = Boolean.TRUE;
        C4415va c4415va4 = this.h;
        if (c4415va4 == null || !a("InMobi", String.valueOf(c4415va4.l), callbacks) || (c4415va = this.h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (c4415va.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.a = (byte) 1;
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                C4415va c4415va5 = this.h;
                c4493y93.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c4415va5 != null ? c4415va5.l : null));
            }
            C4415va c4415va6 = this.h;
            Xb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c4415va6 != null ? c4415va6.l : null));
            C4415va c4415va7 = this.h;
            if (c4415va7 != null) {
                c4415va7.e(this);
            }
            C4415va c4415va8 = this.h;
            if (c4415va8 != null) {
                c4415va8.D();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void c(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.h != null) {
            d(info);
            return;
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            c4493y92.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b = this.a;
        if (b == 8 || b == 1) {
            b((AbstractC4168m1) null, inMobiAdRequestStatus);
            return;
        }
        if (b == 2) {
            Xb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                c4493y93.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b != 5) {
            Xb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            C4493y9 c4493y94 = this.f;
            if (c4493y94 != null) {
                c4493y94.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Xb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        C4493y9 c4493y95 = this.f;
        if (c4493y95 != null) {
            c4493y95.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C4415va c4415va = this.h;
        if (c4415va != null) {
            c4415va.b((byte) 4);
        }
        a();
    }

    public final void d(final AdMetaInfo adMetaInfo) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.c("InterstitialUnifiedAdManager", com.ironsource.Bd.f);
        }
        super.c(adMetaInfo);
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            c4493y92.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.a = (byte) 2;
        this.d.post(new Runnable() { // from class: com.inmobi.media.xa$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4467xa.b(C4467xa.this, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final AbstractC4168m1 f() {
        return this.h;
    }

    public final boolean h() {
        byte b = this.a;
        if (b == 1) {
            C4493y9 c4493y9 = this.f;
            if (c4493y9 != null) {
                c4493y9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Xb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b == 7) {
            Xb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                c4493y92.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b != 5) {
            if (!this.i) {
                return true;
            }
            C4415va c4415va = this.h;
            if (c4415va != null) {
                c4415va.d((short) 2149);
            }
            Xb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                c4493y93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        C4415va c4415va2 = this.h;
        if (c4415va2 != null) {
            Xb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c4415va2.l);
            C4493y9 c4493y94 = this.f;
            if (c4493y94 != null) {
                C4415va c4415va3 = this.h;
                c4493y94.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c4415va3 != null ? c4415va3.l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() {
        C4415va c4415va;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "render");
        }
        C4415va c4415va2 = this.h;
        if (c4415va2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c4415va2.b == 4 && this.e != null) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                c4493y92.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.e;
            Intrinsics.checkNotNull(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.i) {
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                c4493y93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Xb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C4415va c4415va3 = this.h;
            if (c4415va3 != null) {
                c4415va3.c((short) 2128);
                return;
            }
            return;
        }
        C4415va c4415va4 = this.h;
        com.inmobi.media.ads.network.common.model.Ad b = c4415va4 != null ? c4415va4.b(0) : null;
        C4415va c4415va5 = this.h;
        boolean a = a("InMobi", String.valueOf(c4415va5 != null ? c4415va5.l : null));
        if (b == null) {
            C4493y9 c4493y94 = this.f;
            if (c4493y94 != null) {
                c4493y94.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C4415va c4415va6 = this.h;
            if (c4415va6 != null) {
                c4415va6.b((short) 2166);
            }
        }
        if (this.e == null) {
            C4493y9 c4493y95 = this.f;
            if (c4493y95 != null) {
                c4493y95.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C4415va c4415va7 = this.h;
            if (c4415va7 != null) {
                c4415va7.b((short) 2167);
            }
        }
        if (b == null || !a) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c4415va = this.h) != null) {
            c4415va.d((byte) 1);
        }
        C4493y9 c4493y96 = this.f;
        if (c4493y96 != null) {
            c4493y96.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.a = (byte) 8;
        C4415va c4415va8 = this.h;
        if (c4415va8 != null) {
            c4415va8.Y();
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void d() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C4415va c4415va = this.h;
        if (c4415va != null) {
            if (c4415va.b != 6 && c4415va.b != 7) {
                a(true, (short) 2159);
            } else {
                c4415va.f(this);
            }
        }
    }

    public static final void a(C4467xa c4467xa) {
        C4493y9 c4493y9 = c4467xa.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c4467xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C4467xa c4467xa, AdMetaInfo adMetaInfo) {
        C4493y9 c4493y9 = c4467xa.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c4467xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z, short s) {
        C4415va c4415va;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s != 0 && (c4415va = this.h) != null) {
            c4415va.d(s);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.xa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4467xa.c(C4467xa.this);
            }
        });
        if (z) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                c4493y92.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.a = (byte) 6;
            C4415va c4415va2 = this.h;
            if (c4415va2 != null) {
                c4415va2.d();
            }
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            c4493y93.a();
        }
    }

    public static final void c(C4467xa c4467xa) {
        C4493y9 c4493y9 = c4467xa.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c4467xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C4493y9 c4493y92 = c4467xa.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
        C4415va c4415va = c4467xa.h;
        if (c4415va != null) {
            c4415va.b((byte) 4);
        }
    }

    public final void a(Activity activity) {
        C4241ok c4241ok;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "show");
        }
        C4415va c4415va = this.h;
        if (c4415va != null && (c4241ok = c4415va.H) != null) {
            c4241ok.b = true;
        }
        if (c4415va != null) {
            c4415va.R();
        }
        if (h()) {
            if (!AbstractC3962e7.a()) {
                if (this.h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C4415va c4415va2 = this.h;
            if (c4415va2 == null || !c4415va2.d((byte) 4)) {
                return;
            }
            this.i = true;
            C4415va c4415va3 = this.h;
            if (c4415va3 != null) {
                c4415va3.a(this, activity);
            }
        }
    }

    public final void a(C3868ah pubSettings, Context context, boolean z, String logType) {
        C4415va c4415va;
        GestureDetectorOnGestureListenerC4476xi j2;
        C4415va c4415va2;
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logType, "logType");
        if (this.h == null) {
            C4378u0 c4378u0 = new C4378u0(com.safedk.android.analytics.brandsafety.m.w);
            c4378u0.b = pubSettings.a;
            c4378u0.d = pubSettings.c;
            c4378u0.c = pubSettings.d;
            c4378u0.e = pubSettings.h;
            c4378u0.k = pubSettings.f;
            this.h = new C4415va(context, c4378u0.a(), this);
        }
        if (z) {
            g();
        }
        String str = pubSettings.h;
        if (str != null) {
            C4493y9 c4493y9 = this.f;
            if (c4493y9 != null) {
                c4493y9.a();
            }
            C4493y9 a = AbstractC3869ai.a(logType, str);
            this.f = a;
            if (a != null) {
                a.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            C4493y9 logger = this.f;
            if (logger != null && (c4415va2 = this.h) != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c4415va2.i = logger;
                C3877b0 c3877b0 = c4415va2.u;
                c3877b0.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3877b0.f = logger;
            }
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                c4493y92.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C4415va c4415va3 = this.h;
            Intrinsics.checkNotNull(c4415va3);
            AbstractC3869ai.a(c4415va3, this.f);
        }
        C4415va c4415va4 = this.h;
        if (c4415va4 != null) {
            c4415va4.a(context);
        }
        C4415va c4415va5 = this.h;
        if (c4415va5 != null) {
            c4415va5.a(pubSettings.d);
        }
        C4415va c4415va6 = this.h;
        if (c4415va6 != null) {
            c4415va6.L();
        }
        if (pubSettings.e && (c4415va = this.h) != null && (j2 = c4415va.j()) != null) {
            c4415va.G = true;
            j2.l();
        }
        WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            C4415va c4415va7 = this.h;
            if (c4415va7 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c4415va7.A = watermarkData;
                GestureDetectorOnGestureListenerC4476xi r = c4415va7.r();
                if (r != null) {
                    r.setWatermark(watermarkData);
                }
            }
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                c4493y93.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void b() {
        this.d.post(new Runnable() { // from class: com.inmobi.media.xa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4467xa.b(C4467xa.this);
            }
        });
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.a = (byte) 6;
        C4415va c4415va = this.h;
        if (c4415va != null) {
            c4415va.d();
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.e = info;
        if (this.h == null) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                c4493y92.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC4168m1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: com.inmobi.media.xa$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4467xa.a(C4467xa.this, info);
            }
        });
    }

    public static final void b(C4467xa c4467xa) {
        C4493y9 c4493y9 = c4467xa.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c4467xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C4415va c4415va = c4467xa.h;
        if (c4415va != null) {
            c4415va.b((byte) 4);
        }
    }

    public static final void b(C4467xa c4467xa, AdMetaInfo adMetaInfo) {
        C4493y9 c4493y9 = c4467xa.f;
        if (c4493y9 != null) {
            c4493y9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c4467xa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.a(info);
        C4415va c4415va = this.h;
        if (c4415va != null) {
            c4415va.S();
        }
        this.i = false;
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C4415va c4415va = this.h;
        if (c4415va != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c4415va.A = watermarkData;
            GestureDetectorOnGestureListenerC4476xi r = c4415va.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
    }
}
