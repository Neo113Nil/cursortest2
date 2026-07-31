package com.smaato.sdk.ng.models;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.X3;
import com.smaato.sdk.ng.BuildConfig;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.TopicManager;
import com.smaato.sdk.ng.UserDataManager;
import com.smaato.sdk.ng.location.NextGenLocationManager;
import com.smaato.sdk.ng.models.AdRequestFactory;
import com.smaato.sdk.ng.models.bidstream.GeoLocation;
import com.smaato.sdk.ng.models.bidstream.Impression;
import com.smaato.sdk.ng.models.bidstream.ImpressionBanner;
import com.smaato.sdk.ng.models.bidstream.ImpressionVideo;
import com.smaato.sdk.ng.models.bidstream.Signal;
import com.smaato.sdk.ng.prefs.NextGenPreferences;
import com.smaato.sdk.ng.prefs.SessionImpressionPrefs;
import com.smaato.sdk.ng.utils.AtomManager;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NextGenAdvertisingId;
import com.smaato.sdk.ng.utils.NextGenTimeUtils;
import com.smaato.sdk.ng.utils.sdkmanager.DisplayManager;
import com.smaato.sdk.ng.utils.sdkmanager.SdkManager;
import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class NGSDKAdRequestFactory extends BaseRequestFactory implements AdRequestFactory {
    private static final String TAG = "NGSDKAdRequestFactory";
    private DeviceInfo mDeviceInfo;
    private IntegrationType mIntegrationType;
    private boolean mIsRewarded;
    private NextGenLocationManager mLocationManager;
    private String mMediationVendor;
    private final SdkManager mSdkManager;
    private final TopicManager mTopicManager;
    private UserDataManager mUserDataManager;
    private NextGenPreferences prefs;

    public NGSDKAdRequestFactory() {
        this(NextGen.getDeviceInfo(), NextGen.getLocationManager(), NextGen.getUserDataManager(), NextGen.getSdkManager(), NextGen.getTopicManager());
    }

    private long calculateSessionDuration() {
        DeviceInfo deviceInfo;
        if (this.prefs == null && (deviceInfo = this.mDeviceInfo) != null && deviceInfo.getContext() != null) {
            this.prefs = new NextGenPreferences(this.mDeviceInfo.getContext());
        }
        if (this.prefs != null) {
            return System.currentTimeMillis() - this.prefs.getSessionTimeStamp();
        }
        return 0L;
    }

    private String getAgeOfApp() {
        DeviceInfo deviceInfo;
        if (this.prefs == null && (deviceInfo = this.mDeviceInfo) != null && deviceInfo.getContext() != null) {
            this.prefs = new NextGenPreferences(this.mDeviceInfo.getContext());
        }
        NextGenPreferences nextGenPreferences = this.prefs;
        return nextGenPreferences != null ? nextGenPreferences.getAppFirstInstalledTime() : "";
    }

    private String getAtomCohorts() {
        if (AtomManager.isAtomSdkDisabled() || !AtomManager.isAtomSdkConfigurationFetchSuccessful()) {
            return null;
        }
        List<Object> atomCohorts = AtomManager.getAtomCohorts();
        if (atomCohorts.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : atomCohorts) {
            try {
                Object invoke = obj.getClass().getDeclaredMethod("id", null).invoke(obj, null);
                if (invoke != null) {
                    arrayList.add(String.valueOf(invoke));
                }
            } catch (Exception unused) {
                Logger.d(TAG, "Atom not found");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return Base64.encodeToString((X3.j.d + TextUtils.join(StringUtils.COMMA, arrayList) + X3.j.e).getBytes(StandardCharsets.UTF_8), 2);
    }

    private String getDefaultMetaFields() {
        return TextUtils.join(StringUtils.COMMA, new String[]{"points", "revenuemodel", "contentinfo", "creativeid", "campaignid", "bundleid", "adexperience"});
    }

    private String getDefaultNativeAssetFields() {
        return TextUtils.join(StringUtils.COMMA, new String[]{"icon", "title", "banner", "cta", "rating", "description"});
    }

    private String getSupportedApis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("3");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        return TextUtils.join(StringUtils.COMMA, arrayList.toArray(new String[0]));
    }

    private String getSupportedProtocols() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("11");
        arrayList.add("12");
        arrayList.add("13");
        arrayList.add("14");
        return TextUtils.join(StringUtils.COMMA, arrayList.toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createAdRequest$0(String str, String str2, AdSize adSize, int i, boolean z, AdRequestFactory.Callback callback, String str3, Boolean bool) {
        processAdvertisingId(str, str2, adSize, str3, bool.booleanValue(), i, z, callback);
    }

    private void processAdvertisingId(String str, String str2, AdSize adSize, String str3, boolean z, int i, boolean z2, AdRequestFactory.Callback callback) {
        if (callback != null) {
            callback.onRequestCreated(buildRequest(str, str2, adSize, str3, z, this.mIntegrationType, this.mMediationVendor, Integer.valueOf(i), z2));
        }
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public AdRequest buildRequest(String str, String str2, AdSize adSize, String str3, boolean z, IntegrationType integrationType, String str4, Integer num, boolean z2) {
        return buildRequest(null, str, str2, adSize, str3, z, integrationType, str4, num, z2);
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void createAdRequest(final String str, final String str2, final AdSize adSize, boolean z, final boolean z2, final AdRequestFactory.Callback callback) {
        Context context;
        boolean z3;
        String str3;
        if (this.mDeviceInfo == null) {
            this.mDeviceInfo = NextGen.getDeviceInfo();
        }
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo != null) {
            String advertisingId = deviceInfo.getAdvertisingId();
            boolean limitTracking = this.mDeviceInfo.limitTracking();
            context = this.mDeviceInfo.getContext();
            str3 = advertisingId;
            z3 = limitTracking;
        } else {
            context = null;
            z3 = false;
            str3 = null;
        }
        this.mIsRewarded = z;
        if (!TextUtils.isEmpty(str3) || context == null) {
            DeviceInfo deviceInfo2 = this.mDeviceInfo;
            if (deviceInfo2 == null || deviceInfo2.getContext() == null) {
                return;
            }
            processAdvertisingId(str, str2, adSize, str3, z3, new SessionImpressionPrefs(this.mDeviceInfo.getContext()).getImpressionDepth(str2).intValue(), z2, callback);
            return;
        }
        try {
            final int intValue = new SessionImpressionPrefs(this.mDeviceInfo.getContext()).getImpressionDepth(str2).intValue();
            new NextGenAdvertisingId(context).execute(new NextGenAdvertisingId.Listener() { // from class: com.smaato.sdk.ng.models.NGSDKAdRequestFactory$$ExternalSyntheticLambda0
                @Override // com.smaato.sdk.ng.utils.NextGenAdvertisingId.Listener
                public final void onNextGenAdvertisingIdFinish(String str4, Boolean bool) {
                    NGSDKAdRequestFactory.this.lambda$createAdRequest$0(str, str2, adSize, intValue, z2, callback, str4, bool);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.e(TAG, "createAdRequest", e);
        } catch (Exception unused) {
            Logger.e(TAG, "Error executing NextGenAdvertisingId AsyncTask");
        }
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void setAdFormat(String str) {
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void setIntegrationType(IntegrationType integrationType) {
        this.mIntegrationType = integrationType;
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void setMediationVendor(String str) {
        this.mMediationVendor = str;
    }

    NGSDKAdRequestFactory(DeviceInfo deviceInfo, NextGenLocationManager nextGenLocationManager, UserDataManager userDataManager, SdkManager sdkManager, TopicManager topicManager) {
        this.mIntegrationType = IntegrationType.HEADER_BIDDING;
        this.mDeviceInfo = deviceInfo;
        this.mLocationManager = nextGenLocationManager;
        this.mUserDataManager = userDataManager;
        this.mSdkManager = sdkManager;
        this.mTopicManager = topicManager;
    }

    public AdRequest buildRequest(Context context, String str, String str2, AdSize adSize, String str3, boolean z, IntegrationType integrationType, String str4, Integer num, boolean z2) {
        String str5;
        boolean z3;
        Location userLocation;
        UserDataManager userDataManager;
        UserDataManager userDataManager2;
        UserDataManager userDataManager3;
        int i;
        if (this.mUserDataManager == null && context != null) {
            this.mUserDataManager = new UserDataManager(context);
        }
        if (this.mDeviceInfo == null && context != null) {
            this.mDeviceInfo = new DeviceInfo(context);
        }
        if (this.mLocationManager == null && context != null) {
            this.mLocationManager = new NextGenLocationManager(context);
        }
        NGSDKAdRequest nGSDKAdRequest = new NGSDKAdRequest();
        UserDataManager userDataManager4 = this.mUserDataManager;
        if (userDataManager4 != null) {
            z3 = userDataManager4.isCCPAOptOut();
            String iABUSPrivacyString = this.mUserDataManager.getIABUSPrivacyString();
            if (!TextUtils.isEmpty(iABUSPrivacyString)) {
                nGSDKAdRequest.usprivacy = iABUSPrivacyString;
            }
            String iABGDPRConsentString = this.mUserDataManager.getIABGDPRConsentString();
            if (!TextUtils.isEmpty(iABGDPRConsentString)) {
                nGSDKAdRequest.userconsent = iABGDPRConsentString;
            }
            String gppString = this.mUserDataManager.getGppString();
            if (!TextUtils.isEmpty(gppString)) {
                nGSDKAdRequest.gppstring = gppString;
            }
            String gppSid = this.mUserDataManager.getGppSid();
            if (!TextUtils.isEmpty(gppSid)) {
                nGSDKAdRequest.gppsid = gppSid.replace("_", StringUtils.COMMA);
            }
            str5 = str2;
        } else {
            str5 = str2;
            z3 = false;
        }
        nGSDKAdRequest.zoneId = str5;
        nGSDKAdRequest.appToken = TextUtils.isEmpty(str) ? NextGen.getAppToken() : str;
        nGSDKAdRequest.os = "android";
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo != null) {
            nGSDKAdRequest.osver = deviceInfo.getOSVersion();
        }
        nGSDKAdRequest.coppa = NextGen.isCoppaEnabled() ? "1" : "0";
        BaseViewabilityManager visibilityManager = this.mSdkManager.getVisibilityManager();
        if (visibilityManager != null) {
            nGSDKAdRequest.omidpn = visibilityManager.getPartnerName();
            nGSDKAdRequest.omidpv = visibilityManager.getPartnerVersion();
        } else {
            nGSDKAdRequest.omidpn = "Smaato";
            nGSDKAdRequest.omidpv = BuildConfig.OMIDPV;
        }
        nGSDKAdRequest.isInterstitial = Boolean.valueOf(adSize == AdSize.SIZE_INTERSTITIAL);
        nGSDKAdRequest.ae = z2 ? "1" : "0";
        nGSDKAdRequest.hver = BuildConfig.HVER;
        String atomCohorts = getAtomCohorts();
        if (!TextUtils.isEmpty(atomCohorts)) {
            nGSDKAdRequest.vg = atomCohorts;
        }
        Integer num2 = null;
        if (adSize != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (nGSDKAdRequest.isInterstitial.booleanValue()) {
                num2 = 5;
                arrayList2.add(1);
                arrayList2.add(2);
                i = 3;
            } else {
                arrayList.add(5);
                arrayList.add(6);
                arrayList2.add(5);
                arrayList2.add(6);
                i = 4;
            }
            int i2 = nGSDKAdRequest.isInterstitial.booleanValue() ? 7 : 0;
            nGSDKAdRequest.addSignal(new ImpressionBanner(i2, arrayList));
            nGSDKAdRequest.addSignal(new ImpressionVideo(num2, Integer.valueOf(i), i2, arrayList2));
            nGSDKAdRequest.addSignal(new Impression(Integer.valueOf(nGSDKAdRequest.isInterstitial.booleanValue() ? 1 : 0), 1));
        } else {
            nGSDKAdRequest.addSignal(new Impression(null, 1));
        }
        if (NextGen.isCoppaEnabled() || z || TextUtils.isEmpty(str3) || z3 || ((userDataManager3 = this.mUserDataManager) != null && userDataManager3.isConsentDenied())) {
            nGSDKAdRequest.dnt = "1";
        } else {
            nGSDKAdRequest.gid = str3;
            DeviceInfo deviceInfo2 = this.mDeviceInfo;
            if (deviceInfo2 != null) {
                nGSDKAdRequest.gidmd5 = deviceInfo2.getAdvertisingIdMd5();
                nGSDKAdRequest.gidsha1 = this.mDeviceInfo.getAdvertisingIdSha1();
            }
        }
        DeviceInfo deviceInfo3 = this.mDeviceInfo;
        if (deviceInfo3 != null) {
            nGSDKAdRequest.devicemodel = deviceInfo3.getModel();
            nGSDKAdRequest.make = this.mDeviceInfo.getMake();
            nGSDKAdRequest.deviceType = String.valueOf(this.mDeviceInfo.getDeviceType());
            if (this.mDeviceInfo.getLocale() != null && this.mDeviceInfo.getLocale().getLanguage() != null && !this.mDeviceInfo.getLocale().getLanguage().isEmpty()) {
                nGSDKAdRequest.locale = this.mDeviceInfo.getLocale().getLanguage();
                nGSDKAdRequest.language = this.mDeviceInfo.getLocale().getLanguage();
            } else if (this.mDeviceInfo.getLangb() != null && !this.mDeviceInfo.getLangb().isEmpty()) {
                nGSDKAdRequest.langb = this.mDeviceInfo.getLangb();
            }
            nGSDKAdRequest.deviceHeight = this.mDeviceInfo.getDeviceHeight();
            nGSDKAdRequest.deviceWidth = this.mDeviceInfo.getDeviceWidth();
            nGSDKAdRequest.orientation = this.mDeviceInfo.getOrientation().toString();
            nGSDKAdRequest.ppi = this.mDeviceInfo.getPpi();
            nGSDKAdRequest.pxratio = this.mDeviceInfo.getPxratio();
            nGSDKAdRequest.soundSetting = this.mDeviceInfo.getSoundSetting();
            nGSDKAdRequest.js = "1";
            if (this.mDeviceInfo.getCarrier() != null && !this.mDeviceInfo.getCarrier().isEmpty()) {
                nGSDKAdRequest.carrier = this.mDeviceInfo.getCarrier();
            }
            if (this.mDeviceInfo.getConnectionType() != null) {
                nGSDKAdRequest.connectiontype = String.valueOf(this.mDeviceInfo.getConnectionType());
            }
            if (this.mDeviceInfo.getMccmnc() != null && !this.mDeviceInfo.getMccmnc().isEmpty()) {
                nGSDKAdRequest.mccmnc = this.mDeviceInfo.getMccmnc();
            }
            if (this.mDeviceInfo.getMccmncsim() != null && !this.mDeviceInfo.getMccmncsim().isEmpty()) {
                nGSDKAdRequest.mccmncsim = this.mDeviceInfo.getMccmncsim();
            }
            if (this.mDeviceInfo.getStructuredUserAgent() != null) {
                try {
                    JSONObject json = this.mDeviceInfo.getStructuredUserAgent().toJson();
                    if (json != null) {
                        nGSDKAdRequest.sua = Base64.encodeToString(json.toString().getBytes(), 2);
                    }
                } catch (Exception unused) {
                }
            }
            nGSDKAdRequest.geofetch = "1";
        }
        if (!NextGen.isCoppaEnabled() && !z && !z3 && ((userDataManager2 = this.mUserDataManager) == null || !userDataManager2.isConsentDenied())) {
            nGSDKAdRequest.age = NextGen.getAge();
            nGSDKAdRequest.gender = NextGen.getGender();
            nGSDKAdRequest.keywords = NextGen.getKeywords();
        }
        nGSDKAdRequest.bundleid = NextGen.getBundleId();
        nGSDKAdRequest.testMode = NextGen.isTestMode() ? "1" : "0";
        if (adSize == null) {
            nGSDKAdRequest.af = getDefaultNativeAssetFields();
        } else {
            nGSDKAdRequest.al = adSize.getAdLayoutSize();
            if (adSize.getWidth() != 0) {
                nGSDKAdRequest.width = String.valueOf(adSize.getWidth());
            }
            if (adSize.getHeight() != 0) {
                nGSDKAdRequest.height = String.valueOf(adSize.getHeight());
            }
        }
        nGSDKAdRequest.mf = getDefaultMetaFields();
        String supportedProtocols = getSupportedProtocols();
        if (!TextUtils.isEmpty(supportedProtocols)) {
            nGSDKAdRequest.protocol = supportedProtocols;
        }
        String supportedApis = getSupportedApis();
        if (!TextUtils.isEmpty(supportedApis)) {
            nGSDKAdRequest.api = supportedApis;
        }
        DisplayManager displayManager = this.mSdkManager.getDisplayManager();
        nGSDKAdRequest.displaymanager = displayManager.getDisplayManagerName();
        nGSDKAdRequest.displaymanagerver = displayManager.getDisplayManagerVersion(str4, integrationType);
        NextGenLocationManager nextGenLocationManager = this.mLocationManager;
        if (nextGenLocationManager != null && (userLocation = nextGenLocationManager.getUserLocation()) != null && !NextGen.isCoppaEnabled() && !z && (((userDataManager = this.mUserDataManager) == null || !userDataManager.isConsentDenied()) && !z3 && NextGen.isLocationTrackingEnabled())) {
            Locale locale = Locale.ENGLISH;
            nGSDKAdRequest.latitude = String.format(locale, "%.2f", Double.valueOf(userLocation.getLatitude()));
            nGSDKAdRequest.longitude = String.format(locale, "%.2f", Double.valueOf(userLocation.getLongitude()));
            if (userLocation.hasAccuracy() && userLocation.getAccuracy() != 0.0f) {
                nGSDKAdRequest.addSignal(new GeoLocation(Integer.valueOf((int) userLocation.getAccuracy()), formatUTCTime()));
            }
        }
        Signal fillExtensionsObject = fillExtensionsObject(this.mDeviceInfo);
        if (fillExtensionsObject != null) {
            nGSDKAdRequest.addSignal(fillExtensionsObject);
        }
        if (this.mIsRewarded) {
            nGSDKAdRequest.rv = "1";
        } else {
            nGSDKAdRequest.rv = "0";
        }
        nGSDKAdRequest.impdepth = String.valueOf(num);
        try {
            nGSDKAdRequest.ageofapp = new NextGenTimeUtils().getDaysSince(Long.parseLong(getAgeOfApp()));
        } catch (NumberFormatException unused2) {
        }
        nGSDKAdRequest.sessionduration = new NextGenTimeUtils().getSeconds(calculateSessionDuration());
        TopicManager topicManager = this.mTopicManager;
        if (topicManager != null) {
            nGSDKAdRequest.topics = topicManager.getTopics();
        }
        return nGSDKAdRequest;
    }
}
