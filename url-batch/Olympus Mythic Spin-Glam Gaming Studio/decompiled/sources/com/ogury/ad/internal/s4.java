package com.ogury.ad.internal;

import android.net.Uri;
import android.webkit.WebView;
import com.ironsource.X3;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s4 extends z7 {
    public final /* synthetic */ t4 a;

    public s4(t4 t4Var) {
        this.a = t4Var;
    }

    @Override // com.ogury.ad.internal.z7
    public final void a() {
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        b bVar = this.a.b;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + bVar.x.b + "][Load][" + bVar.n.a + "][" + bVar.g + "] A problem occurred on the format side (unloading required)");
        t4 t4Var = this.a;
        y7 y7Var = t4Var.a;
        b bVar2 = t4Var.b;
        zi.a((WebView) y7Var);
        g5 g5Var = g5.a;
        g5.a(new th("loaded_error", bVar2));
        t4 t4Var2 = this.a;
        v4 v4Var = t4Var2.f;
        if (v4Var != null) {
            b ad = t4Var2.b;
            ti tiVar = (ti) v4Var;
            Intrinsics.checkNotNullParameter(ad, "ad");
            l0 l0Var = tiVar.a.l;
            if (l0Var != null) {
                l0Var.a(ad);
            }
            ui uiVar = tiVar.a;
            int i = uiVar.e;
            int i2 = uiVar.f;
            if (i + i2 == uiVar.d) {
                uiVar.f = i2 + 1;
                uiVar.e = i - 1;
                return;
            }
            uiVar.f = i2 + 1;
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
            lb lbVar = lb.e;
            uiVar2.h.removeCallbacksAndMessages(null);
            uiVar2.g = true;
            l0 l0Var2 = uiVar2.l;
            if (l0Var2 != null) {
                kb.a(l0Var2, ad, lbVar, null, 28);
            }
        }
    }

    @Override // com.ogury.ad.internal.z7
    public final void b(WebView webView, String url) {
        String str;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        logger.d(logTag, sourceTag, "onPageFinished");
        t4 t4Var = this.a;
        t4Var.g = true;
        b bVar = t4Var.b;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + bVar.x.b + "][Load][" + bVar.n.a + "][" + bVar.g + "] WebView -> OK");
        v4 v4Var = this.a.f;
        if (v4Var != null) {
            si loadPhase = si.b;
            Intrinsics.checkNotNullParameter(loadPhase, "loadPhase");
            ((ti) v4Var).a.c.add(loadPhase);
        }
        t4 t4Var2 = this.a;
        u5 u5Var = t4Var2.e;
        ob obVar = ob.h;
        b bVar2 = t4Var2.b;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar2.H));
        b5 b5Var = this.a.b.A.a;
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
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(this.a.b.J));
        int i = this.a.k;
        u5Var.a(obVar, bVar2, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        t4.a(this.a);
    }

    @Override // com.ogury.ad.internal.z7
    public final void a(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        t4 t4Var = this.a;
        boolean z = t4Var.g;
        v4 v4Var = t4Var.f;
        if (v4Var != null) {
            ((ti) v4Var).a(t4Var.b, errorMessage, z);
        }
        if (z) {
            return;
        }
        g5 g5Var = g5.a;
        g5.a(new th("loaded_error", t4Var.b));
        t4Var.destroy();
    }

    @Override // com.ogury.ad.internal.z7
    public final void a(boolean z, Uri failingUri) {
        Intrinsics.checkNotNullParameter(failingUri, "failingUri");
        zi.a((WebView) this.a.a);
        t4 t4Var = this.a;
        v4 v4Var = t4Var.f;
        if (v4Var != null) {
            ((ti) v4Var).a(t4Var.b, z, failingUri);
        }
    }

    @Override // com.ogury.ad.internal.z7
    public final void a(y7 webView) {
        String str;
        Intrinsics.checkNotNullParameter(webView, "webView");
        t4 t4Var = this.a;
        t4Var.i = true;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        b bVar = t4Var.b;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + bVar.x.b + "][Load][" + bVar.n.a + "][" + bVar.g + "] Format -> OK");
        v4 v4Var = this.a.f;
        if (v4Var != null) {
            si loadPhase = si.c;
            Intrinsics.checkNotNullParameter(loadPhase, "loadPhase");
            ((ti) v4Var).a.c.add(loadPhase);
        }
        t4 t4Var2 = this.a;
        b bVar2 = t4Var2.b;
        if (bVar2.A.a == b5.a) {
            u5 u5Var = t4Var2.e;
            ob obVar = ob.i;
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar2.H));
            b5 b5Var = this.a.b.A.a;
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
            Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(this.a.b.J));
            int i = this.a.k;
            u5Var.a(obVar, bVar2, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        }
        t4.a(this.a);
    }

    @Override // com.ogury.ad.internal.z7
    public final void b(y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        t4 t4Var = this.a;
        t4Var.h = true;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        b bVar = t4Var.b;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + bVar.x.b + "][Load][" + bVar.n.a + "][" + bVar.g + "] Mraid -> OK");
        v4 v4Var = this.a.f;
        if (v4Var != null) {
            si loadPhase = si.d;
            Intrinsics.checkNotNullParameter(loadPhase, "loadPhase");
            ((ti) v4Var).a.c.add(loadPhase);
        }
        t4.a(this.a);
    }
}
