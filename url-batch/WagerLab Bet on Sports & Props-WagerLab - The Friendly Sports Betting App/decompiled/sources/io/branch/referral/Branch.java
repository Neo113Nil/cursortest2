package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.app.ActivityCompat;
import androidx.media3.extractor.ts.TsExtractor;
import com.amazon.a.a.o.b.f;
import com.android.billingclient.api.Purchase;
import io.branch.indexing.BranchUniversalObject;
import io.branch.interfaces.IBranchLoggingCallbacks;
import io.branch.referral.BranchLogger;
import io.branch.referral.Defines;
import io.branch.referral.ServerRequest;
import io.branch.referral.ServerRequestGetLATD;
import io.branch.referral.SystemObserver;
import io.branch.referral.network.BranchRemoteInterface;
import io.branch.referral.network.BranchRemoteInterfaceUrlConnection;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.BranchEvent;
import io.branch.referral.util.DependencyUtilsKt;
import io.branch.referral.util.LinkProperties;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Branch {
    public static final String ALWAYS_DEEPLINK = "$always_deeplink";
    private static final String AUTO_DEEP_LINK_DISABLE = "io.branch.sdk.auto_link_disable";
    private static final String AUTO_DEEP_LINK_KEY = "io.branch.sdk.auto_link_keys";
    private static final String AUTO_DEEP_LINK_PATH = "io.branch.sdk.auto_link_path";
    private static final String AUTO_DEEP_LINK_REQ_CODE = "io.branch.sdk.auto_link_request_code";
    private static final String BRANCH_LIBRARY_VERSION;
    public static final String DEEPLINK_PATH = "$deeplink_path";
    private static final int DEF_AUTO_DEEP_LINK_REQ_CODE = 1501;
    private static final String[] EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST;
    public static final String FEATURE_TAG_SHARE = "share";
    private static final String GOOGLE_VERSION_TAG;
    private static final int LATCH_WAIT_UNTIL = 2500;
    public static final int LINK_TYPE_ONE_TIME_USE = 1;
    public static final int LINK_TYPE_UNLIMITED_USE = 0;
    public static final String OG_APP_ID = "$og_app_id";
    public static final String OG_DESC = "$og_description";
    public static final String OG_IMAGE_URL = "$og_image_url";
    public static final String OG_TITLE = "$og_title";
    public static final String OG_URL = "$og_url";
    public static final String OG_VIDEO = "$og_video";
    public static final String REDIRECT_ANDROID_URL = "$android_url";
    public static final String REDIRECT_BLACKBERRY_URL = "$blackberry_url";
    public static final String REDIRECT_DESKTOP_URL = "$desktop_url";
    public static final String REDIRECT_FIRE_URL = "$fire_url";
    public static final String REDIRECT_IOS_URL = "$ios_url";
    public static final String REDIRECT_IPAD_URL = "$ipad_url";
    public static final String REDIRECT_WINDOWS_PHONE_URL = "$windows_phone_url";
    public static String _userAgentString;
    private static Branch branchReferral_;
    private static boolean bypassCurrentActivityIntentState_;
    static boolean bypassWaitingForIntent_;
    static boolean deferInitForPluginRuntime;
    static boolean disableAutoSessionInitialization;
    private static boolean disableDeviceIDFetch_;
    private static boolean enableInstantDeepLinking;
    public static String installDeveloperId;
    private static boolean isActivityLifeCycleCallbackRegistered_;
    private static String pluginName;
    private static String pluginVersion;
    static boolean referringLinkAttributionForPreinstalledAppsEnabled;
    static boolean userAgentSync;
    private BranchActivityLifecycleObserver activityLifeCycleObserver;
    private final BranchPluginSupport branchPluginSupport_;
    private final BranchQRCodeCache branchQRCodeCache_;
    private final Context context_;
    WeakReference<Activity> currentActivityReference_;
    private CustomTabsIntent customTabsIntentOverride;
    private JSONObject deeplinkDebugParams_;
    private BranchReferralInitListener deferredCallback;
    private InitSessionBuilder deferredSessionBuilder;
    private Uri deferredUri;
    private final DeviceInfo deviceInfo_;
    final PrefHelper prefHelper_;
    public final ServerRequestQueue requestQueue_;
    private ShareLinkManager shareLinkManager_;
    private final TrackingController trackingController;
    final ConcurrentHashMap<BranchLinkData, String> linkCache_ = new ConcurrentHashMap<>();
    private INTENT_STATE intentState_ = INTENT_STATE.PENDING;
    SESSION_STATE initState_ = SESSION_STATE.UNINITIALISED;
    public boolean closeRequestNeeded = false;
    CountDownLatch getFirstReferringParamsLatch = null;
    CountDownLatch getLatestReferringParamsLatch = null;
    private boolean isInstantDeepLinkPossible = false;
    private BranchRemoteInterface branchRemoteInterface_ = new BranchRemoteInterfaceUrlConnection(this);
    private final BranchConfigurationController branchConfigurationController_ = new BranchConfigurationController();

    public interface BranchLinkCreateListener {
        void onLinkCreate(String str, BranchError branchError);
    }

    public interface BranchLinkShareListener {
        void onChannelSelected(String str);

        void onLinkShareResponse(String str, String str2, BranchError branchError);

        void onShareLinkDialogDismissed();

        void onShareLinkDialogLaunched();
    }

    public interface BranchListResponseListener {
        void onReceivingResponse(JSONArray jSONArray, BranchError branchError);
    }

    public interface BranchNativeLinkShareListener {
        void onChannelSelected(String str);

        void onLinkShareResponse(String str, BranchError branchError);
    }

    public interface BranchReferralInitListener {
        void onInitFinished(JSONObject jSONObject, BranchError branchError);
    }

    public interface BranchReferralStateChangedListener {
        void onStateChanged(boolean z, BranchError branchError);
    }

    public interface BranchUniversalReferralInitListener {
        void onInitFinished(BranchUniversalObject branchUniversalObject, LinkProperties linkProperties, BranchError branchError);
    }

    public interface ExtendedBranchLinkShareListener extends BranchLinkShareListener {
        boolean onChannelSelected(String str, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties);
    }

    public interface IChannelProperties {
        String getSharingMessageForChannel(String str);

        String getSharingTitleForChannel(String str);
    }

    enum INTENT_STATE {
        PENDING,
        READY
    }

    public interface LogoutStatusListener {
        void onLogoutFinished(boolean z, BranchError branchError);
    }

    enum SESSION_STATE {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    public interface TrackingStateCallback {
        void onTrackingStateChanged(boolean z, JSONObject jSONObject, BranchError branchError);
    }

    public void disableAppList() {
    }

    static {
        String str = "io.branch.sdk.android:library:" + getSdkVersionNumber();
        BRANCH_LIBRARY_VERSION = str;
        GOOGLE_VERSION_TAG = "!SDK-VERSION-STRING!:" + str;
        _userAgentString = "";
        bypassWaitingForIntent_ = false;
        bypassCurrentActivityIntentState_ = false;
        referringLinkAttributionForPreinstalledAppsEnabled = false;
        isActivityLifeCycleCallbackRegistered_ = false;
        deferInitForPluginRuntime = false;
        EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST = new String[]{"extra_launch_uri", "branch_intent"};
        installDeveloperId = null;
        enableInstantDeepLinking = false;
        pluginVersion = null;
        pluginName = null;
    }

    private Branch(Context context) {
        this.context_ = context;
        this.prefHelper_ = PrefHelper.getInstance(context);
        this.trackingController = new TrackingController(context);
        this.deviceInfo_ = new DeviceInfo(context);
        this.branchPluginSupport_ = new BranchPluginSupport(context);
        this.branchQRCodeCache_ = new BranchQRCodeCache(context);
        this.requestQueue_ = ServerRequestQueue.getInstance(context);
    }

    public static synchronized Branch getInstance() {
        Branch branch;
        synchronized (Branch.class) {
            if (branchReferral_ == null) {
                BranchLogger.v("Branch instance is not created yet. Make sure you call getAutoInstance(Context).");
            }
            branch = branchReferral_;
        }
        return branch;
    }

    private static synchronized Branch initBranchSDK(Context context, String str) {
        synchronized (Branch.class) {
            if (branchReferral_ != null) {
                BranchLogger.w("Warning, attempted to reinitialize Branch SDK singleton!");
                return branchReferral_;
            }
            branchReferral_ = new Branch(context.getApplicationContext());
            if (TextUtils.isEmpty(str)) {
                BranchLogger.w("Warning: Please enter your branch_key in your project's Manifest file!");
                branchReferral_.prefHelper_.setBranchKey(PrefHelper.NO_STRING_VALUE);
            } else {
                branchReferral_.prefHelper_.setBranchKey(str);
                if (!str.equals(BranchUtil.readBranchKey(context))) {
                    branchReferral_.prefHelper_.setBranchKeySource("init_function");
                }
            }
            if (context instanceof Application) {
                branchReferral_.setActivityLifeCycleObserver((Application) context);
            }
            return branchReferral_;
        }
    }

    public static synchronized Branch getAutoInstance(Context context) {
        Branch branch;
        synchronized (Branch.class) {
            if (branchReferral_ == null) {
                if (BranchUtil.getEnableLoggingConfig(context)) {
                    enableLogging();
                }
                deferInitForPluginRuntime(BranchUtil.getDeferInitForPluginRuntimeConfig(context));
                BranchUtil.setAPIBaseUrlFromConfig(context);
                BranchUtil.setFbAppIdFromConfig(context);
                BranchUtil.setCPPLevelFromConfig(context);
                BranchUtil.setTestMode(BranchUtil.checkTestMode(context));
                Branch initBranchSDK = initBranchSDK(context, BranchUtil.readBranchKey(context));
                branchReferral_ = initBranchSDK;
                BranchPreinstall.getPreinstallSystemData(initBranchSDK, context);
            }
            branch = branchReferral_;
        }
        return branch;
    }

    public static Branch getAutoInstance(Context context, String str) {
        if (branchReferral_ == null) {
            if (BranchUtil.getEnableLoggingConfig(context)) {
                enableLogging();
            }
            deferInitForPluginRuntime(BranchUtil.getDeferInitForPluginRuntimeConfig(context));
            BranchUtil.setAPIBaseUrlFromConfig(context);
            BranchUtil.setFbAppIdFromConfig(context);
            BranchUtil.setCPPLevelFromConfig(context);
            BranchUtil.setTestMode(BranchUtil.checkTestMode(context));
            if (!PrefHelper.isValidBranchKey(str)) {
                BranchLogger.w("Warning, Invalid branch key passed! Branch key will be read from manifest instead!");
                str = BranchUtil.readBranchKey(context);
            }
            Branch initBranchSDK = initBranchSDK(context, str);
            branchReferral_ = initBranchSDK;
            BranchPreinstall.getPreinstallSystemData(initBranchSDK, context);
        }
        return branchReferral_;
    }

    public Context getApplicationContext() {
        return this.context_;
    }

    public void setBranchRemoteInterface(BranchRemoteInterface branchRemoteInterface) {
        if (branchRemoteInterface == null) {
            this.branchRemoteInterface_ = new BranchRemoteInterfaceUrlConnection(this);
        } else {
            this.branchRemoteInterface_ = branchRemoteInterface;
        }
    }

    public BranchRemoteInterface getBranchRemoteInterface() {
        return this.branchRemoteInterface_;
    }

    public static void enableTestMode() {
        if (getInstance() != null) {
            getInstance().branchConfigurationController_.setTestModeEnabled(true);
        } else {
            BranchUtil.setTestMode(true);
        }
        BranchLogger.logAlways("enableTestMode has been changed. It now uses the test key but will not log or randomize the device IDs. If you wish to enable logging, please invoke enableLogging. If you wish to simulate installs, please see add a Test Device (https://help.branch.io/using-branch/docs/adding-test-devices) then reset your test device's data (https://help.branch.io/using-branch/docs/adding-test-devices#section-resetting-your-test-device-data).");
    }

    public static void disableTestMode() {
        if (getInstance() != null) {
            getInstance().branchConfigurationController_.setTestModeEnabled(false);
        } else {
            BranchUtil.setTestMode(false);
        }
    }

    public void disableAdNetworkCallouts(boolean z) {
        PrefHelper.getInstance(this.context_).setAdNetworkCalloutsDisabled(z);
    }

    public static void expectDelayedSessionInitialization(boolean z) {
        disableAutoSessionInitialization = z;
        Branch branch = getInstance();
        if (branch == null || !z) {
            return;
        }
        branch.branchConfigurationController_.setDelayedSessionInitUsed(true);
    }

    public static void setAPIUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            PrefHelper.setAPIUrl(str);
            BranchLogger.v("setAPIUrl: Branch API URL was set to " + str);
            return;
        }
        BranchLogger.w("setAPIUrl: URL cannot be empty or null");
    }

    public static void setCDNBaseUrl(String str) {
        PrefHelper.setCDNBaseUrl(str);
    }

    @Deprecated
    public void disableTracking(boolean z, TrackingStateCallback trackingStateCallback) {
        this.trackingController.disableTracking(this.context_, z, trackingStateCallback);
    }

    @Deprecated
    public void disableTracking(boolean z) {
        disableTracking(z, null);
    }

    public boolean isTrackingDisabled() {
        return this.trackingController.isTrackingDisabled();
    }

    public static void disableInstantDeepLinking(boolean z) {
        if (getInstance() != null) {
            getInstance().branchConfigurationController_.setInstantDeepLinkingEnabled(!z);
        } else {
            enableInstantDeepLinking = !z;
        }
    }

    static void shutDown() {
        ServerRequestQueue.shutDown();
        PrefHelper.shutDown();
        BranchUtil.shutDown();
        branchReferral_ = null;
        bypassCurrentActivityIntentState_ = false;
        enableInstantDeepLinking = false;
        isActivityLifeCycleCallbackRegistered_ = false;
        bypassWaitingForIntent_ = false;
    }

    public void resetUserSession() {
        setInitState(SESSION_STATE.UNINITIALISED);
    }

    public void setRetryCount(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i < 0) {
            return;
        }
        prefHelper.setRetryCount(i);
    }

    public void setRetryInterval(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i <= 0) {
            return;
        }
        prefHelper.setRetryInterval(i);
    }

    public void setNetworkTimeout(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i <= 0) {
            return;
        }
        prefHelper.setTimeout(i);
    }

    public void setNetworkConnectTimeout(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i <= 0) {
            return;
        }
        prefHelper.setConnectTimeout(i);
    }

    public void setNoConnectionRetryMax(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i <= 0) {
            return;
        }
        prefHelper.setNoConnectionRetryMax(i);
    }

    public void setReferrerGclidValidForWindow(long j) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper != null) {
            prefHelper.setReferrerGclidValidForWindow(j);
        }
    }

    public void setBranchKey(String str) {
        if (this.prefHelper_ == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (this.prefHelper_.setBranchKey(str)) {
            resetUserSession();
        }
        this.prefHelper_.setBranchKeySource("public_setter");
    }

    public static void disableDeviceIDFetch(Boolean bool) {
        disableDeviceIDFetch_ = bool.booleanValue();
    }

    public static boolean isDeviceIDFetchDisabled() {
        return disableDeviceIDFetch_;
    }

    public void setDeepLinkDebugMode(JSONObject jSONObject) {
        this.deeplinkDebugParams_ = jSONObject;
    }

    public void setLimitFacebookTracking(boolean z) {
        this.prefHelper_.setLimitFacebookTracking(z);
    }

    public void setDMAParamsForEEA(boolean z, boolean z2, boolean z3) {
        this.prefHelper_.setEEARegion(z);
        this.prefHelper_.setAdPersonalizationConsent(z2);
        this.prefHelper_.setAdUserDataUsageConsent(z3);
    }

    public void setRequestMetadata(String str, String str2) {
        this.prefHelper_.setRequestMetadata(str, str2);
    }

    public Branch addInstallMetadata(String str, String str2) {
        this.prefHelper_.addInstallMetadata(str, str2);
        return this;
    }

    public Branch setPreinstallCampaign(String str) {
        addInstallMetadata(Defines.PreinstallKey.campaign.getKey(), str);
        return this;
    }

    public Branch setPreinstallPartner(String str) {
        addInstallMetadata(Defines.PreinstallKey.partner.getKey(), str);
        return this;
    }

    public static void setReferringLinkAttributionForPreinstalledAppsEnabled() {
        referringLinkAttributionForPreinstalledAppsEnabled = true;
    }

    public static boolean isReferringLinkAttributionForPreinstalledAppsEnabled() {
        return referringLinkAttributionForPreinstalledAppsEnabled;
    }

    public static void setIsUserAgentSync(boolean z) {
        userAgentSync = z;
    }

    public static boolean getIsUserAgentSync() {
        return userAgentSync;
    }

    void closeSessionInternal() {
        clearPartnerParameters();
        executeClose();
        this.prefHelper_.setSessionParams(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.setExternalIntentUri(null);
        this.trackingController.updateTrackingState(this.context_);
    }

    void clearPendingRequests() {
        this.requestQueue_.clear();
    }

    private void executeClose() {
        if (this.initState_ != SESSION_STATE.UNINITIALISED) {
            setInitState(SESSION_STATE.UNINITIALISED);
        }
    }

    public static void registerPlugin(String str, String str2) {
        pluginName = str;
        pluginVersion = str2;
    }

    public static String getPluginVersion() {
        return pluginVersion;
    }

    static String getPluginName() {
        return pluginName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readAndStripParam(Uri uri, Activity activity) {
        BranchLogger.v("Read params uri: " + uri + " bypassCurrentActivityIntentState: " + bypassCurrentActivityIntentState_ + " intent state: " + this.intentState_);
        if (this.branchConfigurationController_.isInstantDeepLinkingEnabled()) {
            boolean z = this.intentState_ == INTENT_STATE.READY || !this.activityLifeCycleObserver.isCurrentActivityLaunchedFromStack();
            BranchLogger.v("activityHasValidIntent: " + z);
            boolean isRestartSessionRequested = isRestartSessionRequested(activity != null ? activity.getIntent() : null);
            if (z && !isRestartSessionRequested) {
                extractSessionParamsForIDL(uri, activity);
            }
        }
        if (bypassCurrentActivityIntentState_) {
            this.intentState_ = INTENT_STATE.READY;
        }
        if (this.intentState_ == INTENT_STATE.READY) {
            extractExternalUriAndIntentExtras(uri, activity);
            extractInitialReferrer(activity);
            if (extractBranchLinkFromIntentExtra(activity) || isActivityLaunchedFromHistory(activity) || extractClickID(uri, activity)) {
                return;
            }
            extractAppLink(uri, activity);
        }
    }

    void unlockSDKInitWaitLock() {
        ServerRequestQueue serverRequestQueue = this.requestQueue_;
        if (serverRequestQueue == null) {
            return;
        }
        serverRequestQueue.postInitClear();
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
        this.requestQueue_.processNextQueueItem("unlockSDKInitWaitLock");
    }

    private boolean isIntentParamsAlreadyConsumed(Activity activity) {
        boolean z = false;
        if (activity != null && activity.getIntent() != null && activity.getIntent().getBooleanExtra(Defines.IntentKeys.BranchLinkUsed.getKey(), false)) {
            z = true;
        }
        BranchLogger.v("isIntentParamsAlreadyConsumed " + z);
        return z;
    }

    private boolean isActivityLaunchedFromHistory(Activity activity) {
        return (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) ? false : true;
    }

    String getSessionReferredLink() {
        String externalIntentUri = this.prefHelper_.getExternalIntentUri();
        if (externalIntentUri.equals(PrefHelper.NO_STRING_VALUE)) {
            return null;
        }
        return externalIntentUri;
    }

    public Branch addWhiteListedScheme(String str) {
        if (str != null) {
            UniversalResourceAnalyser.getInstance(this.context_).addToAcceptURLFormats(str);
        }
        return this;
    }

    public Branch setWhiteListedSchemes(List<String> list) {
        if (list != null) {
            UniversalResourceAnalyser.getInstance(this.context_).addToAcceptURLFormats(list);
        }
        return this;
    }

    public Branch addUriHostsToSkip(String str) {
        if (!TextUtils.isEmpty(str)) {
            UniversalResourceAnalyser.getInstance(this.context_).addToSkipURLFormats(str);
        }
        return this;
    }

    void updateSkipURLFormats() {
        UniversalResourceAnalyser.getInstance(this.context_).checkAndUpdateSkipURLFormats(this.context_);
    }

    public void setIdentity(String str) {
        setIdentity(str, null);
    }

    public void setIdentity(String str, BranchReferralInitListener branchReferralInitListener) {
        if (str != null && !str.equals(this.prefHelper_.getIdentity())) {
            installDeveloperId = str;
            this.prefHelper_.setIdentity(str);
        }
        if (branchReferralInitListener != null) {
            branchReferralInitListener.onInitFinished(getFirstReferringParams(), null);
        }
    }

    public void getLastAttributedTouchData(ServerRequestGetLATD.BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener) {
        if (this.context_ != null) {
            this.requestQueue_.handleNewRequest(new ServerRequestGetLATD(this.context_, Defines.RequestPath.GetLATD, branchLastAttributedTouchDataListener));
        }
    }

    public void getLastAttributedTouchData(ServerRequestGetLATD.BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener, int i) {
        if (this.context_ != null) {
            this.requestQueue_.handleNewRequest(new ServerRequestGetLATD(this.context_, Defines.RequestPath.GetLATD, branchLastAttributedTouchDataListener, i));
        }
    }

    public boolean isUserIdentified() {
        return !this.prefHelper_.getIdentity().equals(PrefHelper.NO_STRING_VALUE);
    }

    public void logout() {
        logout(null);
    }

    public void logout(LogoutStatusListener logoutStatusListener) {
        this.prefHelper_.setIdentity(PrefHelper.NO_STRING_VALUE);
        this.prefHelper_.clearUserValues();
        this.linkCache_.clear();
        this.requestQueue_.clear();
        if (logoutStatusListener != null) {
            logoutStatusListener.onLogoutFinished(true, null);
        }
    }

    public JSONObject getFirstReferringParams() {
        return appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getInstallParams()));
    }

    public void removeSessionInitializationDelay() {
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.USER_SET_WAIT_LOCK);
        this.requestQueue_.processNextQueueItem("removeSessionInitializationDelay");
    }

    public JSONObject getFirstReferringParamsSync() {
        this.getFirstReferringParamsLatch = new CountDownLatch(1);
        if (this.prefHelper_.getInstallParams().equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                this.getFirstReferringParamsLatch.await(2500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        JSONObject convertParamsStringToDictionary = convertParamsStringToDictionary(this.prefHelper_.getInstallParams());
        appendDebugParams(convertParamsStringToDictionary);
        this.getFirstReferringParamsLatch = null;
        return convertParamsStringToDictionary;
    }

    public JSONObject getLatestReferringParams() {
        return appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getSessionParams()));
    }

    public JSONObject getLatestReferringParamsSync() {
        this.getLatestReferringParamsLatch = new CountDownLatch(1);
        try {
            if (this.initState_ != SESSION_STATE.INITIALISED) {
                this.getLatestReferringParamsLatch.await(2500L, TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
        JSONObject appendDebugParams = appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getSessionParams()));
        this.getLatestReferringParamsLatch = null;
        return appendDebugParams;
    }

    public void addFacebookPartnerParameterWithName(String str, String str2) {
        if (this.trackingController.isTrackingDisabled()) {
            return;
        }
        this.prefHelper_.partnerParams_.addFacebookParameter(str, str2);
    }

    public void addSnapPartnerParameterWithName(String str, String str2) {
        if (this.trackingController.isTrackingDisabled()) {
            return;
        }
        this.prefHelper_.partnerParams_.addSnapParameter(str, str2);
    }

    public void clearPartnerParameters() {
        this.prefHelper_.partnerParams_.clearAllParameters();
    }

    private JSONObject appendDebugParams(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = this.deeplinkDebugParams_;
                if (jSONObject2 != null) {
                    if (jSONObject2.length() > 0) {
                        BranchLogger.v("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
                    }
                    Iterator<String> keys = this.deeplinkDebugParams_.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.deeplinkDebugParams_.get(next));
                    }
                }
            } catch (Exception e) {
                BranchLogger.d(e.getMessage());
            }
        }
        return jSONObject;
    }

    public JSONObject getDeeplinkDebugParams() {
        JSONObject jSONObject = this.deeplinkDebugParams_;
        if (jSONObject != null && jSONObject.length() > 0) {
            BranchLogger.v("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
        }
        return this.deeplinkDebugParams_;
    }

    String generateShortLinkInternal(ServerRequestCreateUrl serverRequestCreateUrl) {
        if (serverRequestCreateUrl.constructError_ || serverRequestCreateUrl.handleErrors(this.context_)) {
            return null;
        }
        if (this.linkCache_.containsKey(serverRequestCreateUrl.getLinkPost())) {
            String str = this.linkCache_.get(serverRequestCreateUrl.getLinkPost());
            serverRequestCreateUrl.onUrlAvailable(str);
            return str;
        }
        if (serverRequestCreateUrl.isAsync()) {
            this.requestQueue_.handleNewRequest(serverRequestCreateUrl);
            return null;
        }
        return generateShortLinkSync(serverRequestCreateUrl);
    }

    public void share(Activity activity, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties, BranchNativeLinkShareListener branchNativeLinkShareListener, String str, String str2) {
        NativeShareLinkManager.getInstance().shareLink(activity, branchUniversalObject, linkProperties, branchNativeLinkShareListener, str, str2);
    }

    void shareLink(BranchShareSheetBuilder branchShareSheetBuilder) {
        ShareLinkManager shareLinkManager = this.shareLinkManager_;
        if (shareLinkManager != null) {
            shareLinkManager.cancelShareLinkDialog(true);
        }
        ShareLinkManager shareLinkManager2 = new ShareLinkManager();
        this.shareLinkManager_ = shareLinkManager2;
        shareLinkManager2.shareLink(branchShareSheetBuilder);
    }

    public void cancelShareLinkDialog(boolean z) {
        ShareLinkManager shareLinkManager = this.shareLinkManager_;
        if (shareLinkManager != null) {
            shareLinkManager.cancelShareLinkDialog(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String generateShortLinkSync(ServerRequestCreateUrl serverRequestCreateUrl) {
        ServerResponse serverResponse;
        try {
            serverResponse = new GetShortLinkTask().execute(serverRequestCreateUrl).get(this.prefHelper_.getTimeout() + 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            BranchLogger.d(e.getMessage());
            serverResponse = null;
        }
        String longUrl = serverRequestCreateUrl.isDefaultToLongUrl() ? serverRequestCreateUrl.getLongUrl() : null;
        if (serverResponse != null && serverResponse.getStatusCode() == 200) {
            try {
                longUrl = serverResponse.getObject().getString("url");
                if (serverRequestCreateUrl.getLinkPost() != null) {
                    this.linkCache_.put(serverRequestCreateUrl.getLinkPost(), longUrl);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return longUrl;
    }

    private JSONObject convertParamsStringToDictionary(String str) {
        if (str.equals(PrefHelper.NO_STRING_VALUE)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(Base64.decode(str.getBytes(), 2)));
            } catch (JSONException e) {
                e.printStackTrace();
                return new JSONObject();
            }
        }
    }

    public TrackingController getTrackingController() {
        return this.trackingController;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo_;
    }

    public BranchPluginSupport getBranchPluginSupport() {
        return this.branchPluginSupport_;
    }

    public BranchQRCodeCache getBranchQRCodeCache() {
        return this.branchQRCodeCache_;
    }

    public BranchConfigurationController getConfigurationController() {
        return this.branchConfigurationController_;
    }

    PrefHelper getPrefHelper() {
        return this.prefHelper_;
    }

    ShareLinkManager getShareLinkManager() {
        return this.shareLinkManager_;
    }

    void setIntentState(INTENT_STATE intent_state) {
        this.intentState_ = intent_state;
    }

    void setInitState(SESSION_STATE session_state) {
        this.initState_ = session_state;
    }

    SESSION_STATE getInitState() {
        return this.initState_;
    }

    public void setInstantDeepLinkPossible(boolean z) {
        this.isInstantDeepLinkPossible = z;
    }

    public boolean isInstantDeepLinkPossible() {
        return this.isInstantDeepLinkPossible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeSession(ServerRequestInitSession serverRequestInitSession, int i) {
        BranchLogger.v("initializeSession " + serverRequestInitSession + " delay " + i);
        if (this.prefHelper_.getBranchKey() == null || this.prefHelper_.getBranchKey().equalsIgnoreCase(PrefHelper.NO_STRING_VALUE)) {
            setInitState(SESSION_STATE.UNINITIALISED);
            if (serverRequestInitSession.callback_ != null) {
                serverRequestInitSession.callback_.onInitFinished(null, new BranchError("Trouble initializing Branch.", BranchError.ERR_BRANCH_KEY_INVALID));
            }
            BranchLogger.w("Warning: Please enter your branch_key in your project's manifest");
            return;
        }
        if (BranchUtil.isTestModeEnabled()) {
            BranchLogger.w("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
        }
        if (i > 0) {
            serverRequestInitSession.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.USER_SET_WAIT_LOCK);
            new Handler().postDelayed(new Runnable() { // from class: io.branch.referral.Branch.1
                @Override // java.lang.Runnable
                public void run() {
                    Branch.this.removeSessionInitializationDelay();
                }
            }, i);
        }
        Intent intent = getCurrentActivity() != null ? getCurrentActivity().getIntent() : null;
        boolean isRestartSessionRequested = isRestartSessionRequested(intent);
        SESSION_STATE initState = getInitState();
        BranchLogger.v("Intent: " + intent + " forceBranchSession: " + isRestartSessionRequested + " initState: " + initState);
        if (initState == SESSION_STATE.UNINITIALISED || isRestartSessionRequested) {
            if (isRestartSessionRequested && intent != null) {
                intent.removeExtra(Defines.IntentKeys.ForceNewBranchSession.getKey());
            }
            registerAppInit(serverRequestInitSession, isRestartSessionRequested);
            return;
        }
        if (serverRequestInitSession.callback_ != null) {
            serverRequestInitSession.callback_.onInitFinished(null, new BranchError("Warning.", BranchError.ERR_BRANCH_ALREADY_INITIALIZED));
        }
    }

    void registerAppInit(ServerRequestInitSession serverRequestInitSession, boolean z) {
        BranchLogger.v("registerAppInit " + serverRequestInitSession + " forceBranchSession: " + z);
        setInitState(SESSION_STATE.INITIALISING);
        ServerRequestInitSession selfInitRequest = this.requestQueue_.getSelfInitRequest();
        BranchLogger.v("Ordering init calls");
        BranchLogger.v("Self init request: " + selfInitRequest);
        this.requestQueue_.printQueue();
        if (selfInitRequest == null || z) {
            BranchLogger.v("Moving " + serverRequestInitSession + " to front of the queue or behind network-in-progress request");
            this.requestQueue_.insertRequestAtFront(serverRequestInitSession);
        } else {
            BranchLogger.v("Retrieved " + selfInitRequest + " with callback " + selfInitRequest.callback_ + " in queue currently");
            selfInitRequest.callback_ = serverRequestInitSession.callback_;
            BranchLogger.v(selfInitRequest + " now has callback " + serverRequestInitSession.callback_);
        }
        BranchLogger.v("Finished ordering init calls");
        this.requestQueue_.printQueue();
        initTasks(serverRequestInitSession);
        this.requestQueue_.processNextQueueItem("registerAppInit");
    }

    private void initTasks(final ServerRequest serverRequest) {
        BranchLogger.v("initTasks " + serverRequest);
        if (this.intentState_ != INTENT_STATE.READY && isWaitingForIntent()) {
            serverRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
            BranchLogger.v("Added INTENT_PENDING_WAIT_LOCK");
        }
        if (serverRequest instanceof ServerRequestRegisterInstall) {
            serverRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
            BranchLogger.v("Added INSTALL_REFERRER_FETCH_WAIT_LOCK");
            this.deviceInfo_.getSystemObserver().fetchInstallReferrer(this.context_, new SystemObserver.InstallReferrerFetchEvents() { // from class: io.branch.referral.Branch.2
                @Override // io.branch.referral.SystemObserver.InstallReferrerFetchEvents
                public void onInstallReferrersFinished() {
                    serverRequest.removeProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
                    BranchLogger.v("INSTALL_REFERRER_FETCH_WAIT_LOCK removed");
                    Branch.this.requestQueue_.processNextQueueItem("onInstallReferrersFinished");
                }
            });
        }
        serverRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        BranchLogger.v("Added GAID_FETCH_WAIT_LOCK");
        this.deviceInfo_.getSystemObserver().fetchAdId(this.context_, new SystemObserver.AdsParamsFetchEvents() { // from class: io.branch.referral.Branch.3
            @Override // io.branch.referral.SystemObserver.AdsParamsFetchEvents
            public void onAdsParamsFetchFinished() {
                Branch.this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
                Branch.this.requestQueue_.processNextQueueItem("onAdsParamsFetchFinished");
            }
        });
    }

    ServerRequestInitSession getInstallOrOpenRequest(BranchReferralInitListener branchReferralInitListener, boolean z) {
        if (this.requestQueue_.hasUser()) {
            return new ServerRequestRegisterOpen(this.context_, branchReferralInitListener, z);
        }
        return new ServerRequestRegisterInstall(this.context_, branchReferralInitListener, z);
    }

    void onIntentReady(Activity activity) {
        BranchLogger.v("onIntentReady " + activity + " removing INTENT_PENDING_WAIT_LOCK");
        setIntentState(INTENT_STATE.READY);
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        if (activity.getIntent() != null && getInitState() != SESSION_STATE.INITIALISED) {
            readAndStripParam(activity.getIntent().getData(), activity);
        }
        this.requestQueue_.processNextQueueItem("onIntentReady");
    }

    public void unlockPendingIntent() {
        BranchLogger.v("unlockPendingIntent removing INTENT_PENDING_WAIT_LOCK");
        setIntentState(INTENT_STATE.READY);
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        this.requestQueue_.processNextQueueItem("unlockPendingIntent");
    }

    public void notifyNetworkAvailable() {
        this.requestQueue_.processNextQueueItem("notifyNetworkAvailable");
    }

    private void setActivityLifeCycleObserver(Application application) {
        BranchLogger.v("setActivityLifeCycleObserver activityLifeCycleObserver: " + this.activityLifeCycleObserver + " application: " + application);
        try {
            this.activityLifeCycleObserver = new BranchActivityLifecycleObserver();
            BranchLogger.v("setActivityLifeCycleObserver set new activityLifeCycleObserver: " + this.activityLifeCycleObserver + " application: " + application);
            application.unregisterActivityLifecycleCallbacks(this.activityLifeCycleObserver);
            application.registerActivityLifecycleCallbacks(this.activityLifeCycleObserver);
            isActivityLifeCycleCallbackRegistered_ = true;
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            isActivityLifeCycleCallbackRegistered_ = false;
            BranchLogger.v(new BranchError("", -108).getMessage());
        }
    }

    boolean isRestartSessionRequested(Intent intent) {
        return checkIntentForSessionRestart(intent) || checkIntentForUnusedBranchLink(intent);
    }

    private boolean checkIntentForSessionRestart(Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra(Defines.IntentKeys.ForceNewBranchSession.getKey(), false);
        }
        return false;
    }

    private boolean checkIntentForUnusedBranchLink(Intent intent) {
        if (intent != null) {
            boolean z = intent.getStringExtra(Defines.IntentKeys.BranchURI.getKey()) != null;
            boolean booleanExtra = intent.getBooleanExtra(Defines.IntentKeys.BranchLinkUsed.getKey(), false);
            if (z && !booleanExtra) {
                return true;
            }
        }
        return false;
    }

    private class GetShortLinkTask extends AsyncTask<ServerRequest, Void, ServerResponse> {
        private GetShortLinkTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public ServerResponse doInBackground(ServerRequest... serverRequestArr) {
            return Branch.this.branchRemoteInterface_.make_restful_post(serverRequestArr[0].getPost(), Branch.this.prefHelper_.getAPIBaseUrl() + Defines.RequestPath.GetURL.getPath(), Defines.RequestPath.GetURL.getPath(), Branch.this.prefHelper_.getBranchKey());
        }
    }

    public static boolean isAutoDeepLinkLaunch(Activity activity) {
        return activity.getIntent().getStringExtra(Defines.IntentKeys.AutoDeepLinked.getKey()) != null;
    }

    void checkForAutoDeepLinkConfiguration() {
        JSONObject latestReferringParams = getLatestReferringParams();
        String str = null;
        try {
            if (latestReferringParams.has(Defines.Jsonkey.Clicked_Branch_Link.getKey()) && latestReferringParams.getBoolean(Defines.Jsonkey.Clicked_Branch_Link.getKey())) {
                if (latestReferringParams.length() > 0) {
                    ApplicationInfo applicationInfo = this.context_.getPackageManager().getApplicationInfo(this.context_.getPackageName(), 128);
                    if (applicationInfo.metaData == null || !applicationInfo.metaData.getBoolean(AUTO_DEEP_LINK_DISABLE, false)) {
                        ActivityInfo[] activityInfoArr = this.context_.getPackageManager().getPackageInfo(this.context_.getPackageName(), TsExtractor.TS_STREAM_TYPE_AC3).activities;
                        int i = DEF_AUTO_DEEP_LINK_REQ_CODE;
                        if (activityInfoArr != null) {
                            for (ActivityInfo activityInfo : activityInfoArr) {
                                if (activityInfo != null && activityInfo.metaData != null && ((activityInfo.metaData.getString(AUTO_DEEP_LINK_KEY) != null || activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH) != null) && (checkForAutoDeepLinkKeys(latestReferringParams, activityInfo) || checkForAutoDeepLinkPath(latestReferringParams, activityInfo)))) {
                                    str = activityInfo.name;
                                    i = activityInfo.metaData.getInt(AUTO_DEEP_LINK_REQ_CODE, DEF_AUTO_DEEP_LINK_REQ_CODE);
                                    break;
                                }
                            }
                        }
                        BranchLogger.v("deepLinkActivity " + str + " getCurrentActivity " + getCurrentActivity());
                        if (str != null && getCurrentActivity() != null) {
                            Activity currentActivity = getCurrentActivity();
                            Intent intent = new Intent(currentActivity, Class.forName(str));
                            intent.putExtra(Defines.IntentKeys.AutoDeepLinked.getKey(), "true");
                            intent.putExtra(Defines.Jsonkey.ReferringData.getKey(), latestReferringParams.toString());
                            Iterator<String> keys = latestReferringParams.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                intent.putExtra(next, latestReferringParams.getString(next));
                            }
                            currentActivity.startActivityForResult(intent, i);
                            return;
                        }
                        BranchLogger.v("No activity reference to launch deep linked activity");
                        return;
                    }
                    return;
                }
                return;
            }
            BranchLogger.v("Does not have Clicked_Branch_Link or Clicked_Branch_Link is false, returning");
        } catch (PackageManager.NameNotFoundException unused) {
            BranchLogger.w("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            BranchLogger.w("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity " + ((String) null));
        } catch (Exception unused3) {
        }
    }

    private boolean checkForAutoDeepLinkKeys(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString(AUTO_DEEP_LINK_KEY) != null) {
            for (String str : activityInfo.metaData.getString(AUTO_DEEP_LINK_KEY).split(f.f598a)) {
                if (jSONObject.has(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean checkForAutoDeepLinkPath(JSONObject jSONObject, ActivityInfo activityInfo) {
        String string;
        String str = null;
        try {
        } catch (JSONException e) {
            BranchLogger.d(e.getMessage());
        }
        if (jSONObject.has(Defines.Jsonkey.AndroidDeepLinkPath.getKey())) {
            string = jSONObject.getString(Defines.Jsonkey.AndroidDeepLinkPath.getKey());
        } else {
            if (jSONObject.has(Defines.Jsonkey.DeepLinkPath.getKey())) {
                string = jSONObject.getString(Defines.Jsonkey.DeepLinkPath.getKey());
            }
            if (activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH) != null && str != null) {
                for (String str2 : activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH).split(f.f598a)) {
                    if (pathMatch(str2.trim(), str)) {
                        return true;
                    }
                }
            }
            return false;
        }
        str = string;
        if (activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH) != null) {
            while (r1 < r6) {
            }
        }
        return false;
    }

    private boolean pathMatch(String str, String str2) {
        String[] split = str.split("\\?")[0].split("/");
        String[] split2 = str2.split("\\?")[0].split("/");
        if (split.length != split2.length) {
            return false;
        }
        for (int i = 0; i < split.length && i < split2.length; i++) {
            String str3 = split[i];
            if (!str3.equals(split2[i]) && !str3.contains("*")) {
                return false;
            }
        }
        return true;
    }

    public static void enableLogging(IBranchLoggingCallbacks iBranchLoggingCallbacks, BranchLogger.BranchLogLevel branchLogLevel) {
        BranchLogger.setLoggerCallback(iBranchLoggingCallbacks);
        BranchLogger.setLoggingLevel(branchLogLevel);
        BranchLogger.setLoggingEnabled(true);
        BranchLogger.logAlways(GOOGLE_VERSION_TAG);
    }

    public static void enableLogging() {
        enableLogging(null, BranchLogger.BranchLogLevel.VERBOSE);
    }

    public static void enableLogging(IBranchLoggingCallbacks iBranchLoggingCallbacks) {
        enableLogging(iBranchLoggingCallbacks, BranchLogger.BranchLogLevel.VERBOSE);
    }

    public static void enableLogging(BranchLogger.BranchLogLevel branchLogLevel) {
        enableLogging(null, branchLogLevel);
    }

    public static void disableLogging() {
        BranchLogger.setLoggingEnabled(false);
        BranchLogger.setLoggerCallback(null);
    }

    @Deprecated
    public static void enableForcedSession() {
        bypassWaitingForIntent(true);
    }

    public static void bypassWaitingForIntent(boolean z) {
        bypassWaitingForIntent_ = z;
    }

    @Deprecated
    public static void disableForcedSession() {
        bypassWaitingForIntent(false);
    }

    @Deprecated
    public static boolean isForceSessionEnabled() {
        return isWaitingForIntent();
    }

    public static boolean isWaitingForIntent() {
        return !bypassWaitingForIntent_;
    }

    public static void enableBypassCurrentActivityIntentState() {
        bypassCurrentActivityIntentState_ = true;
    }

    public static boolean bypassCurrentActivityIntentState() {
        return bypassCurrentActivityIntentState_;
    }

    public void registerView(BranchUniversalObject branchUniversalObject, BranchUniversalObject.RegisterViewStatusListener registerViewStatusListener) {
        if (this.context_ != null) {
            new BranchEvent(BRANCH_STANDARD_EVENT.VIEW_ITEM).addContentItems(branchUniversalObject).logEvent(this.context_);
        }
    }

    public static boolean isInstantApp(Context context) {
        return InstantAppUtil.isInstantApp(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean showInstallPrompt(Activity activity, int i) {
        String str;
        String str2 = "";
        if (getInstance() != null) {
            JSONObject latestReferringParams = getInstance().getLatestReferringParams();
            String str3 = "~" + Defines.Jsonkey.ReferringLink.getKey();
            if (latestReferringParams != null && latestReferringParams.has(str3)) {
                try {
                    str = latestReferringParams.getString(str3);
                    try {
                        str = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e = e;
                        e.printStackTrace();
                        if (!TextUtils.isEmpty(str)) {
                        }
                        return InstantAppUtil.doShowInstallPrompt(activity, i, str2);
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (!TextUtils.isEmpty(str)) {
                        }
                        return InstantAppUtil.doShowInstallPrompt(activity, i, str2);
                    }
                } catch (UnsupportedEncodingException | JSONException e3) {
                    e = e3;
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = Defines.Jsonkey.IsFullAppConv.getKey() + "=true&" + Defines.Jsonkey.ReferringLink.getKey() + f.b + str;
                }
            }
        }
        return InstantAppUtil.doShowInstallPrompt(activity, i, str2);
    }

    public static boolean showInstallPrompt(Activity activity, int i, String str) {
        return InstantAppUtil.doShowInstallPrompt(activity, i, Defines.Jsonkey.IsFullAppConv.getKey() + "=true&" + str);
    }

    public static boolean showInstallPrompt(Activity activity, int i, BranchUniversalObject branchUniversalObject) {
        String str = Defines.Jsonkey.ReferringLink.getKey() + f.b + branchUniversalObject.getShortUrl(activity, new LinkProperties());
        if (!TextUtils.isEmpty(str)) {
            return showInstallPrompt(activity, i, str);
        }
        return showInstallPrompt(activity, i, "");
    }

    private void extractSessionParamsForIDL(Uri uri, Activity activity) {
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        Intent intent = activity.getIntent();
        if (uri != null) {
            try {
                if (!isIntentParamsAlreadyConsumed(activity)) {
                    if (!TextUtils.isEmpty(intent.getStringExtra(Defines.IntentKeys.BranchData.getKey()))) {
                        String stringExtra = intent.getStringExtra(Defines.IntentKeys.BranchData.getKey());
                        if (stringExtra != null) {
                            JSONObject jSONObject = new JSONObject(stringExtra);
                            jSONObject.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), true);
                            this.prefHelper_.setSessionParams(jSONObject.toString());
                            this.isInstantDeepLinkPossible = true;
                        }
                        intent.removeExtra(Defines.IntentKeys.BranchData.getKey());
                        activity.setIntent(intent);
                        return;
                    }
                    if (uri.isHierarchical() && Boolean.valueOf(uri.getQueryParameter(Defines.Jsonkey.Instant.getKey())).booleanValue()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : uri.getQueryParameterNames()) {
                            jSONObject2.put(str, uri.getQueryParameter(str));
                        }
                        jSONObject2.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), true);
                        this.prefHelper_.setSessionParams(jSONObject2.toString());
                        this.isInstantDeepLinkPossible = true;
                        return;
                    }
                    return;
                }
            } catch (JSONException e) {
                BranchLogger.d(e.getMessage());
                return;
            }
        }
        if (this.prefHelper_.getInstallParams().equals(PrefHelper.NO_STRING_VALUE)) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(Defines.Jsonkey.IsFirstSession.getKey(), false);
        this.prefHelper_.setSessionParams(jSONObject3.toString());
        this.isInstantDeepLinkPossible = true;
    }

    private void extractAppLink(Uri uri, Activity activity) {
        if (uri == null || activity == null) {
            return;
        }
        String scheme = uri.getScheme();
        Intent intent = activity.getIntent();
        if (scheme == null || intent == null) {
            return;
        }
        if ((!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) || TextUtils.isEmpty(uri.getHost()) || isIntentParamsAlreadyConsumed(activity)) {
            return;
        }
        if (uri.toString().equalsIgnoreCase(UniversalResourceAnalyser.getInstance(this.context_).getStrippedURL(uri.toString()))) {
            this.prefHelper_.setAppLink(uri.toString());
        }
        intent.putExtra(Defines.IntentKeys.BranchLinkUsed.getKey(), true);
        activity.setIntent(intent);
    }

    private boolean extractClickID(Uri uri, Activity activity) {
        String queryParameter;
        String str;
        if (uri != null) {
            try {
                if (!uri.isHierarchical() || (queryParameter = uri.getQueryParameter(Defines.Jsonkey.LinkClickID.getKey())) == null) {
                    return false;
                }
                this.prefHelper_.setLinkClickIdentifier(queryParameter);
                String str2 = "link_click_id=" + queryParameter;
                String uri2 = uri.toString();
                if (str2.equals(uri.getQuery())) {
                    str = "\\?" + str2;
                } else if (uri2.length() - str2.length() == uri2.indexOf(str2)) {
                    str = "&" + str2;
                } else {
                    str = str2 + "&";
                }
                activity.getIntent().setData(Uri.parse(uri2.replaceFirst(str, "")));
                activity.getIntent().putExtra(Defines.IntentKeys.BranchLinkUsed.getKey(), true);
                return true;
            } catch (Exception e) {
                BranchLogger.d(e.getMessage());
            }
        }
        return false;
    }

    private boolean extractBranchLinkFromIntentExtra(Activity activity) {
        String uri;
        BranchLogger.v("extractBranchLinkFromIntentExtra " + activity);
        if (activity == null) {
            return false;
        }
        try {
            if (activity.getIntent() == null || activity.getIntent().getExtras() == null || isIntentParamsAlreadyConsumed(activity)) {
                return false;
            }
            Object obj = activity.getIntent().getExtras().get(Defines.IntentKeys.BranchURI.getKey());
            if (obj instanceof String) {
                uri = (String) obj;
            } else {
                uri = obj instanceof Uri ? ((Uri) obj).toString() : null;
            }
            if (TextUtils.isEmpty(uri)) {
                return false;
            }
            this.prefHelper_.setPushIdentifier(uri);
            Intent intent = activity.getIntent();
            intent.putExtra(Defines.IntentKeys.BranchLinkUsed.getKey(), true);
            activity.setIntent(intent);
            return true;
        } catch (Exception e) {
            BranchLogger.d(e.getMessage());
            return false;
        }
    }

    private void extractExternalUriAndIntentExtras(Uri uri, Activity activity) {
        BranchLogger.v("extractExternalUriAndIntentExtras " + uri + " " + activity);
        try {
            if (isIntentParamsAlreadyConsumed(activity)) {
                return;
            }
            String strippedURL = UniversalResourceAnalyser.getInstance(this.context_).getStrippedURL(uri.toString());
            this.prefHelper_.setExternalIntentUri(strippedURL);
            if (strippedURL.equals(uri.toString())) {
                Bundle extras = activity.getIntent().getExtras();
                Set<String> keySet = extras.keySet();
                if (keySet.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                for (String str : EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST) {
                    if (keySet.contains(str)) {
                        jSONObject.put(str, extras.get(str));
                    }
                }
                if (jSONObject.length() > 0) {
                    this.prefHelper_.setExternalIntentExtra(jSONObject.toString());
                }
            }
        } catch (Exception e) {
            BranchLogger.d(e.getMessage());
        }
    }

    private void extractInitialReferrer(Activity activity) {
        BranchLogger.v("extractInitialReferrer " + activity);
        if (activity != null) {
            Uri referrer = ActivityCompat.getReferrer(activity);
            BranchLogger.v("Initial referrer: " + referrer);
            if (referrer != null) {
                this.prefHelper_.setInitialReferrer(referrer.toString());
            }
        }
    }

    Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivityReference_;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static class InitSessionBuilder {
        private BranchReferralInitListener callback;
        private int delay;
        private Boolean ignoreIntent;
        private boolean isAutoInitialization;
        private boolean isReInitializing;
        private Uri uri;

        public InitSessionBuilder isReferrable(boolean z) {
            return this;
        }

        private InitSessionBuilder(Activity activity) {
            Branch branch = Branch.getInstance();
            if (activity != null) {
                if (branch.getCurrentActivity() == null || !branch.getCurrentActivity().getLocalClassName().equals(activity.getLocalClassName())) {
                    BranchLogger.v("currentActivityReference_ was " + branch.currentActivityReference_);
                    branch.currentActivityReference_ = new WeakReference<>(activity);
                    BranchLogger.v("currentActivityReference_ is now set to " + branch.currentActivityReference_);
                }
            }
        }

        InitSessionBuilder isAutoInitialization(boolean z) {
            this.isAutoInitialization = z;
            return this;
        }

        public InitSessionBuilder withCallback(BranchUniversalReferralInitListener branchUniversalReferralInitListener) {
            BranchLogger.v("InitSessionBuilder setting BranchUniversalReferralInitListener withCallback with " + branchUniversalReferralInitListener);
            this.callback = new BranchUniversalReferralInitWrapper(branchUniversalReferralInitListener);
            return this;
        }

        public InitSessionBuilder withDelay(int i) {
            this.delay = i;
            return this;
        }

        public InitSessionBuilder withCallback(BranchReferralInitListener branchReferralInitListener) {
            BranchLogger.v("InitSessionBuilder setting BranchReferralInitListener withCallback with " + branchReferralInitListener);
            this.callback = branchReferralInitListener;
            return this;
        }

        public InitSessionBuilder withData(Uri uri) {
            BranchLogger.v("InitSessionBuilder setting withData with " + uri);
            this.uri = uri;
            return this;
        }

        public InitSessionBuilder ignoreIntent(boolean z) {
            this.ignoreIntent = Boolean.valueOf(z);
            return this;
        }

        public void init() {
            BranchLogger.v("Beginning session initialization");
            BranchLogger.v("Session uri is " + this.uri);
            BranchLogger.v("Callback is " + this.callback);
            BranchLogger.v("Is auto init " + this.isAutoInitialization);
            BranchLogger.v("Will ignore intent " + this.ignoreIntent);
            BranchLogger.v("Is reinitializing " + this.isReInitializing);
            if (Branch.deferInitForPluginRuntime) {
                BranchLogger.v("Session init is deferred until signaled by plugin.");
                cacheSessionBuilder(this);
                return;
            }
            Branch branch = Branch.getInstance();
            if (branch == null) {
                BranchLogger.logAlways("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
                return;
            }
            Boolean bool = this.ignoreIntent;
            if (bool != null) {
                Branch.bypassWaitingForIntent(bool.booleanValue());
            }
            Activity currentActivity = branch.getCurrentActivity();
            Intent intent = currentActivity != null ? currentActivity.getIntent() : null;
            Uri referrer = currentActivity != null ? ActivityCompat.getReferrer(currentActivity) : null;
            BranchLogger.v("Activity: " + currentActivity);
            BranchLogger.v("Intent: " + intent);
            BranchLogger.v("Initial Referrer: " + referrer);
            if (currentActivity != null && intent != null && referrer != null) {
                PrefHelper.getInstance(currentActivity).setInitialReferrer(referrer.toString());
            }
            Uri uri = this.uri;
            if (uri != null) {
                branch.readAndStripParam(uri, currentActivity);
            } else if (this.isReInitializing && branch.isRestartSessionRequested(intent)) {
                branch.readAndStripParam(intent != null ? intent.getData() : null, currentActivity);
            } else if (this.isReInitializing) {
                BranchReferralInitListener branchReferralInitListener = this.callback;
                if (branchReferralInitListener != null) {
                    branchReferralInitListener.onInitFinished(null, new BranchError("", BranchError.ERR_IMPROPER_REINITIALIZATION));
                    return;
                }
                return;
            }
            BranchLogger.v("isInstantDeepLinkPossible " + branch.isInstantDeepLinkPossible);
            if (branch.isInstantDeepLinkPossible) {
                branch.isInstantDeepLinkPossible = false;
                BranchReferralInitListener branchReferralInitListener2 = this.callback;
                if (branchReferralInitListener2 != null) {
                    branchReferralInitListener2.onInitFinished(branch.getLatestReferringParams(), null);
                }
                Branch.getInstance().requestQueue_.addExtraInstrumentationData(Defines.Jsonkey.InstantDeepLinkSession.getKey(), "true");
                branch.checkForAutoDeepLinkConfiguration();
                this.callback = null;
            }
            if (this.delay > 0) {
                Branch.expectDelayedSessionInitialization(true);
            }
            ServerRequestInitSession installOrOpenRequest = branch.getInstallOrOpenRequest(this.callback, this.isAutoInitialization);
            BranchLogger.d("Creating " + installOrOpenRequest + " from init on thread " + Thread.currentThread().getName());
            branch.initializeSession(installOrOpenRequest, this.delay);
        }

        private void cacheSessionBuilder(InitSessionBuilder initSessionBuilder) {
            Branch.getInstance().deferredSessionBuilder = this;
            BranchLogger.v("Session initialization deferred until plugin invokes notifyNativeToInit()\nCaching Session Builder " + Branch.getInstance().deferredSessionBuilder + "\nuri: " + Branch.getInstance().deferredSessionBuilder.uri + "\ncallback: " + Branch.getInstance().deferredSessionBuilder.callback + "\nisReInitializing: " + Branch.getInstance().deferredSessionBuilder.isReInitializing + "\ndelay: " + Branch.getInstance().deferredSessionBuilder.delay + "\nisAutoInitialization: " + Branch.getInstance().deferredSessionBuilder.isAutoInitialization + "\nignoreIntent: " + Branch.getInstance().deferredSessionBuilder.ignoreIntent);
        }

        public void reInit() {
            this.isReInitializing = true;
            init();
        }
    }

    boolean isIDLSession() {
        return Boolean.parseBoolean(getInstance().requestQueue_.instrumentationExtraData_.get(Defines.Jsonkey.InstantDeepLinkSession.getKey()));
    }

    public static InitSessionBuilder sessionBuilder(Activity activity) {
        return new InitSessionBuilder(activity);
    }

    public static String getSdkVersionNumber() {
        return BuildConfig.VERSION_NAME;
    }

    static void deferInitForPluginRuntime(boolean z) {
        BranchLogger.v("deferInitForPluginRuntime " + z);
        deferInitForPluginRuntime = z;
        if (z) {
            expectDelayedSessionInitialization(true);
            if (getInstance() != null) {
                getInstance().branchConfigurationController_.setDeferInitForPluginRuntime(true);
            }
        }
    }

    public static void notifyNativeToInit() {
        BranchLogger.v("notifyNativeToInit deferredSessionBuilder " + getInstance().deferredSessionBuilder);
        SESSION_STATE initState = getInstance().getInitState();
        if (initState == SESSION_STATE.UNINITIALISED) {
            deferInitForPluginRuntime = false;
            if (getInstance().deferredSessionBuilder != null) {
                getInstance().deferredSessionBuilder.init();
                return;
            }
            return;
        }
        BranchLogger.v("notifyNativeToInit session is not uninitialized. Session state is " + initState);
    }

    public void logEventWithPurchase(final Context context, final Purchase purchase) {
        if (DependencyUtilsKt.classExists("com.android.billingclient.api.BillingClient")) {
            BillingGooglePlay.INSTANCE.getInstance().startBillingClient(new Function1() { // from class: io.branch.referral.Branch$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Branch.lambda$logEventWithPurchase$0(context, purchase, (Boolean) obj);
                }
            });
        }
    }

    static /* synthetic */ Unit lambda$logEventWithPurchase$0(Context context, Purchase purchase, Boolean bool) {
        if (bool.booleanValue()) {
            BillingGooglePlay.INSTANCE.getInstance().logEventWithPurchase(context, purchase);
            return null;
        }
        BranchLogger.e("Cannot log IAP event. Billing client setup failed");
        return null;
    }

    public static void useEUEndpoint() {
        PrefHelper.useEUEndpoint(true);
    }

    public static void setFBAppID(String str) {
        if (!TextUtils.isEmpty(str)) {
            PrefHelper.fbAppId_ = str;
            BranchLogger.v("setFBAppID to " + str);
        } else {
            BranchLogger.w("setFBAppID: fbAppID cannot be empty or null");
        }
    }

    public void setConsumerProtectionAttributionLevel(Defines.BranchAttributionLevel branchAttributionLevel) {
        setConsumerProtectionAttributionLevel(branchAttributionLevel, null);
    }

    public void setConsumerProtectionAttributionLevel(Defines.BranchAttributionLevel branchAttributionLevel, TrackingStateCallback trackingStateCallback) {
        this.prefHelper_.setConsumerProtectionAttributionLevel(branchAttributionLevel);
        BranchLogger.v("Set Consumer Protection Preference to " + branchAttributionLevel);
        if (branchAttributionLevel == Defines.BranchAttributionLevel.NONE) {
            this.trackingController.disableTracking(this.context_, true, trackingStateCallback);
        } else if (this.trackingController.isTrackingDisabled()) {
            this.trackingController.disableTracking(this.context_, false, trackingStateCallback);
        }
    }

    public void openBrowserExperience(JSONObject jSONObject) {
        BranchLogger.v("openBrowserExperience JSONObject: " + String.valueOf(jSONObject));
        try {
            if (jSONObject == null) {
                BranchLogger.e("openBrowserExperience: jsonObject is null");
                return;
            }
            String optString = jSONObject.has(Defines.Jsonkey.Enhanced_Web_Link_UX.getKey()) ? jSONObject.optString(Defines.Jsonkey.Enhanced_Web_Link_UX.getKey(), null) : null;
            String optString2 = jSONObject.has(Defines.Jsonkey.Web_Link_Redirect_URL.getKey()) ? jSONObject.optString(Defines.Jsonkey.Web_Link_Redirect_URL.getKey(), null) : null;
            if (optString2 != null && !optString2.isEmpty()) {
                boolean classExists = DependencyUtilsKt.classExists(DependencyUtilsKt.androidBrowserClass);
                if (Defines.Jsonkey.IN_APP_WEBVIEW.getKey().equals(optString) && classExists) {
                    if (this.customTabsIntentOverride != null) {
                        BranchLogger.v("Using developer specified CustomTabs");
                        launchCustomTabBrowser(this.customTabsIntentOverride, optString2, getCurrentActivity());
                        return;
                    } else {
                        BranchLogger.v("Using default CustomTabs");
                        launchCustomTabBrowser(optString2, getCurrentActivity());
                        return;
                    }
                }
                BranchLogger.v("customTabsImported " + classExists);
                BranchLogger.v("Opening in external browser.");
                launchExternalBrowser(optString2);
                return;
            }
            BranchLogger.e("openBrowserExperience: weblinkUrl is null or empty");
        } catch (Exception e) {
            BranchLogger.e("openBrowserExperience caught exception: " + e);
        }
    }

    private void launchCustomTabBrowser(String str, Activity activity) {
        launchCustomTabBrowser(new CustomTabsIntent.Builder().build(), str, activity);
    }

    public void setCustomTabsIntent(CustomTabsIntent customTabsIntent) {
        this.customTabsIntentOverride = customTabsIntent;
    }

    private void launchCustomTabBrowser(CustomTabsIntent customTabsIntent, String str, Activity activity) {
        try {
            this.prefHelper_.setWebLinkUxTypeUsed(Defines.Jsonkey.IN_APP_WEBVIEW.getKey());
            this.prefHelper_.setWebLinkLoadTime(System.currentTimeMillis());
            customTabsIntent.launchUrl(activity, Uri.parse(str));
        } catch (Exception e) {
            BranchLogger.e("launchCustomTabBrowser caught exception: " + e);
        }
    }

    private void launchExternalBrowser(String str) {
        try {
            this.prefHelper_.setWebLinkUxTypeUsed(Defines.Jsonkey.EXTERNAL_BROWSER.getKey());
            this.prefHelper_.setWebLinkLoadTime(System.currentTimeMillis());
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            this.context_.startActivity(intent);
        } catch (Exception e) {
            BranchLogger.e("launchExternalBrowser caught exception: " + e);
        }
    }
}
