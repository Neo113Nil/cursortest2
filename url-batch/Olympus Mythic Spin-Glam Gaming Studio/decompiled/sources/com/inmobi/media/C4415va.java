package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4415va extends AbstractC4168m1 {
    public int F;
    public boolean G;
    public final C4241ok H;
    public Function0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4415va(Context context, C4431w0 adPlacement, C4467xa c4467xa) {
        super(context, adPlacement, c4467xa);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        this.H = new C4241ok();
        Intrinsics.checkNotNullExpressionValue("va", "TAG");
        long j = adPlacement.a;
        a(context, adPlacement, c4467xa);
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.L();
    }

    public static final void c(C4415va c4415va) {
        c4415va.g(c4415va.n());
    }

    public static final Unit d(C4415va c4415va) {
        c4415va.Z();
        return Unit.INSTANCE;
    }

    public static final void e(C4415va c4415va) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c4415va.O();
        if (c4415va.s) {
            AdSet s = c4415va.s();
            int size = (s == null || (ads = s.getAds()) == null) ? 0 : ads.size();
            for (int i = 1; i < size; i++) {
                c4415va.o++;
                c4415va.O();
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void D() {
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void G() {
        super.G();
        if (!Intrinsics.areEqual(t(), "html") && !Intrinsics.areEqual(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.b == 2) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                c4493y9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.l);
            }
            AbstractC4038h1 n = n();
            if (n != null) {
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("va", "TAG");
                    c4493y92.a("va", "callback - onFetchSuccess");
                }
                c(n);
                return;
            }
            c((short) 2188);
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y93.b("va", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void J() {
        super.J();
        this.F = 0;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void L() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.L();
    }

    public final boolean W() {
        if (F()) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y9.a("va", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC4038h1 n = n();
        if (n == null || h(n)) {
            return false;
        }
        if (4 == this.b) {
            if (!A()) {
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("va", "TAG");
                    c4493y92.a("va", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC4038h1 n2 = n();
                if (n2 == null) {
                    C4493y9 c4493y93 = this.i;
                    if (c4493y93 != null) {
                        c4493y93.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(n2);
                    d(n2);
                }
                return false;
            }
            super.d();
            this.I = null;
        }
        E();
        return true;
    }

    public final int X() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet s = s();
        if (s != null) {
            int podSuccessCount = s.getPodSuccessCount();
            Integer valueOf = Integer.valueOf(podSuccessCount);
            if (podSuccessCount < 1) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        AdSet s2 = s();
        if (s2 != null && (ads = s2.getAds()) != null) {
            int size = ads.size();
            Integer valueOf2 = size > 0 ? Integer.valueOf(size) : null;
            if (valueOf2 != null) {
                return valueOf2.intValue();
            }
        }
        return 1;
    }

    public final void Y() {
        AdConfig adConfig;
        if (Intrinsics.areEqual(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y9.a("va", "renderAd without internet check");
            }
            Z();
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y92.a("va", "renderAd");
        }
        a(new Function0() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4415va.d(C4415va.this);
            }
        }, new Function1() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4415va.a(C4415va.this, (EnumC4069i6) obj);
            }
        });
    }

    public final void Z() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y9.a("va", "renderAdPostInternetCheck");
        }
        super.J();
        this.F = 0;
        try {
            if (N()) {
                return;
            }
            C4326s1 c4326s1 = this.z;
            c4326s1.getClass();
            c4326s1.g = SystemClock.elapsedRealtime();
            String t = t();
            if (!Intrinsics.areEqual(t, "html") && !Intrinsics.areEqual(t, "htmlUrl")) {
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("va", "TAG");
                    c4493y92.a("va", "Cannot handle markupType: " + t());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4415va.e(C4415va.this);
                    }
                });
            }
        } catch (IllegalStateException e) {
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y93.a("va", "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.InterfaceC4457x0
    public final void a(int i, GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    public final void a0() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y9.d("va", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C4326s1 c4326s1 = this.z;
        c4326s1.getClass();
        c4326s1.i = SystemClock.elapsedRealtime();
        Q();
        T();
        this.H.a = true;
        AbstractC4038h1 n = n();
        if (n != null) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y92.a("va", "signaling Success");
            }
            d(n);
        }
    }

    public final short b(Context context) {
        try {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y9.a("va", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            GestureDetectorOnGestureListenerC4476xi container = j();
            if (container == null) {
                return (short) 2155;
            }
            if (Intrinsics.areEqual("unknown", container.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            Intrinsics.checkNotNullParameter(container, "container");
            int hashCode = container.hashCode();
            InMobiAdActivity.t.put(hashCode, container);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            C4493y9 obj = this.i;
            if (obj != null) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                HashMap hashMap = Y8.a;
                String key = uuid.toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(obj, "obj");
                Y8.a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", uuid.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", hashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String t = t();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", Intrinsics.areEqual(t, "html") ? 200 : Intrinsics.areEqual(t, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.s) {
                if (this.q == -1) {
                    this.q = System.currentTimeMillis();
                }
                if (this.o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = AbstractC4002fj.a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return (short) 0;
        } catch (Exception e) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                c4493y92.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
            return (short) 2154;
        }
    }

    public final void b0() {
        MetaInfo metaInfo;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
            c4493y9.c("m1", "submitAdNotReady " + this);
        }
        C4241ok c4241ok = this.H;
        C4326s1 c4326s1 = this.z;
        com.inmobi.media.ads.network.common.model.Ad q = q();
        String creativeType = (q == null || (metaInfo = q.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet s = s();
        Boolean valueOf = s != null ? Boolean.valueOf(s.getIsRewarded()) : null;
        String t = t();
        byte b = this.b;
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        String impressionId = q2 != null ? q2.getImpressionId() : null;
        C4352t0 adNotReadyMetadata = new C4352t0(c4326s1, creativeType, valueOf, t, b, impressionId);
        c4241ok.getClass();
        Intrinsics.checkNotNullParameter(adNotReadyMetadata, "adNotReadyMetadata");
        HashMap hashMap = new HashMap();
        long j = c4326s1.c;
        CoroutineScope coroutineScope = Hl.a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(b == 0 ? (short) 2204 : b == 1 ? (short) 2282 : b == 2 ? (short) 2283 : b == 3 ? (short) 2284 : b == 6 ? (short) 2285 : b == 7 ? (short) 2209 : b == 8 ? (short) 2242 : (short) 2210));
        hashMap.put("markupType", t);
        if (creativeType != null) {
            hashMap.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        if (valueOf != null) {
            hashMap.put("isRewarded", valueOf);
        }
        String a = c4326s1.a();
        if (a.length() > 0) {
            hashMap.put("metadataBlob", a);
        }
        hashMap.put("adType", c4326s1.a.m());
        hashMap.put("networkType", F5.o());
        hashMap.put("plId", Long.valueOf(c4326s1.a.l.a));
        hashMap.put("isAdLoaded", Boolean.valueOf(c4241ok.a));
        String str = c4326s1.a.l.f;
        if (str != null) {
            hashMap.put("plType", str);
        }
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdNotReady", hashMap, EnumC4530zk.a);
    }

    public final void c0() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            c4493y9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.l);
        }
        h();
        a0();
    }

    public final void f(short s) {
        if (this.b == 2) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                c4493y9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public final void g(AbstractC4038h1 abstractC4038h1) {
        if (this.b != 6) {
            if (this.b == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i = this.F + 1;
        this.F = i;
        if (i != 1) {
            c((byte) 7);
            return;
        }
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            c4493y9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.l);
        }
        if (abstractC4038h1 != null) {
            b((byte) 4);
            a(abstractC4038h1);
        }
    }

    public final boolean h(AbstractC4038h1 abstractC4038h1) {
        byte b = this.b;
        if (b == 1) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                c4493y9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b == 7 || b == 6) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                c4493y92.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b != 2) {
            return false;
        }
        if (Intrinsics.areEqual("html", t()) || Intrinsics.areEqual("htmlUrl", t())) {
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                c4493y93.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC4038h1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(Integer.valueOf(i))) {
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) this.h.get(i);
                if (Intrinsics.areEqual(gestureDetectorOnGestureListenerC4476xi != null ? gestureDetectorOnGestureListenerC4476xi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC4476xi, AbstractC4168m1.p(gestureDetectorOnGestureListenerC4476xi));
                    gestureDetectorOnGestureListenerC4476xi.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final String m() {
        return com.safedk.android.analytics.brandsafety.m.w;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void n(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s) {
            V();
        } else if (!a(renderView)) {
            V();
        }
        super.n(renderView);
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final GestureDetectorOnGestureListenerC4476xi r() {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (GestureDetectorOnGestureListenerC4476xi) this.h.get(this.p);
        if (this.G && gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.l();
        }
        return gestureDetectorOnGestureListenerC4476xi;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final byte u() {
        return (byte) 1;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void a(byte[] bArr) {
        if (W()) {
            super.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void m(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        super.m(gestureDetectorOnGestureListenerC4476xi);
        if (!this.s) {
            if (this.b == 2) {
                b((byte) 1);
                c0();
                return;
            }
            return;
        }
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC4476xi);
        if (indexOf < this.p) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y9.a("va", "Ignoring loaded ad with index " + indexOf + " as current rendering index is " + this.p);
                return;
            }
            return;
        }
        this.r.add(Integer.valueOf(indexOf));
        if (this.b == 2) {
            int X = X();
            for (int i = 0; i < X && i < this.h.size(); i++) {
                if (this.h.get(i) == null || !this.r.contains(Integer.valueOf(i))) {
                    return;
                }
            }
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y92.a("va", "Providing success based on index " + indexOf);
            }
            b((byte) 1);
            this.p = 0;
            c0();
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void d() {
        super.d();
        this.I = null;
    }

    public final void a(final C4467xa c4467xa, final Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC4038h1) c4467xa, (Context) activity);
        } else {
            ((ExecutorC4101jc) AbstractC4437w6.e.getValue()).a.post(new Runnable() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    C4415va.a(C4415va.this, c4467xa, activity);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final synchronized void e(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.e(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C4415va.b(C4415va.this);
                }
            });
        }
    }

    public static final void a(C4415va c4415va, AbstractC4038h1 abstractC4038h1, Context context) {
        c4415va.a(abstractC4038h1, context);
    }

    public static final void a(final C4415va c4415va, final GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Context context) {
        final int indexOf = c4415va.h.indexOf(gestureDetectorOnGestureListenerC4476xi);
        CopyOnWriteArrayList list = c4415va.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (indexOf < 0 || indexOf >= list.size()) {
            return;
        }
        short b = c4415va.b(context);
        if (b != 0) {
            c4415va.e(indexOf);
        }
        c4415va.b(indexOf, b == 0);
        Handler handler = c4415va.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    C4415va.a(GestureDetectorOnGestureListenerC4476xi.this, c4415va, indexOf);
                }
            });
        }
    }

    public final void f(AbstractC4038h1 abstractC4038h1) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y9.c("va", "handleAdScreenDismissed " + ((int) this.b));
        }
        if (this.b == 7) {
            int i = this.F - 1;
            this.F = i;
            if (i == 1) {
                c((byte) 6);
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("va", "TAG");
                    c4493y92.d("va", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (this.b == 6 || this.b == 8) {
            this.F--;
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                c4493y93.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.l);
            }
            if (abstractC4038h1 != null) {
                abstractC4038h1.a();
                return;
            }
            C4493y9 c4493y94 = this.i;
            if (c4493y94 != null) {
                c4493y94.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.InterfaceC4457x0
    public final void a(GestureDetectorOnGestureListenerC4476xi renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
            c4493y9.c("m1", "closeCurrentPodAd " + this);
        }
        if (this.s) {
            Integer num = (Integer) this.r.higher(Integer.valueOf(this.h.indexOf(renderView)));
            if (num != null) {
                a(num.intValue(), renderView, activity);
            } else {
                b();
            }
        }
    }

    public final void a(AbstractC4038h1 abstractC4038h1, Context context) {
        if (abstractC4038h1 == null) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                c4493y9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        Function0 function0 = this.I;
        if (function0 != null) {
            function0.mo4828invoke();
            return;
        }
        if (this.b == 8) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y92.b("va", "unload has been called on this ad. Dont show. ");
            }
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            Xb.a((byte) 2, "va", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (this.b == 4) {
            e(abstractC4038h1);
            c((byte) 6);
            if (A()) {
                a((short) 2153);
                c((byte) 0);
                GestureDetectorOnGestureListenerC4476xi j = j();
                if (j != null) {
                    j.b();
                    return;
                }
                return;
            }
            if (context == null) {
                context = o();
            }
            short b = b(context);
            if (b != 0) {
                a(b);
                return;
            } else {
                abstractC4038h1.c();
                return;
            }
        }
        Xb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        C4493y9 c4493y93 = this.i;
        if (c4493y93 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y93.b("va", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        }
        Intrinsics.checkNotNullExpressionValue("va", "TAG");
        Xb.a((byte) 1, "va", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        a((short) 2152);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final synchronized void f(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.f(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    C4415va.c(C4415va.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.InterfaceC4457x0
    public final boolean a(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s) {
            if (((Integer) this.r.higher(Integer.valueOf(this.h.indexOf(renderView)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.Lk
    public final void a(byte b) {
        if (b == 1) {
            if (this.s) {
                if (this.b == 2) {
                    C4493y9 c4493y9 = this.i;
                    if (c4493y9 != null) {
                        Intrinsics.checkNotNullExpressionValue("va", "TAG");
                        c4493y9.b("va", "RenderView time out");
                    }
                    int X = X();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= X) {
                            break;
                        }
                        if (!this.r.contains(Integer.valueOf(i2))) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    a((GestureDetectorOnGestureListenerC4476xi) null, Integer.valueOf(i), 2);
                    i();
                    f();
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b);
            return;
        }
        super.a(b);
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.InterfaceC4457x0
    public final void a(int i, final GestureDetectorOnGestureListenerC4476xi renderView, final Context context) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y9.a("va", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(renderView) && i < this.h.size() && this.h.get(i) != null && ((gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) this.h.get(i)) == null || gestureDetectorOnGestureListenerC4476xi.C0)) {
            if (context == null) {
                context = o();
            }
            super.a(i, renderView, context);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4415va.a(C4415va.this, renderView, context);
                    }
                });
                return;
            }
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y92.a("va", "Cannot show an pod ad with invalid index passed");
        }
        b(this.h.indexOf(renderView), false);
    }

    public static final Unit a(C4415va c4415va, EnumC4069i6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
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
            c4415va.a(inMobiAdRequestStatus, true, s);
            return Unit.INSTANCE;
        }
        s = 2122;
        c4415va.a(inMobiAdRequestStatus, true, s);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4168m1
    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, short s, String failureErrorCode) {
        Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        super.a(gestureDetectorOnGestureListenerC4476xi, s, failureErrorCode);
        if (this.s) {
            int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC4476xi);
            if (indexOf < X()) {
                a(gestureDetectorOnGestureListenerC4476xi, (Integer) null, s == 2137 ? 1 : 3);
                f(s);
            }
            a(indexOf, true);
            return;
        }
        f(s);
    }

    public static final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, C4415va c4415va, int i) {
        gestureDetectorOnGestureListenerC4476xi.m();
        c4415va.a(i, false);
    }

    public static final void a(C4415va c4415va) {
        c4415va.e();
        C4493y9 c4493y9 = c4415va.i;
        if (c4493y9 != null) {
            c4493y9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c4415va.l);
        }
        if (c4415va.n() != null) {
            AbstractC4038h1 n = c4415va.n();
            if (n != null) {
                n.a();
                return;
            }
            return;
        }
        C4493y9 c4493y92 = c4415va.i;
        if (c4493y92 != null) {
            c4493y92.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC4168m1, com.inmobi.media.AbstractC4528zi
    public final void a(GestureDetectorOnGestureListenerC4476xi renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        if (b == 4) {
            final short s = z ? (short) 2220 : (short) 2219;
            this.I = new Function0() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return C4415va.a(C4415va.this, s);
                }
            };
            return;
        }
        if (b != 6) {
            if (b == 7) {
                short s2 = z ? (short) 2224 : (short) 2223;
                Xb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                C4493y9 c4493y9 = this.i;
                if (c4493y9 != null) {
                    Intrinsics.checkNotNullExpressionValue("va", "TAG");
                    c4493y9.b("va", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z, s2);
                renderView.x();
                f(n());
                return;
            }
            return;
        }
        short s3 = z ? (short) 2222 : (short) 2221;
        Xb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y92.b("va", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        renderView.x();
        if (this.F == 0) {
            a(s3);
        } else {
            renderView.a(z, s3);
            f(n());
        }
    }

    public static final Unit a(C4415va c4415va, short s) {
        Xb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C4493y9 c4493y9 = c4415va.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("va", "TAG");
            c4493y9.b("va", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c4415va.a(s);
        c4415va.I = null;
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.InterfaceC4457x0
    public final void b() {
        if (this.s) {
            C4493y9 c4493y9 = this.i;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("va", "TAG");
                c4493y9.a("va", "Closing the ad as closeAll is called");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.va$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4415va.a(C4415va.this);
                    }
                });
            }
        }
    }

    public static final void b(C4415va c4415va) {
        c4415va.f(c4415va.n());
    }
}
