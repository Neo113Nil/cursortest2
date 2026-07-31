package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlOmidTracker;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.video.POBVastError;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.InMobiNetworkBridge;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.core.DivActionHandler;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class GestureDetectorOnGestureListenerC4476xi extends D2 implements C, K2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Wf, Eh {
    public static final C3947di g1 = new C3947di();
    public static final C3921ci h1 = new C3921ci();
    public static final String i1 = GestureDetectorOnGestureListenerC4476xi.class.getSimpleName();
    public static final M1 j1 = new M1(Boolean.FALSE, new Function0() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return Boolean.valueOf(GestureDetectorOnGestureListenerC4476xi.y());
        }
    }, false, true);
    public String A;
    public final GestureDetector A0;
    public Jc B;
    public final Uk B0;
    public boolean C;
    public boolean C0;
    public JSONObject D;
    public boolean D0;
    public JSONObject E;
    public C3909c6 E0;
    public boolean F;
    public InterfaceC3857a6 F0;
    public boolean G;
    public String G0;
    public boolean H;
    public Vf H0;
    public boolean I;
    public M0 I0;
    public EnumC4061ho J;
    public final AtomicBoolean J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public U L0;
    public String M;
    public String M0;
    public final AtomicBoolean N;
    public boolean N0;
    public final Object O;
    public Wo O0;
    public final Object P;
    public boolean P0;
    public boolean Q;
    public Map Q0;
    public final boolean R;
    public final C4055hi R0;
    public View S;
    public final C4449wi S0;
    public WebChromeClient.CustomViewCallback T;
    public String T0;
    public int U;
    public final C4186mi U0;
    public boolean V;
    public final C4081ii V0;
    public boolean W;
    public final C4001fi W0;
    public boolean X0;
    public L4 Y0;
    public D8 Z0;
    public long a0;
    public boolean a1;
    public final byte b;
    public String b0;
    public C4423vi b1;
    public final Set c;
    public final AtomicBoolean c0;
    public S8 c1;
    public String d;
    public ViewTreeObserver.OnGlobalLayoutListener d0;
    public final C4291qi d1;
    public final boolean e;
    public Hi e0;
    public final C3895bi e1;
    public String f;
    public final Lazy f0;
    public Uo f1;
    public volatile long g;
    public C4395ug g0;
    public final Bi h;
    public final Lazy h0;
    public final InterfaceC4466x9 i;
    public String i0;
    public final Yi j;
    public Map j0;
    public final Jo k;
    public J2 k0;
    public final C4221o0 l;
    public C l0;
    public final AdConfig m;
    public boolean m0;
    public volatile boolean n;
    public InterfaceC4457x0 n0;
    public volatile boolean o;
    public AbstractC4008fo o0;
    public volatile boolean p;
    public final boolean p0;
    public InterfaceC4315rg q;
    public int q0;
    public byte r;
    public String r0;
    public final Fj s;
    public int[] s0;
    public final Lazy t;
    public long t0;
    public WeakReference u;
    public int u0;
    public WeakReference v;
    public final C4029gi v0;
    public WeakReference w;
    public final C4133ki w0;
    public AbstractC4528zi x;
    public int x0;
    public final Mutex y;
    public int y0;
    public volatile Job z;
    public Bc z0;

    public /* synthetic */ GestureDetectorOnGestureListenerC4476xi(Context context, byte b, LinkedHashSet linkedHashSet, String str, String str2, long j, Bi bi, InterfaceC4466x9 interfaceC4466x9, Yi yi, Jo jo, C4221o0 c4221o0, AdConfig adConfig, int i) {
        this(context, b, (i & 4) != 0 ? null : linkedHashSet, (i & 8) != 0 ? null : str, (i & 16) == 0, (i & 32) != 0 ? "DEFAULT" : str2, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? null : bi, interfaceC4466x9, yi, jo, c4221o0, adConfig);
    }

    public static final TelemetryConfig.LandingPageConfig A() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return ((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getLpConfig();
    }

    public static final C4344sj c(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        return new C4344sj(gestureDetectorOnGestureListenerC4476xi.k, gestureDetectorOnGestureListenerC4476xi.i);
    }

    public static final Unit f() {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.D();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.h0.getValue();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraid();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final Kk getScrollThrottler() {
        return (Kk) this.f0.getValue();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public static final short m(String str) {
        Intrinsics.checkNotNull(str);
        return Short.parseShort(str);
    }

    private final void setAdSize(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setAdSize " + this);
        }
        T5 t5 = R5.a;
        this.q0 = (int) (R5.b() * Integer.parseInt(((String[]) new Regex(VastAttributes.HORIZONTAL_POSITION).split(str, 0).toArray(new String[0]))[0]));
        this.t0 = ((int) (R5.b() * Integer.parseInt(((String[]) new Regex(VastAttributes.HORIZONTAL_POSITION).split(str, 0).toArray(new String[0]))[1]))) * this.q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setOmidViewableAd(Vk trackerAttr) {
        boolean z;
        String str;
        AdSessionContext createHtmlAdSessionContext;
        Jf jf = null;
        jf = null;
        jf = null;
        if (this.a1) {
            D8 d8 = this.Z0;
            if (d8 != null) {
                AbstractC4008fo viewableAd = this.o0;
                Intrinsics.checkNotNull(viewableAd);
                String str2 = this.r0;
                Intrinsics.checkNotNullParameter(this, "adContainer");
                Intrinsics.checkNotNullParameter(viewableAd, "viewableAd");
                Intrinsics.checkNotNullParameter(trackerAttr, "trackerAttr");
                Context context = (Context) d8.h.get();
                if (context != null) {
                    d8.i = getAdConfig().getViewability().getOmidConfig().getOmidEnabled();
                    CoroutineScope coroutineScope = d8.d;
                    Oe oe = new Oe(d8.d, d8.c);
                    HashMap hashMap = trackerAttr.b;
                    Object obj = hashMap.get("customReferenceData");
                    String str3 = obj instanceof String ? (String) obj : null;
                    Object obj2 = hashMap.get("isolateVerificationScripts");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    Object obj3 = hashMap.get("macros");
                    Map map = obj3 instanceof Map ? (Map) obj3 : null;
                    List<HtmlOmidTracker> omidTrackers = d8.a.getOmidTrackers();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(omidTrackers, 10));
                    for (Iterator it = omidTrackers.iterator(); it.hasNext(); it = it) {
                        HtmlOmidTracker htmlOmidTracker = (HtmlOmidTracker) it.next();
                        arrayList.add(new Nf(htmlOmidTracker.getVendor(), htmlOmidTracker.getVerificationParams(), htmlOmidTracker.getUrl()));
                    }
                    Mf mf = new Mf(context, this, viewableAd, coroutineScope, oe, new C4518z8(arrayList, map == null ? MapsKt.emptyMap() : map, str3 == null ? "" : str3, str2, Intrinsics.areEqual(bool, Boolean.TRUE)), d8.c);
                    d8.p = mf;
                    jf = mf;
                }
            }
        } else {
            Object obj4 = trackerAttr.b.get("omidAdSession");
            InterfaceC4011g1 interfaceC4011g1 = obj4 instanceof InterfaceC4011g1 ? (InterfaceC4011g1) obj4 : null;
            if (trackerAttr.b.containsKey("deferred")) {
                Object obj5 = trackerAttr.b.get("deferred");
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj5).booleanValue()) {
                    z = true;
                    Object obj6 = trackerAttr.b.get("customReferenceData");
                    str = !(obj6 instanceof String) ? (String) obj6 : null;
                    if (z && interfaceC4011g1 != null) {
                        String str4 = this.r0;
                        Sf sf = Rf.a;
                        sf.getClass();
                        Intrinsics.checkNotNullParameter(this, "webView");
                        createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(sf.b, this, str4, str);
                        Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                        C4473xf c4473xf = (C4473xf) interfaceC4011g1;
                        if (createHtmlAdSessionContext != null) {
                            c4473xf.c = createHtmlAdSessionContext;
                        }
                    }
                    if (interfaceC4011g1 != null) {
                        AbstractC4008fo abstractC4008fo = this.o0;
                        Intrinsics.checkNotNull(abstractC4008fo);
                        jf = new Jf(this, abstractC4008fo, interfaceC4011g1, this.i);
                    }
                }
            }
            z = false;
            Object obj62 = trackerAttr.b.get("customReferenceData");
            if (!(obj62 instanceof String)) {
            }
            if (z) {
                String str42 = this.r0;
                Sf sf2 = Rf.a;
                sf2.getClass();
                Intrinsics.checkNotNullParameter(this, "webView");
                createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(sf2.b, this, str42, str);
                Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                C4473xf c4473xf2 = (C4473xf) interfaceC4011g1;
                if (createHtmlAdSessionContext != null) {
                }
            }
            if (interfaceC4011g1 != null) {
            }
        }
        if (jf != null) {
            this.o0 = jf;
            return;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).b(TAG, this.a1 ? "Failed to create OMID tracked hybrid video ad." : "Did not find a OMID ad session; the IAB decorator will not be applied.");
        }
    }

    public static final boolean y() {
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNull(context);
        Qa a = Pa.a(context, "default");
        Intrinsics.checkNotNullParameter("enableImraidLogs", "key");
        return a.a.getBoolean("enableImraidLogs", false);
    }

    public final void B() {
        Activity activity;
        if (getPlacementType() == 0) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            toString();
            if (((Activity) this.v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                Intrinsics.checkNotNullParameter(this, "<this>");
                int i = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                    i++;
                }
                if (activity != null) {
                    this.v = new WeakReference(activity);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public void C() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onImpressionFired " + this);
        }
        F();
        D8 d8 = this.Z0;
        if (d8 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = d8.j;
            Mf mf = d8.p;
            if (mf != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    Oe oe = mf.e;
                    if (oe != null) {
                        oe.a(skipOffset, autoplay);
                    }
                } else {
                    Oe oe2 = mf.e;
                    if (oe2 != null) {
                        oe2.a(autoplay);
                    }
                }
                Oe oe3 = mf.e;
                if (oe3 != null) {
                    if (oe3.e == null) {
                        InterfaceC4466x9 interfaceC4466x92 = oe3.b;
                        if (interfaceC4466x92 != null) {
                            ((C4493y9) interfaceC4466x92).a(AbstractC3984f1.f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        InterfaceC4466x9 interfaceC4466x93 = oe3.b;
                        if (interfaceC4466x93 != null) {
                            ((C4493y9) interfaceC4466x93).a(AbstractC3984f1.f, "registerImpression");
                        }
                        X4.a(oe3.a, new C3852a1(oe3, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onUserLandingCompleted " + this);
        }
        h("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "processUnload " + this);
        }
        if (this.N.get()) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).b(TAG2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            InterfaceC4466x9 interfaceC4466x93 = this.i;
            if (interfaceC4466x93 != null) {
                String TAG3 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C4493y9) interfaceC4466x93).b(TAG3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.D0) {
            InterfaceC4466x9 interfaceC4466x94 = this.i;
            if (interfaceC4466x94 != null) {
                String TAG4 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C4493y9) interfaceC4466x94).b(TAG4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.P0) {
            return;
        }
        this.P0 = true;
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC4476xi.a(GestureDetectorOnGestureListenerC4476xi.this);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    public final void F() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "recordContextualData " + this);
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.a();
        }
    }

    public final void G() {
        String str;
        C4431w0 c4431w0;
        String str2;
        String str3;
        String str4;
        C4431w0 c4431w02;
        String str5;
        C4299r1 c4299r1;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "sendTelemetryEventForNetworkLoad " + this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(this.C0 ? (short) 2212 : (short) 2211));
        Bi bi = this.h;
        if (bi != null && (c4299r1 = bi.j) != null) {
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c4299r1.a.c));
        }
        Bi bi2 = this.h;
        if (bi2 != null && (c4431w02 = bi2.a) != null && (str5 = c4431w02.f) != null) {
            linkedHashMap.put("plType", str5);
        }
        Bi bi3 = this.h;
        if (bi3 != null && (str4 = bi3.f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        Bi bi4 = this.h;
        if (bi4 != null && (str3 = bi4.b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        Bi bi5 = this.h;
        if (bi5 != null && (c4431w0 = bi5.a) != null && (str2 = c4431w0.e) != null) {
            linkedHashMap.put("adType", str2);
        }
        Bi bi6 = this.h;
        if (bi6 != null && (str = bi6.d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        Bi bi7 = this.h;
        if (bi7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(bi7.h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void H() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setCurrentPosition " + this);
        }
        this.E = new JSONObject();
        getLocationOnScreen(new int[2]);
        try {
            JSONObject jSONObject = this.E;
            if (jSONObject != null) {
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, N3.b(r0[0] / R5.b()));
            }
            JSONObject jSONObject2 = this.E;
            if (jSONObject2 != null) {
                jSONObject2.put(VastAttributes.VERTICAL_POSITION, N3.b(r0[1] / R5.b()));
            }
            int b = N3.b(getWidth() / R5.b());
            int b2 = N3.b(getHeight() / R5.b());
            JSONObject jSONObject3 = this.E;
            if (jSONObject3 != null) {
                jSONObject3.put("width", b);
            }
            JSONObject jSONObject4 = this.E;
            if (jSONObject4 != null) {
                jSONObject4.put("height", b2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.P) {
            this.G = false;
            this.P.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.D = new JSONObject();
        if (this.w == null) {
            ViewParent parent = getParent();
            this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.w;
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.D;
                if (jSONObject != null) {
                    jSONObject.put(VastAttributes.HORIZONTAL_POSITION, N3.b(iArr[0] / R5.b()));
                }
                JSONObject jSONObject2 = this.D;
                if (jSONObject2 != null) {
                    jSONObject2.put(VastAttributes.VERTICAL_POSITION, N3.b(iArr[1] / R5.b()));
                }
                WeakReference weakReference3 = this.w;
                int b = N3.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / R5.b());
                WeakReference weakReference4 = this.w;
                int b2 = N3.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / R5.b());
                JSONObject jSONObject3 = this.D;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", b);
                }
                JSONObject jSONObject4 = this.D;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", b2);
                }
            } catch (JSONException unused) {
                Unit unit = Unit.INSTANCE;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.D;
                if (jSONObject5 != null) {
                    jSONObject5.put(VastAttributes.HORIZONTAL_POSITION, 0);
                }
                JSONObject jSONObject6 = this.D;
                if (jSONObject6 != null) {
                    jSONObject6.put(VastAttributes.VERTICAL_POSITION, 0);
                }
                JSONObject jSONObject7 = this.D;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.D;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                Unit unit2 = Unit.INSTANCE;
            }
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            Unit unit3 = Unit.INSTANCE;
        }
    }

    public final void J() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setFallbackImpressionMinPercentageViewed " + this);
        }
        this.y0 = Intrinsics.areEqual("video", this.G0) ? getAdConfig().getViewability().getVideoImpressionMinPercentageViewed() : Intrinsics.areEqual("audio", this.G0) ? Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final void K() {
        this.x0 = Intrinsics.areEqual("video", this.G0) ? getAdConfig().getViewability().getVideoImpressionMinTimeViewed() : Intrinsics.areEqual("audio", this.G0) ? Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
    }

    public final void L() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setFallbackImpressionParams " + this);
        }
        K();
        J();
        M();
    }

    public final void M() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setFallbackImpressionType " + this);
        }
        String adType = getAdType();
        this.r = Intrinsics.areEqual(adType, "banner") ? getAdConfig().getViewability().getBannerImpressionType() : Intrinsics.areEqual(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
    }

    public final void N() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setImpressionParams " + this);
        }
        if (this.c == null) {
            L();
            return;
        }
        try {
            L();
            for (Vk vk : this.c) {
                if (vk.a == 2) {
                    if (vk.b.containsKey("type")) {
                        Object obj = vk.b.get("type");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.r = (byte) ((Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (vk.b.containsKey("time")) {
                        Object obj2 = vk.b.get("time");
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.x0 = ((Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (vk.b.containsKey("view")) {
                        Object obj3 = vk.b.get("view");
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.y0 = ((Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.r == 2) {
                        if (vk.b.containsKey("pixel")) {
                            Object obj4 = vk.b.get("pixel");
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.u0 = ((Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (vk.b.containsKey("frame")) {
                            Object obj5 = vk.b.get("frame");
                            this.s0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).b(TAG2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (Exception unused2) {
            InterfaceC4466x9 interfaceC4466x93 = this.i;
            if (interfaceC4466x93 != null) {
                String TAG3 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C4493y9) interfaceC4466x93).b(TAG3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setIsViewHardwareAccelerated " + this);
        }
        this.C = isHardwareAccelerated();
    }

    public final void P() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "skipFromInterActive " + this);
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.h();
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "skipFromInterActive");
        }
    }

    public final void Q() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "startTrackingAudioVolume " + this);
        }
        if (!z() || this.e) {
            return;
        }
        C4272q c4272q = C4272q.a;
        C4029gi listener = this.v0;
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(C4272q.g, null, null, new C4140l(interfaceC4466x92, listener, null), 3, null);
    }

    public final void R() {
        Set linkedHashSet;
        Set<View> keySet;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "startTrackingExposure " + this);
        }
        if (!z() || this.e) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).b(TAG2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (keySet = friendlyViews.keySet()) == null || (linkedHashSet = CollectionsKt.toMutableSet(keySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            this.L0 = new U(this, linkedHashSet, getAdConfig().getMraid3().getExposureChangeInterval(), this.w0, this.i);
        }
        U u = this.L0;
        if (u != null) {
            u.a();
        }
    }

    public final void S() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "stopTrackingAudioVolume " + this);
        }
        C4272q c4272q = C4272q.a;
        C4029gi listener = this.v0;
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(C4272q.g, null, null, new C4193n(interfaceC4466x92, listener, null), 3, null);
    }

    public final void T() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "stopTrackingExposure " + this);
        }
        U u = this.L0;
        if (u != null) {
            u.b();
        }
    }

    public final void U() {
        new G3(this, !this.H, !this.K, this.i).a(this.f1);
    }

    public final long V() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "timeSincePodShow " + this);
        }
        InterfaceC4457x0 interfaceC4457x0 = this.n0;
        if (interfaceC4457x0 != null) {
            return ((AbstractC4168m1) interfaceC4457x0).U();
        }
        return 0L;
    }

    public final void W() {
        getListener().e(this);
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "ad dismissed");
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a();
        }
        M0 m0 = this.I0;
        if (m0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            m0 = null;
        }
        if (m0.d.get()) {
            m0.a("session end is already triggered");
            return;
        }
        if (!m0.a.getEnabled()) {
            m0.a("config kill switch - false. ad quality will skip");
        } else if (m0.g == null) {
            m0.a("setup not done. ignore trigger");
        } else {
            m0.d.set(true);
            m0.a(false);
        }
    }

    public final void X() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "unregisterBackButtonPressedEventListener " + this);
        }
        this.M = null;
    }

    public final void Y() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "updateActivitiesOrientationProperties " + this);
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Vf orientationProperties = this.H0;
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        X8 x8 = ((InMobiAdActivity) activity).a;
        if (x8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
            x8 = null;
        }
        x8.a(orientationProperties);
    }

    public final void a(Bc movementGestureDetector) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            JSONArray jSONArray = movementGestureDetector.j;
            Integer valueOf = jSONArray != null ? Integer.valueOf(jSONArray.length()) : null;
            ((C4493y9) interfaceC4466x92).a(TAG2, StringsKt.trimIndent("onPanDetected\n " + valueOf + " \n " + movementGestureDetector.j));
        }
        h("window.imraidview.onGestureDetected('2', '" + movementGestureDetector.j + "');");
    }

    public final void b(Bc rotationDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(rotationDetector, "rotationDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, StringsKt.trimIndent(" Rotation detected " + rotationDetector.i + " \n " + initialEvent + " \n " + endEvent));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(initialEvent.getX())), Integer.valueOf(N3.c(initialEvent.getY()))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(initialEvent.getX(1))), Integer.valueOf(N3.c(initialEvent.getY(1)))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(endEvent.getX())), Integer.valueOf(N3.c(endEvent.getY()))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(endEvent.getX(1))), Integer.valueOf(N3.c(endEvent.getY(1)))})));
        h("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void d(boolean z) {
        EnumC4061ho enumC4061ho = z ? EnumC4061ho.c : EnumC4061ho.b;
        if (this.J != enumC4061ho) {
            if (!this.Q) {
                this.J = enumC4061ho;
                if (z) {
                    getListener().i(this);
                }
                c(z);
                M0 m0 = this.I0;
                if (m0 != null) {
                    EnumC4061ho adViewableStatus = this.J;
                    Intrinsics.checkNotNullParameter(adViewableStatus, "adViewableStatus");
                    m0.h = adViewableStatus;
                }
                p();
            }
            D8 d8 = this.Z0;
            if (d8 == null || d8.g.get() || !D8.a(d8, new A8[]{A8.c, A8.e, A8.f}, null, null, null, 14) || d8.l == z) {
                return;
            }
            d8.l = z;
            if (!z) {
                if (!d8.g.get() && d8.k.p.isPlaying()) {
                    d8.k.f();
                    V7 v7 = d8.k;
                    Jg state = Jg.e;
                    v7.getClass();
                    Intrinsics.checkNotNullParameter(state, "state");
                    v7.t = state;
                    return;
                }
                return;
            }
            if (d8.g.get()) {
                return;
            }
            V7 v72 = d8.k;
            if (v72.t == Jg.e) {
                v72.e();
                V7 v73 = d8.k;
                Jg state2 = Jg.d;
                v73.getClass();
                Intrinsics.checkNotNullParameter(state2, "state");
                v73.t = state2;
            }
        }
    }

    @Override // com.inmobi.media.D2, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/xi;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, motionEvent);
        return safedk_xi_dispatchTouchEvent_b3b2cfe26c6e9f1be3c98ee225afc147(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        C4502yi c4502yi;
        if (this.e) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            C3909c6 c3909c6 = new C3909c6("IN_CUSTOM_BROWSER", new Function0() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return GestureDetectorOnGestureListenerC4476xi.f();
                }
            }, new Function1() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC4476xi.a((JSONObject) obj);
                }
            }, new Function2() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GestureDetectorOnGestureListenerC4476xi.a((String) obj, (Map) obj2);
                }
            }, this.i, this.c1, getAdConfig().getCustomBrowser().getInt().getLoadCompletionDeBounce());
            this.E0 = c3909c6;
            c4502yi = c3909c6;
        } else {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).c(TAG2, "view is ad. Using RenderViewClient");
            }
            C4502yi c4502yi2 = new C4502yi(this.e0, this.i, new Function1() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC4476xi.a(GestureDetectorOnGestureListenerC4476xi.this, ((Boolean) obj).booleanValue());
                }
            });
            String adType = getAdType();
            c4502yi2.b = Intrinsics.areEqual(adType, "banner") ? getAdConfig().getRendering().getBannerNetworkLoadsLimit() : Intrinsics.areEqual(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            c4502yi = c4502yi2;
        }
        setWebViewClient(c4502yi);
    }

    public final void g() {
        String TAG = i1;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        Job job = this.z;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.z = null;
    }

    @NotNull
    public AdConfig getAdConfig() {
        return this.m;
    }

    @Nullable
    public final C4221o0 getAdMetaData() {
        return this.l;
    }

    @Nullable
    public final InterfaceC4457x0 getAdPodHandler() {
        return this.n0;
    }

    @NotNull
    public final M0 getAdQualityManager() {
        M0 m0 = this.I0;
        if (m0 != null) {
            return m0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
        return null;
    }

    @Nullable
    public String getAdType() {
        return this.i0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.m0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    @NotNull
    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.v;
    }

    @Nullable
    public final String getBeaconUrl() {
        return this.M0;
    }

    @NotNull
    public final Uo getCloseAssetArea() {
        return this.f1;
    }

    public final long getConfiguredArea() {
        return this.t0;
    }

    @NotNull
    public Context getContainerContext() {
        Activity activity = (Activity) this.u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Nullable
    public final String getContentURL() {
        return this.r0;
    }

    @Nullable
    public final L4 getContextualDataHandler() {
        return this.Y0;
    }

    @NotNull
    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    @Nullable
    public String getCreativeId() {
        return this.b0;
    }

    @NotNull
    public final String getCurrentPosition() {
        String jSONObject;
        JSONObject jSONObject2 = this.E;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    @NotNull
    public final Object getCurrentPositionMonitor() {
        return this.P;
    }

    @WorkerThread
    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC4457x0 interfaceC4457x0 = this.n0;
        if (interfaceC4457x0 != null) {
            return ((AbstractC4168m1) interfaceC4457x0).l(this);
        }
        return 0;
    }

    @Nullable
    public Object getDataModel() {
        return null;
    }

    @NotNull
    public final String getDefaultPosition() {
        String jSONObject;
        JSONObject jSONObject2 = this.D;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    @NotNull
    public final Object getDefaultPositionMonitor() {
        return this.O;
    }

    @Nullable
    public final InterfaceC3857a6 getEmbeddedBrowserJsCallbacks() {
        return this.F0;
    }

    @Nullable
    public final U getExposureTracker() {
        return this.L0;
    }

    @Nullable
    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.j0;
    }

    @Nullable
    public final Activity getFullScreenActivity() {
        return (Activity) this.u.get();
    }

    @NotNull
    public B getFullScreenEventsListener() {
        return this.d1;
    }

    @Nullable
    public String getImpressionId() {
        return this.d;
    }

    public final byte getImpressionType() {
        return this.r;
    }

    @Nullable
    public final S8 getInAppActivityBrowserClientListener() {
        return this.c1;
    }

    @NotNull
    public final String getLandingScheme() {
        return this.f;
    }

    @NotNull
    public final AbstractC4528zi getListener() {
        AbstractC4528zi abstractC4528zi = this.x;
        if (abstractC4528zi != null) {
            return abstractC4528zi;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "listener getter " + this);
        }
        C3921ci c3921ci = h1;
        this.x = c3921ci;
        return c3921ci;
    }

    @Nullable
    public final String getMCreativeType() {
        return this.G0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.y0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.x0;
    }

    @Nullable
    public final AbstractC4008fo getMViewableAd() {
        return this.o0;
    }

    @NotNull
    public String getMarkupType() {
        return this.T0;
    }

    @NotNull
    public final String getMarkupTypeAdUnit() {
        return this.T0;
    }

    @Nullable
    public final Jc getMediaProcessor() {
        return this.B;
    }

    public final int getMinimumPixelsPainted() {
        return this.u0;
    }

    @NotNull
    public final String getMraidJsString() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "mraidJsString getter " + this);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "mraid_js_store");
        Intrinsics.checkNotNullParameter("mraid_js_string", "key");
        Intrinsics.checkNotNullParameter("mraid_js_string", "key");
        String string = a.a.getString("mraid_js_string", null);
        if (string == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).a(TAG2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(e){}};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,\ne=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(b){try{b.apply({},a)}catch(d){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var e=this.listeners;e[c]||(e[c]=new EventListeners(c));e[c].broadcast(b)}catch(d){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(b){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(b);return!1};a.popupBlocked=function(b){a.firePopupBlockedBeacon(b)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nb.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(d){imraidview.showAlert(\"setOrientationProperties: \"+d+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"open: \"+b)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var b=\"\";null!=a&&(b=a);try{sdkController.playVideo(\"window.mraidview\",b)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===\ntypeof JSON){var d=\"\",c;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(c=0;c<b.length;c++)0<c&&(d+=\",\"),d+=a.stringifyArg(b[c]);return d+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(a){var b,c,f;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(f in a)null!==a[f]&&(c||(b+=\",\"),b=b+'\"'+f+'\":',c=typeof a[f],b=\"number\"===c||\"boolean\"===c?b+a[f]:\"function\"===typeof a[f]?b+'\"\"':a[f]instanceof\nObject?b+this.stringify(args[i][f]):b+'\"'+a[f]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var b;switch(a.orientation){case 0:case 180:b=\"portrait\";break;case 90:case 270:b=\"landscape\";break;default:b=\"none\"}return{orientation:b,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(k){imraidview.showAlert(\"executeNativesetExpandProperties: \"+k+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(b){var c,k;try{c=parseInt(b.width);k=parseInt(b.height);if(isNaN(c)||isNaN(k)||1>c||1>k)throw\"Invalid\";b.width=c;b.height=k;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(f){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",f=0;f<b;f++)c+=a[f];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0);\"function\"===typeof b.iosBannerExposureChange&&b.iosBannerExposureChange(a)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=\nfunction(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(c){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=\na.getState())&&a.useCustomClose(c.useCustomClose),window.mraid.broadcastEvent(\"error\",\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(c))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):\n(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),b.expand(a))}catch(c){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=function(){try{1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};\na.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=\nb.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+c+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var d=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var d=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var d={name:\"timeupdate\",target:{}};d.target.currentTime=b;d.target.duration=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+a;d.width=b;d.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+\na;d.width=b;d.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(a,b,c){var d={name:\"close\"};d.viaUserInteraction=b;d.target={};d.target.currentTime=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.fireMediaVolumeChangeEvent=function(a,b,c){var d={name:\"volumechange\",target:{}};d.target.volume=b;d.target.muted=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",\nb)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,d=\"\",e=0;e<c;e++)d+=b[e];return parseInt(d)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,d,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.openInlineInstaller=function(b,c,d){try{\"undefined\"==typeof b&&(b=null),\"undefined\"==typeof d&&(d=null),sdkController.openInlineInstaller(\"window.imraidview\",\nb,c,d)}catch(e){a.showAlert(\"openInlineInstaller: \"+e)}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==a||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(d){}};\na.customExpand=function(b,c,d,e,f){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):void 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,d,e,f)}catch(k){a.showAlert(\"executeNativeCustomExpand: \"+\nk+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=\nfunction(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",a)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,\nvoid 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=c&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(d){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=\nfunction(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=mraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+d)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};\na.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"loadWebView: \"+d)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=\nfunction(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"sendMessage: \"+d)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===\ntypeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):sdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):\nsdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};var e=function(){try{var a=window.mraidview.getSdkVersionInt();return 1110===a||1111===a}catch(b){return!1}},d=0,k=function(a,b){var c=Number(a);return!isNaN(c)&&\nisFinite(c)?Math.round(c*b):a};a.createVideoPlayer=function(b){try{if(!(0<d))try{d=\"number\"===typeof window.devicePixelRatio&&0<window.devicePixelRatio?window.devicePixelRatio:1}catch(c){d=1}if(e())try{var f=b.config;\"undefined\"!==typeof f.playbackUpdateInterval&&null!==f.playbackUpdateInterval&&(f.playbackInterval=f.playbackUpdateInterval);var g=f.videoViewPosition;null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==typeof g.x&&null!==g.x)&&(g.x=k(g.x,d));null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==\ntypeof g.y&&null!==g.y)&&(g.y=k(g.y,d))}catch(l){a.showAlert(\"applyCreateVideoPlayerContractPatch: \"+l)}h();n();sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(r){a.showAlert(\"createVideoPlayer: \"+r)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,d){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");\nsdkController.executeVideoPlayerActions(\"window.imraidview\",b,JSON.stringify(d))}catch(e){a.showAlert(\"executeVideoPlayerActions: \"+e)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{l(),sdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}};var f=null,g=!1,h=function(){if(!g&&e())try{f=window.imraid.broadcastEvent,\nwindow.imraid.broadcastEvent=function(b){try{if(1<arguments.length&&\"VideoPlayerPosition\"===arguments[0]&&window.mraidview){var c=arguments[1];c&&(\"undefined\"!==typeof c.x&&null!==c.x)&&(c.x=k(c.x,1/d));c&&(\"undefined\"!==typeof c.y&&null!==c.y)&&(c.y=k(c.y,1/d))}if(\"function\"===typeof f)return f.apply(this,arguments)}catch(e){a.showAlert(\"originalBroadcastEvent failed: \"+e)}},g=!0}catch(b){l(),a.showAlert(\"Registering listener failed: \"+b)}},l=function(){try{g&&(window.imraid.broadcastEvent=f,f=null,\ng=!1)}catch(b){a.showAlert(\"Unregistering listener failed: \"+b)}},n=function(){try{if(window.imraid&&!(\"function\"!==typeof window.imraid.addEventListener||\"function\"!==typeof window.imraid.broadcastEvent)&&!window.imraid.__videoErrorRelaysRegistered)window.imraid.addEventListener(\"VideoPlaybackError\",function(b){try{window.imraid.broadcastEvent(\"error\",{command:\"VideoPlayerError\",errorCode:b&&b.errorCode},\"VideoPlaybackError\")}catch(c){a.showAlert(\"VideoPlaybackError relay failed: \"+c)}}),window.imraid.addEventListener(\"VideoCommandError\",\nfunction(b){try{window.imraid.broadcastEvent(\"error\",{command:b&&b.jsCommand,errorMsg:b&&b.errorMessage},\"VideoCommandError\")}catch(c){a.showAlert(\"VideoCommandError relay failed: \"+c)}}),window.imraid.__videoErrorRelaysRegistered=!0}catch(b){a.showAlert(\"registerVideoErrorRelays failed: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,f){var g=arguments.length,h,l=null;if(3>g){if(\"function\"===typeof arguments[g-1])h=arguments[g-1];else return;l={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],l={reason:11,url:arguments[1]});\"function\"!==!h&&(l?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(l))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,f)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,e,g){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,e,g)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.openInlineInstaller=b.openInlineInstaller;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=\nb.impressionFired;a.getImraidVersion=b.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=\nb.showWebView;a.sendMessage=b.sendMessage;a.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}try{a.addEventListener(\"orientationChange\",\nfunction(a){\"function\"===typeof b.fireSafeAreaChangeEventOnOrientationChange&&b.fireSafeAreaChangeEventOnOrientationChange(a)})}catch(e){b&&\"function\"===typeof b.log&&b.log(\"orientationChange listener registration failed: \"+e)}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(a){try{\"number\"===typeof a&&Number.isFinite(a)&&1120<=getSdkVersionInt()?sdkController.fireAdFailed(\"window.imaiview\",a):sdkController.fireAdFailed(\"window.imaiview\")}catch(c){sdkController.fireAdFailed(\"window.imaiview\")}};\na.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(k){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,h=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(s){n=\nl=0}imIsObjValid(k)?imIsObjValid(d)?(m=k.url,q=k.fallbackUrl,p=k.urlType,f=d.url,g=d.pingWV,h=d.fr):(m=k.url,p=k.urlType):(m=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=!0;if(0>g||1<g)g=!0;if(\"number\"!=typeof p||null==p)p=0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,h):b.ping(f,h):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(f)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==d?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(t){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,h=null,l=null,n=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(d)&&(f=d.url,g=d.pingWV,h=d.fr);try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=\n!0;if(0>g||1<g)g=!0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,h):b.ping(f,h):b.log(\"clickurl provided is null.\");b.onUserInteraction(k)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        InterfaceC4466x9 interfaceC4466x93 = this.i;
        if (interfaceC4466x93 != null) {
            String TAG3 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C4493y9) interfaceC4466x93).a(TAG3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    @NotNull
    public final Vf getOrientationProperties() {
        return this.H0;
    }

    public final long getPlacementId() {
        return this.a0;
    }

    public byte getPlacementType() {
        return this.b;
    }

    @Nullable
    public final HtmlVideoPlaybackState getPlaybackState() {
        D8 d8 = this.Z0;
        if (d8 == null) {
            return null;
        }
        if (d8.g.get()) {
            return new HtmlVideoPlaybackState();
        }
        if (d8.q.get() == A8.a) {
            EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
            d8.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return d8.k.a();
    }

    @Nullable
    public C getReferenceContainer() {
        return this.l0;
    }

    @Nullable
    public final Hi getRenderViewTelemetry() {
        return this.e0;
    }

    @WorkerThread
    @NotNull
    public final JSONArray getRenderableAdIndexes() {
        InterfaceC4457x0 interfaceC4457x0 = this.n0;
        return interfaceC4457x0 != null ? ((AbstractC4168m1) interfaceC4457x0).w() : new JSONArray();
    }

    @NotNull
    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    @NotNull
    public final Yi getRoute() {
        return this.j;
    }

    @Nullable
    public final JSONObject getSafeArea() {
        Wo wo = this.O0;
        if (wo != null) {
            Integer f = R5.f();
            Vo vo = (f == null && (f = R5.g) == null) ? null : (Vo) wo.d.get(f);
            if (vo != null) {
                return vo.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.N0;
    }

    @WorkerThread
    public final long getShowTimeStamp() {
        InterfaceC4457x0 interfaceC4457x0 = this.n0;
        if (interfaceC4457x0 != null) {
            return ((AbstractC4168m1) interfaceC4457x0).x();
        }
        return 0L;
    }

    @NotNull
    public final C4344sj getSiblingWebviewManager() {
        return (C4344sj) this.t.getValue();
    }

    @Nullable
    public Map<String, C4326s1> getTelemetryManagerMap() {
        return this.Q0;
    }

    @NotNull
    public Fk getTelemetryOnAdImpression() {
        Map<String, C4326s1> telemetryManagerMap = getTelemetryManagerMap();
        return new Fk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.G0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    @VisibleForTesting
    public final boolean getUnloaded() {
        return this.P0;
    }

    @NotNull
    public final InterfaceC4165lo getVISIBILITY_CHANGE_LISTENER() {
        return this.W0;
    }

    @Nullable
    public View getVideoContainerView() {
        return null;
    }

    @NotNull
    public final String getViewState() {
        return this.A;
    }

    @Override // com.inmobi.media.Eh
    public long getViewTouchTimestamp() {
        return this.g;
    }

    @NotNull
    public AbstractC4008fo getViewableAd() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "viewableAd getter " + this);
        }
        if (this.o0 == null) {
            this.o0 = new N9(this, new C4035go(this), new C4491y7(this.r, this.G0, this.x0, this.y0, getVisibilityTrackingMinPercentage(), this.i), this.i);
            Set<Vk> set = this.c;
            if (set != null) {
                for (Vk vk : set) {
                    try {
                        if (vk.a == 3) {
                            setOmidViewableAd(vk);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        InterfaceC4466x9 interfaceC4466x92 = this.i;
                        if (interfaceC4466x92 != null) {
                            String TAG2 = i1;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((C4493y9) interfaceC4466x92).b(TAG2, "Exception occurred while creating the HTML viewable ad : " + e.getMessage());
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        AbstractC4008fo abstractC4008fo = this.o0;
        Intrinsics.checkNotNull(abstractC4008fo);
        return abstractC4008fo;
    }

    @Nullable
    public final int[] getViewableFrameArray() {
        return this.s0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    @NotNull
    public final Jo getWebViewFactory() {
        return this.k;
    }

    @NotNull
    public final To getWindowInsetListener() {
        return this.S0;
    }

    @NotNull
    public final Fj getWvStateMachine() {
        return this.s;
    }

    public final void h(final String value) {
        Intrinsics.checkNotNullParameter(value, "js");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "injectJavaScript " + this + " - " + value);
        }
        Intrinsics.checkNotNullParameter(value, "value");
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC4476xi.d(GestureDetectorOnGestureListenerC4476xi.this, value);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.postAtFrontOfQueue(runnable);
    }

    public final void i(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Hi hi = this.e0;
        if (hi != null) {
            hi.b();
        }
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "loadDataInWebView " + this);
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        InMobiNetworkBridge.webviewLoadDataWithBaseURL(this, "", content, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
    }

    public final void j() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void k() {
        if (this.N.get()) {
            return;
        }
        if (!this.I) {
            this.I = true;
            return;
        }
        g();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.d0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.d0 = null;
        }
        this.N.set(true);
        this.k.a(this.j.b);
        Wo wo = this.O0;
        if (wo != null) {
            wo.a();
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.b();
        }
        this.Q = true;
        this.U = -1;
        D8 d8 = this.Z0;
        if (d8 != null) {
            InterfaceC4466x9 interfaceC4466x9 = d8.c;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("HybridVideoPlayerHandler", "destroy");
            }
            d8.a();
            Mf mf = d8.p;
            if (mf != null) {
                InterfaceC4466x9 interfaceC4466x92 = mf.g;
                if (interfaceC4466x92 != null) {
                    Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
                    ((C4493y9) interfaceC4466x92).c("Mf", "stopOmidSession");
                }
                Oe oe = mf.e;
                if (oe != null) {
                    if (oe.c == null) {
                        InterfaceC4466x9 interfaceC4466x93 = oe.b;
                        if (interfaceC4466x93 != null) {
                            ((C4493y9) interfaceC4466x93).a(AbstractC3984f1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC4466x9 interfaceC4466x94 = oe.b;
                        if (interfaceC4466x94 != null) {
                            ((C4493y9) interfaceC4466x94).a(AbstractC3984f1.f, "stopAdSession");
                        }
                        AdSession adSession = oe.c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        oe.c = null;
                    }
                }
            }
            d8.p = null;
            N3.a(d8.d);
        }
        this.Z0 = null;
        removeJavascriptInterface("sdkController");
        Jc jc = this.B;
        if (jc != null) {
            C4206nc c4206nc = jc.d;
            if (c4206nc != null) {
                c4206nc.a();
            }
            jc.d = null;
            C4206nc c4206nc2 = jc.e;
            if (c4206nc2 != null) {
                c4206nc2.a();
            }
            jc.e = null;
            C4206nc c4206nc3 = jc.f;
            if (c4206nc3 != null) {
                c4206nc3.a();
            }
            jc.f = null;
        }
        this.u.clear();
        this.v.clear();
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            weakReference.clear();
        }
        AbstractC4008fo abstractC4008fo = this.o0;
        if (abstractC4008fo != null) {
            abstractC4008fo.d();
        }
        AbstractC4008fo abstractC4008fo2 = this.o0;
        if (abstractC4008fo2 != null) {
            abstractC4008fo2.a();
        }
        C4395ug c4395ug = this.g0;
        if (c4395ug != null) {
            N8 n8 = C4131kg.b;
            if (n8 != null) {
                String id = c4395ug.c;
                Intrinsics.checkNotNullParameter(id, "id");
                n8.b.remove(id);
                Iterator it = n8.b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            C4462x5 c4462x5 = C4131kg.c;
            if (c4462x5 != null) {
                String id2 = c4395ug.c;
                Intrinsics.checkNotNullParameter(id2, "id");
                c4462x5.b.remove(id2);
                Iterator it2 = c4462x5.b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c4395ug.d.set(true);
        }
        this.g0 = null;
        T();
        S();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.F0 = null;
        this.x = null;
        this.l0 = null;
        this.n0 = null;
        this.C0 = false;
        this.c1 = null;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            BuildersKt__Builders_commonKt.launch$default(L9.f, null, null, new C4107ji(viewGroup, this, null), 3, null);
        }
    }

    public final void l(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "registerBackButtonPressedEventListener " + this);
        }
        this.M = str;
    }

    public void n() {
        InterfaceC4457x0 interfaceC4457x0;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "dismissCurrentViewContainer " + this);
        }
        Jc jc = this.B;
        if (jc != null) {
            C4390uc c4390uc = jc.c;
            if (c4390uc != null) {
                c4390uc.b();
            }
            jc.c = null;
        }
        if (Intrinsics.areEqual("Default", this.A)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z = parent instanceof ViewGroup;
            if (z) {
                this.k.b(new Function1() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC4476xi.c((Fi) obj);
                    }
                });
            }
            if (1 == this.b) {
                o();
            } else if (z) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.J != EnumC4061ho.c || (interfaceC4457x0 = this.n0) == null) {
            return;
        }
        interfaceC4457x0.a(this, getFullScreenActivity());
    }

    public final void o() {
        Activity fullScreenActivity;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "finishFullScreenActivity " + this);
        }
        SparseArray sparseArray = InMobiAdActivity.t;
        Intrinsics.checkNotNullParameter(this, "container");
        InMobiAdActivity.t.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (Intrinsics.areEqual("Default", this.A)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        InterfaceC4457x0 interfaceC4457x0 = this.n0;
        if (interfaceC4457x0 == null || !interfaceC4457x0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            Intrinsics.checkNotNull(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((InMobiAdActivity) fullScreenActivity2).e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.U == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.U);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Xh xh;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.e) {
            if (Intrinsics.areEqual(this.j.b, "default")) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        Jc jc = this.B;
        if (jc != null) {
            C4206nc c4206nc = jc.d;
            if (c4206nc != null) {
                c4206nc.b();
            }
            C4206nc c4206nc2 = jc.e;
            if (c4206nc2 != null) {
                c4206nc2.b();
            }
            C4206nc c4206nc3 = jc.f;
            if (c4206nc3 != null) {
                c4206nc3.b();
            }
        }
        O();
        if (this.w == null) {
            ViewParent parent = getParent();
            this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC4466x9 interfaceC4466x93 = this.i;
        if (interfaceC4466x93 == null || (xh = ((C4493y9) interfaceC4466x93).a) == null) {
            return;
        }
        xh.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onDetachedFromWindow " + this);
        }
        C3909c6 c3909c6 = this.E0;
        if (c3909c6 != null) {
            C3909c6.a(c3909c6, 8, true, null, 12);
            C4266pj c4266pj = c3909c6.m;
            if (!c4266pj.f && c4266pj.a > 0) {
                c4266pj.f = true;
                c4266pj.g = EnumC4213nj.f;
                c4266pj.a();
            }
            CoroutineScopeKt.cancel$default(c4266pj.d, null, 1, null);
        }
        Jc jc = this.B;
        if (jc != null) {
            C4206nc c4206nc = jc.d;
            if (c4206nc != null) {
                c4206nc.a();
            }
            C4206nc c4206nc2 = jc.e;
            if (c4206nc2 != null) {
                c4206nc2.a();
            }
            C4206nc c4206nc3 = jc.f;
            if (c4206nc3 != null) {
                c4206nc3.a();
            }
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "Detached from window");
        }
        M0 m0 = this.I0;
        if (m0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            m0 = null;
        }
        if (m0.d.get()) {
            m0.a("session end is already triggered");
        } else if (!m0.a.getEnabled()) {
            m0.a("config kill switch - false. ad quality will skip");
        } else if (m0.g == null) {
            m0.a("setup not done. ignore trigger");
        } else {
            m0.d.set(true);
            m0.a(false);
        }
        if (this.J0.get()) {
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4317ri(this, null), 3, null);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e) {
            InterfaceC4466x9 interfaceC4466x93 = this.i;
            if (interfaceC4466x93 != null) {
                String TAG3 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C4493y9) interfaceC4466x93).b(TAG3, "Detaching WebView from window encountered an error ( " + e.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).c(TAG2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.i;
        if (interfaceC4466x93 != null) {
            String TAG3 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C4493y9) interfaceC4466x93).a(TAG3, "onDoubleTapEvent detected \n " + e);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(N3.c(e.getX()));
                jSONArray.put(N3.c(e.getY()));
            } catch (JSONException e2) {
                InterfaceC4466x9 interfaceC4466x94 = this.i;
                if (interfaceC4466x94 != null) {
                    String TAG4 = i1;
                    Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    ((C4493y9) interfaceC4466x94).a(TAG4, "Exception in onDoubleTap", e2);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            h("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.n) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).c(TAG2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(motionEvent.getX())), Integer.valueOf(N3.c(motionEvent.getY()))})));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(e2.getX())), Integer.valueOf(N3.c(e2.getY()))})));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f), Float.valueOf(f2)})));
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x93 = this.i;
            if (interfaceC4466x93 != null) {
                String TAG3 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C4493y9) interfaceC4466x93).a(TAG3, "Exception in onFling", e);
            }
        }
        h("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).c(TAG2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.i;
        if (interfaceC4466x93 != null) {
            String TAG3 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C4493y9) interfaceC4466x93).a(TAG3, "onLongPress detected \n " + e);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(e.getX()));
            jSONArray.put(N3.c(e.getY()));
        } catch (JSONException e2) {
            InterfaceC4466x9 interfaceC4466x94 = this.i;
            if (interfaceC4466x94 != null) {
                String TAG4 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C4493y9) interfaceC4466x94).a(TAG4, "Exception in onLongPress", e2);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // com.inmobi.media.D2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (this.e && !this.W) {
            this.W = true;
            SparseArray sparseArray = InMobiAdActivity.t;
            g1.getClass();
            JSONObject jsonObject = C3947di.a("IN_CUSTOM_BROWSER", "onScroll");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = InMobiAdActivity.u;
            if (gestureDetectorOnGestureListenerC4476xi != null) {
                gestureDetectorOnGestureListenerC4476xi.c(jsonObject);
            }
            return false;
        }
        if (!this.n) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "onScroll detected \n " + motionEvent + " \n " + e2);
        }
        if (!this.e) {
            Kk scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - scrollThrottler.b < scrollThrottler.a) {
                scrollThrottler.b = elapsedRealtime;
            } else {
                scrollThrottler.b = elapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(motionEvent.getX())), Integer.valueOf(N3.c(motionEvent.getY()))})));
                        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(e2.getX())), Integer.valueOf(N3.c(e2.getY()))})));
                    } catch (Exception e) {
                        InterfaceC4466x9 interfaceC4466x93 = this.i;
                        if (interfaceC4466x93 != null) {
                            String TAG3 = i1;
                            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                            ((C4493y9) interfaceC4466x93).a(TAG3, "Exception in onScroll", e);
                        }
                    }
                    h("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).c(TAG2, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.i;
        if (interfaceC4466x93 != null) {
            String TAG3 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C4493y9) interfaceC4466x93).a(TAG3, "onSingleTapConfirmed detected \n " + e);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(e.getX()));
            jSONArray.put(N3.c(e.getY()));
        } catch (JSONException e2) {
            InterfaceC4466x9 interfaceC4466x94 = this.i;
            if (interfaceC4466x94 != null) {
                String TAG4 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C4493y9) interfaceC4466x94).a(TAG4, "Exception in onSingleTapConfirmed", e2);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onSingleTapUp detected \n " + e);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "onSizeChanged " + this);
        }
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "onSizeChanged (" + i + ", " + i2 + ")");
        }
        if (i == 0 || i2 == 0) {
            return;
        }
        a(N3.b(i / R5.b()), N3.b(i2 / R5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.K0) {
                InterfaceC4466x9 interfaceC4466x9 = this.i;
                if (interfaceC4466x9 != null) {
                    String TAG = i1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C4493y9) interfaceC4466x9).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.K0 = true;
            }
            return super.onTouchEvent(event);
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onWindowFocusChanged " + this + " - " + z);
        }
        super.onWindowFocusChanged(z);
        if (z) {
            if (isShown()) {
                C4412v7 c4412v7 = C4491y7.k;
                if (c4412v7.b(this, this, this.y0) && c4412v7.a(this, this, this.y0)) {
                    z = true;
                }
            }
            z = false;
        }
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity == null || !fullScreenActivity.isInMultiWindowMode()) {
            d(z);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "onWindowVisibilityChanged " + this + " " + i);
        }
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        boolean z2 = i == 0;
        if (z2) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                C4412v7 c4412v7 = C4491y7.k;
                if (c4412v7.b(this, this, visibilityTrackingMinPercentage) && c4412v7.a(this, this, visibilityTrackingMinPercentage)) {
                    z = true;
                }
            }
        } else {
            z = z2;
        }
        d(z);
    }

    public final void p() {
        M0 m0;
        AdQualityControl adQualityControl;
        Activity activity;
        M0 m02;
        AdQualityControl adQualityControl2;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireAQSession - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
        }
        if (!Intrinsics.areEqual(getAdType(), com.safedk.android.analytics.brandsafety.m.w) || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.u.get()) == null) {
            M0 m03 = this.I0;
            if (m03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                m0 = null;
            } else {
                m0 = m03;
            }
            m0.getClass();
            Intrinsics.checkNotNullParameter(this, "adView");
            if (!m0.a()) {
                m0.a("session state invalid");
                return;
            }
            m0.a("session start trigger...");
            m0.c.set(true);
            AdQualityControl adQualityControl3 = m0.g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = m0.g) == null) {
                return;
            }
            m0.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (C4055hi) null);
            return;
        }
        M0 m04 = this.I0;
        if (m04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            m02 = null;
        } else {
            m02 = m04;
        }
        m02.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!m02.a()) {
            m02.a("session state invalid");
            return;
        }
        m02.a("session start trigger...");
        m02.c.set(true);
        AdQualityControl adQualityControl4 = m02.g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = m02.g) == null) {
            return;
        }
        m02.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (C4055hi) null);
    }

    public final void q() {
        if (this.N.get()) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        Hi hi = this.e0;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            CoroutineScope coroutineScope = Hl.a;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            a.put("latency", Long.valueOf(elapsedRealtime));
            hi.h = elapsedRealtime;
            String a2 = hi.a("FireAdReady");
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b(a2, a, EnumC4530zk.a);
        }
        InterfaceC4466x9 interfaceC4466x93 = this.i;
        if (interfaceC4466x93 != null) {
            String TAG3 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C4493y9) interfaceC4466x93).a(TAG3, "fireAdReady " + this);
        }
        this.C0 = true;
        if (this.r == 0) {
            u();
        }
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4397ui(this, null), 3, null);
        getListener().h(this);
    }

    public final void r() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireBackButtonPressedEvent " + this);
        }
        String str = this.M;
        if (str != null) {
            a(str, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireClickTrackers " + this);
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.f();
        }
        v();
        getListener().b(this);
    }

    public boolean safedk_xi_dispatchTouchEvent_b3b2cfe26c6e9f1be3c98ee225afc147(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.K0) {
                InterfaceC4466x9 interfaceC4466x9 = this.i;
                if (interfaceC4466x9 != null) {
                    String TAG = i1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C4493y9) interfaceC4466x9).b(TAG, "dispatchTouchEvent Invalid Coordinates " + event);
                }
                this.K0 = true;
            }
            return super.dispatchTouchEvent(event);
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "dispatchTouchEvent " + this);
        }
        this.B0.a(event);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(event);
    }

    public final void setAdPodHandler(@Nullable InterfaceC4457x0 interfaceC4457x0) {
        this.n0 = interfaceC4457x0;
    }

    public void setAdType(@Nullable String str) {
        this.i0 = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.m0 = z;
    }

    public final void setAndUpdateViewState(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setAndUpdateViewState " + this);
        }
        this.A = state;
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "set state:" + this.A);
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = state.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        f(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z) {
        this.L = z;
    }

    public final void setBannerHolderActivity(@NotNull WeakReference<Activity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.v = weakReference;
    }

    public final void setBeaconUrl(@Nullable String str) {
        this.M0 = str;
    }

    public final void setBlobProvider(@Nullable J2 j2) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setBlobProvider " + this);
        }
        this.k0 = j2;
    }

    public final void setCloseAssetArea(@NotNull Uo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.X0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!N3.a(context)) {
                return;
            }
        }
        this.f1 = new Uo(0, value.b, value.c, 0);
    }

    public final void setConfiguredArea(long j) {
        this.t0 = getWidth() * getHeight();
    }

    public final void setContentURL(@Nullable String str) {
        this.r0 = str;
    }

    public final void setContextualDataHandler(@Nullable L4 l4) {
        this.Y0 = l4;
    }

    public void setCreativeId(@Nullable String str) {
        this.b0 = str;
    }

    public final void setDisableBackButton(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setDisableBackButton " + this);
        }
        this.L = z;
    }

    public final void setEmbeddedBrowserJsCallbacks(@Nullable InterfaceC3857a6 interfaceC3857a6) {
        this.F0 = interfaceC3857a6;
    }

    public final void setEnableNativeGestures(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "enableNativeGestures " + this + " " + z);
        }
        boolean z2 = this.n;
        this.n = z;
        if (z && !z2) {
            if (this.z0 == null) {
                this.z0 = new Bc(this);
            }
        } else {
            if (z || !z2) {
                return;
            }
            this.z0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setEnableTouchBeginCallback " + this + " " + z);
        }
        this.p = z;
    }

    public final void setEnableTouchEndCallback(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setEnableTouchEndCallback " + this + " " + z);
        }
        this.o = z;
    }

    public void setExitAnimation(int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setExitAnimation " + this);
        }
        this.U = i;
    }

    public final void setExposureTracker(@Nullable U u) {
        this.L0 = u;
    }

    public void setFriendlyViews(@Nullable Map<View, FriendlyObstructionPurpose> map) {
        this.j0 = map;
    }

    public void setFullScreenActivityContext(@Nullable Activity activity) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setFullScreenActivityContext " + this);
        }
        this.u = new WeakReference(activity);
        Y();
        if (this.e || activity == null) {
            return;
        }
        Wo wo = this.O0;
        if (wo != null) {
            wo.a();
        }
        this.O0 = new Wo(activity, this.S0, this.i);
    }

    public final void setImmersiveMode(boolean z) {
        this.X0 = z;
    }

    public void setImpressionId(@Nullable String str) {
        this.d = str;
    }

    public final void setInAppActivityBrowserClientListener(@Nullable S8 s8) {
        this.c1 = s8;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(@Nullable C4152lb c4152lb) {
        C3909c6 c3909c6 = this.E0;
        if (c3909c6 != null) {
            c3909c6.k = c4152lb;
            c3909c6.l = new C4100jb(c4152lb, c3909c6);
        }
    }

    public final void setLandingScheme(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f = str;
    }

    public final void setMCreativeType(@Nullable String str) {
        this.G0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i) {
        this.y0 = i;
    }

    public final void setMImpressionMinTimeViewed(int i) {
        this.x0 = i;
    }

    public final void setMViewableAd(@Nullable AbstractC4008fo abstractC4008fo) {
        this.o0 = abstractC4008fo;
    }

    public final void setMarkupTypeAdUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.T0 = str;
    }

    public final void setOrientationProperties(@NotNull Vf vf) {
        Intrinsics.checkNotNullParameter(vf, "<set-?>");
        this.H0 = vf;
    }

    @VisibleForTesting
    public final void setPingAckListener(@NotNull InterfaceC4315rg pingAckListener) {
        Intrinsics.checkNotNullParameter(pingAckListener, "pingAckListener");
        this.q = pingAckListener;
    }

    @VisibleForTesting
    public final void setPingManager(@NotNull C4395ug pingManager) {
        Intrinsics.checkNotNullParameter(pingManager, "pingManager");
        this.g0 = pingManager;
    }

    public final void setPlacementId(long j) {
        this.a0 = j;
    }

    public final void setPreloadView(boolean z) {
    }

    public void setReferenceContainer(@Nullable C c) {
        this.l0 = c;
    }

    public final void setRenderViewEventListener(@Nullable AbstractC4528zi abstractC4528zi) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setRenderViewEventListener " + this);
        }
        this.x = abstractC4528zi;
    }

    public final void setRenderViewTelemetry(@Nullable Hi hi) {
        this.e0 = hi;
    }

    public final void setScrollable(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "setScrollable " + this);
        }
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public final void setShouldFireLandingPageBeacons(boolean z) {
        this.N0 = z;
    }

    public void setTelemetryManagerMap(@Nullable Map<String, C4326s1> map) {
        this.Q0 = map;
    }

    @VisibleForTesting
    public final void setUnloaded(boolean z) {
        this.P0 = z;
    }

    public final void setUseCustomClose(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setUseCustomClose " + this + " " + z);
        }
        this.H = z;
    }

    public void setViewTouchTimestamp(long j) {
        this.g = j;
    }

    public final void setWatermark(@NotNull final WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] decode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        if (!this.c0.get()) {
            this.c0.set(true);
            this.d0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda13
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    GestureDetectorOnGestureListenerC4476xi.a(GestureDetectorOnGestureListenerC4476xi.this, decode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.d0);
        } else {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).c(TAG2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "stopLoading " + this);
        }
        if (this.N.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireEvent " + this + " 2");
        }
    }

    public void u() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireImpression " + this);
        }
        if (Intrinsics.areEqual("video", this.G0) || Intrinsics.areEqual("audio", this.G0)) {
            return;
        }
        F();
        h("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireOnUserInteraction " + this);
        }
        h("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "firePopupBlockedEvent " + this);
        }
        h("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void x() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "fullScreenActivity is not null and finishing");
            }
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.b();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (Intrinsics.areEqual(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return Intrinsics.areEqual(getAdType(), com.safedk.android.analytics.brandsafety.m.w) && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public final void m() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        Jc jc = this.B;
        if (jc != null) {
            C4390uc c4390uc = jc.c;
            if (c4390uc != null) {
                c4390uc.b();
            }
            jc.c = null;
        }
        if (Intrinsics.areEqual("Default", this.A)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.k.b(new Function1() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC4476xi.b((Fi) obj);
                    }
                });
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            Intrinsics.checkNotNullParameter(this, "container");
            InMobiAdActivity.t.remove(hashCode());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GestureDetectorOnGestureListenerC4476xi(Context context, byte b, Set set, String str, boolean z, String landingScheme, long j, Bi bi, InterfaceC4466x9 interfaceC4466x9, Yi route, Jo webViewFactory, C4221o0 c4221o0, AdConfig adConfig) {
        super(r10);
        C3895bi c3973ei;
        Uo uo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = b;
        this.c = set;
        this.d = str;
        this.e = z;
        this.f = landingScheme;
        this.g = j;
        this.h = bi;
        this.i = interfaceC4466x9;
        this.j = route;
        this.k = webViewFactory;
        this.l = c4221o0;
        this.m = adConfig;
        this.p = true;
        this.q = new C4370ti(this);
        this.s = new Fj(interfaceC4466x9);
        this.t = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return GestureDetectorOnGestureListenerC4476xi.c(GestureDetectorOnGestureListenerC4476xi.this);
            }
        });
        this.u = new WeakReference(null);
        this.v = new WeakReference(null);
        this.y = MutexKt.Mutex$default(false, 1, null);
        this.A = "Default";
        this.F = true;
        this.G = true;
        this.I = true;
        this.J = EnumC4061ho.a;
        this.N = new AtomicBoolean(false);
        this.O = new Object();
        this.P = new Object();
        this.R = true;
        this.U = -1;
        this.a0 = Long.MIN_VALUE;
        this.c0 = new AtomicBoolean(false);
        this.f0 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return GestureDetectorOnGestureListenerC4476xi.b(GestureDetectorOnGestureListenerC4476xi.this);
            }
        });
        this.h0 = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return GestureDetectorOnGestureListenerC4476xi.A();
            }
        });
        this.v0 = new C4029gi(this);
        this.w0 = new C4133ki(this);
        this.x0 = Integer.MIN_VALUE;
        this.y0 = Integer.MIN_VALUE;
        this.J0 = new AtomicBoolean(true);
        this.R0 = new C4055hi(this);
        this.S0 = new C4449wi(this);
        this.T0 = "html";
        this.U0 = new C4186mi(this, context);
        this.V0 = new C4081ii(this);
        this.W0 = new C4001fi(this);
        String TAG = i1;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        g1.getClass();
        j1.a();
        this.l0 = this;
        this.p0 = true;
        this.H0 = new Vf();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b == 1);
        this.A0 = gestureDetector;
        this.B0 = new Uk(this);
        if (this.n && this.z0 == null) {
            this.z0 = new Bc(this);
        }
        if (bi != null) {
            this.e0 = new Hi(bi);
        }
        AbstractC3869ai.a(this, interfaceC4466x9);
        if (c4221o0 != null) {
            setAdType(c4221o0.a);
            this.X0 = c4221o0.b;
            this.a0 = c4221o0.c;
            this.m0 = c4221o0.d;
            setCreativeId(c4221o0.e);
            this.n0 = c4221o0.i;
            this.r0 = c4221o0.j;
            this.T0 = c4221o0.g;
            String str2 = c4221o0.h;
            if (str2 != null) {
                setAdSize(str2);
            }
            setTelemetryManagerMap(c4221o0.k);
            b(c4221o0.f);
        }
        this.b1 = new C4423vi(this);
        this.c1 = new C4159li(this);
        this.d1 = new C4291qi(this);
        if (getAdConfig().getRendering().getDisableShowCustomView()) {
            c3973ei = new C3895bi(this);
        } else {
            c3973ei = new C3973ei(this);
        }
        this.e1 = c3973ei;
        if (!this.X0 && !N3.a(context)) {
            uo = new Uo(0, 0, 0, 0);
        } else {
            uo = new Uo(0, 44, 44, 0);
        }
        this.f1 = uo;
    }

    public final void j(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "loadScript " + this);
        }
        InMobiNetworkBridge.webviewLoadUrl(this, str);
    }

    public final void l() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    public final void f(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireStateChange " + this + " " + str);
        }
        h("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void g(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (getAdConfig().getPingV2().getEnabled()) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).a(TAG, "handlePing " + this);
            }
            if (this.g0 == null) {
                this.g0 = new C4395ug(this.q, this.e0);
            }
            C4395ug c4395ug = this.g0;
            Intrinsics.checkNotNull(c4395ug);
            c4395ug.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new C4341sg(c4395ug, json, null), 3, null);
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "pings v2 is disabled " + this);
        }
        Hi hi = this.e0;
        if (hi != null) {
            Intrinsics.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map a = hi.a();
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2257);
            a.put(DivActionHandler.DivActionReason.TRIGGER, "unknown");
            a.put("retryCount", String.valueOf(0));
            AbstractC4526zg.a("PingFailed", a);
        }
        InterfaceC4315rg interfaceC4315rg = this.q;
        EnumC4043h6[] enumC4043h6Arr = EnumC4043h6.a;
        ((C4370ti) interfaceC4315rg).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    public final void c(String str, String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "sendTelemetryForAutoRedirectFraud " + this + " " + str + " " + str2);
        }
        HashMap hashMap = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            hashMap.put("creativeId", creativeId);
        }
        hashMap.put(DivActionHandler.DivActionReason.TRIGGER, str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        hashMap.put("adType", str2);
        a("BlockAutoRedirection", hashMap);
    }

    public final void f(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "processUseCustomCloseRequest " + this + " " + z);
        }
        setUseCustomClose(z);
        U();
    }

    public final void i() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "completeFromInterActive " + this);
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.g();
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "completeFromInterActive");
        }
    }

    public final void c(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireViewableChange " + this + " " + z);
        }
        h("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    public static final Unit c(Fi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.n();
        return Unit.INSTANCE;
    }

    public final void a(Bc movementGestureDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (!this.e && getRenderingConfig().getSupportedGestures().contains(4)) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).a(TAG, StringsKt.trimIndent(" onScaleDetected\n " + initialEvent + " \n " + endEvent));
            }
            JSONArray jSONArray = new JSONArray();
            float f = 2;
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c((endEvent.getX(1) + endEvent.getX()) / f)), Integer.valueOf(N3.c((endEvent.getY(1) + endEvent.getY()) / f))})));
            h("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).c(TAG2, "Pinch gesture is disabled from config");
        }
    }

    public final void c(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    @Override // com.inmobi.media.Eh
    public final boolean c() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r6.equals("html5video") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012b, code lost:
    
        if (r5.C == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012f, code lost:
    
        if (r5.R == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0132, code lost:
    
        r6 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0134, code lost:
    
        if (r6 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0136, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC4476xi.i1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "TAG");
        ((com.inmobi.media.C4493y9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0151, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        if (r6.equals("inlineVideo") == false) goto L80;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x015b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "supports " + this + " " + str);
        }
        boolean z = false;
        if (str != null) {
            switch (str.hashCode()) {
                case -1886160473:
                    if (str.equals("playVideo")) {
                        return true;
                    }
                    break;
                case -1647691422:
                    break;
                case -988153970:
                    if (str.equals("pingV2")) {
                        AdConfig.PingsV2Config pingV2 = getAdConfig().getPingV2();
                        InterfaceC4466x9 interfaceC4466x92 = this.i;
                        if (interfaceC4466x92 != null) {
                            String TAG2 = i1;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((C4493y9) interfaceC4466x92).a(TAG2, "supports(pingV2) " + pingV2.getEnabled());
                        }
                        return pingV2.getEnabled();
                    }
                    break;
                case -315615134:
                    str.equals("streaming");
                    break;
                case -168584769:
                    if (str.equals("edge-to-edge")) {
                        if (getPlacementType() != 1) {
                            InterfaceC4466x9 interfaceC4466x93 = this.i;
                            if (interfaceC4466x93 != null) {
                                String TAG3 = i1;
                                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                                ((C4493y9) interfaceC4466x93).b(TAG3, "EDGE_TO_EDGE is only supported for fullscreen ads. supports(edge-to-edge) = false");
                            }
                            return false;
                        }
                        if (this.X0) {
                            InterfaceC4466x9 interfaceC4466x94 = this.i;
                            if (interfaceC4466x94 != null) {
                                String TAG4 = i1;
                                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                                ((C4493y9) interfaceC4466x94).b(TAG4, "Ad is in Immersive mode. supports(edge-to-edge) = false");
                            }
                            return false;
                        }
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return N3.a(context);
                    }
                    break;
                case 886211909:
                    if (str.equals("openInlineInstaller")) {
                        return true;
                    }
                    break;
                case 1137617595:
                    if (str.equals(X3.i.v)) {
                        return this.X0;
                    }
                    break;
                case 1509574865:
                    break;
                case 1511497695:
                    if (str.equals("hybridVideo") && getAdConfig().getHybridNative().getIsEnabled()) {
                        String maxSupportedPlayerVersion = getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
                        Hi hi = this.e0;
                        try {
                            AbstractC4322rn.a(maxSupportedPlayerVersion);
                            return true;
                        } catch (Ig e) {
                            if (hi != null) {
                                hi.a(e.a);
                            }
                        }
                    }
                    return false;
                case 1642189884:
                    if (!str.equals("saveContent")) {
                    }
                    break;
                case 1772979069:
                    str.equals("redirectFraudDetection");
                    break;
            }
        }
        return false;
    }

    public final void c(String jsCallbackNamespace, String callback, String blob) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(blob, "blob");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "retrievedBlob");
        }
        a(jsCallbackNamespace, callback + "(" + blob + ");");
    }

    public final void b(float f, float f2) {
        if (!this.o) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(f));
            jSONArray.put(N3.c(f2));
        } catch (JSONException e) {
            InterfaceC4466x9 interfaceC4466x93 = this.i;
            if (interfaceC4466x93 != null) {
                String TAG3 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C4493y9) interfaceC4466x93).a(TAG3, "Exception in onTouchEnd", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    public final void c(int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "showPodAdAtIndex " + this + " " + i);
        }
        if (this.J == EnumC4061ho.c && this.n0 != null && !this.N.get()) {
            InterfaceC4457x0 interfaceC4457x0 = this.n0;
            if (interfaceC4457x0 != null) {
                interfaceC4457x0.a(i, this, getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public final void c(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).a(TAG, "onLpLifeCycleEvent " + this);
            }
            h("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void c(GestureDetectorOnGestureListenerC4476xi sourceView, String targetId) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "fireShowWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    public static final Kk b(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        return new Kk(gestureDetectorOnGestureListenerC4476xi.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    public void b() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "destroyContainer " + this);
        }
        k();
        this.k.b(new Function1() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GestureDetectorOnGestureListenerC4476xi.a((Fi) obj);
            }
        });
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.p0 && omidConfig.isOmidEnabled()) {
            Rf.a.getClass();
            if (Omid.isActive()) {
                new Ci(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void a(float f, float f2) {
        if (!this.p) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).c(TAG, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(f));
            jSONArray.put(N3.c(f2));
        } catch (JSONException e) {
            InterfaceC4466x9 interfaceC4466x93 = this.i;
            if (interfaceC4466x93 != null) {
                String TAG3 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C4493y9) interfaceC4466x93).a(TAG3, "Exception in onTouchBegin", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    public final void e(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireDetectAutoRedirectFraud " + this + " " + str);
        }
        h("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void e(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "processDisableCloseRegionRequest " + this + " " + z);
        }
        this.K = z;
        U();
    }

    public final void h() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "closeAll " + this);
        }
        InterfaceC4457x0 interfaceC4457x0 = this.n0;
        if (interfaceC4457x0 != null) {
            interfaceC4457x0.b();
        }
        x();
    }

    public final void b(Tf orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "handle orientationChange " + this + " " + orientation);
        }
        a(Uf.a(orientation));
    }

    public static final void a(GestureDetectorOnGestureListenerC4476xi renderView, byte[] bArr, WatermarkData watermarkData) {
        InterfaceC4466x9 interfaceC4466x9 = renderView.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "adding overlay to renderview");
        }
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FrameLayout overlayLayout = AbstractC4534zo.a(context, bArr, watermarkData.getAlpha());
        Intrinsics.checkNotNullParameter(overlayLayout, "overlayLayout");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (renderView.getParent() != null) {
            ViewParent parent = renderView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        renderView.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = renderView.d0;
        if (onGlobalLayoutListener != null) {
            renderView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            renderView.d0 = null;
        }
    }

    public final void b(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "processMediaPlaybackRequest " + this);
        }
        if (this.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).b(TAG2, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.b) {
            InterfaceC4466x9 interfaceC4466x93 = this.i;
            if (interfaceC4466x93 != null) {
                String TAG3 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C4493y9) interfaceC4466x93).b(TAG3, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null) {
            InterfaceC4466x9 interfaceC4466x94 = this.i;
            if (interfaceC4466x94 != null) {
                String TAG4 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C4493y9) interfaceC4466x94).b(TAG4, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        Jc jc = this.B;
        if (jc != null) {
            jc.a(activity, url);
        }
    }

    public static final Unit b(Fi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.n();
        return Unit.INSTANCE;
    }

    public final void b(int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "loadPodAd " + this);
        }
        if (this.J == EnumC4061ho.c && this.n0 != null && !this.N.get()) {
            InterfaceC4457x0 interfaceC4457x0 = this.n0;
            if (interfaceC4457x0 != null) {
                interfaceC4457x0.a(i, this);
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).b(TAG2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void b(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "fireNextAdShowComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adShowSuccess'," + z + ");";
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void b(String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "creativeType " + this + " " + str);
        }
        this.G0 = str;
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.e);
        }
        h("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void b(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onCTLifeCycleEvent " + this);
        }
        h("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jsonObject + ");");
    }

    public final void b(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireLandingPageTracker " + this);
        }
        getListener().a(this, trackerName, macros);
    }

    public final void b(GestureDetectorOnGestureListenerC4476xi sourceView, String targetId) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "fireLoadWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        Hi hi = this.e0;
        jSONObject.put("latency", hi != null ? hi.h : 0L);
        sourceView.h("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public final void a(String url, String templateInfoStr, boolean z) {
        Activity activity;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
            }
            if (Intrinsics.areEqual(getAdType(), com.safedk.android.analytics.brandsafety.m.w) && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.u.get()) != null) {
                Lazy lazy = F0.a;
                F0.a(activity, this, url, z, jSONObject, this.R0);
            } else {
                Lazy lazy2 = F0.a;
                F0.a(this, this, url, z, jSONObject, this.R0);
            }
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x92 = this.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).a(TAG2, "issue wile reporting ad", e);
            }
        }
    }

    public final void a(MotionEvent motionEvent) {
        Bc bc;
        if (this.e && !this.V) {
            this.V = true;
            SparseArray sparseArray = InMobiAdActivity.t;
            g1.getClass();
            JSONObject jsonObject = C3947di.a("IN_CUSTOM_BROWSER", "onInteraction");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = InMobiAdActivity.u;
            if (gestureDetectorOnGestureListenerC4476xi != null) {
                gestureDetectorOnGestureListenerC4476xi.c(jsonObject);
            }
        }
        if (this.b == 1 && (bc = this.z0) != null) {
            bc.a(motionEvent);
        }
        this.A0.onTouchEvent(motionEvent);
    }

    public final void a(AbstractC4528zi abstractC4528zi) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "initialize " + this);
        }
        int i = Build.VERSION.SDK_INT;
        if (Intrinsics.areEqual(this.T0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.x = abstractC4528zi;
        ViewParent parent = getParent();
        this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        Dc dc = new Dc(url, maxRetries, retryInterval, expiry, interfaceC4466x92);
        if (url != null) {
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new Cc(dc, null), 3, null);
        } else if (interfaceC4466x92 != null) {
            String TAG2 = dc.f;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).b(TAG2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.e1);
        if (!this.e) {
            Ha ha = new Ha(this.b, this);
            InterfaceC4466x9 logger = this.i;
            if (logger != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                ha.c = logger;
            }
            InMobiNetworkBridge.webviewAddJavascriptInterface(this, ha, "sdkController");
        }
        this.B = new Jc(this, this.i);
        this.I0 = new M0(getAdConfig().getAdQuality(), this.i);
        if (i >= 29) {
            Di di = new Di(this.i, this.e0);
            Object value = AbstractC4437w6.c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            setWebViewRenderProcessClient((ExecutorService) value, di);
        }
        C4221o0 c4221o0 = this.l;
        if (c4221o0 != null && (adQualityControl = c4221o0.n) != null) {
            M0 m0 = this.I0;
            if (m0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                m0 = null;
            }
            m0.getClass();
            Intrinsics.checkNotNullParameter(adQualityControl, "adQualityControl");
            m0.a("adQuality session setup");
            if (!m0.a.getEnabled()) {
                m0.a("config kill switch while setup - false. ad quality will skip");
            } else if (m0.c.get()) {
                m0.a("session already started. skip");
            } else {
                m0.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon != null && beacon.length() == 0) {
                    m0.a("no beacon received. aborting...");
                    CoroutineScope coroutineScope = F0.e;
                    if (coroutineScope != null) {
                        CoroutineScopeKt.cancel(coroutineScope, new CancellationException("Shutdown"));
                    }
                    F0.e = null;
                    m0.a("session end - cleanup");
                    m0.g = null;
                    m0.f.clear();
                    m0.c.set(false);
                    m0.d.set(false);
                    m0.a("ad quality session is already in progress. skipping...");
                } else {
                    m0.g = adQualityControl;
                }
            }
        }
        C4221o0 c4221o02 = this.l;
        if (c4221o02 != null && (watermarkData = c4221o02.m) != null) {
            setWatermark(watermarkData);
        }
        C4221o0 c4221o03 = this.l;
        if (c4221o03 != null ? Intrinsics.areEqual(c4221o03.l, Boolean.TRUE) : false) {
            l();
        }
    }

    public final void k(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Hi hi = this.e0;
        if (hi != null) {
            hi.b();
        }
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "loadUrlInWebView " + this);
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        InMobiNetworkBridge.webviewLoadUrl(this, url);
    }

    public final void a(RelativeLayout adView) {
        Mf mf;
        Intrinsics.checkNotNullParameter(adView, "adBackgroundView");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        D8 d8 = this.Z0;
        if (d8 != null) {
            Intrinsics.checkNotNullParameter(adView, "parentView");
            if (d8.g.get()) {
                return;
            }
            InterfaceC4466x9 interfaceC4466x92 = d8.c;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (d8.i && (mf = d8.p) != null) {
                Intrinsics.checkNotNullParameter(adView, "parentView");
                InterfaceC4466x9 interfaceC4466x93 = mf.g;
                if (interfaceC4466x93 != null) {
                    Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
                    ((C4493y9) interfaceC4466x93).c("Mf", "startOmidSession");
                }
                Oe oe = mf.e;
                if (oe != null) {
                    Intrinsics.checkNotNullParameter(adView, "adView");
                    if (oe.c == null) {
                        InterfaceC4466x9 interfaceC4466x94 = oe.b;
                        if (interfaceC4466x94 != null) {
                            ((C4493y9) interfaceC4466x94).a(AbstractC3984f1.f, "Failed to registerAdView. adSession is null");
                        }
                    } else {
                        InterfaceC4466x9 interfaceC4466x95 = oe.b;
                        if (interfaceC4466x95 != null) {
                            ((C4493y9) interfaceC4466x95).a(AbstractC3984f1.f, "registerAdView");
                        }
                        X4.a(oe.a, new Z0(oe, adView, null));
                    }
                }
                Oe oe2 = mf.e;
                if (oe2 != null) {
                    if (oe2.c == null) {
                        InterfaceC4466x9 interfaceC4466x96 = oe2.b;
                        if (interfaceC4466x96 != null) {
                            ((C4493y9) interfaceC4466x96).a(AbstractC3984f1.f, "Failed to startAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC4466x9 interfaceC4466x97 = oe2.b;
                        if (interfaceC4466x97 != null) {
                            ((C4493y9) interfaceC4466x97).a(AbstractC3984f1.f, "startAdSession");
                        }
                        X4.a(oe2.a, new C3904c1(oe2, null));
                    }
                }
            }
            d8.k.a(adView);
            d8.k.e();
            d8.o = true;
        }
    }

    public final void a(EnumC4465x8 enumC4465x8, Object obj) {
        if (obj instanceof String) {
            obj = "'" + obj + "'";
        }
        String str = "window.imraid.broadcastEvent('" + enumC4465x8.a + "', " + obj + ");";
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).b(TAG, "fireHtmlVideoEvents: " + str);
        }
        h(str);
    }

    public final void a(HashMap params) {
        Mf mf;
        Oe oe;
        Intrinsics.checkNotNullParameter(params, "params");
        getListener().a(params);
        D8 d8 = this.Z0;
        if (d8 == null || (mf = d8.p) == null || (oe = mf.e) == null) {
            return;
        }
        oe.a(InteractionType.CLICK);
    }

    public static final Unit a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "it");
        SparseArray sparseArray = InMobiAdActivity.t;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.c(jsonObject);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        SparseArray sparseArray = InMobiAdActivity.t;
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.b(trackerName, macros);
        }
        return Unit.INSTANCE;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "initContextualData " + this);
        }
        this.Y0 = new L4(ad != null ? ad.getContextData() : null, this.a0);
    }

    public static final Unit a(Fi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b();
        return Unit.INSTANCE;
    }

    public final void a(String url, boolean z) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(url, "url");
        if (!z) {
            k(url);
            return;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "loadHtmlUrl: prefetching URL content before WebView load");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Hi hi = this.e0;
        if (hi != null) {
            Map a = hi.a();
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("HtmlUrlPrefetchStarted", a, EnumC4530zk.a);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4239oi(url, this, elapsedRealtime, null), 3, null);
        this.z = launch$default;
    }

    @Override // com.inmobi.media.Eh
    public final void a(String mraidApi) {
        Intrinsics.checkNotNullParameter(mraidApi, "mraidApi");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        e(mraidApi);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(mraidApi, adType);
    }

    public final void a(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireNextAdLoadComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adLoadSuccess'," + z + ");";
        InterfaceC4466x9 interfaceC4466x92 = this.i;
        if (interfaceC4466x92 != null) {
            String TAG2 = i1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).c(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void a(int i, int i2) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireSizeChanged " + this + " w-" + i + " h-" + i2);
        }
        h("window.mraidview.broadcastEvent('sizeChange'," + i + StringUtils.COMMA + i2 + ");");
    }

    public final void a(int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireOrientationChange " + this + " " + i);
        }
        h("window.imraid.broadcastEvent('orientationChange','" + i + "');");
    }

    public final void a(String str, JSONObject message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireError " + this + " - " + message);
        }
        h("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        d(message);
    }

    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireError " + this + " - " + message + " - " + str2);
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + message + "\", \"" + str2 + "\")");
    }

    public final void a(String str, String callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        h(str + "." + callback);
    }

    public final void a(String str, HashMap hashMap) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "processTelemetryEvent " + this);
        }
        getListener().a(str, hashMap);
    }

    public void a(Vf orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "setOrientationProperties " + this);
        }
        this.H0 = orientationProperties;
        Y();
    }

    public static final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        gestureDetectorOnGestureListenerC4476xi.getListener().j(gestureDetectorOnGestureListenerC4476xi);
    }

    @Override // com.inmobi.media.Wf
    public final void a(Tf orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onOrientationUpdate " + this);
        }
    }

    public final void a(Tf orientation, Vo vo) {
        JSONObject jSONObject;
        Uo uo;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "fireOnSafeAreaChanged " + this);
        }
        Intrinsics.checkNotNullParameter(vo, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        try {
            vo.getClass();
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            uo = (Uo) vo.a.get(orientation);
        } catch (Exception unused) {
        }
        if (uo != null) {
            jSONObject = uo.a();
            jSONObject.put(X3.i.n, Uf.a(orientation));
            h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
        }
        jSONObject = null;
        h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
    }

    @Override // com.inmobi.media.D2
    public final C4048hb d() {
        C4178mb c4178mb;
        String str;
        String str2;
        String str3;
        C4431w0 c4431w0;
        String str4;
        C4431w0 c4431w02;
        String str5;
        C4431w0 c4431w03;
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "initLandingPageHandler " + this);
        }
        boolean z = this.e;
        String str6 = this.f;
        boolean cctEnabled = getAdConfig().getCctEnabled();
        boolean partialTabsEnabled = getAdConfig().getPartialTabsEnabled();
        Bi bi = this.h;
        C4074ib c4074ib = new C4074ib(z, str6, cctEnabled, partialTabsEnabled, bi != null ? bi.m : null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C4081ii c4081ii = this.V0;
        C4186mi c4186mi = this.U0;
        if (this.e) {
            c4178mb = null;
        } else {
            Bi bi2 = this.h;
            long j = (bi2 == null || (c4431w03 = bi2.a) == null) ? 0L : c4431w03.a;
            String impressionId = getImpressionId();
            String str7 = impressionId == null ? "" : impressionId;
            Bi bi3 = this.h;
            c4178mb = new C4178mb(j, str7, (bi3 == null || (c4431w02 = bi3.a) == null || (str5 = c4431w02.f) == null) ? "" : str5, (bi3 == null || (c4431w0 = bi3.a) == null || (str4 = c4431w0.e) == null) ? "" : str4, (bi3 == null || (str3 = bi3.b) == null) ? "" : str3, (bi3 == null || (str2 = bi3.f) == null) ? "" : str2, (bi3 == null || (str = bi3.d) == null) ? "" : str, bi3 != null ? bi3.h : false, this.f);
        }
        return new C4048hb(context, c4074ib, c4081ii, c4186mi, this, c4178mb, this.i, new WeakReference(this));
    }

    public final void d(JSONObject jSONObject) {
        short s;
        final String optString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_CODE);
        Object a = P3.a(new Function0() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Short.valueOf(GestureDetectorOnGestureListenerC4476xi.m(optString));
            }
        });
        if (Result.m8029isSuccessimpl(a)) {
            short shortValue = ((Number) a).shortValue();
            Hi hi = this.e0;
            if (hi != null) {
                Map a2 = hi.a();
                switch (shortValue) {
                    case 101:
                        s = 2261;
                        break;
                    case 102:
                        s = 2262;
                        break;
                    case 103:
                        s = 2263;
                        break;
                    case 104:
                        s = 2267;
                        break;
                    case 105:
                        s = 2266;
                        break;
                    case 106:
                        s = 2265;
                        break;
                    case 107:
                        s = 2264;
                        break;
                    default:
                        switch (shortValue) {
                            case 301:
                                s = 2268;
                                break;
                            case 302:
                                s = 2269;
                                break;
                            case POBVastError.NO_VAST_RESPONSE /* 303 */:
                                s = 2270;
                                break;
                            case 304:
                                s = 2271;
                                break;
                            case MRAID_BRIDGE_ERROR_VALUE:
                                s = 2272;
                                break;
                            case 306:
                                s = 2273;
                                break;
                            case 307:
                                s = 2274;
                                break;
                            case 308:
                                s = 2275;
                                break;
                            case ASSET_FAILED_TO_DELETE_VALUE:
                                s = 2276;
                                break;
                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                s = 2277;
                                break;
                            case MRAID_JS_CALL_EMPTY_VALUE:
                                s = 2278;
                                break;
                            case DEEPLINK_OPEN_FAILED_VALUE:
                                s = 2280;
                                break;
                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                s = 2281;
                                break;
                            default:
                                s = shortValue;
                                break;
                        }
                }
                a2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                long j = hi.c;
                CoroutineScope coroutineScope = Hl.a;
                a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
                C4425vk c4425vk = C4425vk.a;
                C4425vk.b("CompanionWebViewLoadFailed", a2, EnumC4530zk.a);
            }
        }
    }

    public static final void d(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, String str) {
        try {
            if (gestureDetectorOnGestureListenerC4476xi.N.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            InterfaceC4466x9 interfaceC4466x9 = gestureDetectorOnGestureListenerC4476xi.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).a(TAG, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC4476xi.c(str2);
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x92 = gestureDetectorOnGestureListenerC4476xi.i;
            if (interfaceC4466x92 != null) {
                String TAG2 = i1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).b(TAG2, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e.getMessage());
            }
        }
    }

    public final void d(String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.P0) {
            InterfaceC4466x9 interfaceC4466x9 = this.i;
            if (interfaceC4466x9 != null) {
                String TAG = i1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.D0 = true;
        Hi hi = this.e0;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            CoroutineScope coroutineScope = Hl.a;
            a.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a2 = hi.a("FireAdFailed");
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b(a2, a, EnumC4530zk.a);
        }
        getListener().a(this, errorCode);
    }

    public static String d(int i) {
        return "SDK_" + i;
    }

    public final boolean a(JsResult jsResult) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.Eh
    public final boolean a() {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "hasUserInteracted " + getViewTouchTimestamp() + " " + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.m0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "handlePingException " + this, e);
        }
        InterfaceC4315rg interfaceC4315rg = this.q;
        EnumC4043h6[] enumC4043h6Arr = EnumC4043h6.a;
        ((C4370ti) interfaceC4315rg).a("", -107, "Ping exception occurred", System.currentTimeMillis(), 0);
        Lazy lazy = AbstractC3861aa.a;
        AbstractC4361t9.a(e);
    }

    public static final Unit a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = gestureDetectorOnGestureListenerC4476xi.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC4476xi.getListener().a(gestureDetectorOnGestureListenerC4476xi, z);
        return Unit.INSTANCE;
    }

    public final void a(boolean z, short s) {
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        Hi hi = this.e0;
        if (hi != null) {
            hi.a(z, s);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi sourceView, String targetId) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC4466x9 interfaceC4466x9 = this.i;
        if (interfaceC4466x9 != null) {
            String TAG = i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).c(TAG, "fireDestroyWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
