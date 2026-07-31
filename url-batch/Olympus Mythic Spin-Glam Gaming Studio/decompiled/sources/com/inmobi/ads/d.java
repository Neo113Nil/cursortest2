package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.AbstractC3905c2;
import com.inmobi.media.C4012g2;
import com.inmobi.media.C4065i2;
import com.inmobi.media.Xb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements PreloadManager {
    public final C4012g2 a;
    public final /* synthetic */ InMobiBanner b;

    public d(InMobiBanner inMobiBanner) {
        this.b = inMobiBanner;
        this.a = new C4012g2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            C4065i2 mAdManager = this.b.getMAdManager();
            if (mAdManager != null) {
                mAdManager.o();
            }
        } catch (IllegalStateException e) {
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            Xb.a((byte) 1, access$getTAG$cp, e.getMessage());
            AbstractC3905c2 mPubListener = this.b.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(this.b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.b.setEnableAutoRefresh(false);
        this.b.a((PublisherCallbacks) this.a, "Preload", false);
    }
}
