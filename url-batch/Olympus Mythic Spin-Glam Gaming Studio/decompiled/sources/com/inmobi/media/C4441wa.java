package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.safedk.android.internal.special.SpecialsBridge;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.wa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4441wa extends PublisherCallbacks {

    @NotNull
    public WeakReference<InMobiInterstitial> a;

    public C4441wa(InMobiInterstitial interstitial) {
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        this.a = new WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> params) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(params, "params");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC4362ta mPubListener$media_release;
        InMobiInterstitial ad = this.a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C4388ua) mPubListener$media_release).a.onAdDismissed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC4362ta mPubListener$media_release;
        InMobiInterstitial ad = this.a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C4388ua) mPubListener$media_release).a.onAdDisplayFailed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo info) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial ad = this.a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        SpecialsBridge.inmobiOnInterstitialAdDisplayed(((C4388ua) mPubListener$media_release).a, ad, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiInterstitial ad = this.a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        ((C4388ua) mPubListener$media_release).a.onAdFetchFailed(ad, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable Fk fk) {
        InMobiInterstitial ad = this.a.get();
        AbstractC4362ta mPubListener$media_release = ad != null ? ad.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (fk != null) {
                fk.b();
            }
        } else {
            Intrinsics.checkNotNullParameter(ad, "ad");
            ((C4388ua) mPubListener$media_release).a.onAdImpression(ad);
            if (fk != null) {
                fk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus status) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo info) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC4362ta mPubListener$media_release;
        InMobiInterstitial ad = this.a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C4388ua) mPubListener$media_release).a.onAdWillDisplay(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String log) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(log, "log");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] request) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(request, "request");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C4388ua) mPubListener$media_release).a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus status) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "reason");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(status, "status");
        ((C4388ua) mPubListener$media_release).a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> rewards) {
        AbstractC4362ta mPubListener$media_release;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        InMobiInterstitial ad = this.a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((C4388ua) mPubListener$media_release).a.onRewardsUnlocked(ad, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC4362ta mPubListener$media_release;
        InMobiInterstitial ad = this.a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C4388ua) mPubListener$media_release).a.onUserLeftApplication(ad);
    }
}
