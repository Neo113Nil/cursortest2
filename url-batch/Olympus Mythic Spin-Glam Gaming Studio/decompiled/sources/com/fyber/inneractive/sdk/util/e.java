package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.ironsource.B5;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* loaded from: classes6.dex */
public final class e implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e b;

    public e(com.fyber.inneractive.sdk.web.e eVar, String str) {
        this.b = eVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.b;
        Object obj = this.a;
        eVar.getClass();
        String str = (String) obj;
        String str2 = s.a() ? com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v : com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u;
        if (!TextUtils.isEmpty(str) && !eVar.a.isTerminated() && !eVar.a.isShutdown()) {
            if (TextUtils.isEmpty(eVar.k)) {
                eVar.l.p = str2.concat("wv.inner-active.mobi/");
            } else {
                eVar.l.p = str2 + eVar.k;
            }
            if (eVar.f) {
                return;
            }
            com.fyber.inneractive.sdk.web.i iVar = eVar.l;
            com.fyber.inneractive.sdk.web.m mVar = iVar.b;
            if (mVar != null) {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(mVar, iVar.p, str, POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
                eVar.l.q = str;
            } else {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_TO_WEBVIEW);
                com.fyber.inneractive.sdk.web.g gVar = iVar.f;
                if (gVar != null) {
                    gVar.a(iVar, inneractiveInfrastructureError);
                }
                iVar.b(true);
            }
        } else if (!eVar.a.isTerminated() && !eVar.a.isShutdown()) {
            com.fyber.inneractive.sdk.web.i iVar2 = eVar.l;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_FINAL_HTML);
            com.fyber.inneractive.sdk.web.g gVar2 = iVar2.f;
            if (gVar2 != null) {
                gVar2.a(iVar2, inneractiveInfrastructureError2);
            }
            iVar2.b(true);
        }
        eVar.f = true;
        eVar.a.shutdownNow();
        Handler handler = eVar.b;
        if (handler != null) {
            d dVar = eVar.d;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            e eVar2 = eVar.c;
            if (eVar2 != null) {
                eVar.b.removeCallbacks(eVar2);
            }
            eVar.b = null;
        }
        eVar.l.o = null;
    }
}
