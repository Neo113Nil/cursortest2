package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.g2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C4012g2 extends PublisherCallbacks {

    @NotNull
    private WeakReference<InMobiBanner> a;

    public C4012g2(InMobiBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.a = new WeakReference<>(banner);
    }

    @NotNull
    public final WeakReference<InMobiBanner> a() {
        return this.a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> params) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(params, "params");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner ad = this.a.get();
        if (ad == null) {
            return;
        }
        AbstractC3905c2 mPubListener = ad.getMPubListener();
        if (mPubListener != null) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            ((C3931d2) mPubListener).a.onAdDismissed(ad);
        }
        ad.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo info) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C3931d2) mPubListener).a.onAdDisplayed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        ((C3931d2) mPubListener).a.onAdFetchFailed(ad, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable Fk fk) {
        InMobiBanner ad = this.a.get();
        AbstractC3905c2 mPubListener = ad != null ? ad.getMPubListener() : null;
        if (mPubListener == null) {
            if (fk != null) {
                fk.b();
            }
        } else {
            Intrinsics.checkNotNullParameter(ad, "ad");
            ((C3931d2) mPubListener).a.onAdImpression(ad);
            if (fk != null) {
                fk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullExpressionValue(C4012g2.class.getSimpleName(), "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        AbstractC3905c2 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            mPubListener.a(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo info) {
        C4065i2 mAdManager;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mAdManager = inMobiBanner.getMAdManager()) == null) {
            return;
        }
        if (!mAdManager.l()) {
            mAdManager.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            AbstractC3905c2 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.b(inMobiBanner, info);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager.l()) {
            AbstractC4168m1 f = mAdManager.f();
            if (f != null) {
                f.c((short) 2173);
                return;
            }
            return;
        }
        AbstractC4168m1 f2 = mAdManager.f();
        if (f2 != null) {
            f2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(@NotNull Z1 item) {
        Intrinsics.checkNotNullParameter(item, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(item);
        AudioListener mAudioListener = inMobiBanner.getMAudioListener();
        if (mAudioListener != null) {
            Z1.b.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            int ordinal = item.ordinal();
            mAudioListener.onAudioStatusChanged(inMobiBanner, ordinal != 1 ? ordinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String log) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(log, "log");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] request) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(request, "request");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((C3931d2) mPubListener).a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus status) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(status, "reason");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(status, "status");
        ((C3931d2) mPubListener).a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> rewards) {
        AbstractC3905c2 mPubListener;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((C3931d2) mPubListener).a.onRewardsUnlocked(ad, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3905c2 mPubListener;
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C3931d2) mPubListener).a.onUserLeftApplication(ad);
    }

    public final void a(@NotNull WeakReference<InMobiBanner> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.a = weakReference;
    }
}
