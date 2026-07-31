package com.pubmatic.sdk.omsdk;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubmatic.Omid;
import com.iab.omid.library.pubmatic.adsession.AdEvents;
import com.iab.omid.library.pubmatic.adsession.AdSession;
import com.iab.omid.library.pubmatic.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.CreativeType;
import com.iab.omid.library.pubmatic.adsession.ImpressionType;
import com.iab.omid.library.pubmatic.adsession.Owner;
import com.iab.omid.library.pubmatic.adsession.Partner;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider;

@Keep
/* loaded from: classes14.dex */
public class POBHTMLMeasurement extends POBMeasurement implements POBHTMLMeasurementProvider {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBHTMLMeasurementProvider.POBHTMLAdEventType.values().length];
            a = iArr;
            try {
                iArr[POBHTMLMeasurementProvider.POBHTMLAdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBHTMLMeasurementProvider.POBHTMLAdEventType.IMPRESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider
    public void signalAdEvent(@NonNull POBHTMLMeasurementProvider.POBHTMLAdEventType pOBHTMLAdEventType) {
        if (this.adEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_SIGNALING_EVENT, pOBHTMLAdEventType.name());
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_SIGNALING_EVENT, pOBHTMLAdEventType.name());
            int i = a.a[pOBHTMLAdEventType.ordinal()];
            if (i == 1) {
                this.adEvents.loaded();
            } else {
                if (i != 2) {
                    return;
                }
                this.adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
            POBLog.error(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_SIGNALING_EVENT, pOBHTMLAdEventType.name());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider
    public void startAdSession(@NonNull WebView webView) {
        try {
            Context applicationContext = webView.getContext().getApplicationContext();
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(POBCommonConstants.PARTNER_NAME, "5.1.2"), webView, null, ""));
            this.adSession = createAdSession;
            createAdSession.registerAdView(webView);
            this.adEvents = AdEvents.createAdEvents(this.adSession);
            this.adSession.start();
            POBLog.debug(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_START_SESSION, new Object[0]);
        } catch (Exception e) {
            POBLog.error(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_START_SESSION, e.getMessage());
        }
    }
}
