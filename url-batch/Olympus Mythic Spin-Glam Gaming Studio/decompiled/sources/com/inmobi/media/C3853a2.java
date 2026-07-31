package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3853a2 extends AbstractC3924cl {
    public R1 h;
    public R1 i;
    public R1 j;
    public R1 k;

    public C3853a2(InMobiAudio.a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.c = callbacks;
    }

    public static final void a(C3853a2 c3853a2, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = c3853a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(C3853a2 c3853a2, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = c3853a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.a = (byte) 0;
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String str2 = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c4493y92.d(str2, "AdManager state - CREATED");
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            String str3 = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            c4493y93.a(str3, "Ad load successful, providing callback");
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C3853a2.b(C3853a2.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final AbstractC4168m1 f() {
        return m() ? this.j : this.k;
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final void g() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "submitAdLoadCalled " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.P();
        }
    }

    public final void h() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "clear " + this);
        }
        p();
        R1 r1 = this.h;
        if (r1 != null) {
            r1.d();
        }
        this.h = null;
        R1 r12 = this.i;
        if (r12 != null) {
            r12.d();
        }
        this.i = null;
        this.j = null;
        this.k = null;
        this.b = null;
    }

    public final void i() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "pause " + this);
        }
        R1 r1 = this.j;
        if (r1 != null) {
            r1.X();
        }
    }

    public final void j() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.c(str, "registerLifeCycleCallbacks " + this);
        }
        R1 r1 = this.h;
        if (r1 != null) {
            r1.Z();
        }
        R1 r12 = this.i;
        if (r12 != null) {
            r12.Z();
        }
    }

    public final void k() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "loadIntoView " + this);
        }
        R1 r1 = this.k;
        if (r1 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a("InMobi", String.valueOf(r1.l.a))) {
            this.a = (byte) 8;
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String str2 = AbstractC3879b2.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c4493y92.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            r1.a0();
        }
    }

    public final void l() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "resume " + this);
        }
        R1 r1 = this.j;
        if (r1 != null) {
            r1.Y();
        }
    }

    public final boolean m() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.c(str, "shouldUseForegroundUnit " + this);
        }
        R1 r1 = this.j;
        Byte valueOf = r1 != null ? Byte.valueOf(r1.b) : null;
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String str2 = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c4493y92.d(str2, "State - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "submitAdShowCalled " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.R();
        }
    }

    public final void o() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "swapAdUnits " + this);
        }
        R1 r1 = this.j;
        if (Intrinsics.areEqual(r1, this.h)) {
            this.j = this.i;
            this.k = this.h;
        } else if (Intrinsics.areEqual(r1, this.i) || r1 == null) {
            this.j = this.h;
            this.k = this.i;
        }
    }

    public final void p() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        R1 r1 = this.h;
        if (r1 != null) {
            r1.c0();
        }
        R1 r12 = this.i;
        if (r12 != null) {
            r12.c0();
        }
    }

    public final boolean a(long j) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.c(str, "checkForRefreshRate " + this);
        }
        if (this.k == null) {
            return false;
        }
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        int minRefreshInterval = ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = AbstractC3879b2.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        R1 r1 = this.k;
        Xb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (r1 != null ? r1.l : null) + ")");
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            R1 r12 = this.k;
            c4493y92.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (r12 != null ? r12.l : null) + ")");
        }
        return false;
    }

    public final void b(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "load 1 " + this);
        }
        R1 r1 = this.k;
        if (r1 != null && a("InMobi", String.valueOf(r1.l.a), this.c) && r1.d((byte) 1)) {
            this.a = (byte) 1;
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String str2 = AbstractC3879b2.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c4493y92.d(str2, "AdManager state - LOADING");
            }
            this.e = null;
            r1.d(adSize);
            r1.b(false);
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.c(str, "onAdFetchSuccess " + this);
        }
        R1 r1 = this.k;
        if ((r1 != null ? r1.b(0) : null) == null) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String str2 = AbstractC3879b2.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c4493y92.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC4168m1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            String str3 = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            c4493y93.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C3853a2.a(C3853a2.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC4038h1
    public final void b() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "onAdShowFailed " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C3853a2.a(C3853a2.this);
            }
        });
    }

    public final void b(RelativeLayout relativeLayout) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "showAudioAd");
        }
        R1 r1 = this.j;
        if (r1 != null && r1.b == 7) {
            String str2 = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            Xb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c4493y92.b(str2, "ad is active");
            }
            R1 r12 = this.k;
            if (r12 != null) {
                r12.f((short) 15);
                return;
            }
            return;
        }
        R1 r13 = this.k;
        if (r13 != null) {
            C4493y9 c4493y93 = r13.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y93.c("m1", "canProceedToShow");
            }
            if (r13.A()) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                Xb.a((byte) 1, "m1", "Ad Show has failed because current ad is expired. Please call load() again.");
                C4493y9 c4493y94 = r13.i;
                if (c4493y94 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y94.b("m1", "ad is expired");
                }
                r13.d0();
                return;
            }
            byte b = r13.b;
            if (b == 1 || b == 2) {
                Xb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                C4493y9 c4493y95 = r13.i;
                if (c4493y95 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y95.b("m1", "ad is not ready");
                }
                C4493y9 c4493y96 = r13.i;
                if (c4493y96 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y96.a("m1", "callback - onShowFailure");
                }
                r13.f((short) 2152);
                return;
            }
            if (b == 3) {
                Xb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                r13.f((short) 0);
                C4493y9 c4493y97 = r13.i;
                if (c4493y97 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y97.a("m1", "callback - onShowFailure");
                }
                C4493y9 c4493y98 = r13.i;
                if (c4493y98 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y98.b("m1", "ad is failed");
                    return;
                }
                return;
            }
            if (b == 8) {
                Xb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                r13.f((short) 0);
                C4493y9 c4493y99 = r13.i;
                if (c4493y99 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y99.a("m1", "callback - onShowFailure");
                }
                C4493y9 c4493y910 = r13.i;
                if (c4493y910 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y910.b("m1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b == 0) {
                Xb.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                r13.f((short) 0);
                C4493y9 c4493y911 = r13.i;
                if (c4493y911 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y911.a("m1", "callback - onShowFailure");
                }
                C4493y9 c4493y912 = r13.i;
                if (c4493y912 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y912.b("m1", "show called before load");
                    return;
                }
                return;
            }
            o();
            a(relativeLayout);
        }
    }

    public final void b(short s) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.b(str, "submitAdLoadFailed " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.c((short) 15);
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        GestureDetectorOnGestureListenerC4476xi j;
        C4431w0 c4431w0;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "displayAd " + this);
        }
        R1 r1 = this.j;
        if (r1 == null || (j = r1.j()) == null) {
            return;
        }
        AbstractC4008fo viewableAd = j.getViewableAd();
        R1 r12 = this.j;
        if (r12 != null && (c4431w0 = r12.l) != null && c4431w0.l) {
            j.l();
        }
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View c = viewableAd.c();
        viewableAd.a((Map) null);
        R1 r13 = this.k;
        if (r13 != null) {
            r13.X();
        }
        if (viewGroup == null) {
            relativeLayout.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        R1 r14 = this.k;
        if (r14 != null) {
            r14.d();
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void a() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "onAdDismissed " + this);
        }
        this.a = (byte) 0;
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String str2 = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c4493y92.d(str2, "AdManager state - CREATED");
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            c4493y93.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "onAdDisplayed");
        }
        super.a(info);
        AbstractC4168m1 f = f();
        if (f != null) {
            f.S();
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl, com.inmobi.media.AbstractC4038h1
    public final void a(AbstractC4168m1 abstractC4168m1, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.b(str, com.ironsource.Zf.b);
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
    }

    public static final void a(C3853a2 c3853a2) {
        C4493y9 c4493y9 = c3853a2.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3853a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C4493y9 c4493y92 = c3853a2.f;
        if (c4493y92 != null) {
            c4493y92.a();
        }
    }

    public final void a(final InMobiAudio audio) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(audio);
            } else {
                this.d.post(new Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3853a2.a(C3853a2.this, audio);
                    }
                });
            }
        } catch (Exception e) {
            R1 r1 = this.k;
            if (r1 != null) {
                r1.f((short) 26);
            }
            String str2 = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            Xb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c4493y92.b(str2, "Show failed with unexpected error: " + e.getMessage());
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    @Override // com.inmobi.media.AbstractC3924cl
    public final void a(short s) {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String str = AbstractC3879b2.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c4493y9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        R1 r1 = this.k;
        if (r1 != null) {
            r1.b(s);
        }
    }

    public final void a(Context context, C3868ah pubSettings, String adSize) {
        String m10Context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        String str = AbstractC3879b2.a;
        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
        C4378u0 c4378u0 = new C4378u0("audio");
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
        c4378u0.i = pubSettings.e;
        c4378u0.e = pubSettings.h;
        c4378u0.k = pubSettings.f;
        C4431w0 a = c4378u0.a();
        R1 r1 = this.h;
        if (r1 != null && this.i != null) {
            r1.a(context, a, this);
            R1 r12 = this.i;
            if (r12 != null) {
                r12.a(context, a, this);
            }
        } else {
            this.h = new R1(context, a, this);
            this.i = new R1(context, a, this);
            this.k = this.h;
        }
        String str2 = pubSettings.h;
        if (str2 != null) {
            C4493y9 c4493y9 = this.f;
            if (c4493y9 != null) {
                c4493y9.a();
            }
            C4493y9 a2 = AbstractC3869ai.a("audio", str2);
            this.f = a2;
            if (a2 != null) {
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                a2.a(str, "adding audioAdUnit1 to reference tracker");
            }
            R1 r13 = this.h;
            Intrinsics.checkNotNull(r13);
            AbstractC3869ai.a(r13, this.f);
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                c4493y92.a(str, "adding audioAdUnit2 to reference tracker");
            }
            R1 r14 = this.i;
            Intrinsics.checkNotNull(r14);
            AbstractC3869ai.a(r14, this.f);
        }
    }

    public static final void a(C3853a2 c3853a2, RelativeLayout relativeLayout) {
        c3853a2.b(relativeLayout);
    }
}
