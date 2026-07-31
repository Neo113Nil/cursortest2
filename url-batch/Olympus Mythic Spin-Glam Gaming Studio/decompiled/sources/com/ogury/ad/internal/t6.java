package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.iab.omid.library.ogury.Omid;
import com.iab.omid.library.ogury.adsession.AdSession;
import com.ogury.core.internal.DebugUtils;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.ogury.core.internal.network.NetworkClient;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class t6 {
    public dh A;
    public z B;
    public z C;
    public boolean D;
    public final Application a;
    public final le b;
    public final vh c;
    public final b2 d;
    public final s7 e;
    public final g f;
    public final z g;
    public final sg h;
    public boolean i;
    public final a3 j;
    public final q0 k;
    public final f l;
    public final u5 m;
    public boolean n;
    public y7 o;
    public w6 p;
    public boolean q;
    public e8 s;
    public b t;
    public a2 v;
    public z z;
    public boolean r = true;
    public List u = new ArrayList();
    public final rg w = new rg();
    public final View.OnLayoutChangeListener x = b();
    public int y = 1;

    public t6(j6 j6Var) {
        this.a = j6Var.a;
        this.b = j6Var.e;
        this.c = j6Var.f;
        this.d = j6Var.g;
        this.e = j6Var.h;
        this.f = j6Var.b;
        this.g = j6Var.c;
        this.h = j6Var.i;
        this.i = j6Var.d;
        this.j = j6Var.j;
        this.k = j6Var.k;
        this.l = j6Var.m;
        this.m = j6Var.l;
        n8 n8Var = n8.a;
        this.z = n8Var;
        this.B = n8Var;
        this.C = n8Var;
    }

    public final void a(int i) {
        if (this.y != 4) {
            this.y = i;
        }
    }

    public final View.OnLayoutChangeListener b() {
        return new View.OnLayoutChangeListener() { // from class: com.ogury.ad.internal.t6$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                t6.a(t6.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
    }

    public final void c() {
        String str;
        v9 v9Var;
        AdSession adSession;
        String str2;
        if (this.y != 4) {
            Logger.INSTANCE.w(LogTag.MRAID, SourceTag.ADS, "destroying ad");
            a(4);
            this.j.destroy();
            e8 e8Var = this.s;
            y7 obj = null;
            if (e8Var != null) {
                ArrayList a = e8Var.e.a();
                int size = a.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = a.get(i);
                    i++;
                    y7 webView = (y7) obj2;
                    t7 t7Var = webView.p;
                    t7Var.getClass();
                    Intrinsics.checkNotNullParameter(webView, "webView");
                    t7Var.c.a(webView.getMraidCommandExecutor());
                }
                z9 z9Var = e8Var.f;
                try {
                    z9Var.a.unregisterReceiver(z9Var.d);
                } catch (Exception e) {
                    oh.a(e);
                }
                c2 c2Var = e8Var.i;
                try {
                    c2Var.a.unregisterReceiver(c2Var.c);
                } catch (Throwable th) {
                    oh.a(th);
                }
                h8 h8Var = e8Var.j;
                if (h8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("multiWebViewUrlHandler");
                    h8Var = null;
                }
                h8Var.b = null;
            }
            a2 a2Var = this.v;
            if (a2Var != null) {
                a2Var.f.removeCallbacksAndMessages(null);
            }
            b bVar = this.t;
            if (bVar == null || (str = bVar.b) == null) {
                str = "";
            }
            if (!this.n && bVar != null) {
                u5 u5Var = this.m;
                ob obVar = ob.C;
                Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
                b5 b5Var = bVar.A.a;
                Intrinsics.checkNotNullParameter(b5Var, "<this>");
                int ordinal = b5Var.ordinal();
                if (ordinal == 0) {
                    str2 = POBConstants.KEY_FORMAT;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = "sdk";
                }
                Pair pair2 = TuplesKt.to("loaded_source", str2);
                Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
                int i2 = bVar.K;
                u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)));
            }
            s7 s7Var = this.e;
            r7 r7Var = new r7(str, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.ah);
            s7Var.getClass();
            s7.a(r7Var);
            x9 x9Var = this.c.a;
            if (Omid.isActive() && (v9Var = x9Var.a) != null && (adSession = v9Var.a) != null) {
                adSession.finish();
            }
            g gVar = this.f;
            gVar.f = null;
            gVar.h = null;
            gVar.i = null;
            gVar.j = null;
            gVar.k = null;
            gVar.g = null;
            gVar.l = null;
            gVar.removeAllViews();
            this.z = n8.a;
            y7 y7Var = this.o;
            if (y7Var != null) {
                y7Var.d = null;
                y7Var.setClientAdapter(null);
                y7Var.i = f2.b;
                y7Var.g = null;
                if (DebugUtils.INSTANCE.isDebug()) {
                    y7 y7Var2 = this.o;
                    if (y7Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                    } else {
                        obj = y7Var2;
                    }
                    Intrinsics.checkNotNullParameter(obj, "obj");
                }
            }
        }
    }

    public final void d() {
        y7 y7Var = this.o;
        w6 w6Var = null;
        if (y7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var = null;
        }
        if (!y7Var.k) {
            Logger.INSTANCE.w(LogTag.MRAID, SourceTag.ADS, "ad already paused");
            return;
        }
        Logger.INSTANCE.w(LogTag.MRAID, SourceTag.ADS, "pauseAd");
        y7 y7Var2 = this.o;
        if (y7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var2 = null;
        }
        y7Var2.setResumed(false);
        ViewGroup parentAsViewGroup = this.f.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeOnLayoutChangeListener(this.x);
        }
        d dVar = new d();
        dVar.c = 0.0f;
        w6 w6Var2 = this.p;
        if (w6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mraidCommandExecutor");
        } else {
            w6Var = w6Var2;
        }
        w6Var.a(dVar);
    }

    public final void e() {
        ViewGroup parentAsViewGroup;
        y7 y7Var = this.o;
        y7 y7Var2 = null;
        if (y7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var = null;
        }
        if (y7Var.k) {
            Logger.INSTANCE.w(LogTag.MRAID, SourceTag.ADS, "ad already resumed");
            return;
        }
        Logger.INSTANCE.w(LogTag.MRAID, SourceTag.ADS, "resumeAd");
        y7 y7Var3 = this.o;
        if (y7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            y7Var2 = y7Var3;
        }
        y7Var2.setResumed(true);
        if (this.i && (parentAsViewGroup = this.f.getParentAsViewGroup()) != null) {
            parentAsViewGroup.addOnLayoutChangeListener(this.x);
        }
        if (this.y != 2) {
            a(1);
        }
        this.j.a();
    }

    public final void f() {
        String str;
        b bVar = this.t;
        if (bVar == null || (str = bVar.b) == null) {
            str = "";
        }
        s7 s7Var = this.e;
        r7 r7Var = new r7(str, "closeWhithoutShowNextAd");
        s7Var.getClass();
        s7.a(r7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ee, code lost:
    
        if (r11.f == true) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.iab.omid.library.ogury.adsession.AdSessionContext] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [com.iab.omid.library.ogury.adsession.AdSession] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [com.iab.omid.library.ogury.adsession.AdSessionConfiguration] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b ad, List notDisplayedAds) {
        String str;
        y7 mraidWebView;
        y7 adWebView;
        y7 y7Var;
        ?? r11;
        a2 a2Var;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(notDisplayedAds, "notDisplayedAds");
        u5 u5Var = this.m;
        ob obVar = ob.s;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
        b5 b5Var = ad.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str = POBConstants.KEY_FORMAT;
        } else if (ordinal == 1) {
            str = "sdk";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair2 = TuplesKt.to("loaded_source", str);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
        int i = ad.K;
        u5Var.a(obVar, ad, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        this.u = notDisplayedAds;
        this.t = ad;
        f fVar = this.l;
        fVar.g = ad;
        a3 a3Var = this.j;
        if (a3Var != null) {
            a3Var.a(fVar);
        }
        fVar.h = a3Var;
        this.C.a(this.f, this);
        g frameLayout = this.f;
        Intrinsics.checkNotNullParameter(ad, "<this>");
        if (!ad.x.a()) {
            b2 b2Var = this.d;
            Application context = this.a;
            Intrinsics.checkNotNullParameter(context, "context");
            if (z8.c == null) {
                int millis = (int) TimeUnit.SECONDS.toMillis(le.b.b.a);
                Context context2 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                Context applicationContext = context2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                z8.c = new z8(new m3(applicationContext), new NetworkClient(millis, millis * 5));
            }
            z8 oguryApi = z8.c;
            Intrinsics.checkNotNull(oguryApi);
            String closeButtonUrl = ad.r;
            b2Var.getClass();
            Intrinsics.checkNotNullParameter(this, "adController");
            Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
            Intrinsics.checkNotNullParameter(oguryApi, "oguryApi");
            Intrinsics.checkNotNullParameter(closeButtonUrl, "closeButtonUrl");
            this.v = new a2(this, frameLayout, oguryApi, closeButtonUrl);
        }
        g3 foregroundHandlerFactory = new g3(this.a, this);
        Application context3 = this.a;
        g activityRoot = this.f;
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(activityRoot, "activityRoot");
        Intrinsics.checkNotNullParameter(foregroundHandlerFactory, "mraidHandlersFactory");
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(...)");
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap2, "synchronizedMap(...)");
        v1 v1Var = new v1(context3, activityRoot, ad);
        f8 f8Var = new f8(synchronizedMap, synchronizedMap2);
        z9 z9Var = new z9(context3, f8Var);
        c2 c2Var = new c2(context3, f8Var);
        g5 g5Var = g5.a;
        e8 multiWebViewBrowser = new e8(ad, synchronizedMap, synchronizedMap2, v1Var, f8Var, z9Var, u5.e.a(context3), foregroundHandlerFactory, c2Var);
        multiWebViewBrowser.j = new h8(multiWebViewBrowser, f8Var);
        this.s = multiWebViewBrowser;
        k6 newWebViewCreatedCallback = new k6(this);
        Intrinsics.checkNotNullParameter(newWebViewCreatedCallback, "newWebViewCreatedCallback");
        h8 h8Var = multiWebViewBrowser.j;
        if (h8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("multiWebViewUrlHandler");
            h8Var = null;
        }
        h8Var.b = newWebViewCreatedCallback;
        l6 newForceCloseCallback = new l6(this);
        Intrinsics.checkNotNullParameter(newForceCloseCallback, "newForceCloseCallback");
        Intrinsics.checkNotNullParameter(ad, "<this>");
        if (!ad.x.a()) {
            h8 h8Var2 = multiWebViewBrowser.j;
            if (h8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("multiWebViewUrlHandler");
                h8Var2 = null;
            }
            h8Var2.c = newForceCloseCallback;
        }
        m6 handleOnRenderProcessGone = new m6(this, ad);
        Intrinsics.checkNotNullParameter(multiWebViewBrowser, "multiWebViewBrowser");
        Intrinsics.checkNotNullParameter(foregroundHandlerFactory, "foregroundHandlerFactory");
        Intrinsics.checkNotNullParameter(handleOnRenderProcessGone, "handleOnRenderProcessGone");
        v6 v6Var = v6.a;
        h8 h8Var3 = multiWebViewBrowser.j;
        if (h8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("multiWebViewUrlHandler");
            h8Var3 = null;
        }
        qi qiVar = new qi(h8Var3, foregroundHandlerFactory, handleOnRenderProcessGone);
        Intrinsics.checkNotNullParameter(ad, "ad");
        qiVar.e = ad;
        String cacheId = ad.a;
        Intrinsics.checkNotNullParameter(cacheId, "cacheId");
        ConcurrentHashMap concurrentHashMap = v6.b;
        if (concurrentHashMap.containsKey(cacheId)) {
            u6 u6Var = (u6) concurrentHashMap.get(cacheId);
            mraidWebView = u6Var != null ? u6Var.b : null;
            concurrentHashMap.remove(cacheId);
            if (mraidWebView != null) {
            }
            if (mraidWebView != null) {
                adWebView = null;
            } else {
                qiVar.d = mraidWebView;
                x7 x7Var = qiVar.a;
                g3 g3Var = qiVar.b;
                Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
                Context context4 = g3Var.a;
                w6 mraidCommandExecutor = mraidWebView.getMraidCommandExecutor();
                t6 t6Var = g3Var.b;
                s7 s7Var = s7.a;
                mraidWebView.setMraidUrlHandler(new f2(new x7[]{x7Var, new j3(context4, mraidCommandExecutor, t6Var, ne.g.a(g3Var.a), new r0(g3Var.a), new q0(g3Var.a))}));
                mraidWebView.getSettings().setJavaScriptEnabled(true);
                zi.a(mraidWebView);
                zi.b(mraidWebView);
                y7 y7Var2 = qiVar.d;
                if (y7Var2 != null) {
                    y7Var2.setClientAdapter(new pi(qiVar));
                }
                y7 webView = qiVar.d;
                if (webView != null) {
                    t7 t7Var = webView.p;
                    t7Var.getClass();
                    Intrinsics.checkNotNullParameter(webView, "webView");
                    t7Var.a.a(webView.getMraidCommandExecutor());
                }
                adWebView = qiVar.d;
            }
            if (adWebView == null) {
                this.o = adWebView;
                this.p = adWebView.getMraidCommandExecutor();
                String webViewName = ad.k;
                if (webViewName.length() == 0) {
                    webViewName = "controller";
                }
                boolean z = ad.w;
                Intrinsics.checkNotNullParameter(webViewName, "webViewName");
                Intrinsics.checkNotNullParameter(adWebView, "webView");
                adWebView.setTag(webViewName);
                synchronizedMap.put(webViewName, adWebView);
                synchronizedMap2.put(webViewName, new xi(false, z, "", 48));
                this.b.getClass();
                pf profig = le.b;
                of ofVar = profig.d.f;
                this.q = ofVar.a;
                this.r = ofVar.b;
                a2 a2Var2 = this.v;
                if (a2Var2 != null) {
                    a2Var2.a(TimeUnit.SECONDS.toMillis(ofVar.d));
                }
                if (adWebView.getShowSdkCloseButton() || (a2Var = this.v) == null) {
                    y7Var = null;
                } else {
                    y7Var = null;
                    a2Var.f.removeCallbacksAndMessages(null);
                    a2Var.e.setVisibility(8);
                }
                this.f.addView(adWebView, new FrameLayout.LayoutParams(-1, -1));
                x xVar = ad.x;
                xVar.getClass();
                if (xVar == x.f && !this.i) {
                    rg rgVar = this.w;
                    ja jaVar = ad.m;
                    rgVar.b = jaVar.b;
                    rgVar.c = jaVar.c;
                    this.f.setInitialSize(rgVar);
                    this.f.setupDrag(ad.m.a);
                }
                vh vhVar = this.c;
                vhVar.getClass();
                Intrinsics.checkNotNullParameter(profig, "profig");
                Intrinsics.checkNotNullParameter(ad, "ad");
                Intrinsics.checkNotNullParameter(adWebView, "webView");
                if (profig.f.a && ad.p) {
                    x9 x9Var = vhVar.a;
                    boolean z2 = ad.q;
                    Intrinsics.checkNotNullParameter(adWebView, "webView");
                    if (Omid.isActive()) {
                        v9 v9Var = new v9();
                        x9Var.a = v9Var;
                        Intrinsics.checkNotNullParameter(adWebView, "adWebView");
                        Intrinsics.checkNotNullParameter(adWebView, "adWebView");
                        try {
                            q9 a = p9.a(adWebView, z2);
                            AdSession createAdSession = AdSession.createAdSession(a != null ? a.b : y7Var, a != null ? a.a : y7Var);
                            createAdSession.registerAdView(adWebView);
                            r11 = createAdSession;
                        } catch (Exception e) {
                            r9.a(e);
                            r11 = y7Var;
                        }
                        v9Var.a = r11;
                        if (r11 != 0) {
                            r11.start();
                        }
                    }
                }
                this.f.setAdLayoutChangeListener(new r6(this));
                y7 y7Var3 = this.o;
                if (y7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    y7Var3 = y7Var;
                }
                y7Var3.setVisibilityChangedListener(new s6(this));
                this.f.setOnWindowGainFocusListener(new n6(this));
                this.f.setOnWindowLoseFocusListener(new o6(this));
                this.f.setOnAttachToWindowListener(new p6(this));
                this.f.setOnDetachFromWindowListener(new q6(this));
                return;
            }
            throw new IllegalStateException("WebView must not be null");
        }
        mraidWebView = null;
        if (mraidWebView != null) {
        }
        if (adWebView == null) {
        }
    }

    public static final void a(t6 this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        y7 y7Var = this$0.o;
        if (y7Var == null || Intrinsics.areEqual(y7Var.getAdState(), "hidden")) {
            return;
        }
        y7 y7Var2 = this$0.o;
        if (y7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var2 = null;
        }
        if (zi.d(y7Var2)) {
            this$0.j.a();
        }
    }

    public final boolean a() {
        y7 y7Var = this.o;
        y7 y7Var2 = null;
        if (y7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var = null;
        }
        if (Intrinsics.areEqual(y7Var.getAdState(), "expanded")) {
            return true;
        }
        if (!this.i) {
            return false;
        }
        y7 y7Var3 = this.o;
        if (y7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            y7Var2 = y7Var3;
        }
        return Intrinsics.areEqual(y7Var2.getAdState(), "default");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0.x.a() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        y7 y7Var = this.o;
        w6 w6Var = null;
        if (y7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var = null;
        }
        if (y7Var.l) {
            b bVar = this.t;
            if (bVar != null) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
            }
            this.B.a(this.f, this);
            if (z) {
                f();
                return;
            }
            return;
        }
        y7 y7Var2 = this.o;
        if (y7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var2 = null;
        }
        if (!Intrinsics.areEqual(y7Var2.getAdState(), "default") && !this.i) {
            y7 y7Var3 = this.o;
            if (y7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                y7Var3 = null;
            }
            y7Var3.setMultiBrowserOpened(false);
            y7 y7Var4 = this.o;
            if (y7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                y7Var4 = null;
            }
            y7Var4.setVisibility(0);
            this.f.c();
            this.z.a(this.f, this);
            w6 w6Var2 = this.p;
            if (w6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mraidCommandExecutor");
            } else {
                w6Var = w6Var2;
            }
            w6Var.getClass();
            Intrinsics.checkNotNullParameter("default", "state");
            b8.a(w6Var.a, x6.c("default"));
            w6Var.a.setAdState("default");
            return;
        }
        this.B.a(this.f, this);
        if (z) {
        }
    }
}
