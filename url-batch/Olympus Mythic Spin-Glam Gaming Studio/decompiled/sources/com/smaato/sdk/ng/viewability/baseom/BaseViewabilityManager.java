package com.smaato.sdk.ng.viewability.baseom;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.smaato.sdk.ng.utils.Logger;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseViewabilityManager {
    private Object a = null;
    private boolean b = true;

    public BaseViewabilityManager(final Application application) {
        final String tag = getTag() != null ? getTag() : BaseViewabilityManager.class.getSimpleName();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseViewabilityManager.this.a(application, tag);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Application application, String str) {
        try {
            if (!isOmActive()) {
                activateOmId(application);
            }
        } catch (IllegalArgumentException unused) {
            Logger.e(str, "Could not initialise Omid");
        }
        if (isOmActive() && this.a == null) {
            try {
                this.a = createPartner();
            } catch (IllegalArgumentException unused2) {
                Logger.e(str, "Could not initialise Omid");
            }
        }
    }

    public abstract void activateOmId(Application application);

    public abstract void addFriendlyObstruction(Object obj, View view, Enum r3, String str);

    public abstract <T> T createAdEvents(Object obj);

    public abstract <T> T createAdSession(T t, T t2);

    public abstract <T> T createHtmlAdSessionContext(WebView webView);

    public abstract <T> T createMediaEvents(T t);

    public abstract <T> T createNativeAdSessionContext(List<BaseVerificationScriptResource> list);

    public abstract <T> T createPartner();

    public abstract <T> T createVastPropertiesForNonSkippableMedia();

    public abstract <T> T createVastPropertiesForSkippableMedia(Integer num);

    public abstract void fireEventProperties(Object obj, Object obj2);

    public abstract void fireImpression(Object obj);

    public abstract void fireLoaded(Object obj);

    public abstract void fireMediaEventStart(Object obj, float f, float f2);

    public abstract void fireMediaEventVolumeChange(Object obj, float f);

    public abstract void fireMediaEvents(Enum r1, Object obj);

    public abstract <T> T getNativeAdSessionConfiguration();

    public abstract <T> T getOwner(boolean z);

    public abstract <T> T getPartner();

    public abstract String getPartnerName();

    public abstract String getPartnerVersion();

    public abstract String getSdkVersion();

    public abstract String getServiceJS();

    public abstract String getTag();

    public abstract <T> T getWebAdSessionConfiguration(boolean z, T t);

    public abstract boolean isOmActive();

    public boolean isViewabilityMeasurementActivated() {
        return isOmActive() && this.b;
    }

    public boolean isViewabilityMeasurementEnabled() {
        return this.b;
    }

    public abstract void registerAdView(Object obj, View view);

    public void setViewabilityMeasurementEnabled(boolean z) {
        this.b = z;
    }

    public abstract void startAdSession(Object obj);

    public abstract void stopAdSession(Object obj);
}
