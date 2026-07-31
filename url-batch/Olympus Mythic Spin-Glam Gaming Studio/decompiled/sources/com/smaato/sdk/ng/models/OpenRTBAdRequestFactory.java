package com.smaato.sdk.ng.models;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.TopicManager;
import com.smaato.sdk.ng.UserDataManager;
import com.smaato.sdk.ng.location.NextGenLocationManager;
import com.smaato.sdk.ng.models.AdRequestFactory;
import com.smaato.sdk.ng.models.request.App;
import com.smaato.sdk.ng.models.request.Banner;
import com.smaato.sdk.ng.models.request.Data;
import com.smaato.sdk.ng.models.request.DataExtension;
import com.smaato.sdk.ng.models.request.Device;
import com.smaato.sdk.ng.models.request.Ext;
import com.smaato.sdk.ng.models.request.Geo;
import com.smaato.sdk.ng.models.request.Imp;
import com.smaato.sdk.ng.models.request.Native;
import com.smaato.sdk.ng.models.request.OpenRTBAdRequest;
import com.smaato.sdk.ng.models.request.Regs;
import com.smaato.sdk.ng.models.request.Segment;
import com.smaato.sdk.ng.models.request.User;
import com.smaato.sdk.ng.models.request.Video;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NextGenAdvertisingId;
import com.smaato.sdk.ng.utils.sdkmanager.DisplayManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes15.dex */
public class OpenRTBAdRequestFactory extends BaseRequestFactory implements AdRequestFactory {
    private static final String TAG = "OpenRTBAdRequestFactory";
    private String mAdFormat;
    private String mAdvertisingId;
    private final DeviceInfo mDeviceInfo;
    private final DisplayManager mDisplayManager;
    private IntegrationType mIntegrationType;
    private boolean mIsCCPAOptOut;
    private boolean mIsRewarded;
    private boolean mLimitTracking;
    private final NextGenLocationManager mLocationManager;
    private String mMediationVendor;
    private final TopicManager mTopicManager;
    private final UserDataManager mUserDataManager;

    public OpenRTBAdRequestFactory() {
        this(NextGen.getDeviceInfo(), NextGen.getLocationManager(), NextGen.getUserDataManager(), NextGen.getSdkManager().getDisplayManager(), NextGen.getTopicManager());
    }

    private Integer getAccuracy() {
        Location userLocation;
        NextGenLocationManager nextGenLocationManager = this.mLocationManager;
        if (nextGenLocationManager == null || (userLocation = nextGenLocationManager.getUserLocation()) == null) {
            return null;
        }
        return Integer.valueOf(Math.round(userLocation.getAccuracy()));
    }

    private int getDnt() {
        return (NextGen.isCoppaEnabled() || this.mLimitTracking || TextUtils.isEmpty(this.mAdvertisingId) || this.mIsCCPAOptOut || this.mUserDataManager.isConsentDenied()) ? 1 : 0;
    }

    private Ext getExt() {
        Ext ext = new Ext();
        UserDataManager userDataManager = this.mUserDataManager;
        if (userDataManager != null) {
            String gppString = userDataManager.getGppString();
            if (!TextUtils.isEmpty(gppString)) {
                ext.setGpp(gppString);
            }
            String gppSid = this.mUserDataManager.getGppSid();
            if (!TextUtils.isEmpty(gppSid)) {
                String[] split = gppSid.split("_");
                ArrayList arrayList = new ArrayList();
                for (String str : split) {
                    try {
                        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                    } catch (Exception e) {
                        Logger.e(TAG, e.getMessage());
                    }
                }
                if (!arrayList.isEmpty()) {
                    ext.setGppSid(arrayList);
                }
            }
        }
        return ext;
    }

    private String getGender() {
        String gender = NextGen.getGender();
        if (TextUtils.isEmpty(gender)) {
            return null;
        }
        return gender;
    }

    private Integer getGeofetch() {
        return 1;
    }

