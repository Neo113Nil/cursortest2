package com.pubmatic.sdk.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.Omid;
import com.iab.omid.library.pubmatic.adsession.AdEvents;
import com.iab.omid.library.pubmatic.adsession.AdSession;
import com.iab.omid.library.pubmatic.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.CreativeType;
import com.iab.omid.library.pubmatic.adsession.ImpressionType;
import com.iab.omid.library.pubmatic.adsession.Owner;
import com.iab.omid.library.pubmatic.adsession.Partner;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.omsdk.POBNativeMeasurement;
import java.util.List;

@Keep
/* loaded from: classes13.dex */
public class POBNativeMeasurement extends POBMeasurement implements POBNativeMeasurementProvider {

    @NonNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    class a implements POBMeasurementProvider.POBScriptListener {
        final /* synthetic */ List a;
        final /* synthetic */ View b;
        final /* synthetic */ POBNativeMeasurementProvider.POBOmidSessionListener c;

        a(List list, View view, POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
            this.a = list;
            this.b = view;
            this.c = pOBOmidSessionListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
            AdSession adSession = POBNativeMeasurement.this.adSession;
            if (adSession != null) {
                adSession.start();
                POBLog.debug(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_START_SESSION, new Object[0]);
                pOBOmidSessionListener.onOmidSessionInitialized();
            }
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onFailedToReceiveMeasurementScript(int i) {
            POBLog.error(POBOMSDKUtil.TAG, POBLogConstants.OMID_JS_SCRIPT_FAILURE, new Object[0]);
            this.c.onOmidSessionInitializationFailed();
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onMeasurementScriptReceived(String str) {
            AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(Partner.createPartner(POBCommonConstants.PARTNER_NAME, "5.1.2"), str, this.a, null, "");
            AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            POBNativeMeasurement.this.adSession = AdSession.createAdSession(createAdSessionConfiguration, createNativeAdSessionContext);
            POBNativeMeasurement.this.adSession.registerAdView(this.b);
            POBNativeMeasurement pOBNativeMeasurement = POBNativeMeasurement.this;
            pOBNativeMeasurement.adEvents = AdEvents.createAdEvents(pOBNativeMeasurement.adSession);
            Handler handler = POBNativeMeasurement.this.handler;
            final POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener = this.c;
            handler.post(new Runnable() { // from class: com.pubmatic.sdk.omsdk.POBNativeMeasurement$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    POBNativeMeasurement.a.this.a(pOBOmidSessionListener);
                }
            });
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBNativeMeasurementProvider.POBNativeAdEventType.values().length];
            a = iArr;
            try {
                iArr[POBNativeMeasurementProvider.POBNativeAdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBNativeMeasurementProvider.POBNativeAdEventType.IMPRESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider
    public void signalAdEvent(@NonNull POBNativeMeasurementProvider.POBNativeAdEventType pOBNativeAdEventType) {
        if (this.adEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_SIGNALING_EVENT, pOBNativeAdEventType.name());
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_SIGNALING_EVENT, pOBNativeAdEventType.name());
            int i = b.a[pOBNativeAdEventType.ordinal()];
            if (i == 1) {
                this.adEvents.loaded();
            } else if (i != 2) {
                POBLog.warn(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_SIGNALING_EVENT, pOBNativeAdEventType.name());
            } else {
                this.adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
            POBLog.error(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_SIGNALING_EVENT, pOBNativeAdEventType.name());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider
    public void startAdSession(@NonNull View view, @Nullable List<? extends POBVerificationScriptResource> list, @NonNull POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
        try {
            List<VerificationScriptResource> verificationScriptResourceList = POBOMSDKUtil.getVerificationScriptResourceList(list);
            if (verificationScriptResourceList.isEmpty()) {
                POBLog.error(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_START_SESSION, "Verification list is empty");
                pOBOmidSessionListener.onOmidSessionInitializationFailed();
            } else {
                Context applicationContext = view.getContext().getApplicationContext();
                if (!Omid.isActive()) {
                    Omid.activate(applicationContext);
                }
                omidJsServiceScript(applicationContext, new a(verificationScriptResourceList, view, pOBOmidSessionListener));
            }
        } catch (Exception e) {
            POBLog.error(POBOMSDKUtil.TAG, POBOMSDKLogConstants.MSG_OMSDK_UNABLE_START_SESSION, e.getMessage());
        }
    }
}
