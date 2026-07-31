package com.smaato.sdk.ng;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.analytics.CrashController;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.analytics.ReportingEventCallback;
import com.smaato.sdk.ng.api.NGSDKApiClient;
import com.smaato.sdk.ng.api.SDKConfigAPiClient;
import com.smaato.sdk.ng.browser.BrowserManager;
import com.smaato.sdk.ng.db.OnDatabaseResetListener;
import com.smaato.sdk.ng.location.NextGenLocationManager;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.NGSDKAdRequest;
import com.smaato.sdk.ng.models.NGSDKAdRequestFactory;
import com.smaato.sdk.ng.prefs.NextGenPreferences;
import com.smaato.sdk.ng.prefs.SessionImpressionPrefs;
import com.smaato.sdk.ng.utils.AdTopicsAPIManager;
import com.smaato.sdk.ng.utils.AtomManager;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NGSDKApiUrlComposer;
import com.smaato.sdk.ng.utils.sdkmanager.DisplayManager;
import com.smaato.sdk.ng.utils.sdkmanager.SdkManager;
import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;
import com.smaato.sdk.ng.vpaid.VideoAdCache;
import com.smaato.sdk.ng.vpaid.enums.AudioState;
import com.smaato.sdk.ng.vpaid.utils.FileUtils;

/* loaded from: classes9.dex */
public class NextGen {
    private static String A = null;
    private static String B = null;
    private static String C = null;
    private static String D = null;
    private static String E = null;
    private static String F = null;
    private static String G = null;
    private static String H = null;
    private static Integer I = Integer.valueOf(R.mipmap.skip);
    private static Integer J = -1;
    private static Integer K = -1;
    private static AudioState L = AudioState.ON;
    private static NextGenPreferences M = null;
    public static final String NEXTGEN_VERSION = "23.1.0";
    private static String a = null;
    private static Application b = null;

    @SuppressLint({"StaticFieldLeak"})
    private static NGSDKApiClient c = null;

    @SuppressLint({"StaticFieldLeak"})
    private static SDKConfigAPiClient d = null;
    private static DeviceInfo e = null;

    @SuppressLint({"StaticFieldLeak"})
    private static UserDataManager f = null;

    @SuppressLint({"StaticFieldLeak"})
    private static SdkManager g = null;

    @SuppressLint({"StaticFieldLeak"})
    private static NextGenLocationManager h = null;
    private static ReportingController i = null;
    private static CrashController j = null;
    private static DiagnosticsManager k = null;
    private static AdCache l = null;
    private static VideoAdCache m = null;
    private static BrowserManager n = null;
    private static VgiIdManager o = null;
    private static TopicManager p = null;
    private static boolean q = false;
    private static boolean r = false;
    private static boolean s = false;
    private static boolean t = true;
    private static boolean u = true;
    private static boolean v;
    private static boolean w;
    private static boolean x;
    private static boolean y;
    private static String z;

    public interface InitialisationListener {
        void onInitialisationFinished(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Application application) {
        new SessionImpressionPrefs(application.getApplicationContext()).nukePrefs();
    }

    public static void addReportingCallback(ReportingEventCallback reportingEventCallback) {
        getReportingController().addCallback(reportingEventCallback);
    }

    public static boolean areLocationUpdatesEnabled() {
        return t;
    }

