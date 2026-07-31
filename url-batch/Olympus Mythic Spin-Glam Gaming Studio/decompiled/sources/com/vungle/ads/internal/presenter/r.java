package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.ironsource.C4701ic;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.AdConfig;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.InvalidCTAUrl;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.TpatError;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.u1;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes5.dex */
public final class r implements com.vungle.ads.internal.ui.view.o, com.vungle.ads.internal.ui.view.p {
    public static final Map z = MapsKt.mapOf(TuplesKt.to("checkpoint.0", Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), TuplesKt.to(UnifiedMediationParams.KEY_CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));
    public final com.vungle.ads.internal.ui.view.k a;
    public final h0 b;
    public final i3 c;
    public final com.vungle.ads.internal.ui.z d;
    public Executor e;
    public final com.vungle.ads.internal.omsdk.e f;
    public final com.vungle.ads.internal.platform.f g;
    public long h;
    public a i;
    public boolean j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public Long m;
    public String n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public z s;
    public y t;
    public final Lazy u;
    public final Lazy v;
    public boolean w;
    public final Lazy x;
    public long y;

    public r(com.vungle.ads.internal.ui.view.k adWidget, h0 advertisement, i3 placement, com.vungle.ads.internal.ui.z vungleWebClient, com.vungle.ads.internal.executor.j executor, com.vungle.ads.internal.omsdk.e omTracker, com.vungle.ads.internal.platform.f platform) {
        Intrinsics.checkNotNullParameter(adWidget, "adWidget");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(omTracker, "omTracker");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.a = adWidget;
        this.b = advertisement;
        this.c = placement;
        this.d = vungleWebClient;
        this.e = executor;
        this.f = omTracker;
        this.g = platform;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        Context context = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.o = LazyKt.lazy(lazyThreadSafetyMode, new n(context));
        Context context2 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
        this.p = LazyKt.lazy(lazyThreadSafetyMode, new o(context2));
        Context context3 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "adWidget.context");
        this.q = LazyKt.lazy(lazyThreadSafetyMode, new p(context3));
        Context context4 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        this.r = LazyKt.lazy(lazyThreadSafetyMode, new q(context4));
        this.u = LazyKt.lazy(m.a);
        this.v = LazyKt.lazy(new g(this));
        this.x = LazyKt.lazy(new d(this));
    }

    public static final void e(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String b = this$0.c.b();
        List list = null;
        com.vungle.ads.internal.network.m a = ((VungleApiClient) this$0.o.getValue()).a(new p1(list, this$0.m, this$0.b.e(), b, this$0.n, (c1) null, 67));
        if (a != null) {
            a.a(new j(this$0));
            return;
        }
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", "Invalid ri call.");
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Error RI API for placement: ");
        a2.append(this$0.c.b());
        new NetworkUnreachable(a2.toString()).setLogEntry$vungle_ads_release(this$0.b()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final com.vungle.ads.internal.network.r c() {
        return (com.vungle.ads.internal.network.r) this.r.getValue();
    }

    public final void d() {
        if (this.w) {
            this.a.a("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final void f() {
        this.d.a();
    }

    public final void g() {
        String str;
        String str2;
        String str3;
        String str4;
        IndexHtmlError indexHtmlError;
        int b;
        boolean z2 = false;
        this.k.set(false);
        AdConfig j = this.b.j();
        if (j != null && (b = j.getB()) > 0) {
            this.w = (b & 2) == 2;
        }
        AdConfig j2 = this.b.j();
        Integer valueOf = j2 != null ? Integer.valueOf(j2.getAdOrientation()) : null;
        this.a.setOrientation((valueOf != null && valueOf.intValue() == 0) ? 7 : (valueOf != null && valueOf.intValue() == 1) ? 6 : 4);
        this.f.a();
        this.d.a((com.vungle.ads.internal.ui.view.o) this);
        this.d.a((com.vungle.ads.internal.ui.view.p) this);
        this.d.b(false);
        if (!this.b.G()) {
            String str5 = this.b.i;
            File file = str5 != null ? new File(str5) : null;
            if (file == null || !file.exists()) {
                Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
                StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Fail to load html ");
                a.append(file != null ? file.getPath() : null);
                indexHtmlError = new IndexHtmlError(reason, a.toString());
            } else {
                this.a.a(this.d, this.b.v());
                com.vungle.ads.internal.ui.view.k kVar = this.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("file://");
                a2.append(file.getPath());
                kVar.a(a2.toString());
                indexHtmlError = null;
            }
            if (indexHtmlError != null) {
                indexHtmlError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(indexHtmlError, this.c.a);
                }
                a();
                return;
            }
        }
        this.m = Long.valueOf(System.currentTimeMillis());
        z zVar = this.s;
        this.n = zVar != null ? ((u1) zVar).r() : null;
        z zVar2 = this.s;
        if (zVar2 == null || (str = ((u1) zVar2).q()) == null) {
            str = "";
        }
        z zVar3 = this.s;
        if (zVar3 == null || (str2 = ((u1) zVar3).n()) == null) {
            str2 = "";
        }
        z zVar4 = this.s;
        if (zVar4 == null || (str3 = ((u1) zVar4).p()) == null) {
            str3 = "";
        }
        z zVar5 = this.s;
        if (zVar5 == null || (str4 = ((u1) zVar5).o()) == null) {
            str4 = "";
        }
        this.b.a(str, str2, str3, str4);
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k()) {
            PrivacyManager.INSTANCE.getClass();
            if (Intrinsics.areEqual("unknown", PrivacyManager.b())) {
                z2 = true;
            }
        }
        this.d.a(z2, ConfigManager.j(), ConfigManager.i(), ConfigManager.g(), ConfigManager.h());
        if (z2) {
            PrivacyManager.INSTANCE.getClass();
            PrivacyManager.a("opted_out_by_timeout", "vungle_modal", "");
        }
        int a3 = this.b.a(Boolean.valueOf(this.c.j()));
        if (a3 > 0) {
            ((com.vungle.ads.internal.util.o) this.u.getValue()).a(new Runnable() { // from class: com.vungle.ads.internal.presenter.r$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    r.d(r.this);
                }
            }, a3);
        } else {
            this.w = true;
        }
        a aVar2 = this.i;
        if (aVar2 != null) {
            aVar2.a("start", null, this.c.b());
        }
    }

    public final void h() {
        Long l = this.m;
        if (l != null) {
            List b = this.b.b("ad.close", String.valueOf(System.currentTimeMillis() - l.longValue()), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                    pVar.i = "ad.close";
                    pVar.j = b();
                    c().a(pVar.a(), false);
                }
            }
        }
    }

    public static final void c(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h();
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    public final com.vungle.ads.internal.util.s b() {
        return (com.vungle.ads.internal.util.s) this.v.getValue();
    }

    public final void a(z zVar) {
        this.s = zVar;
    }

    public static final void d(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w = true;
    }

    public final void a(com.vungle.ads.internal.ui.k kVar) {
        this.t = kVar;
    }

    public final void a(int i) {
        long j;
        AdSession adSession;
        a aVar;
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "detach()");
        boolean z3 = (i & 1) != 0;
        boolean z4 = (i & 2) != 0;
        com.vungle.ads.internal.ui.z zVar = this.d;
        zVar.q = null;
        zVar.o = null;
        if (!z3 && z4 && !this.k.getAndSet(true) && (aVar = this.i) != null) {
            aVar.a("end", null, this.c.a);
        }
        com.vungle.ads.internal.omsdk.e eVar = this.f;
        if (!eVar.b || (adSession = eVar.c) == null) {
            j = 0;
        } else {
            adSession.finish();
            j = com.vungle.ads.internal.omsdk.e.d;
        }
        eVar.b = false;
        eVar.c = null;
        this.a.a(j);
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "user interaction");
            this.h = System.currentTimeMillis();
            ((p0) this.x.getValue()).a(motionEvent);
        }
    }

    public final void a() {
        if (com.vungle.ads.internal.util.y.a()) {
            this.e.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.r$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    r.c(r.this);
                }
            });
        } else {
            h();
        }
        com.vungle.ads.internal.util.y.a(new e(this));
    }

    public final void a(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new h(this));
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        m2Var.c = 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.a(m2Var, b(), str);
        analyticsClient.c(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b2, code lost:
    
        r2 = java.lang.System.currentTimeMillis() - r17.h;
        r5 = com.vungle.ads.internal.ConfigManager.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02bb, code lost:
    
        if (r5 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02bd, code lost:
    
        r5 = r5.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02bf, code lost:
    
        if (r5 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c1, code lost:
    
        r5 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02c3, code lost:
    
        if (r5 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c5, code lost:
    
        r5 = r5.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d1, code lost:
    
        if (r2 <= r5) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ca, code lost:
    
        r5 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d3, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d8, code lost:
    
        if (r16 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02da, code lost:
    
        r17.h = 0;
        com.vungle.ads.internal.AnalyticsClient.a(com.vungle.ads.internal.AnalyticsClient.INSTANCE, new com.vungle.ads.internal.m2(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), b(), 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02ef, code lost:
    
        r17.h = 0;
        r2 = r17.a.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "adWidget.context");
        r0 = com.vungle.ads.internal.util.l.a(r0, r1, r2, b(), new com.vungle.ads.internal.presenter.f(r0, r17));
        r1 = r17.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030b, code lost:
    
        if (r1 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030d, code lost:
    
        r1.a("open", "adClick", r17.c.b());
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0318, code lost:
    
        if (r0 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x031a, code lost:
    
        r0 = r17.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x031c, code lost:
    
        if (r0 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x031e, code lost:
    
        r0.a("open", "adLeftApplication", r17.c.b());
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02d6, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a5, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0260, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x024f, code lost:
    
        if (r18.equals("openNonMraid") == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023a, code lost:
    
        if (r18.equals("open") == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0253, code lost:
    
        r0 = r17.b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0259, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025b, code lost:
    
        r0 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0261, code lost:
    
        r1 = com.vungle.ads.internal.util.r.a("url", r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0269, code lost:
    
        if (com.vungle.ads.internal.util.n.a(r1) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026b, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r1 + ')').setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x028f, code lost:
    
        com.vungle.ads.internal.ConfigManager.INSTANCE.getClass();
        r2 = com.vungle.ads.internal.ConfigManager.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0296, code lost:
    
        if (r2 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0298, code lost:
    
        r2 = r2.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x029a, code lost:
    
        if (r2 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x029c, code lost:
    
        r2 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x029e, code lost:
    
        if (r2 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a0, code lost:
    
        r2 = r2.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a6, code lost:
    
        if (r2 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02af, code lost:
    
        if (r17.h != 0) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String command, JsonObject arguments) {
        int i;
        Integer intOrNull;
        Object m8023constructorimpl;
        boolean z2;
        String str;
        Map map;
        boolean a;
        List a2;
        Sdk.SDKError.Reason reason;
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        switch (command.hashCode()) {
            case -1988620632:
                if (command.equals("detectBlackScreen")) {
                    String a3 = com.vungle.ads.internal.util.r.a("samplingFactor", arguments);
                    if (a3 != null && (intOrNull = StringsKt.toIntOrNull(a3)) != null) {
                        if (!(intOrNull.intValue() > 0)) {
                            intOrNull = null;
                        }
                        if (intOrNull != null) {
                            i = intOrNull.intValue();
                            this.d.a(i);
                            break;
                        }
                    }
                    i = 100;
                    this.d.a(i);
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1912374177:
                if (command.equals("successfulView")) {
                    a aVar = this.i;
                    if (aVar != null) {
                        aVar.a("successfulView", null, this.c.b());
                        Unit unit = Unit.INSTANCE;
                    }
                    if (this.c.j()) {
                        ConfigManager.INSTANCE.getClass();
                        if (ConfigManager.o() && !this.l.getAndSet(true)) {
                            this.e.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.r$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    r.e(r.this);
                                }
                            });
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1422950858:
                if (command.equals("action")) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -735200587:
                if (command.equals("actionWithValue")) {
                    String a4 = com.vungle.ads.internal.util.r.a("event", arguments);
                    String a5 = com.vungle.ads.internal.util.r.a("value", arguments);
                    if (StringsKt.equals(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, a4, true)) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(a5 != null ? Long.valueOf(Long.parseLong(a5)) : null);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                            m8023constructorimpl = null;
                        }
                        Long l = (Long) m8023constructorimpl;
                        this.y = l != null ? l.longValue() : 0L;
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -660787472:
                if (command.equals("consentAction")) {
                    String a6 = com.vungle.ads.internal.util.r.a("event", arguments);
                    PrivacyConsent privacyConsent = PrivacyConsent.OPT_OUT;
                    String value = Intrinsics.areEqual(a6, privacyConsent.getValue()) ? privacyConsent.getValue() : PrivacyConsent.OPT_IN.getValue();
                    PrivacyManager.INSTANCE.getClass();
                    PrivacyManager.a(value, "vungle_modal", null);
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -649897046:
                if (command.equals("openAppStore")) {
                    com.vungle.ads.internal.model.i c = this.b.c();
                    String a7 = c != null ? c.a() : null;
                    String a8 = com.vungle.ads.internal.util.r.a("url", arguments);
                    if (!com.vungle.ads.internal.util.n.a(a8)) {
                        new InvalidCTAUrl("Invalid InlineInstall Url (" + a8 + ')').setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    this.h = System.currentTimeMillis();
                    Context context = this.a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
                    boolean a9 = com.vungle.ads.internal.util.l.a(a7, null, context, b(), new f(a7, this));
                    if (a9) {
                        z2 = a9;
                    } else {
                        if (a8 == null || a8.length() == 0) {
                            a("url: " + a8 + ", message: url is null/empty");
                        } else {
                            Uri parse = Uri.parse(a8);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                            Intent intent = new Intent("android.intent.action.VIEW", parse);
                            intent.setPackage("com.android.vending");
                            if (!(this.a.getContext() instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                            if (intent.resolveActivity(this.a.getContext().getPackageManager()) == null) {
                                a("url: " + a8 + ", message: play store not installed");
                            } else {
                                y yVar = this.t;
                                Pair a10 = yVar != null ? ((com.vungle.ads.internal.ui.k) yVar).a(intent) : new Pair(Boolean.FALSE, null);
                                boolean booleanValue = ((Boolean) a10.component1()).booleanValue();
                                String str2 = (String) a10.component2();
                                if (!booleanValue) {
                                    a("url: " + a8 + ", message: " + str2);
                                } else {
                                    String a11 = com.iab.omid.library.vungle.d.a("url: ", a8);
                                    m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                                    m2Var.c = 1L;
                                    AnalyticsClient.INSTANCE.a(m2Var, b(), a11);
                                    z2 = true;
                                }
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        a aVar2 = this.i;
                        if (aVar2 != null) {
                            aVar2.a("open", "adClick", this.c.b());
                            Unit unit2 = Unit.INSTANCE;
                        }
                        a aVar3 = this.i;
                        if (aVar3 != null) {
                            aVar3.a("open", "adLeftApplication", this.c.b());
                            Unit unit3 = Unit.INSTANCE;
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -568000867:
                if (command.equals("pingUrl")) {
                    String a12 = com.vungle.ads.internal.util.r.a("requestType", arguments);
                    if (a12 != null) {
                        str = a12.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    } else {
                        str = null;
                    }
                    if (!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{C4701ic.a, "POST"}), str)) {
                        new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, "Invalid request type: " + str + ". Only 'GET' and 'POST' are supported").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    } else {
                        String a13 = com.vungle.ads.internal.util.r.a("url", arguments);
                        String a14 = com.vungle.ads.internal.util.r.a("requestData", arguments);
                        boolean parseBoolean = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a("retry", arguments));
                        String a15 = com.vungle.ads.internal.util.r.a("headers", arguments);
                        if (a15 != null) {
                            try {
                                Json.Default r9 = Json.Default;
                                SerializersModule serializersModule = r9.getSerializersModule();
                                KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
                                KSerializer serializer = SerializersKt.serializer(serializersModule, Reflection.typeOf(Map.class, companion3.invariant(Reflection.typeOf(String.class)), companion3.invariant(Reflection.typeOf(String.class))));
                                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                                map = (Map) r9.decodeFromString(serializer, a15);
                            } catch (Exception unused) {
                                new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, com.iab.omid.library.vungle.d.a("Failed to decode header: ", a15)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                                return true;
                            }
                        } else {
                            map = null;
                        }
                        if (!com.vungle.ads.internal.util.z.a(a13)) {
                            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else if (a13 != null) {
                            com.vungle.ads.internal.network.p a16 = new com.vungle.ads.internal.network.p(a13).a(map).a(a14).a(parseBoolean).b("pingUrl").a(b());
                            if (Intrinsics.areEqual(str, C4701ic.a)) {
                                a16.b();
                            } else {
                                a16.c();
                            }
                            Unit unit4 = Unit.INSTANCE;
                            c().a(a16.a(), false);
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -511324706:
                if (command.equals("openPrivacy")) {
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), b(), 4);
                    String a17 = com.vungle.ads.internal.util.r.a("url", arguments);
                    if (!(a17 == null || a17.length() == 0) && com.vungle.ads.internal.util.n.a(a17)) {
                        Context context2 = this.a.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
                        a = com.vungle.ads.internal.util.l.a(null, a17, context2, b(), null);
                        if (a) {
                            a aVar4 = this.i;
                            if (aVar4 != null) {
                                aVar4.a("open", "adLeftApplication", this.c.b());
                                Unit unit5 = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            new PrivacyUrlError(a17).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        }
                    } else {
                        if (a17 == null) {
                            a17 = "nonePrivacyUrl";
                        }
                        new PrivacyUrlError(a17).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case -418575596:
                break;
            case -348095344:
                if (command.equals("useCustomPrivacy")) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case 3417674:
                break;
            case 3566511:
                if (command.equals("tpat")) {
                    String a18 = com.vungle.ads.internal.util.r.a("event", arguments);
                    if (a18 == null || a18.length() == 0) {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    } else {
                        Sdk.SDKMetric.SDKMetricType sDKMetricType = (Sdk.SDKMetric.SDKMetricType) z.get(a18);
                        if (sDKMetricType != null) {
                            AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(sDKMetricType), b(), 4);
                        }
                        if (Intrinsics.areEqual(a18, "checkpoint.0")) {
                            a2 = this.b.b(a18, ((com.vungle.ads.internal.platform.c) this.g).e(), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
                        } else if (Intrinsics.areEqual(a18, "video.length")) {
                            a2 = h0.a(this.b, a18, String.valueOf(this.y), 4);
                        } else {
                            a2 = h0.a(this.b, a18, (String) null, 6);
                        }
                        if (a2 != null) {
                            Iterator it = a2.iterator();
                            while (it.hasNext()) {
                                c().a(new com.vungle.ads.internal.network.p((String) it.next()).b(a18).a(b()).a(), false);
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(a18, "checkpoint.0") && !this.j) {
                            this.j = true;
                            a aVar5 = this.i;
                            if (aVar5 != null) {
                                aVar5.a("adViewed", null, this.c.b());
                                Unit unit7 = Unit.INSTANCE;
                            }
                            Handler handler = com.vungle.ads.internal.util.y.a;
                            com.vungle.ads.internal.util.y.a(new i(this));
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case 94756344:
                if (command.equals("close")) {
                    a();
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case 96784904:
                if (command.equals("error")) {
                    String a19 = com.vungle.ads.internal.util.r.a("code", arguments);
                    boolean parseBoolean2 = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a("fatal", arguments));
                    String a20 = com.vungle.ads.internal.util.r.a("errorMessage", arguments);
                    if (parseBoolean2) {
                        reason = Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR;
                    } else {
                        reason = Sdk.SDKError.Reason.MRAID_ERROR;
                    }
                    String str3 = a19 + " : " + a20;
                    MraidTemplateError mraidTemplateError = new MraidTemplateError(reason, str3);
                    Handler handler2 = com.vungle.ads.internal.util.y.a;
                    com.vungle.ads.internal.util.y.a(new k(this, mraidTemplateError, parseBoolean2, str3));
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case 133423073:
                if (command.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h)) {
                    String a21 = com.vungle.ads.internal.util.r.a("forceOrientation", arguments);
                    if (a21 != null && a21.length() != 0) {
                        Locale ENGLISH = Locale.ENGLISH;
                        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                        String lowerCase = a21.toLowerCase(ENGLISH);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (Intrinsics.areEqual(lowerCase, "landscape")) {
                            this.a.setOrientation(6);
                            break;
                        } else if (Intrinsics.areEqual(lowerCase, "portrait")) {
                            this.a.setOrientation(7);
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case 592314818:
                if (command.equals("updateSignals")) {
                    String a22 = com.vungle.ads.internal.util.r.a("signals", arguments);
                    if (a22 != null && a22.length() != 0) {
                        ((com.vungle.ads.internal.signals.j) this.q.getValue()).b(a22);
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1496446614:
                if (command.equals("getAvailableDiskSpace")) {
                    try {
                        Context context3 = this.a.getContext();
                        File noBackupFilesDir = context3.getNoBackupFilesDir();
                        PathProvider pathProvider = (PathProvider) this.p.getValue();
                        String path = noBackupFilesDir.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "dir.path");
                        pathProvider.getClass();
                        long a23 = PathProvider.a(path);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        long a24 = com.vungle.ads.internal.util.z.a(context3);
                        Handler handler3 = com.vungle.ads.internal.util.y.a;
                        com.vungle.ads.internal.util.y.a(new l(this, a23, a24));
                        break;
                    } catch (Exception e) {
                        boolean z4 = com.vungle.ads.internal.util.u.a;
                        StringBuilder a25 = com.iab.omid.library.vungle.internal.l.a("Failed to get available disk space: ");
                        a25.append(e.getMessage());
                        com.vungle.ads.internal.util.t.b("MRAIDPresenter", a25.toString());
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1614272768:
                if (command.equals("useCustomClose")) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
            default:
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                break;
        }
        return true;
        return true;
    }

    public final void e() {
        a(new WebViewRenderProcessUnresponsive("fatal=true"), true, null);
    }

    public final void a(boolean z2, String errorDesc) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (z2) {
            WebViewError webViewError = new WebViewError(errorDesc);
            webViewError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(webViewError, this.c.a);
            }
            a();
        }
    }

    public final void a(VungleError vungleError, boolean z2, String str) {
        boolean z3 = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("handleWebViewException: ");
        a.append(vungleError.getLocalizedMessage());
        a.append(", fatal: ");
        a.append(z2);
        a.append(", errorMsg: ");
        a.append(str);
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", a.toString());
        vungleError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
        if (z2) {
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(vungleError, this.c.a);
            }
            a();
        }
    }
}
