package net.pubnative.lite.sdk.models;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.BuildConfig;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.TopicManager;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.location.HyBidLocationManager;
import net.pubnative.lite.sdk.models.AdRequestFactory;
import net.pubnative.lite.sdk.models.bidstream.GeoLocation;
import net.pubnative.lite.sdk.models.bidstream.Impression;
import net.pubnative.lite.sdk.models.bidstream.ImpressionBanner;
import net.pubnative.lite.sdk.models.bidstream.ImpressionVideo;
import net.pubnative.lite.sdk.models.bidstream.Signal;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.utils.AtomManager;
import net.pubnative.lite.sdk.utils.HyBidAdvertisingId;
import net.pubnative.lite.sdk.utils.HyBidTimeUtils;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.sdkmanager.DisplayManager;
import net.pubnative.lite.sdk.utils.sdkmanager.SdkManager;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PNAdRequestFactory extends BaseRequestFactory implements AdRequestFactory {
    private static final String TAG = "PNAdRequestFactory";
    private DeviceInfo mDeviceInfo;
    private IntegrationType mIntegrationType;
    private boolean mIsRewarded;
    private HyBidLocationManager mLocationManager;
    private String mMediationVendor;
    private final SdkManager mSdkManager;
    private final TopicManager mTopicManager;
    private UserDataManager mUserDataManager;
    private HyBidPreferences prefs;

    public PNAdRequestFactory() {
        this(HyBid.getDeviceInfo(), HyBid.getLocationManager(), HyBid.getUserDataManager(), HyBid.getSdkManager(), HyBid.getTopicManager());
    }

    private long calculateSessionDuration() {
        DeviceInfo deviceInfo;
        if (this.prefs == null && (deviceInfo = this.mDeviceInfo) != null && deviceInfo.getContext() != null) {
            this.prefs = new HyBidPreferences(this.mDeviceInfo.getContext());
        }
        if (this.prefs != null) {
            return System.currentTimeMillis() - this.prefs.getSessionTimeStamp();
        }
        return 0L;
    }

    private String getAgeOfApp() {
        DeviceInfo deviceInfo;
        if (this.prefs == null && (deviceInfo = this.mDeviceInfo) != null && deviceInfo.getContext() != null) {
            this.prefs = new HyBidPreferences(this.mDeviceInfo.getContext());
        }
        HyBidPreferences hyBidPreferences = this.prefs;
        return hyBidPreferences != null ? hyBidPreferences.getAppFirstInstalledTime() : "";
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

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public AdRequest buildRequest(String str, String str2, AdSize adSize, String str3, boolean z, IntegrationType integrationType, String str4, Integer num, boolean z2) {
        return buildRequest(null, str, str2, adSize, str3, z, integrationType, str4, num, z2);
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void createAdRequest(final String str, final String str2, final AdSize adSize, boolean z, final boolean z2, final AdRequestFactory.Callback callback) {
        Context context;
        boolean z3;
        String str3;
        if (this.mDeviceInfo == null) {
            this.mDeviceInfo = HyBid.getDeviceInfo();
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
            new HyBidAdvertisingId(context).execute(new HyBidAdvertisingId.Listener() { // from class: net.pubnative.lite.sdk.models.PNAdRequestFactory$$ExternalSyntheticLambda0
                @Override // net.pubnative.lite.sdk.utils.HyBidAdvertisingId.Listener
                public final void onHyBidAdvertisingIdFinish(String str4, Boolean bool) {
                    PNAdRequestFactory.this.lambda$createAdRequest$0(str, str2, adSize, intValue, z2, callback, str4, bool);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.e(TAG, "createAdRequest", e);
        } catch (Exception unused) {
            Logger.e(TAG, "Error executing HyBidAdvertisingId AsyncTask");
        }
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void setAdFormat(String str) {
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void setIntegrationType(IntegrationType integrationType) {
        this.mIntegrationType = integrationType;
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void setMediationVendor(String str) {
        this.mMediationVendor = str;
    }

    PNAdRequestFactory(DeviceInfo deviceInfo, HyBidLocationManager hyBidLocationManager, UserDataManager userDataManager, SdkManager sdkManager, TopicManager topicManager) {
        this.mIntegrationType = IntegrationType.HEADER_BIDDING;
        this.mDeviceInfo = deviceInfo;
        this.mLocationManager = hyBidLocationManager;
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
            this.mLocationManager = new HyBidLocationManager(context);
        }
        PNAdRequest pNAdRequest = new PNAdRequest();
        UserDataManager userDataManager4 = this.mUserDataManager;
        if (userDataManager4 != null) {
            z3 = userDataManager4.isCCPAOptOut();
            String iABUSPrivacyString = this.mUserDataManager.getIABUSPrivacyString();
            if (!TextUtils.isEmpty(iABUSPrivacyString)) {
                pNAdRequest.usprivacy = iABUSPrivacyString;
            }
            String iABGDPRConsentString = this.mUserDataManager.getIABGDPRConsentString();
            if (!TextUtils.isEmpty(iABGDPRConsentString)) {
                pNAdRequest.userconsent = iABGDPRConsentString;
            }
            String gppString = this.mUserDataManager.getGppString();
            if (!TextUtils.isEmpty(gppString)) {
                pNAdRequest.gppstring = gppString;
            }
            String gppSid = this.mUserDataManager.getGppSid();
            if (!TextUtils.isEmpty(gppSid)) {
                pNAdRequest.gppsid = gppSid.replace("_", StringUtils.COMMA);
            }
            str5 = str2;
        } else {
            str5 = str2;
            z3 = false;
        }
        pNAdRequest.zoneId = str5;
        pNAdRequest.appToken = TextUtils.isEmpty(str) ? HyBid.getAppToken() : str;
        pNAdRequest.os = "android";
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo != null) {
            pNAdRequest.osver = deviceInfo.getOSVersion();
        }
        pNAdRequest.coppa = HyBid.isCoppaEnabled() ? "1" : "0";
        BaseViewabilityManager visibilityManager = this.mSdkManager.getVisibilityManager();
        if (visibilityManager != null) {
            pNAdRequest.omidpn = visibilityManager.getPartnerName();
            pNAdRequest.omidpv = visibilityManager.getPartnerVersion();
        } else {
            pNAdRequest.omidpn = BuildConfig.OMIDPN;
            pNAdRequest.omidpv = BuildConfig.OMIDPV;
        }
        pNAdRequest.isInterstitial = Boolean.valueOf(adSize == AdSize.SIZE_INTERSTITIAL);
        pNAdRequest.ae = z2 ? "1" : "0";
        pNAdRequest.hver = "3.8.2";
        String atomCohorts = getAtomCohorts();
        if (!TextUtils.isEmpty(atomCohorts)) {
            pNAdRequest.vg = atomCohorts;
        }
        Integer num2 = null;
        if (adSize != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (pNAdRequest.isInterstitial.booleanValue()) {
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
            int i2 = pNAdRequest.isInterstitial.booleanValue() ? 7 : 0;
            pNAdRequest.addSignal(new ImpressionBanner(i2, arrayList));
            pNAdRequest.addSignal(new ImpressionVideo(num2, Integer.valueOf(i), i2, arrayList2));
            pNAdRequest.addSignal(new Impression(Integer.valueOf(pNAdRequest.isInterstitial.booleanValue() ? 1 : 0), 1));
        } else {
            pNAdRequest.addSignal(new Impression(null, 1));
        }
        if (HyBid.isCoppaEnabled() || z || TextUtils.isEmpty(str3) || z3 || ((userDataManager3 = this.mUserDataManager) != null && userDataManager3.isConsentDenied())) {
            pNAdRequest.dnt = "1";
        } else {
            pNAdRequest.gid = str3;
            DeviceInfo deviceInfo2 = this.mDeviceInfo;
            if (deviceInfo2 != null) {
                pNAdRequest.gidmd5 = deviceInfo2.getAdvertisingIdMd5();
                pNAdRequest.gidsha1 = this.mDeviceInfo.getAdvertisingIdSha1();
            }
        }
        DeviceInfo deviceInfo3 = this.mDeviceInfo;
        if (deviceInfo3 != null) {
            pNAdRequest.devicemodel = deviceInfo3.getModel();
            pNAdRequest.make = this.mDeviceInfo.getMake();
            pNAdRequest.deviceType = String.valueOf(this.mDeviceInfo.getDeviceType());
            if (this.mDeviceInfo.getLocale() != null && this.mDeviceInfo.getLocale().getLanguage() != null && !this.mDeviceInfo.getLocale().getLanguage().isEmpty()) {
                pNAdRequest.locale = this.mDeviceInfo.getLocale().getLanguage();
                pNAdRequest.language = this.mDeviceInfo.getLocale().getLanguage();
            } else if (this.mDeviceInfo.getLangb() != null && !this.mDeviceInfo.getLangb().isEmpty()) {
                pNAdRequest.langb = this.mDeviceInfo.getLangb();
            }
            pNAdRequest.deviceHeight = this.mDeviceInfo.getDeviceHeight();
            pNAdRequest.deviceWidth = this.mDeviceInfo.getDeviceWidth();
            pNAdRequest.orientation = this.mDeviceInfo.getOrientation().toString();
            pNAdRequest.ppi = this.mDeviceInfo.getPpi();
            pNAdRequest.pxratio = this.mDeviceInfo.getPxratio();
            pNAdRequest.soundSetting = this.mDeviceInfo.getSoundSetting();
            pNAdRequest.js = "1";
            if (this.mDeviceInfo.getCarrier() != null && !this.mDeviceInfo.getCarrier().isEmpty()) {
                pNAdRequest.carrier = this.mDeviceInfo.getCarrier();
            }
            if (this.mDeviceInfo.getConnectionType() != null) {
                pNAdRequest.connectiontype = String.valueOf(this.mDeviceInfo.getConnectionType());
            }
            if (this.mDeviceInfo.getMccmnc() != null && !this.mDeviceInfo.getMccmnc().isEmpty()) {
                pNAdRequest.mccmnc = this.mDeviceInfo.getMccmnc();
            }
            if (this.mDeviceInfo.getMccmncsim() != null && !this.mDeviceInfo.getMccmncsim().isEmpty()) {
                pNAdRequest.mccmncsim = this.mDeviceInfo.getMccmncsim();
            }
            if (this.mDeviceInfo.getStructuredUserAgent() != null) {
                try {
                    JSONObject json = this.mDeviceInfo.getStructuredUserAgent().toJson();
                    if (json != null) {
                        pNAdRequest.sua = Base64.encodeToString(json.toString().getBytes(), 2);
                    }
                } catch (Exception unused) {
                }
            }
            pNAdRequest.geofetch = "1";
        }
        if (!HyBid.isCoppaEnabled() && !z && !z3 && ((userDataManager2 = this.mUserDataManager) == null || !userDataManager2.isConsentDenied())) {
            pNAdRequest.age = HyBid.getAge();
            pNAdRequest.gender = HyBid.getGender();
            pNAdRequest.keywords = HyBid.getKeywords();
        }
        pNAdRequest.bundleid = HyBid.getBundleId();
        pNAdRequest.testMode = HyBid.isTestMode() ? "1" : "0";
        if (adSize == null) {
            pNAdRequest.af = getDefaultNativeAssetFields();
        } else {
            pNAdRequest.al = adSize.getAdLayoutSize();
            if (adSize.getWidth() != 0) {
                pNAdRequest.width = String.valueOf(adSize.getWidth());
            }
            if (adSize.getHeight() != 0) {
                pNAdRequest.height = String.valueOf(adSize.getHeight());
            }
        }
        pNAdRequest.mf = getDefaultMetaFields();
        String supportedProtocols = getSupportedProtocols();
        if (!TextUtils.isEmpty(supportedProtocols)) {
            pNAdRequest.protocol = supportedProtocols;
        }
        String supportedApis = getSupportedApis();
        if (!TextUtils.isEmpty(supportedApis)) {
            pNAdRequest.api = supportedApis;
        }
        DisplayManager displayManager = this.mSdkManager.getDisplayManager();
        pNAdRequest.displaymanager = displayManager.getDisplayManagerName();
        pNAdRequest.displaymanagerver = displayManager.getDisplayManagerVersion(str4, integrationType);
        HyBidLocationManager hyBidLocationManager = this.mLocationManager;
        if (hyBidLocationManager != null && (userLocation = hyBidLocationManager.getUserLocation()) != null && !HyBid.isCoppaEnabled() && !z && (((userDataManager = this.mUserDataManager) == null || !userDataManager.isConsentDenied()) && !z3 && HyBid.isLocationTrackingEnabled())) {
            Locale locale = Locale.ENGLISH;
            pNAdRequest.latitude = String.format(locale, "%.2f", Double.valueOf(userLocation.getLatitude()));
            pNAdRequest.longitude = String.format(locale, "%.2f", Double.valueOf(userLocation.getLongitude()));
            if (userLocation.hasAccuracy() && userLocation.getAccuracy() != 0.0f) {
                pNAdRequest.addSignal(new GeoLocation(Integer.valueOf((int) userLocation.getAccuracy()), formatUTCTime()));
            }
        }
        Signal fillExtensionsObject = fillExtensionsObject(this.mDeviceInfo);
        if (fillExtensionsObject != null) {
            pNAdRequest.addSignal(fillExtensionsObject);
        }
        if (this.mIsRewarded) {
            pNAdRequest.rv = "1";
        } else {
            pNAdRequest.rv = "0";
        }
        pNAdRequest.impdepth = String.valueOf(num);
        try {
            pNAdRequest.ageofapp = new HyBidTimeUtils().getDaysSince(Long.parseLong(getAgeOfApp()));
        } catch (NumberFormatException unused2) {
        }
        pNAdRequest.sessionduration = new HyBidTimeUtils().getSeconds(calculateSessionDuration());
        TopicManager topicManager = this.mTopicManager;
        if (topicManager != null) {
            pNAdRequest.topics = topicManager.getTopics();
        }
        return pNAdRequest;
    }
}
