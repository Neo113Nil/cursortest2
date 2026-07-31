package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4065i2 extends AbstractC3924cl {
    public final String h = "InMobi";
    public final String i = C4065i2.class.getSimpleName();
    public final String j = VastAttributes.HORIZONTAL_POSITION;
    public C3956e2 k;
    public C3956e2 l;
    public C3956e2 m;
    public C3956e2 n;

    public final void a(InMobiBanner banner) {
        C4431w0 c4431w0;
        Intrinsics.checkNotNullParameter(banner, "banner");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "applyInlineAdaptiveSizeIfNeeded " + this);
        }
        C3956e2 c3956e2 = this.n;
        if (c3956e2 == null || (c4431w0 = c3956e2.l) == null || !c4431w0.j || c4431w0.i.length() == 0) {
            return;
        }
        List split$default = StringsKt.split$default((CharSequence) c4431w0.i, new String[]{this.j}, false, 0, 6, (Object) null);
        if (split$default.size() != 2) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.b(TAG2, "Invalid adaptive ad size: " + c4431w0.i);
                return;
            }
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
        Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
        Integer num = null;
        if (((intOrNull == null || intOrNull.intValue() <= 0) ? null : intOrNull) != null) {
            if (intOrNull2 != null && intOrNull2.intValue() > 0) {
                num = intOrNull2;
            }
            if (num != null) {
                banner.updateLayoutParamsForResolvedSize$media_release(intOrNull.intValue(), intOrNull2.intValue());
                return;
            }
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            String TAG3 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c4493y93.b(TAG3, "Invalid adaptive ad size: " + c4431w0.i);
        }
    }

    public final void b(InMobiBanner banner) {
        C4431w0 c4431w0;
        Intrinsics.checkNotNullParameter(banner, "banner");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "displayAd " + this);
        }
        C3956e2 c3956e2 = this.m;
        GestureDetectorOnGestureListenerC4476xi j = c3956e2 != null ? c3956e2.j() : null;
        if (j == null) {
            j = null;
        }
        if (j == null) {
            return;
        }
        AbstractC4008fo viewableAd = j.getViewableAd();
        C3956e2 c3956e22 = this.m;
        if (c3956e22 != null && (c4431w0 = c3956e22.l) != null && c4431w0.l) {
            j.l();
        }
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View c = viewableAd.c();
        viewableAd.a(new HashMap());
        C3956e2 c3956e23 = this.n;
        if (c3956e23 != null) {
            c3956e23.X();
        }
        C3956e2 c3956e24 = this.m;
        if (c3956e24 != null && c3956e24.b == 8) {
            View view = new View(banner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            if (viewGroup == null) {
                banner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            banner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        C3956e2 c3956e25 = this.n;
        if (c3956e25 != null) {
            c3956e25.d();
        }
    }

    public final void c(InMobiBanner inMobiBanner) {
        C4431w0 c4431w0;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "displayInternal " + this);
        }
        C3956e2 c3956e2 = this.m;
        if (c3956e2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC4476xi j = c3956e2.j();
        if (j == null) {
            j = null;
        }
        if (j == null) {
            return;
        }
        AbstractC4008fo viewableAd = j.getViewableAd();
        C3956e2 c3956e22 = this.m;
        if (c3956e22 != null && (c4431w0 = c3956e22.l) != null && c4431w0.l) {
            j.l();
        }
        View c = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final AbstractC4168m1 f() {
        return q() ? this.m : this.n;
    }

    public final void h() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C3956e2 c3956e2;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "canScheduleRefresh " + this);
        }
        C3956e2 c3956e22 = this.n;
        if (c3956e22 == null) {
            return false;
        }
        byte b = c3956e22.b;
        if (b != 4 && b != 1 && b != 2 && ((c3956e2 = this.m) == null || c3956e2.b != 7)) {
            return true;
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.a(TAG2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "clear " + this);
        }
        t();
        C3956e2 c3956e2 = this.k;
        if (c3956e2 != null) {
            c3956e2.d();
        }
        this.k = null;
        C3956e2 c3956e22 = this.l;
        if (c3956e22 != null) {
            c3956e22.d();
        }
        this.l = null;
        this.f = null;
        this.m = null;
        this.n = null;
        this.b = null;
    }

    public final int k() {
        AdConfig adConfig;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "defaultRefreshInterval " + this);
        }
        AbstractC4168m1 f = f();
        if (f == null || (adConfig = f.c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Intrinsics.areEqual(this.m, this.k);
        String TAG2 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Intrinsics.areEqual(this.n, this.k);
        String TAG3 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        Intrinsics.areEqual(this.m, this.l);
        String TAG4 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        Intrinsics.areEqual(this.n, this.l);
        String TAG5 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        Objects.toString(this.k);
        String TAG6 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        Objects.toString(this.l);
        C3956e2 c3956e2 = this.m;
        return c3956e2 != null && c3956e2.b == 7;
    }

    public final void m() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "pause " + this);
        }
        C3956e2 c3956e2 = this.m;
        if (c3956e2 != null) {
            c3956e2.X();
        }
    }

    public final void n() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        C3956e2 c3956e2 = this.k;
        if (c3956e2 != null) {
            c3956e2.Z();
        }
        C3956e2 c3956e22 = this.l;
        if (c3956e22 != null) {
            c3956e22.Z();
        }
    }

    public final void o() {
        C3956e2 c3956e2;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "render " + this);
        }
        C3956e2 c3956e22 = this.n;
        if (c3956e22 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.h, String.valueOf(c3956e22.l.a))) {
            PublisherCallbacks publisherCallbacks = this.c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3956e2 = this.n) != null) {
                c3956e2.d((byte) 1);
            }
            this.a = (byte) 8;
            c3956e22.a0();
        }
    }

    public final void p() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "resume " + this);
        }
        C3956e2 c3956e2 = this.m;
        if (c3956e2 != null) {
            c3956e2.Y();
        }
    }

    public final boolean q() {
        C3956e2 c3956e2 = this.m;
        Byte valueOf = c3956e2 != null ? Byte.valueOf(c3956e2.b) : null;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "shouldUseForegroundUnit " + this + " state - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "submitAdShowFail " + this);
        }
        AbstractC4168m1 f = f();
        if (f != null) {
            f.d((short) 2239);
        }
    }

    public final void s() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "swapAdUnits " + this);
        }
        C3956e2 c3956e2 = this.m;
        if (c3956e2 == null) {
            this.m = this.k;
            this.n = this.l;
        } else if (Intrinsics.areEqual(c3956e2, this.k)) {
            this.m = this.l;
            this.n = this.k;
        } else if (Intrinsics.areEqual(c3956e2, this.l)) {
            this.m = this.k;
            this.n = this.l;
        }
    }

    public final void t() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        C3956e2 c3956e2 = this.k;
        if (c3956e2 != null) {
            c3956e2.c0();
        }
        C3956e2 c3956e22 = this.l;
        if (c3956e22 != null) {
            c3956e22.c0();
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.a = (byte) 0;
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.a(TAG2, "Ad load successful, providing callback");
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.i2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4065i2.b(C4065i2.this, info);
            }
        });
    }

    public final boolean a(long j) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "checkForRefreshRate " + this);
        }
        C3956e2 c3956e2 = this.n;
        if (c3956e2 == null) {
            return false;
        }
        AdConfig adConfig = c3956e2.c;
        Intrinsics.checkNotNull(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.b(TAG2, "Early refresh request");
        }
        b(this.n, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG3 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        C3956e2 c3956e22 = this.n;
        Xb.a((byte) 1, TAG3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3956e22 != null ? c3956e22.l : null) + ")");
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            String TAG4 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            C3956e2 c3956e23 = this.n;
            c4493y93.b(TAG4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3956e23 != null ? c3956e23.l : null) + ")");
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onAdFetchSuccess " + this);
        }
        this.e = info;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C3956e2 c3956e2 = this.n;
        if ((c3956e2 != null ? c3956e2.b(0) : null) == null) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.b(TAG2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC4168m1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            String TAG3 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c4493y93.a(TAG3, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: com.inmobi.media.i2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4065i2.a(C4065i2.this, info);
            }
        });
    }

    public static final void b(C4065i2 c4065i2, AdMetaInfo adMetaInfo) {
        C4493y9 c4493y9 = c4065i2.f;
        if (c4493y9 != null) {
            String TAG = c4065i2.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c4065i2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c4065i2.b((short) 2184);
        }
    }

    public final int a(int i, int i2) {
        AdConfig adConfig;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "getRefreshInterval " + this);
        }
        C3956e2 c3956e2 = this.n;
        return (c3956e2 == null || (adConfig = c3956e2.c) == null) ? i2 : i < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i;
    }

    public final void b(short s) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "submitAdLoadFailed " + this);
        }
        AbstractC4168m1 f = f();
        if (f != null) {
            f.c(s);
        }
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean z) {
        C3956e2 c3956e2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "load 1 " + this);
        }
        if (Intrinsics.areEqual(this.b, Boolean.FALSE)) {
            b(this.n, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3956e2 c3956e22 = this.n;
            if (c3956e22 != null) {
                c3956e22.b((short) 2006);
            }
            Xb.a((byte) 1, this.h, "Cannot call load() API after calling load(byte[])");
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.b(TAG2, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.b = Boolean.TRUE;
        if (this.c == null) {
            this.c = callbacks;
        }
        C3956e2 c3956e23 = this.n;
        if (c3956e23 == null || !a(this.h, String.valueOf(c3956e23.l), callbacks) || (c3956e2 = this.n) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (c3956e2.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                String TAG3 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c4493y93.d(TAG3, "AdManager state - LOADING");
            }
            this.a = (byte) 1;
            this.e = null;
            C3956e2 c3956e24 = this.n;
            Intrinsics.checkNotNull(c3956e24);
            c3956e24.d(adSize);
            C3956e2 c3956e25 = this.n;
            Intrinsics.checkNotNull(c3956e25);
            c3956e25.b(z);
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        C3956e2 c3956e2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "load 2 " + this);
        }
        if (Intrinsics.areEqual(this.b, Boolean.TRUE)) {
            Xb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.b(TAG2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.a = (byte) 1;
        this.c = callbacks;
        if (this.n != null) {
            C3956e2 c3956e22 = this.m;
            if ((c3956e22 == null || !c3956e22.C()) && (c3956e2 = this.n) != null && c3956e2.d((byte) 1)) {
                C4493y9 c4493y93 = this.f;
                if (c4493y93 != null) {
                    String TAG3 = this.i;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    c4493y93.a(TAG3, "timer started - load banner");
                }
                C3956e2 c3956e23 = this.n;
                if (c3956e23 != null) {
                    c3956e23.E();
                }
                C3956e2 c3956e24 = this.n;
                if (c3956e24 != null) {
                    c3956e24.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void a() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onAdDismissed " + this);
        }
        this.a = (byte) 0;
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.d(TAG2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(C4065i2 c4065i2, AdMetaInfo adMetaInfo) {
        C4493y9 c4493y9 = c4065i2.f;
        if (c4493y9 != null) {
            String TAG = c4065i2.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c4065i2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        C4493y9 c4493y92 = c4065i2.f;
        if (c4493y92 != null) {
            String TAG2 = c4065i2.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void a(int i, final int i2, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        ViewParent parent;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onShowNextPodAd " + this);
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.a(TAG2, "on Show next pod ad index: " + i);
        }
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            try {
                parent = gestureDetectorOnGestureListenerC4476xi.getParent();
            } catch (Exception unused) {
                C3956e2 c3956e2 = this.m;
                if (c3956e2 != null) {
                    c3956e2.e(i2);
                }
                C3956e2 c3956e22 = this.m;
                if (c3956e22 != null) {
                    c3956e22.b(i2, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C3956e2 c3956e23 = this.m;
            if (c3956e23 != null) {
                c3956e23.b(i2, true);
            }
            c(inMobiBanner);
            this.d.post(new Runnable() { // from class: com.inmobi.media.i2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C4065i2.a(C4065i2.this, i2);
                }
            });
            return;
        }
        C3956e2 c3956e24 = this.m;
        if (c3956e24 != null) {
            c3956e24.e(i2);
        }
        C3956e2 c3956e25 = this.m;
        if (c3956e25 != null) {
            c3956e25.b(i2, false);
        }
    }

    public final void a(Context context, C3868ah pubSettings, String adSize) {
        String m10Context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter("banner", "logType");
        Intrinsics.checkNotNullExpressionValue(this.i, "TAG");
        C4378u0 c4378u0 = new C4378u0("banner");
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            m10Context = "activity";
        } else {
            m10Context = "others";
        }
        Intrinsics.checkNotNullParameter(m10Context, "m10Context");
        c4378u0.j = m10Context;
        c4378u0.b = pubSettings.a;
        c4378u0.d = pubSettings.c;
        c4378u0.c = pubSettings.d;
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        c4378u0.g = adSize;
        String str = pubSettings.b;
        if (str == null) {
            str = "";
        }
        c4378u0.h = str;
        c4378u0.i = pubSettings.e;
        c4378u0.e = pubSettings.h;
        c4378u0.k = pubSettings.f;
        C4431w0 a = c4378u0.a();
        String str2 = pubSettings.h;
        if (str2 != null) {
            C4493y9 c4493y9 = this.f;
            if (c4493y9 != null) {
                c4493y9.a();
            }
            this.f = AbstractC3869ai.a("banner", str2);
        }
        C3956e2 c3956e2 = this.k;
        if (c3956e2 != null && this.l != null) {
            c3956e2.a(context, a, this);
            C3956e2 c3956e22 = this.l;
            if (c3956e22 != null) {
                c3956e22.a(context, a, this);
            }
        } else {
            this.k = new C3956e2(context, a, this);
            C3956e2 c3956e23 = new C3956e2(context, a, this);
            this.l = c3956e23;
            this.n = this.k;
            this.m = c3956e23;
        }
        C4493y9 logger = this.f;
        if (logger != null) {
            C3956e2 c3956e24 = this.k;
            if (c3956e24 != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3956e24.i = logger;
                C3877b0 c3877b0 = c3956e24.u;
                c3877b0.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3877b0.f = logger;
            }
            C3956e2 c3956e25 = this.l;
            if (c3956e25 != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3956e25.i = logger;
                C3877b0 c3877b02 = c3956e25.u;
                c3877b02.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3877b02.f = logger;
            }
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String TAG = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c4493y92.a(TAG, "adding mBannerAdUnit1 to reference tracker");
            }
            Nb nb = AbstractC3869ai.a;
            C3956e2 c3956e26 = this.k;
            Intrinsics.checkNotNull(c3956e26);
            AbstractC3869ai.a(c3956e26, this.f);
            C4493y9 c4493y93 = this.f;
            if (c4493y93 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y93.a(TAG2, "adding mBannerAdUnit2 to reference tracker");
            }
            C3956e2 c3956e27 = this.l;
            Intrinsics.checkNotNull(c3956e27);
            AbstractC3869ai.a(c3956e27, this.f);
        }
        WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            C3956e2 c3956e28 = this.k;
            if (c3956e28 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c3956e28.A = watermarkData;
                GestureDetectorOnGestureListenerC4476xi r = c3956e28.r();
                if (r != null) {
                    r.setWatermark(watermarkData);
                }
            }
            C3956e2 c3956e29 = this.l;
            if (c3956e29 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c3956e29.A = watermarkData;
                GestureDetectorOnGestureListenerC4476xi r2 = c3956e29.r();
                if (r2 != null) {
                    r2.setWatermark(watermarkData);
                }
            }
        }
    }

    public static final void a(C4065i2 c4065i2, int i) {
        C3956e2 c3956e2 = c4065i2.m;
        if (c3956e2 != null) {
            c3956e2.a(i, false);
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3956e2 c3956e2 = this.k;
        if (c3956e2 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c3956e2.A = watermarkData;
            GestureDetectorOnGestureListenerC4476xi r = c3956e2.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
        C3956e2 c3956e22 = this.l;
        if (c3956e22 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c3956e22.A = watermarkData;
            GestureDetectorOnGestureListenerC4476xi r2 = c3956e22.r();
            if (r2 != null) {
                r2.setWatermark(watermarkData);
            }
        }
    }
}
