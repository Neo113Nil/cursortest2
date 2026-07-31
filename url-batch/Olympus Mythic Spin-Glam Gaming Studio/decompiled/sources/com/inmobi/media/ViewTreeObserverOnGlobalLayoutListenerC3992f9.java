package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3992f9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ InMobiBanner a;

    public ViewTreeObserverOnGlobalLayoutListenerC3992f9(InMobiBanner inMobiBanner) {
        this.a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C4493y9 c4493y9;
        boolean c;
        boolean c2;
        try {
            c = this.a.c();
            if (!c) {
                InMobiBanner.access$captureStandardBannerSize(this.a, N3.b(r0.getMeasuredWidth() / R5.b()), N3.b(this.a.getMeasuredHeight() / R5.b()));
            }
            c2 = this.a.c();
            if (c2) {
                this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e) {
            C4065i2 mAdManager = this.a.getMAdManager();
            if (mAdManager == null || (c4493y9 = mAdManager.f) == null) {
                return;
            }
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            c4493y9.a(access$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e);
        }
    }
}
