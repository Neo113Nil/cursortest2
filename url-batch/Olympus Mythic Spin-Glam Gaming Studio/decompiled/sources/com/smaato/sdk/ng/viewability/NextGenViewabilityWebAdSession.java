package com.smaato.sdk.ng.viewability;

import android.webkit.WebView;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;

/* loaded from: classes4.dex */
public class NextGenViewabilityWebAdSession extends NextGenViewabilityAdSession {
    private static final String f = "NextGenViewabilityWebAdSession";

    public NextGenViewabilityWebAdSession(BaseViewabilityManager baseViewabilityManager) {
        super(baseViewabilityManager);
    }

    private boolean a() {
        BaseViewabilityManager baseViewabilityManager = this.d;
        return baseViewabilityManager == null || !baseViewabilityManager.isViewabilityMeasurementEnabled();
    }

    protected void b() {
        Object obj;
        if (a() || (obj = this.a) == null) {
            return;
        }
        this.b = this.d.createAdEvents(obj);
    }

    public void initAdSession(WebView webView, boolean z) {
        if (a()) {
            return;
        }
        try {
            Object createHtmlAdSessionContext = this.d.createHtmlAdSessionContext(webView);
            BaseViewabilityManager baseViewabilityManager = this.d;
            Object createAdSession = this.d.createAdSession(baseViewabilityManager.getWebAdSessionConfiguration(z, baseViewabilityManager.getOwner(z)), createHtmlAdSessionContext);
            this.a = createAdSession;
            this.d.registerAdView(createAdSession, webView);
            b();
            this.d.startAdSession(this.a);
        } catch (IllegalArgumentException e) {
            Logger.e("", e.getMessage());
        } catch (NullPointerException e2) {
            Logger.e(f, "OM SDK Ad Session - Exception", e2);
        }
    }
}
