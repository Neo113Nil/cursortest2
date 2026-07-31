package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3924cl extends AbstractC4038h1 {
    public byte a;
    public Boolean b;
    public PublisherCallbacks c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public AdMetaInfo e;
    public C4493y9 f;
    public WatermarkData g;

    public static final void a(AbstractC4168m1 abstractC4168m1, AbstractC3924cl abstractC3924cl, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC4168m1 != null) {
            abstractC4168m1.b((byte) 1);
        }
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        C4493y9 c4493y92 = abstractC3924cl.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
    }

    public final void b(final AbstractC4168m1 abstractC4168m1, final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onLoadFailure " + this);
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y92.d("cl", "AdManager state - LOAD_FAILED");
        }
        this.a = (byte) 3;
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.a(AbstractC4168m1.this, this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void c() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdWillShow " + this);
        }
        byte b = this.a;
        if (b == 4 || b == 5) {
            return;
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.b(AbstractC3924cl.this);
            }
        });
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y92.d("cl", "AdManager state - WILL_DISPLAY");
        }
        this.a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void e() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onUserLeftApplication " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.c(AbstractC3924cl.this);
            }
        });
    }

    public abstract AbstractC4168m1 f();

    public void g() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "submitAdLoadCalled " + this);
        }
        AbstractC4168m1 f = f();
        if (f != null) {
            f.P();
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void a(final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdFetchFailed " + this);
        }
        this.a = (byte) 3;
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.a(AbstractC3924cl.this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public void b(AdMetaInfo info) {
        AbstractC4168m1 f;
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdFetchSuccess " + this);
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y92.d("cl", "AdManager state - FETCHED");
        }
        this.a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (f = f()) == null) {
            return;
        }
        f.b((byte) 2);
    }

    public static final void a(AbstractC3924cl abstractC3924cl, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        C4493y9 c4493y92 = abstractC3924cl.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public void c(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdLoadSucceeded " + this);
        }
        this.e = info;
        AbstractC4168m1 f = f();
        if (f != null) {
            f.b((byte) 1);
        }
    }

    public static final void b(AbstractC3924cl abstractC3924cl) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public void a(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdDisplayed " + this);
        }
        if (this.a != 5) {
            this.e = info;
            this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3924cl.a(AbstractC3924cl.this, info);
                }
            });
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("cl", "TAG");
                c4493y92.d("cl", "AdManager state - DISPLAYED");
            }
            this.a = (byte) 5;
        }
    }

    public static final void c(AbstractC3924cl abstractC3924cl) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void b(final HashMap rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdRewardActionCompleted " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.b(AbstractC3924cl.this, rewards);
            }
        });
    }

    public static final void b(AbstractC3924cl abstractC3924cl, Map map) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    public static final void a(AbstractC3924cl abstractC3924cl, AdMetaInfo adMetaInfo) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public void a(AbstractC4168m1 abstractC4168m1, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdLoadFailed " + this);
        }
        b(abstractC4168m1, status);
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void a(final HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdInteraction " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.a(AbstractC3924cl.this, params);
            }
        });
    }

    public static final void a(AbstractC3924cl abstractC3924cl, Map map) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "getSignals " + this);
        }
        if (f() != null) {
            this.c = callbacks;
            callbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        C4415va c4415va;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "load " + this);
        }
        if (Intrinsics.areEqual(this.b, Boolean.TRUE)) {
            Xb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("cl", "TAG");
                c4493y92.a("cl", "Cannot call load(byte[]) API after load() API is called");
            }
            C4467xa c4467xa = (C4467xa) this;
            b(c4467xa.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C4415va c4415va2 = c4467xa.h;
            if (c4415va2 != null) {
                c4415va2.b((short) 2140);
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.a = (byte) 1;
        C4493y9 logger = this.f;
        if (logger != null && (c4415va = ((C4467xa) this).h) != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c4415va.i = logger;
            C3877b0 c3877b0 = c4415va.u;
            c3877b0.getClass();
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3877b0.f = logger;
        }
        C4467xa c4467xa2 = (C4467xa) this;
        C4415va c4415va3 = c4467xa2.h;
        if (c4415va3 == null || !c4415va3.d((byte) 1)) {
            return;
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y93.a("cl", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.c = callbacks;
        C4415va c4415va4 = c4467xa2.h;
        if (c4415va4 != null) {
            c4415va4.a(bArr);
        }
    }

    public void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.g = watermarkData;
    }

    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            Xb.a((byte) 1, "cl", "preload() and load() cannot be called on the same instance, please use a different instance.");
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                c4493y92.b(tag, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC4168m1 f = f();
            if (f != null) {
                f.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b = this.a;
        if (b == 8) {
            Xb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                c4493y93.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC4168m1 f2 = f();
            if (f2 != null) {
                f2.b((short) 2002);
            }
            return false;
        }
        if (b == 1) {
            Xb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C4493y9 c4493y94 = this.f;
            if (c4493y94 != null) {
                c4493y94.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC4168m1 f3 = f();
            if (f3 != null) {
                f3.b((short) 2001);
            }
            return false;
        }
        if (b != 5) {
            return true;
        }
        Xb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C4493y9 c4493y95 = this.f;
        if (c4493y95 != null) {
            c4493y95.b(tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC4168m1 f4 = f();
        if (f4 != null) {
            f4.c((short) 2003);
        }
        return false;
    }

    public final boolean a(String tag, String placementString) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "canRender " + this);
        }
        byte b = this.a;
        if (b == 1) {
            Xb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("cl", "TAG");
                c4493y92.b("cl", "adload in progress");
            }
            AbstractC4168m1 f = f();
            if (f != null) {
                f.c((short) 2129);
            }
            return false;
        }
        if (b == 8) {
            Xb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("cl", "TAG");
                c4493y93.b("cl", "ad loading into view is in progress");
            }
            AbstractC4168m1 f2 = f();
            if (f2 != null) {
                f2.c((short) 2164);
            }
            return false;
        }
        if (b != 5) {
            if (b == 7) {
                return true;
            }
            C4493y9 c4493y94 = this.f;
            if (c4493y94 != null) {
                Intrinsics.checkNotNullExpressionValue("cl", "TAG");
                c4493y94.b("cl", "ad in illegal state");
            }
            AbstractC4168m1 f3 = f();
            if (f3 != null) {
                f3.c((short) 2165);
            }
            AbstractC4168m1 f4 = f();
            if (f4 != null) {
                f4.K();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        Xb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C4493y9 c4493y95 = this.f;
        if (c4493y95 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y95.b("cl", "ad active before renderAd");
        }
        AbstractC4168m1 f5 = f();
        if (f5 != null) {
            f5.c((short) 2130);
        }
        AbstractC4168m1 f6 = f();
        if (f6 != null) {
            f6.K();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        return false;
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public void a() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdDismissed " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.a(AbstractC3924cl.this);
            }
        });
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
    }

    public static final void a(AbstractC3924cl abstractC3924cl) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        C4493y9 c4493y92 = abstractC3924cl.f;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y92.b("cl", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void a(final Fk fk) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "onAdImpression " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.a(AbstractC3924cl.this, fk);
            }
        });
    }

    public static final void a(AbstractC3924cl abstractC3924cl, Fk fk) {
        if (abstractC3924cl.c == null) {
            C4493y9 c4493y9 = abstractC3924cl.f;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("cl", "TAG");
                c4493y9.b("cl", "callback is null");
            }
            if (fk != null) {
                fk.b();
                return;
            }
            return;
        }
        C4493y9 c4493y92 = abstractC3924cl.f;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y92.a("cl", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(fk);
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void a(final Z1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.a(AbstractC3924cl.this, audioStatusInternal);
            }
        });
    }

    public static final void a(AbstractC3924cl abstractC3924cl, Z1 z1) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onAudioStatusChanged - " + z1.a);
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(z1);
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void a(final String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.d.post(new Runnable() { // from class: com.inmobi.media.cl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3924cl.a(AbstractC3924cl.this, log);
            }
        });
    }

    public static final void a(AbstractC3924cl abstractC3924cl, String str) {
        C4493y9 c4493y9 = abstractC3924cl.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.a("cl", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = abstractC3924cl.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("cl", "TAG");
            c4493y9.c("cl", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC4168m1 f = f();
        if (f != null) {
            f.b(s);
        }
    }
}