    private static boolean b(String str) {
        return NextGen.class.getPackage() != null && NextGen.class.getPackage().getName().equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str) {
        if (getReportingController() == null || !isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("init");
        reportingEvent.setAppToken(str);
        getReportingController().reportEvent(reportingEvent);
    }

    public static AdCache getAdCache() {
        isInitialized();
        return l;
    }

    public static String getAge() {
        return z;
    }

    public static NGSDKApiClient getApiClient() {
        isInitialized();
        return c;
    }

    public static synchronized String getAppToken() {
        String str;
        synchronized (NextGen.class) {
            isInitialized();
            str = a;
        }
        return str;
    }

    public static String getAppVersion() {
        return F;
    }

    public static BrowserManager getBrowserManager() {
        isInitialized();
        return n;
    }

    public static String getBundleId() {
        return C;
    }

    public static String getContentAgeRating() {
        return H;
    }

    public static String getCustomRequestSignalData() {
        return getCustomRequestSignalData(null);
    }

    public static String getDeveloperDomain() {
        return G;
    }

    public static DeviceInfo getDeviceInfo() {
        isInitialized();
        return e;
    }

    public static DiagnosticsManager getDiagnosticsManager() {
        return k;
    }

    public static String getEncodedCustomRequestSignalData() {
        return a(getCustomRequestSignalData());
    }

    public static String getGender() {
        return A;
    }

    public static String getIabCategory() {
        return D;
    }

    public static String getKeywords() {
        return B;
    }

    public static NextGenLocationManager getLocationManager() {
        isInitialized();
        return h;
    }

    public static String getNextGenVersion() {
        return "23.1.0";
    }

    public static Integer getNormalCloseXmlResource() {
        return J;
    }

    public static Integer getPressedCloseXmlResource() {
        return K;
    }

    public static ReportingController getReportingController() {
        if (i == null) {
            i = new ReportingController();
        }
        return i;
    }

    public static SDKConfigAPiClient getSDKConfigApiClient() {
        return d;
    }

    public static String getSDKVersionInfo() {
        return getSdkManager().getDisplayManager().getDisplayManagerVersion(IntegrationType.IN_APP_BIDDING);
    }

    public static SdkManager getSdkManager() {
        isInitialized();
        SdkManager sdkManager = g;
        return sdkManager != null ? sdkManager : SdkManager.builder().displayManager(DisplayManager.builder().setIsWrapped(BuildConfig.IS_WRAPPED).setDisplayManagerName("Smaato").build()).build();
    }

    public static Integer getSkipXmlResource() {
        return I;
    }

    public static TopicManager getTopicManager() {
        isInitialized();
        return p;
    }

    public static UserDataManager getUserDataManager() {
        isInitialized();
        return f;
    }

    public static VgiIdManager getVgiIdManager() {
        isInitialized();
        return o;
    }

    public static synchronized VideoAdCache getVideoAdCache() {
        VideoAdCache videoAdCache;
        synchronized (NextGen.class) {
            isInitialized();
            videoAdCache = m;
        }
        return videoAdCache;
    }

    @Deprecated
    public static AudioState getVideoAudioStatus() {
        return L;
    }

    public static BaseViewabilityManager getViewabilityManager() {
        isInitialized();
        return getSdkManager().getVisibilityManager();
    }

    public static String getsIabSubcategory() {
        return E;
    }

    public static void initialize(String str, Application application) {
        initialize(str, application, null);
    }

    public static Boolean isAtomStarted() {
        return Boolean.valueOf(y);
    }

    public static boolean isCoppaEnabled() {
        return r;
    }

    public static Boolean isDiagnosticsEnabled() {
        return Boolean.valueOf(v);
    }

    public static boolean isInitialized() {
        return q;
    }

    public static boolean isLocationTrackingEnabled() {
        return u;
    }

    public static Boolean isReportingEnabled() {
        return Boolean.valueOf(x);
    }

    public static boolean isTestMode() {
        return s;
    }

    public static Boolean isTopicsApiEnabled() {
        return Boolean.valueOf(w);
    }

    public static boolean isViewabilityMeasurementActivated() {
        BaseViewabilityManager visibilityManager = getSdkManager().getVisibilityManager();
        return visibilityManager != null && visibilityManager.isViewabilityMeasurementActivated();
    }

    public static boolean removeReportingCallback(ReportingEventCallback reportingEventCallback) {
        return getReportingController().removeCallback(reportingEventCallback);
    }

    public static void reportException(Exception exc) {
        if (j == null || getReportingController() == null || !isReportingEnabled().booleanValue()) {
            return;
        }
        getReportingController().reportEvent(j.formatException(exc));
    }

    public static void setAge(String str) {
        z = str;
    }

    public static synchronized void setAppToken(String str) {
        synchronized (NextGen.class) {
            a = str;
        }
    }

    public static void setAppVersion(String str) {
        F = str;
    }

    public static void setAtomStarted(Boolean bool) {
        y = bool.booleanValue();
    }

    public static void setCloseXmlResource(Integer num, Integer num2) {
        J = num;
        K = num2;
    }

    public static void setContentAgeRating(String str) {
        H = str;
    }

    public static void setCoppaEnabled(boolean z2) {
        r = z2;
    }

    public static void setDeveloperDomain(String str) {
        G = str;
    }

    public static void setDiagnosticsEnabled(Boolean bool) {
        v = bool.booleanValue();
    }

    public static void setGender(String str) {
        A = str;
    }

    public static void setIabCategory(String str) {
        D = str;
    }

    public static void setIabSubcategory(String str) {
        E = str;
    }

    public static void setKeywords(String str) {
        B = str;
    }

    public static void setLocationTrackingEnabled(boolean z2) {
        u = z2;
    }

    public static void setLocationUpdatesEnabled(boolean z2) {
        t = z2;
    }

    public static void setLogLevel(Logger.Level level) {
        Logger.setLogLevel(level);
    }

    public static void setReportingEnabled(Boolean bool) {
        x = bool.booleanValue();
    }

    public static void setSDKConfigURL(String str) {
    }

    public static void setSdkManager(SdkManager sdkManager) {
        if (sdkManager == null || !b("com.smaato.sdk.ng")) {
            return;
        }
        g = sdkManager;
    }

    public static void setSkipXmlResource(Integer num) {
        I = num;
    }

    public static void setTestMode(boolean z2) {
        s = z2;
    }

    public static void setTopicsApiEnabled(Boolean bool) {
        w = bool.booleanValue();
    }

    @Deprecated
    public static void setVideoAudioStatus(AudioState audioState) {
        L = audioState;
    }

    public static void validateAtom() {
        a(a, b, (InitialisationListener) null);
    }

    public static String getCustomRequestSignalData(String str) {
        return getCustomRequestSignalData(null, str);
    }

    public static String getSDKVersionInfo(IntegrationType integrationType) {
        DisplayManager displayManager = getSdkManager().getDisplayManager();
        if (integrationType == null) {
            integrationType = IntegrationType.IN_APP_BIDDING;
        }
        return displayManager.getDisplayManagerVersion(integrationType);
    }

    public static void initialize(final String str, final Application application, InitialisationListener initialisationListener) {
        long currentTimeMillis;
        Boolean isTopicsAPIEnabled;
        a = str;
        b = application;
        if (str == null || application == null) {
            initialisationListener.onInitialisationFinished(false);
        }
        try {
            currentTimeMillis = application.getApplicationContext().getPackageManager().getPackageInfo(application.getApplicationContext().getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            currentTimeMillis = System.currentTimeMillis();
        }
        NextGenPreferences nextGenPreferences = new NextGenPreferences(application.getApplicationContext());
        M = nextGenPreferences;
        nextGenPreferences.setAppFirstInstalledTime(String.valueOf(currentTimeMillis));
        M.setSessionTimeStamp(System.currentTimeMillis(), new OnDatabaseResetListener() { // from class: com.smaato.sdk.ng.NextGen$$ExternalSyntheticLambda1
            @Override // com.smaato.sdk.ng.db.OnDatabaseResetListener
            public final void onDatabaseReset() {
                NextGen.a(application);
            }
        }, NextGenPreferences.TIMESTAMP.NORMAL);
        C = application.getPackageName();
        c = new NGSDKApiClient(application);
        FileUtils.initParentDirAsync(application.getApplicationContext());
        if (application.getSystemService("location") != null) {
            h = new NextGenLocationManager(application);
            if (isLocationTrackingEnabled() && areLocationUpdatesEnabled()) {
                h.startLocationUpdates();
            }
        }
        f = new UserDataManager(application.getApplicationContext());
        l = new AdCache();
        m = new VideoAdCache();
        n = new BrowserManager();
        o = new VgiIdManager(application.getApplicationContext());
        k = new DiagnosticsManager(application.getApplicationContext(), getReportingController());
        if (Build.VERSION.SDK_INT >= 33 && (isTopicsAPIEnabled = AdTopicsAPIManager.isTopicsAPIEnabled(application.getApplicationContext())) != null && isTopicsAPIEnabled.booleanValue()) {
            setTopicsApiEnabled(Boolean.TRUE);
            p = new TopicManager(application.getApplicationContext());
        }
        if (j == null) {
            j = new CrashController();
        }
        if (e == null) {
            DeviceInfo deviceInfo = new DeviceInfo(application.getApplicationContext());
            e = deviceInfo;
            deviceInfo.initialize(new DeviceInfo.Listener() { // from class: com.smaato.sdk.ng.NextGen$$ExternalSyntheticLambda2
                @Override // com.smaato.sdk.ng.DeviceInfo.Listener
                public final void onInfoLoaded() {
                    NextGen.c(str);
                }
            });
        }
        if (d == null) {
            SDKConfigAPiClient sDKConfigAPiClient = new SDKConfigAPiClient(application.getApplicationContext());
            d = sDKConfigAPiClient;
            sDKConfigAPiClient.setAppToken(str);
        }
        a(str, application, initialisationListener);
        q = true;
    }

    private static void a(String str, Application application, InitialisationListener initialisationListener) {
        a(application, str, initialisationListener);
    }

    public static String getCustomRequestSignalData(Context context, String str) {
        NGSDKAdRequestFactory nGSDKAdRequestFactory = new NGSDKAdRequestFactory();
        if (isInitialized()) {
            return NGSDKApiUrlComposer.getUrlQuery(getApiClient().getApiUrl(), (NGSDKAdRequest) nGSDKAdRequestFactory.buildRequest("", "", AdSize.SIZE_INTERSTITIAL, "", true, IntegrationType.IN_APP_BIDDING, str, 0, false));
        }
        return NGSDKApiUrlComposer.getUrlQuery(BuildConfig.BASE_URL, (NGSDKAdRequest) nGSDKAdRequestFactory.buildRequest(context, "", "", AdSize.SIZE_INTERSTITIAL, "", true, IntegrationType.IN_APP_BIDDING, str, 0, false));
    }

    public static String getEncodedCustomRequestSignalData(String str) {
        return a(getCustomRequestSignalData(str));
    }

    private static synchronized void a(final Application application, String str, final InitialisationListener initialisationListener) {
        synchronized (NextGen.class) {
            SDKConfigAPiClient sDKConfigAPiClient = d;
            if (sDKConfigAPiClient != null) {
                sDKConfigAPiClient.fetchConfig(new SDKConfigAPiClient.AtomConfigListener() { // from class: com.smaato.sdk.ng.NextGen$$ExternalSyntheticLambda0
                    @Override // com.smaato.sdk.ng.api.SDKConfigAPiClient.AtomConfigListener
                    public final void onAtomValueFetched(Boolean bool) {
                        NextGen.a(application, initialisationListener, bool);
                    }
                });
            }
        }
    }

    public static void reportException(Throwable th) {
        if (j == null || getReportingController() == null || !isReportingEnabled().booleanValue()) {
            return;
        }
        getReportingController().reportEvent(j.formatException(th));
    }

    public static String getEncodedCustomRequestSignalData(Context context, String str) {
        return a(getCustomRequestSignalData(context, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Application application, InitialisationListener initialisationListener, Boolean bool) {
        a(bool, application);
        if (initialisationListener != null) {
            initialisationListener.onInitialisationFinished(true);
        }
    }

    private static void a(Boolean bool, Application application) {
        if (isAtomStarted().booleanValue() || bool == null || application == null || !bool.booleanValue()) {
            return;
        }
        AtomManager.initializeAtom(application.getApplicationContext());
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