    private Float getLatitude() {
        if (this.mLocationManager.getUserLocation() != null) {
            return roundToTwoDecimalPlaces(Float.valueOf((float) this.mLocationManager.getUserLocation().getLatitude()));
        }
        return null;
    }

    private Float getLongitude() {
        if (this.mLocationManager.getUserLocation() != null) {
            return roundToTwoDecimalPlaces(Float.valueOf((float) this.mLocationManager.getUserLocation().getLongitude()));
        }
        return null;
    }

    private Regs getRegs() {
        Regs regs = new Regs();
        if (this.mUserDataManager != null) {
            regs.setExt(getExt());
        }
        return regs;
    }

    private List<Integer> getSupportedApis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt("3")));
        arrayList.add(Integer.valueOf(Integer.parseInt("5")));
        arrayList.add(Integer.valueOf(Integer.parseInt("6")));
        arrayList.add(Integer.valueOf(Integer.parseInt("7")));
        return arrayList;
    }

    private List<Integer> getSupportedProtocols() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt("1")));
        arrayList.add(Integer.valueOf(Integer.parseInt("2")));
        arrayList.add(Integer.valueOf(Integer.parseInt("3")));
        arrayList.add(Integer.valueOf(Integer.parseInt("4")));
        arrayList.add(Integer.valueOf(Integer.parseInt("5")));
        arrayList.add(Integer.valueOf(Integer.parseInt("6")));
        arrayList.add(Integer.valueOf(Integer.parseInt("7")));
        arrayList.add(Integer.valueOf(Integer.parseInt("8")));
        arrayList.add(Integer.valueOf(Integer.parseInt("11")));
        arrayList.add(Integer.valueOf(Integer.parseInt("12")));
        arrayList.add(Integer.valueOf(Integer.parseInt("13")));
        arrayList.add(Integer.valueOf(Integer.parseInt("14")));
        return arrayList;
    }

    private int getTestInt() {
        return NextGen.isTestMode() ? 1 : 0;
    }

    private Integer getUTcOffset() {
        return formatUTCTime();
    }

    private List<Data> getUserData() {
        ArrayList arrayList = new ArrayList();
        TopicManager topicManager = this.mTopicManager;
        if (topicManager != null && topicManager.getTopics() != null && !this.mTopicManager.getTopics().isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Topic topic : this.mTopicManager.getTopics()) {
                Long taxonomyVersion = topic.getTaxonomyVersion();
                if (!hashMap.containsKey(taxonomyVersion)) {
                    hashMap.put(taxonomyVersion, new ArrayList());
                }
                ArrayList arrayList2 = (ArrayList) hashMap.get(taxonomyVersion);
                Objects.requireNonNull(arrayList2);
                arrayList2.add(topic);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList3 = (ArrayList) entry.getValue();
                if (!arrayList3.isEmpty()) {
                    Data data = new Data();
                    int i = 0;
                    data.setExt(new DataExtension(((Topic) arrayList3.get(0)).getTaxonomyVersion(), ((Topic) arrayList3.get(0)).getTaxonomyVersionName()));
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj = arrayList3.get(i);
                        i++;
                        Segment segment = new Segment();
                        segment.setId(String.valueOf(((Topic) obj).getId()));
                        arrayList4.add(segment);
                    }
                    data.setSegment(arrayList4);
                    arrayList.add(data);
                }
            }
        }
        return arrayList;
    }

    private Integer getYearOfBirth() {
        String age = NextGen.getAge();
        int i = Calendar.getInstance().get(1);
        if (TextUtils.isEmpty(age)) {
            return null;
        }
        return Integer.valueOf(i - Integer.parseInt(age));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createAdRequest$0(String str, String str2, AdSize adSize, boolean z, AdRequestFactory.Callback callback, String str3, Boolean bool) {
        processAdvertisingId(str, str2, adSize, str3, bool.booleanValue(), z, callback);
    }

    private void processAdvertisingId(String str, String str2, AdSize adSize, String str3, boolean z, boolean z2, AdRequestFactory.Callback callback) {
        if (callback != null) {
            callback.onRequestCreated(buildRequest(str, str2, adSize, str3, z, this.mIntegrationType, this.mMediationVendor, 0, z2));
        }
    }

    private Float roundToTwoDecimalPlaces(Float f) {
        if (f != null) {
            return Float.valueOf(Math.round(f.floatValue() * 100.0f) / 100.0f);
        }
        return null;
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public AdRequest buildRequest(String str, String str2, AdSize adSize, String str3, boolean z, IntegrationType integrationType, String str4, Integer num, boolean z2) {
        this.mIsCCPAOptOut = this.mUserDataManager.isCCPAOptOut();
        OpenRTBAdRequest openRTBAdRequest = new OpenRTBAdRequest(str, str2);
        openRTBAdRequest.setId("92d6421e44a44dff9f05b29be0ca5bef");
        openRTBAdRequest.setImp(getImpressions(adSize, str4, integrationType));
        openRTBAdRequest.setApp(getApp());
        openRTBAdRequest.setDevice(getDevice());
        openRTBAdRequest.setUser(getUser());
        openRTBAdRequest.setTest(Integer.valueOf(getTestInt()));
        openRTBAdRequest.setAt(2);
        openRTBAdRequest.setTmax(1500);
        openRTBAdRequest.setAllimps(0);
        openRTBAdRequest.setRegs(getRegs());
        ArrayList arrayList = new ArrayList();
        arrayList.add("USD");
        openRTBAdRequest.setCur(arrayList);
        openRTBAdRequest.isInterstitial = Boolean.valueOf(adSize == AdSize.SIZE_INTERSTITIAL);
        return openRTBAdRequest;
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void createAdRequest(final String str, final String str2, final AdSize adSize, boolean z, final boolean z2, final AdRequestFactory.Callback callback) {
        this.mAdvertisingId = this.mDeviceInfo.getAdvertisingId();
        this.mLimitTracking = this.mDeviceInfo.limitTracking();
        Context context = this.mDeviceInfo.getContext();
        this.mIsRewarded = z;
        if (!TextUtils.isEmpty(this.mAdvertisingId) || context == null) {
            processAdvertisingId(str, str2, adSize, this.mAdvertisingId, this.mLimitTracking, z2, callback);
            return;
        }
        try {
            new NextGenAdvertisingId(context).execute(new NextGenAdvertisingId.Listener() { // from class: com.smaato.sdk.ng.models.OpenRTBAdRequestFactory$$ExternalSyntheticLambda0
                @Override // com.smaato.sdk.ng.utils.NextGenAdvertisingId.Listener
                public final void onNextGenAdvertisingIdFinish(String str3, Boolean bool) {
                    OpenRTBAdRequestFactory.this.lambda$createAdRequest$0(str, str2, adSize, z2, callback, str3, bool);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.e(TAG, "createAdRequest", e);
        } catch (Exception unused) {
            Logger.e(TAG, "Error executing NextGenAdvertisingId Executor");
        }
    }

    App getApp() {
        App app = new App();
        app.setBundle(NextGen.getBundleId());
        app.setCategories(new ArrayList());
        app.setSectionCategories(new ArrayList());
        app.setPageCategories(new ArrayList());
        app.setKeywords(NextGen.getKeywords());
        return app;
    }

    Banner getBanner(AdSize adSize) {
        Banner banner = new Banner();
        banner.setFormat(new ArrayList());
        AdSize adSize2 = AdSize.SIZE_INTERSTITIAL;
        if (adSize == adSize2) {
            banner.setW(Integer.valueOf(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE));
            banner.setH(480);
        } else {
            banner.setW(Integer.valueOf(adSize.getWidth()));
            banner.setH(Integer.valueOf(adSize.getHeight()));
        }
        banner.setBtype(new ArrayList());
        banner.setBattr(new ArrayList());
        if (adSize != adSize2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(5);
            arrayList.add(6);
            banner.setExpdir(arrayList);
        }
        banner.setPos(Integer.valueOf(adSize == adSize2 ? 7 : 0));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(POBCommonConstants.CONTENT_TYPE_HTML);
        arrayList2.add(POBCommonConstants.CONTENT_TYPE_JAVASCRIPT);
        banner.setMimes(arrayList2);
        banner.setTopframe(1);
        banner.setApi(new ArrayList());
        banner.setId("");
        banner.setVcm(0);
        banner.setApi(getSupportedApis());
        return banner;
    }

    Imp getBannerImpression(AdSize adSize, String str, IntegrationType integrationType) {
        Imp imp = new Imp();
        imp.setId("94628ee5-fe99-436d-94b5-f3270ad06530");
        imp.setMetric(new ArrayList());
        imp.setBanner(getBanner(adSize));
        imp.setDisplaymanager(this.mDisplayManager.getDisplayManagerName());
        imp.setDisplaymanagerver(this.mDisplayManager.getDisplayManagerVersion(str, integrationType));
        imp.setInstl(Integer.valueOf(adSize != AdSize.SIZE_INTERSTITIAL ? 0 : 1));
        imp.setClickbrowser(1);
        imp.setSecure(1);
        return imp;
    }

    Device getDevice() {
        Device device = new Device();
        device.setOs("Android");
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo != null) {
            device.setOsVersion(deviceInfo.getOSVersion());
            device.setUserAgent(this.mDeviceInfo.getUserAgent());
            device.setModel(this.mDeviceInfo.getModel());
            device.setMake(this.mDeviceInfo.getMake());
            device.setDeviceType(Integer.valueOf(this.mDeviceInfo.getDeviceType()));
            device.setCarrier(this.mDeviceInfo.getCarrier());
            device.setMccmnc(this.mDeviceInfo.getMccmnc());
            device.setMccmncsim(this.mDeviceInfo.getMccmncsim());
            device.setPpi(Integer.valueOf(Integer.parseInt(this.mDeviceInfo.getPpi())));
            device.setPxratio(Float.valueOf(Float.parseFloat(this.mDeviceInfo.getPxratio())));
            device.setH(Integer.valueOf(Integer.parseInt(this.mDeviceInfo.getDeviceHeight())));
            device.setW(Integer.valueOf(Integer.parseInt(this.mDeviceInfo.getDeviceWidth())));
            device.setLanguage(this.mDeviceInfo.getLocale().toString());
            device.setConnectiontype(this.mDeviceInfo.getConnectionType());
            device.setIfa(this.mDeviceInfo.getAdvertisingId());
            device.setDpidsha1(this.mDeviceInfo.getAdvertisingIdSha1());
            device.setDpidmd5(this.mDeviceInfo.getAdvertisingIdMd5());
            if (this.mDeviceInfo.getLocale() != null) {
                this.mDeviceInfo.getLocale().getLanguage();
                if (!this.mDeviceInfo.getLocale().getLanguage().isEmpty()) {
                    device.setLanguage(this.mDeviceInfo.getLocale().getLanguage());
                }
            }
            if (this.mDeviceInfo.getStructuredUserAgent() != null) {
                device.setSua(this.mDeviceInfo.getStructuredUserAgent());
            }
        }
        device.setGeofetch(getGeofetch());
        device.setGeo(getDeviceGeo());
        device.setDnt(Integer.valueOf(getDnt()));
        device.setJs(1);
        device.setIp("107.219.186.28");
        device.setMacsha1("");
        device.setMacmd5("");
        device.setExt(fillBidStreamExtensionsObject(this.mDeviceInfo));
        return device;
    }

    Geo getDeviceGeo() {
        Geo geo = new Geo();
        geo.setLat(getLatitude());
        geo.setLon(getLongitude());
        geo.setAccuracy(getAccuracy());
        geo.setUtcoffset(getUTcOffset());
        geo.setType(1);
        return geo;
    }

    List<Imp> getImpressions(AdSize adSize, String str, IntegrationType integrationType) {
        ArrayList arrayList = new ArrayList();
        boolean z = adSize == AdSize.SIZE_INTERSTITIAL || adSize == AdSize.SIZE_300x250 || adSize == AdSize.SIZE_320x480 || adSize == AdSize.SIZE_480x320 || adSize == AdSize.SIZE_768x1024 || adSize == AdSize.SIZE_1024x768;
        String str2 = this.mAdFormat;
        if (str2 != null && str2.equals("video") && z) {
            arrayList.add(getVideoImpression(adSize, str, integrationType));
            return arrayList;
        }
        String str3 = this.mAdFormat;
        if (str3 != null && str3.equals("html")) {
            arrayList.add(getBannerImpression(adSize, str, integrationType));
            return arrayList;
        }
        if (z) {
            arrayList.add(getVideoImpression(adSize, str, integrationType));
        }
        arrayList.add(getBannerImpression(adSize, str, integrationType));
        return arrayList;
    }

    Native getNative() {
        return new Native();
    }

    User getUser() {
        User user = new User();
        user.setYearOfBirth(getYearOfBirth());
        user.setGender(getGender());
        user.setData(getUserData());
        return user;
    }

    Video getVideo(AdSize adSize) {
        Video video = new Video();
        AdSize adSize2 = AdSize.SIZE_INTERSTITIAL;
        if (adSize == adSize2) {
            video.setWidth(Integer.valueOf(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE));
            video.setHeight(480);
        } else {
            video.setWidth(Integer.valueOf(adSize.getWidth()));
            video.setHeight(Integer.valueOf(adSize.getHeight()));
        }
        ArrayList arrayList = new ArrayList();
        if (adSize != adSize2) {
            video.setPlacementSubtype(4);
            arrayList.add(5);
            arrayList.add(6);
        } else {
            video.setPlacement(5);
            video.setPlacementSubtype(3);
            arrayList.add(1);
            arrayList.add(2);
        }
        video.setPlaybackMethod(arrayList);
        video.setPos(Integer.valueOf(adSize == adSize2 ? 7 : 0));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("video/mp4");
        arrayList2.add("video/webm");
        arrayList2.add("video/3gpp");
        arrayList2.add("video/3gpp2");
        arrayList2.add("video/x-m4v");
        video.setMimes(arrayList2);
        video.setBoxingAllowed(0);
        video.setLinearity(1);
        video.setPlaybackEnd(1);
        video.setMraidEndcard(Boolean.TRUE);
        video.setClickType(3);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(3);
        video.setDelivery(arrayList3);
        video.setProtocols(getSupportedProtocols());
        return video;
    }

    Imp getVideoImpression(AdSize adSize, String str, IntegrationType integrationType) {
        Imp imp = new Imp();
        imp.setId("94628ee5-fe99-436d-94b5-f3270ad06529");
        imp.setMetric(new ArrayList());
        imp.setVideo(getVideo(adSize));
        imp.setDisplaymanager(this.mDisplayManager.getDisplayManagerName());
        imp.setDisplaymanagerver(this.mDisplayManager.getDisplayManagerVersion(str, integrationType));
        imp.setInstl(Integer.valueOf(adSize != AdSize.SIZE_INTERSTITIAL ? 0 : 1));
        imp.setClickbrowser(1);
        imp.setSecure(1);
        return imp;
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void setAdFormat(String str) {
        this.mAdFormat = str;
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void setIntegrationType(IntegrationType integrationType) {
        this.mIntegrationType = integrationType;
    }

    @Override // com.smaato.sdk.ng.models.AdRequestFactory
    public void setMediationVendor(String str) {
        this.mMediationVendor = str;
    }

    OpenRTBAdRequestFactory(DeviceInfo deviceInfo, NextGenLocationManager nextGenLocationManager, UserDataManager userDataManager, DisplayManager displayManager, TopicManager topicManager) {
        this.mIntegrationType = IntegrationType.HEADER_BIDDING;
        this.mDeviceInfo = deviceInfo;
        this.mLocationManager = nextGenLocationManager;
        this.mUserDataManager = userDataManager;
        this.mDisplayManager = displayManager;
        this.mTopicManager = topicManager;
    }
}
