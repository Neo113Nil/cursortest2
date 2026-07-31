package com.ogury.ad.internal;

import com.ironsource.X3;
import com.ogury.ad.OguryAdError;
import com.ogury.ad.viewer.AdsCallback;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class a0 {
    public m0 a;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public final ArrayList f = new ArrayList();
    public int g;
    public boolean h;

    public final void a(x xVar, c cVar, String str, AdsCallback adsCallback) {
        if (this.f.contains(str)) {
            return;
        }
        this.f.add(str);
        LogTag logTag = LogTag.REQUESTS;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Impression");
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Triggering onAdImpression() callback");
        a(adsCallback, xVar.b, cVar != null ? cVar.a : null);
        if (adsCallback != null) {
            adsCallback.onAdImpression();
        }
    }

    public final void b(x xVar, c cVar, AdsCallback adsCallback) {
        if (this.c) {
            this.c = false;
            IntegrationLogger.d(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Ad successfully shown!");
            a(adsCallback, xVar.b, cVar != null ? cVar.a : null);
        }
    }

    public final void c(x xVar, c cVar, AdsCallback adsCallback) {
        if (this.e) {
            if (this.g == this.b || this.h) {
                this.e = false;
                LogTag logTag = LogTag.REQUESTS;
                SourceTag sourceTag = SourceTag.ADS;
                IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Ad closed");
                IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Triggering onAdClosed() callback");
                a(adsCallback, xVar.b, cVar != null ? cVar.a : null);
                if (adsCallback != null) {
                    adsCallback.onAdClosed();
                }
                m0 m0Var = this.a;
                if (m0Var != null) {
                    m0Var.mo4828invoke();
                }
            }
        }
    }

    public final void a(x xVar, c cVar, AdsCallback adsCallback) {
        if (this.d) {
            this.d = false;
            LogTag logTag = LogTag.REQUESTS;
            SourceTag sourceTag = SourceTag.ADS;
            IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Ad clicked");
            IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Triggering onAdClicked() callback");
            a(adsCallback, xVar.b, cVar != null ? cVar.a : null);
            if (adsCallback != null) {
                adsCallback.onAdClicked();
            }
        }
    }

    public static void a(w7 w7Var, x xVar, c cVar, Function1 function1) {
        LogTag logTag = LogTag.REQUESTS;
        SourceTag sourceTag = SourceTag.ADS;
        String str = xVar.b;
        String str2 = cVar != null ? cVar.a : null;
        tg tgVar = w7Var.c;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + str + "][Show][" + str2 + "] Reward: " + tgVar.b + " " + tgVar.a);
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Triggering onAdRewarded() callback");
        a(function1, xVar.b, cVar != null ? cVar.a : null);
        if (function1 != null) {
            function1.invoke(w7Var.c);
        }
    }

    public static void a(q7 q7Var, x xVar, c cVar, AdsCallback adsCallback) {
        LogTag logTag = LogTag.REQUESTS;
        SourceTag sourceTag = SourceTag.ADS;
        String str = xVar.b;
        String str2 = cVar != null ? cVar.a : null;
        IntegrationLogger.e(logTag, sourceTag, X3.j.d + str + "][Show][" + str2 + "]* Failed to show (error code: " + q7Var.c + ")");
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + xVar.b + "][Show][" + (cVar != null ? cVar.a : null) + "] Triggering onAdError() callback");
        a(adsCallback, xVar.b, cVar != null ? cVar.a : null);
        if (adsCallback != null) {
            adsCallback.onAdError(new OguryAdError(OguryAdError.Type.SHOW_ERROR, q7Var.c, "No ad has been loaded."));
        }
    }

    public static void a(AdsCallback adsCallback, String str, String str2) {
        if (adsCallback == null) {
            IntegrationLogger.d(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + str + "][Show][" + str2 + "] No ad listener registered");
        }
    }

    public static void a(Function1 function1, String str, String str2) {
        if (function1 == null) {
            IntegrationLogger.d(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + str + "][Show][" + str2 + "] No ad listener registered");
        }
    }
}
