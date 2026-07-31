package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C3956e2 extends AbstractC4168m1 implements Application.ActivityLifecycleCallbacks {
    public final String F;
    public final String G;
    public boolean H;
    public int I;
    public final C3985f2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3956e2(Context context, C4431w0 placement, AbstractC3924cl abstractC3924cl) {
        super(context, placement, abstractC3924cl);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        String TAG = C3956e2.class.getSimpleName();
        this.F = TAG;
        this.G = "InMobi";
        this.J = new C3985f2();
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        long j = placement.a;
        a(context, placement, abstractC3924cl);
    }

    public static final void a(C3956e2 c3956e2, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, int i) {
        int indexOf = c3956e2.h.indexOf(gestureDetectorOnGestureListenerC4476xi);
        try {
            AbstractC4038h1 n = c3956e2.n();
            C4493y9 c4493y9 = c3956e2.i;
            if (c4493y9 != null) {
                String TAG = c3956e2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c4493y9.c(TAG, "callback onShowNextPodAd");
            }
            if (n != null) {
                n.a(i, indexOf, gestureDetectorOnGestureListenerC4476xi);
            }
        } catch (Exception unused) {
            c3956e2.b(indexOf, false);
            c3956e2.e(indexOf);
        }
    }

    public static final void b(C3956e2 c3956e2) {
        try {
            if (c3956e2.b == 7) {
                int i = c3956e2.I - 1;
                c3956e2.I = i;
                if (i == 0) {
                    c3956e2.c((byte) 6);
                    AbstractC4038h1 n = c3956e2.n();
                    if (n != null) {
                        n.a();
                    }
                }
            }
        } catch (Exception e) {
            C4493y9 c4493y9 = c3956e2.i;
            if (c4493y9 != null) {
                String TAG = c3956e2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c4493y9.b(TAG, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final void c(C3956e2 c3956e2) {
        try {
            if (c3956e2.b != 6) {
                if (c3956e2.b == 7) {
                    c3956e2.I++;
                    return;
                }
                return;
            }
            c3956e2.I++;
            c3956e2.c((byte) 7);
            C4493y9 c4493y9 = c3956e2.i;
            if (c4493y9 != null) {
                String TAG = c3956e2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c4493y9.d(TAG, "AdUnit " + c3956e2 + " state - ACTIVE");
            }
            C4493y9 c4493y92 = c3956e2.i;
            if (c4493y92 != null) {
                c4493y92.c(c3956e2.G, "Successfully displayed banner ad for placement Id : " + c3956e2.l);
            }
            AbstractC4038h1 n = c3956e2.n();
            if (n != null) {
                c3956e2.a(n);
            }
        } catch (Exception e) {
            C4493y9 c4493y93 = c3956e2.i;
            if (c4493y93 != null) {
                String TAG2 = c3956e2.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y93.b(TAG2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e.getMessage());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void D() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "load " + this);
        }
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final boolean F() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 == null) {
            return false;
        }
        String TAG = this.F;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        c4493y9.c(TAG, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void G() {
        AbstractC4038h1 n;
        super.G();
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            c4493y9.c(this.G, "Banner ad fetch successful for placement id: " + this.l);
        }
        if (!Intrinsics.areEqual(t(), "html") && !Intrinsics.areEqual(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.b != 2 || (n = n()) == null) {
            return;
        }
        c(n);
    }

    public boolean W() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "canProceedToLoad " + this);
        }
        F();
        if (1 == this.b || 2 == this.b) {
            Xb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != this.b) {
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                c4493y93.c(this.G, "Fetching a Banner ad for placement id: " + this.l);
            }
            E();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        C4493y9 c4493y94 = this.i;
        if (c4493y94 != null) {
            String TAG3 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c4493y94.b(TAG3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.a);
        }
        return false;
    }

    public final void X() {
        AbstractC4008fo viewableAd;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "onPause " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            GestureDetectorOnGestureListenerC4476xi j = j();
            Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 1);
        }
    }

    public final void Y() {
        AbstractC4008fo viewableAd;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "onResume " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            GestureDetectorOnGestureListenerC4476xi j = j();
            Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 0);
        }
    }

    public final void Z() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        Context o = o();
        if (o != null) {
            AbstractC4002fj.a(o, this);
        }
    }

    public final void a0() {
        AdConfig adConfig;
        if (Intrinsics.areEqual(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c4493y9.a(TAG, "renderAd without internet check");
            }
            b0();
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            String TAG2 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.a(TAG2, "renderAd");
        }
        a(new Function0() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C3956e2.e(C3956e2.this);
            }
        }, new Function1() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3956e2.a(C3956e2.this, (EnumC4069i6) obj);
            }
        });
    }

    public final void b0() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (N()) {
                return;
            }
            C4326s1 c4326s1 = this.z;
            c4326s1.getClass();
            c4326s1.g = SystemClock.elapsedRealtime();
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3956e2.f(C3956e2.this);
                    }
                });
            }
        } catch (IllegalStateException e) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.a(TAG2, "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void c0() {
        Application application;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        Context o = o();
        Activity activity = o instanceof Activity ? (Activity) o : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void d() {
        this.J.a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final synchronized void e(GestureDetectorOnGestureListenerC4476xi renderView) {
        try {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c4493y9.a(TAG, "onAdScreenDismissed " + this);
            }
            super.e(renderView);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3956e2.b(C3956e2.this);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final synchronized void f(GestureDetectorOnGestureListenerC4476xi renderView) {
        try {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c4493y9.a(TAG, "onAdScreenDisplayed " + this);
            }
            super.f(renderView);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3956e2.c(C3956e2.this);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        if (this.s) {
            Integer num = (Integer) CollectionsKt.firstOrNull(this.r);
            if (num != null) {
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) CollectionsKt.getOrNull(this.h, num.intValue());
                if (Intrinsics.areEqual(gestureDetectorOnGestureListenerC4476xi != null ? gestureDetectorOnGestureListenerC4476xi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC4476xi, AbstractC4168m1.p(gestureDetectorOnGestureListenerC4476xi));
                    gestureDetectorOnGestureListenerC4476xi.g();
                    return;
                }
                return;
            }
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(Integer.valueOf(i))) {
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) this.h.get(i);
                if (Intrinsics.areEqual(gestureDetectorOnGestureListenerC4476xi2 != null ? gestureDetectorOnGestureListenerC4476xi2.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC4476xi2, AbstractC4168m1.p(gestureDetectorOnGestureListenerC4476xi2));
                    gestureDetectorOnGestureListenerC4476xi2.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final HashMap l() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "adSpecificRequestParams getter " + this);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("u-rt", this.H ? "1" : "0");
        hashMap.put("mk-ad-slot", this.l.h);
        return hashMap;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public String m() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void o(GestureDetectorOnGestureListenerC4476xi renderView) {
        int indexOf;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s && (indexOf = this.h.indexOf(renderView)) > this.p && renderView.J != EnumC4061ho.c) {
            this.r.remove(Integer.valueOf(indexOf));
        } else {
            V();
            super.o(renderView);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onActivityDestroyed " + this);
        }
        Context o = o();
        if (Intrinsics.areEqual(o, activity)) {
            Intrinsics.checkNotNull(o, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) o).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onActivityStarted " + this);
        }
        if (Intrinsics.areEqual(o(), activity)) {
            Y();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onActivityStopped " + this);
        }
        if (Intrinsics.areEqual(o(), activity)) {
            X();
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final GestureDetectorOnGestureListenerC4476xi r() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "htmlAdContainer getter " + this);
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (GestureDetectorOnGestureListenerC4476xi) this.h.get(this.p);
        if (this.l.l && gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.l();
        }
        return gestureDetectorOnGestureListenerC4476xi;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final byte u() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void m(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "handleRenderViewSignaledAdReady " + this);
        }
        super.m(gestureDetectorOnGestureListenerC4476xi);
        if (this.s && this.h.indexOf(gestureDetectorOnGestureListenerC4476xi) > 0 && this.b == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) this.h.get(this.p);
            if (gestureDetectorOnGestureListenerC4476xi2 != null) {
                gestureDetectorOnGestureListenerC4476xi2.a(true);
                return;
            }
            return;
        }
        if (this.b != 2) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.a(TAG2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        C4493y9 c4493y93 = this.i;
        if (c4493y93 != null) {
            String TAG3 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c4493y93.d(TAG3, "AdUnit " + this + " state - READY");
        }
        C4326s1 c4326s1 = this.z;
        c4326s1.getClass();
        c4326s1.i = SystemClock.elapsedRealtime();
        Q();
        T();
        C4493y9 c4493y94 = this.i;
        if (c4493y94 != null) {
            c4493y94.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.l);
        }
        AbstractC4038h1 n = n();
        if (n != null) {
            d(n);
        } else {
            C4493y9 c4493y95 = this.i;
            if (c4493y95 != null) {
                String TAG4 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                c4493y95.b(TAG4, "AdUnit listener is null");
            }
        }
        h();
    }

    public static final void d(C3956e2 c3956e2) {
        try {
            if (c3956e2.b == 4) {
                c3956e2.c((byte) 6);
                C4493y9 c4493y9 = c3956e2.i;
                if (c4493y9 != null) {
                    String TAG = c3956e2.F;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    c4493y9.d(TAG, "AdUnit " + c3956e2 + " state - RENDERED");
                }
            }
        } catch (Exception e) {
            C4493y9 c4493y92 = c3956e2.i;
            if (c4493y92 != null) {
                String TAG2 = c3956e2.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.b(TAG2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final Unit e(C3956e2 c3956e2) {
        C4493y9 c4493y9 = c3956e2.i;
        if (c4493y9 != null) {
            String TAG = c3956e2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "loadWithRetry success");
        }
        c3956e2.b0();
        return Unit.INSTANCE;
    }

    public static final void f(C3956e2 c3956e2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c3956e2.s) {
            c3956e2.q = System.currentTimeMillis();
            AdSet s = c3956e2.s();
            if (s != null && (ads = s.getAds()) != null) {
                int i = 0;
                for (Object obj : ads) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    c3956e2.r.add(Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        c3956e2.O();
    }

    @Override // com.inmobi.media.InterfaceC4457x0
    public final void b() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "closeAll " + this);
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, short s, String failureErrorCode) {
        Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC4476xi, s, failureErrorCode);
        if (this.s) {
            int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC4476xi);
            a(indexOf, true);
            if (indexOf > 0 && this.b == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) this.h.get(this.p);
                if (gestureDetectorOnGestureListenerC4476xi2 != null) {
                    gestureDetectorOnGestureListenerC4476xi2.a(false);
                }
            }
        }
        if (this.b == 2) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                c4493y92.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public final boolean b(int i, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "isInValidShowPodIndex " + i + " " + this.r + " " + this.h.indexOf(gestureDetectorOnGestureListenerC4476xi) + " " + this + " ");
        }
        if (!this.r.contains(Integer.valueOf(i)) || i <= this.h.indexOf(gestureDetectorOnGestureListenerC4476xi) || this.h.get(i) == null) {
            return true;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) this.h.get(i);
        return (gestureDetectorOnGestureListenerC4476xi2 == null || gestureDetectorOnGestureListenerC4476xi2.C0) ? false : true;
    }

    public final void d(String str) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "setAdSize " + this);
        }
        C4431w0 c4431w0 = this.l;
        Intrinsics.checkNotNull(str);
        c4431w0.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c4431w0.h = str;
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.AbstractC4528zi
    public void i(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.c(TAG, "onRenderViewVisible " + this);
        }
        super.i(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C3956e2.d(C3956e2.this);
                }
            });
        }
    }

    public final void b(boolean z) {
        C4493y9 c4493y9;
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y92.a(TAG, "load " + this);
        }
        if (z && (c4493y9 = this.i) != null) {
            c4493y9.c(this.G, "Initiating Banner refresh for placement id: " + this.l);
        }
        this.H = z;
        D();
    }

    @Override // com.inmobi.media.InterfaceC4457x0
    public final void a(int i, GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "loadPodAd " + this);
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(renderView)) {
            this.o = i;
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3956e2.a(C3956e2.this);
                    }
                });
                return;
            }
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            String TAG2 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c4493y92.a(TAG2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.a(false);
        }
    }

    public static final void a(C3956e2 c3956e2) {
        C4493y9 c4493y9 = c3956e2.i;
        if (c4493y9 != null) {
            String TAG = c3956e2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "start loading html ad");
        }
        c3956e2.O();
    }

    public static final Unit a(C3956e2 c3956e2, EnumC4069i6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
        C4493y9 c4493y9 = c3956e2.i;
        if (c4493y9 != null) {
            String TAG = c3956e2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.b(TAG, "loadWithRetry error - " + errorCode);
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2123;
                        break;
                    case 13:
                        s = 2124;
                        break;
                    case 14:
                        s = 2125;
                        break;
                    case 15:
                        s = 2126;
                        break;
                    case 16:
                        s = 2127;
                        break;
                }
            } else {
                s = 2229;
            }
            c3956e2.a(inMobiAdRequestStatus, true, s);
            return Unit.INSTANCE;
        }
        s = 2122;
        c3956e2.a(inMobiAdRequestStatus, true, s);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.InterfaceC4457x0
    public final void a(final int i, final GestureDetectorOnGestureListenerC4476xi renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c4493y9.a(TAG, "showPodAdAtIndex " + this + " index - " + i);
        }
        if (!this.s) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c4493y92.b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.h;
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC4476xi != null) {
                gestureDetectorOnGestureListenerC4476xi.b(false);
                return;
            }
            return;
        }
        if (b(i, renderView)) {
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                String TAG3 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c4493y93.b(TAG3, "Cannot show an pod ad with invalid index passed");
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.h;
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) copyOnWriteArrayList2.get(copyOnWriteArrayList2.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC4476xi2 != null) {
                gestureDetectorOnGestureListenerC4476xi2.b(false);
                return;
            }
            return;
        }
        super.a(i, renderView, context);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    C3956e2.a(C3956e2.this, renderView, i);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public void a(Z1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC4038h1 n = n();
        if (n != null) {
            n.a(audioStatusInternal);
        }
        C3985f2 c3985f2 = this.J;
        c3985f2.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!c3985f2.a && audioStatusInternal == Z1.e) {
            c3985f2.a = true;
            C4020g9 c4020g9 = C4020g9.c;
            c4020g9.a = System.currentTimeMillis();
            c4020g9.b++;
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public void a(boolean z) {
        C4020g9 c4020g9 = C4020g9.c;
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "banner_audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", "key");
        int i = a.a.getInt("user_mute_count", 0);
        a.a("user_mute_count", z ? Math.max(0, i - 1) : i + 1, false);
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.AbstractC4528zi
    public final void a(GestureDetectorOnGestureListenerC4476xi renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        if (b != 4 && b != 6) {
            if (b == 7) {
                renderView.a(z, this.b == 7 ? z ? (short) 2224 : (short) 2223 : (short) 2227);
                return;
            }
            return;
        }
        byte b2 = this.b;
        if (b2 == 4) {
            r1 = z ? (short) 2220 : (short) 2219;
        } else if (b2 == 6) {
            r1 = z ? (short) 2222 : (short) 2221;
        }
        K();
        renderView.a(z, r1);
    }
}
