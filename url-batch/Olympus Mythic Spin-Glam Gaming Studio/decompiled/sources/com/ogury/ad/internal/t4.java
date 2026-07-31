package com.ogury.ad.internal;

import android.webkit.WebView;
import com.ironsource.X3;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class t4 implements ri {
    public final y7 a;
    public final b b;
    public final v6 c;
    public final o0 d;
    public final u5 e;
    public v4 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;

    public t4(y7 webView, b ad, v6 webViewCache, o0 oguryAdGateway, u5 monitoringEventLogger) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(webViewCache, "webViewCache");
        Intrinsics.checkNotNullParameter(oguryAdGateway, "oguryAdGateway");
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        this.a = webView;
        this.b = ad;
        this.c = webViewCache;
        this.d = oguryAdGateway;
        this.e = monitoringEventLogger;
        webView.setClientAdapter(new s4(this));
    }

    public static final void a(t4 t4Var) {
        String str;
        if (!t4Var.j && t4Var.h && t4Var.g) {
            b bVar = t4Var.b;
            if (bVar.A.a != b5.a || t4Var.i) {
                t4Var.j = true;
                u5 u5Var = t4Var.e;
                ob obVar = ob.j;
                Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
                b5 b5Var = t4Var.b.A.a;
                Intrinsics.checkNotNullParameter(b5Var, "<this>");
                int ordinal = b5Var.ordinal();
                if (ordinal == 0) {
                    str = POBConstants.KEY_FORMAT;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "sdk";
                }
                Pair pair2 = TuplesKt.to("loaded_source", str);
                Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(t4Var.b.J));
                int i = t4Var.k;
                u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
                g5 g5Var = g5.a;
                g5.a(new th(X3.i.r, t4Var.b));
                u6 mraidCacheItem = new u6(new WeakReference(t4Var.d), t4Var.a, t4Var.b);
                t4Var.c.getClass();
                Intrinsics.checkNotNullParameter(mraidCacheItem, "mraidCacheItem");
                v6.b.put(mraidCacheItem.c.a, mraidCacheItem);
                v6.d();
                v4 v4Var = t4Var.f;
                if (v4Var != null) {
                    b ad = t4Var.b;
                    ti tiVar = (ti) v4Var;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    ui uiVar = tiVar.a;
                    int i2 = uiVar.e;
                    if (uiVar.f + i2 == uiVar.d) {
                        return;
                    }
                    uiVar.e = i2 + 1;
                    y4 y4Var = uiVar.i;
                    if (y4Var != null) {
                        y4Var.a();
                    }
                    ui uiVar2 = tiVar.a;
                    int i3 = uiVar2.e;
                    if (uiVar2.f + i3 != uiVar2.d || uiVar2.g) {
                        return;
                    }
                    if (i3 > 0) {
                        uiVar2.a(ad);
                        return;
                    }
                    lb lbVar = lb.d;
                    String str2 = uiVar2.m;
                    uiVar2.h.removeCallbacksAndMessages(null);
                    uiVar2.g = true;
                    l0 l0Var = uiVar2.l;
                    if (l0Var != null) {
                        kb.a(l0Var, ad, lbVar, str2, 28);
                    }
                }
            }
        }
    }

    @Override // com.ogury.ad.internal.ri
    public final void destroy() {
        this.f = null;
        this.a.setClientAdapter(null);
        this.a.setDestroyed(true);
        zi.a((WebView) this.a);
    }

    @Override // com.ogury.ad.internal.ri
    public final void a(v4 loadCallback, int i) {
        String str;
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        this.k = i;
        b ad = this.b;
        ti tiVar = (ti) loadCallback;
        tiVar.getClass();
        Intrinsics.checkNotNullParameter(ad, "ad");
        tiVar.a.j = ad;
        u5 u5Var = this.e;
        ob obVar = ob.g;
        b bVar = this.b;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
        b5 b5Var = this.b.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str = POBConstants.KEY_FORMAT;
        } else if (ordinal == 1) {
            str = "sdk";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        u5Var.a(obVar, bVar, pb.a(pair, TuplesKt.to("loaded_source", str), TuplesKt.to("reload", Boolean.valueOf(this.b.J)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        this.f = loadCallback;
        y7 y7Var = this.a;
        b ad2 = this.b;
        Intrinsics.checkNotNullParameter(y7Var, "<this>");
        Intrinsics.checkNotNullParameter(ad2, "ad");
        String str2 = ad2.i;
        if (str2.length() == 0) {
            str2 = "http://ads-test.st.ogury.com/";
        }
        String str3 = str2;
        String str4 = ad2.c;
        if (str4.length() == 0) {
            str4 = "The ad contains no ad_content";
        }
        try {
            y7Var.loadDataWithBaseURL(str3, str4, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        } catch (Throwable th) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, th);
        }
    }

    @Override // com.ogury.ad.internal.ri
    public final boolean a() {
        return this.j;
    }
}
