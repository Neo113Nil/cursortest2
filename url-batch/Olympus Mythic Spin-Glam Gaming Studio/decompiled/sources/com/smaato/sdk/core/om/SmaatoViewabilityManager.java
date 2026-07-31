package com.smaato.sdk.core.om;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.smaato.Omid;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.CreativeType;
import com.iab.omid.library.smaato.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.smaato.adsession.ImpressionType;
import com.iab.omid.library.smaato.adsession.Owner;
import com.iab.omid.library.smaato.adsession.Partner;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.iab.omid.library.smaato.adsession.media.InteractionType;
import com.iab.omid.library.smaato.adsession.media.MediaEvents;
import com.iab.omid.library.smaato.adsession.media.Position;
import com.iab.omid.library.smaato.adsession.media.VastProperties;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;
import com.smaato.sdk.ng.viewability.baseom.BaseVerificationScriptResource;
import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;
import com.smaato.sdk.ng.viewability.baseom.MediaEventType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class SmaatoViewabilityManager extends BaseViewabilityManager {
    private static final String TAG = "SmaatoViewabilityManager";
    private static String VIEWABILITY_JS_SERVICE_CONTENT = null;
    private static final String VIEWABILITY_PARTNER_NAME = "Smaato";
    private String contentUrl;
    private String customReferenceData;
    private boolean mShouldMeasureViewability;
    private Partner mSmaatoPartner;

    public SmaatoViewabilityManager(Application application) {
        super(application);
        this.mSmaatoPartner = null;
        this.mShouldMeasureViewability = true;
        this.customReferenceData = "";
        this.contentUrl = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createAdSession(T t, T t2) {
        if ((t instanceof AdSessionConfiguration) && (t2 instanceof AdSessionContext)) {
            return (T) AdSession.createAdSession((AdSessionConfiguration) t, (AdSessionContext) t2);
        }
        return null;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void registerAdView(Object obj, View view) {
        if (obj instanceof AdSession) {
            ((AdSession) obj).registerAdView(view);
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void startAdSession(Object obj) {
        if (obj instanceof AdSession) {
            ((AdSession) obj).start();
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void stopAdSession(Object obj) {
        if (obj instanceof AdSession) {
            ((AdSession) obj).finish();
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void addFriendlyObstruction(Object obj, View view, Enum r4, String str) {
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        if (obj instanceof AdSession) {
            if (r4.equals(BaseFriendlyObstructionPurpose.VIDEO_CONTROLS)) {
                friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            } else {
                friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            }
            ((AdSession) obj).addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public String getTag() {
        return TAG;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createNativeAdSessionContext(List<BaseVerificationScriptResource> list) {
        ArrayList arrayList = new ArrayList();
        for (BaseVerificationScriptResource baseVerificationScriptResource : list) {
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(baseVerificationScriptResource.getVendorKey(), baseVerificationScriptResource.getResourceUrl(), baseVerificationScriptResource.getVerificationParameters()));
        }
        return (T) AdSessionContext.createNativeAdSessionContext((Partner) createPartner(), getServiceJS(), arrayList, this.customReferenceData, this.contentUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T getWebAdSessionConfiguration(boolean z, T t) {
        if (!(t instanceof Owner)) {
            return null;
        }
        Owner owner = (Owner) t;
        return (T) AdSessionConfiguration.createAdSessionConfiguration(z ? CreativeType.DEFINED_BY_JAVASCRIPT : CreativeType.HTML_DISPLAY, z ? ImpressionType.DEFINED_BY_JAVASCRIPT : ImpressionType.BEGIN_TO_RENDER, owner, z ? owner : Owner.NONE, false);
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createHtmlAdSessionContext(WebView webView) {
        return (T) AdSessionContext.createHtmlAdSessionContext((Partner) getPartner(), webView, this.contentUrl, this.customReferenceData);
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public String getServiceJS() {
        if (TextUtils.isEmpty(VIEWABILITY_JS_SERVICE_CONTENT)) {
            VIEWABILITY_JS_SERVICE_CONTENT = Assets.omsdkjs;
        }
        return VIEWABILITY_JS_SERVICE_CONTENT;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createAdEvents(Object obj) {
        if (obj instanceof AdSession) {
            return (T) AdEvents.createAdEvents((AdSession) obj);
        }
        return null;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void fireLoaded(Object obj) {
        if (obj instanceof AdEvents) {
            ((AdEvents) obj).loaded();
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void fireEventProperties(Object obj, Object obj2) {
        if ((obj instanceof AdEvents) && (obj2 instanceof VastProperties)) {
            ((AdEvents) obj).loaded((VastProperties) obj2);
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void fireImpression(Object obj) {
        if (obj instanceof AdEvents) {
            ((AdEvents) obj).impressionOccurred();
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public boolean isOmActive() {
        return Omid.isActive();
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void activateOmId(Application application) {
        Omid.activate(application);
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T getNativeAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
        Owner owner = Owner.NATIVE;
        return (T) AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.iab.omid.library.smaato.adsession.Partner] */
    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createPartner() {
        ?? r0 = (T) Partner.createPartner(getPartnerName(), getSdkVersion());
        this.mSmaatoPartner = r0;
        return r0;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T getOwner(boolean z) {
        return z ? (T) Owner.JAVASCRIPT : (T) Owner.NATIVE;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T getPartner() {
        return (T) this.mSmaatoPartner;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public String getPartnerName() {
        return "Smaato";
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public String getPartnerVersion() {
        return Omid.getVersion();
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public String getSdkVersion() {
        return "23.1.0";
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public boolean isViewabilityMeasurementActivated() {
        return Omid.isActive() && this.mShouldMeasureViewability;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void setViewabilityMeasurementEnabled(boolean z) {
        this.mShouldMeasureViewability = z;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public boolean isViewabilityMeasurementEnabled() {
        return this.mShouldMeasureViewability;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createMediaEvents(T t) {
        if (t instanceof AdSession) {
            return (T) MediaEvents.createMediaEvents((AdSession) t);
        }
        return null;
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void fireMediaEvents(Enum r2, Object obj) {
        if (obj instanceof MediaEvents) {
            switch (AnonymousClass1.$SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[((MediaEventType) r2).ordinal()]) {
                case 1:
                    ((MediaEvents) obj).firstQuartile();
                    break;
                case 2:
                    ((MediaEvents) obj).midpoint();
                    break;
                case 3:
                    ((MediaEvents) obj).thirdQuartile();
                    break;
                case 4:
                    ((MediaEvents) obj).complete();
                    break;
                case 5:
                    ((MediaEvents) obj).pause();
                    break;
                case 6:
                    ((MediaEvents) obj).resume();
                    break;
                case 7:
                    ((MediaEvents) obj).bufferStart();
                    break;
                case 8:
                    ((MediaEvents) obj).bufferFinish();
                    break;
                case 9:
                    ((MediaEvents) obj).skipped();
                    break;
                case 10:
                    ((MediaEvents) obj).adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    /* renamed from: com.smaato.sdk.core.om.SmaatoViewabilityManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType;

        static {
            int[] iArr = new int[MediaEventType.values().length];
            $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType = iArr;
            try {
                iArr[MediaEventType.FIRST_QUARTILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.MIDPOINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.THIRD_QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.BUFFER_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.BUFFER_FINISH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.SKIPPED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$viewability$baseom$MediaEventType[MediaEventType.CLICK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void fireMediaEventStart(Object obj, float f, float f2) {
        if (obj instanceof MediaEvents) {
            ((MediaEvents) obj).start(f, f2);
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public void fireMediaEventVolumeChange(Object obj, float f) {
        if (obj instanceof MediaEvents) {
            ((MediaEvents) obj).volumeChange(f);
        }
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createVastPropertiesForNonSkippableMedia() {
        return (T) VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
    }

    @Override // com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager
    public <T> T createVastPropertiesForSkippableMedia(Integer num) {
        return (T) VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : -1.0f, false, Position.STANDALONE);
    }
}
