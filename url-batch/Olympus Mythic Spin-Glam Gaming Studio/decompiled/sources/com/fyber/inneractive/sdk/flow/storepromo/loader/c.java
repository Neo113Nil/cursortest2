package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* loaded from: classes15.dex */
public final class c implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ d b;

    public c(d dVar, String str) {
        this.b = dVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.b.a;
        String str = this.a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.a;
        if (aVar != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(aVar, null, str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
            } catch (Throwable th) {
                if (fVar.e != null) {
                    fVar.e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th.getMessage(), "");
                }
            }
        }
    }
}
