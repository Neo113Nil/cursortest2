package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.Defines;
import io.branch.referral.SystemObserver;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class ServerRequest {
    private static final String POST_KEY = "REQ_POST";
    private static final String POST_PATH_KEY = "REQ_POST_PATH";
    private static final Defines.RequestPath[] initializationAndEventRoutes = {Defines.RequestPath.RegisterInstall, Defines.RequestPath.RegisterOpen, Defines.RequestPath.ContentEvent, Defines.RequestPath.TrackStandardEvent, Defines.RequestPath.TrackCustomEvent};
    public boolean constructError_;
    private final Context context_;
    protected long creation_ts;
    public int currentRetryCount;
    private final Set<PROCESS_WAIT_LOCK> locks_;
    private JSONObject params_;
    protected final PrefHelper prefHelper_;
    private long queueWaitTime_;
    final Defines.RequestPath requestPath_;
    protected String uuid;

    public enum BRANCH_API_VERSION {
        V1,
        V1_LATD,
        V2
    }

    public enum PROCESS_WAIT_LOCK {
        SDK_INIT_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        USER_SET_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK,
        USER_AGENT_STRING_LOCK
    }

    public abstract void clearCallbacks();

    public abstract boolean handleErrors(Context context);

    public abstract void handleFailure(int i, String str);

    public boolean isGAdsParamsRequired() {
        return true;
    }

    public abstract boolean isGetRequest();

    public abstract void onRequestSucceeded(ServerResponse serverResponse, Branch branch);

    protected boolean prepareExecuteWithoutTracking() {
        return false;
    }

    protected boolean shouldAddDMAParams() {
        return false;
    }

    public boolean shouldRetryOnFail() {
        return false;
    }

    protected boolean shouldUpdateLimitFacebookTracking() {
        return false;
    }

    public ServerRequest(Context context, Defines.RequestPath requestPath) {
        this(requestPath, new JSONObject(), context);
    }

    protected ServerRequest(Defines.RequestPath requestPath, JSONObject jSONObject, Context context) {
        this.creation_ts = 0L;
        this.queueWaitTime_ = 0L;
        this.constructError_ = false;
        this.currentRetryCount = 0;
        BranchLogger.v("ServerRequest constructor");
        this.context_ = context;
        this.requestPath_ = requestPath;
        this.params_ = jSONObject;
        this.prefHelper_ = PrefHelper.getInstance(context);
        this.locks_ = new HashSet();
        long currentTimeMillis = System.currentTimeMillis();
        this.creation_ts = currentTimeMillis;
        this.uuid = getRequestUuid(formatUnixEpochToDateFormat(currentTimeMillis));
    }

    private String formatUnixEpochToDateFormat(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("-yyyyMMddHH", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    private String getRequestUuid(String str) {
        return UUID.randomUUID().toString() + str;
    }

    void addDMAParams() {
        if (this.prefHelper_.isDMAParamsInitialized()) {
            try {
                if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1) {
                    this.params_.put(Defines.Jsonkey.DMA_EEA.getKey(), this.prefHelper_.getEEARegion());
                    this.params_.put(Defines.Jsonkey.DMA_Ad_Personalization.getKey(), this.prefHelper_.getAdPersonalizationConsent());
                    this.params_.put(Defines.Jsonkey.DMA_Ad_User_Data.getKey(), this.prefHelper_.getAdUserDataUsageConsent());
                } else {
                    JSONObject optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey());
                    if (optJSONObject != null) {
                        optJSONObject.put(Defines.Jsonkey.DMA_EEA.getKey(), this.prefHelper_.getEEARegion());
                        optJSONObject.put(Defines.Jsonkey.DMA_Ad_Personalization.getKey(), this.prefHelper_.getAdPersonalizationConsent());
                        optJSONObject.put(Defines.Jsonkey.DMA_Ad_User_Data.getKey(), this.prefHelper_.getAdUserDataUsageConsent());
                    }
                }
            } catch (JSONException e) {
                BranchLogger.d(e.getMessage());
            }
        }
    }

    private void addConsumerProtectionAttributionLevel() {
        if (this.prefHelper_.isAttributionLevelInitialized()) {
            try {
                if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1) {
                    this.params_.put(Defines.Jsonkey.Consumer_Protection_Attribution_Level.getKey(), this.prefHelper_.getConsumerProtectionAttributionLevel().toString());
                    return;
                }
                JSONObject optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey());
                if (optJSONObject != null) {
                    optJSONObject.put(Defines.Jsonkey.Consumer_Protection_Attribution_Level.getKey(), this.prefHelper_.getConsumerProtectionAttributionLevel().toString());
                }
            } catch (JSONException e) {
                BranchLogger.d(e.getMessage());
            }
        }
    }

    public final String getRequestPath() {
        return this.requestPath_.getPath();
    }

    public String getRequestUrl() {
        return this.prefHelper_.getAPIBaseUrl() + this.requestPath_.getPath();
    }

    protected void setPost(JSONObject jSONObject) throws JSONException {
        BranchLogger.v("setPost " + jSONObject);
        this.params_ = jSONObject;
        if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1) {
            DeviceInfo.getInstance().updateRequestWithV1Params(this, this.params_);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            this.params_.put(Defines.Jsonkey.UserData.getKey(), jSONObject2);
            DeviceInfo.getInstance().updateRequestWithV2Params(this, this.prefHelper_, jSONObject2);
        }
        this.params_.put(Defines.Jsonkey.Debug.getKey(), Branch.isDeviceIDFetchDisabled());
    }

    public JSONObject getPost() {
        return this.params_;
    }

    public JSONObject getPostWithInstrumentationValues(ConcurrentHashMap<String, String> concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                if (this.params_ != null) {
                    JSONObject jSONObject2 = new JSONObject(this.params_.toString());
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
                if (concurrentHashMap.size() <= 0) {
                    return jSONObject;
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    for (String str : concurrentHashMap.keySet()) {
                        jSONObject3.put(str, concurrentHashMap.get(str));
                        concurrentHashMap.remove(str);
                    }
                    jSONObject.put(Defines.Jsonkey.Branch_Instrumentation.getKey(), jSONObject3);
                    return jSONObject;
                } catch (JSONException e) {
                    BranchLogger.w("Caught JSONException " + e.getMessage());
                    return jSONObject;
                }
            } catch (JSONException e2) {
                BranchLogger.d(e2.getMessage());
                return jSONObject;
            }
        } catch (ConcurrentModificationException unused) {
            return this.params_;
        } catch (Exception e3) {
            BranchLogger.v("ServerRequest " + this + " getPostWithInstrumentationValues caught exception: " + e3.getMessage());
            return jSONObject;
        }
    }

    public JSONObject getGetParams() {
        return this.params_;
    }

    protected void addGetParam(String str, String str2) {
        try {
            this.params_.put(str, str2);
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(POST_KEY, this.params_);
            jSONObject.put(POST_PATH_KEY, this.requestPath_.getPath());
            return jSONObject;
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|3|(10:5|7|8|(1:10)|12|13|14|(2:16|17)|19|(2:21|22)(1:24))|29|7|8|(0)|12|13|14|(0)|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        io.branch.referral.BranchLogger.w("Caught JSONException " + r7.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        io.branch.referral.BranchLogger.w("Caught JSONException " + r1.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: JSONException -> 0x0037, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0037, blocks: (B:8:0x002c, B:10:0x0032), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: JSONException -> 0x0059, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0059, blocks: (B:14:0x004d, B:16:0x0053), top: B:13:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ServerRequest fromJSON(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2;
        String str = "";
        try {
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
        if (jSONObject.has(POST_KEY)) {
            jSONObject2 = jSONObject.getJSONObject(POST_KEY);
            if (jSONObject.has(POST_PATH_KEY)) {
                str = jSONObject.getString(POST_PATH_KEY);
            }
            boolean z = true;
            if (jSONObject.has("INITIATED_BY_CLIENT")) {
                z = jSONObject.getBoolean("INITIATED_BY_CLIENT");
            }
            if (TextUtils.isEmpty(str)) {
                return getExtendedServerRequest(str, jSONObject2, context, z);
            }
            return null;
        }
        jSONObject2 = null;
        if (jSONObject.has(POST_PATH_KEY)) {
        }
        boolean z2 = true;
        if (jSONObject.has("INITIATED_BY_CLIENT")) {
        }
        if (TextUtils.isEmpty(str)) {
        }
    }

    private static ServerRequest getExtendedServerRequest(String str, JSONObject jSONObject, Context context, boolean z) {
        if (str.equalsIgnoreCase(Defines.RequestPath.GetURL.getPath())) {
            return new ServerRequestCreateUrl(Defines.RequestPath.GetURL, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.RegisterInstall.getPath())) {
            return new ServerRequestRegisterInstall(Defines.RequestPath.RegisterInstall, jSONObject, context, z);
        }
        if (str.equalsIgnoreCase(Defines.RequestPath.RegisterOpen.getPath())) {
            return new ServerRequestRegisterOpen(Defines.RequestPath.RegisterOpen, jSONObject, context, z);
        }
        return null;
    }

    void updateGAdsParams() {
        BRANCH_API_VERSION branchRemoteAPIVersion = getBranchRemoteAPIVersion();
        int lATVal = DeviceInfo.getInstance().getSystemObserver().getLATVal();
        String aid = DeviceInfo.getInstance().getSystemObserver().getAID();
        if (!TextUtils.isEmpty(aid) && (this.prefHelper_.getConsumerProtectionAttributionLevel() == Defines.BranchAttributionLevel.FULL || !this.prefHelper_.isAttributionLevelInitialized())) {
            updateAdvertisingIdsObject(aid);
            replaceHardwareIdOnValidAdvertisingId();
        }
        try {
            if (branchRemoteAPIVersion == BRANCH_API_VERSION.V1) {
                this.params_.put(Defines.Jsonkey.LATVal.getKey(), lATVal);
                if (!TextUtils.isEmpty(aid)) {
                    if (!SystemObserver.isHuaweiMobileServicesAvailable(this.context_) && (this.prefHelper_.getConsumerProtectionAttributionLevel() == Defines.BranchAttributionLevel.FULL || !this.prefHelper_.isAttributionLevelInitialized())) {
                        this.params_.put(Defines.Jsonkey.GoogleAdvertisingID.getKey(), aid);
                    }
                    this.params_.remove(Defines.Jsonkey.UnidentifiedDevice.getKey());
                    return;
                }
                if (payloadContainsDeviceIdentifiers(this.params_) || this.params_.optBoolean(Defines.Jsonkey.UnidentifiedDevice.getKey())) {
                    return;
                }
                this.params_.put(Defines.Jsonkey.UnidentifiedDevice.getKey(), true);
                return;
            }
            JSONObject optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey());
            if (optJSONObject != null) {
                optJSONObject.put(Defines.Jsonkey.LimitedAdTracking.getKey(), lATVal);
                if (!TextUtils.isEmpty(aid)) {
                    if (!SystemObserver.isHuaweiMobileServicesAvailable(this.context_) && (this.prefHelper_.getConsumerProtectionAttributionLevel() == Defines.BranchAttributionLevel.FULL || !this.prefHelper_.isAttributionLevelInitialized())) {
                        optJSONObject.put(Defines.Jsonkey.AAID.getKey(), aid);
                    }
                    optJSONObject.remove(Defines.Jsonkey.UnidentifiedDevice.getKey());
                    return;
                }
                if (payloadContainsDeviceIdentifiers(optJSONObject) || optJSONObject.optBoolean(Defines.Jsonkey.UnidentifiedDevice.getKey())) {
                    return;
                }
                optJSONObject.put(Defines.Jsonkey.UnidentifiedDevice.getKey(), true);
            }
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
    }

    private void updateAdvertisingIdsObject(String str) {
        String key;
        try {
            if (SystemObserver.isFireOSDevice()) {
                key = Defines.Jsonkey.FireAdId.getKey();
            } else if (SystemObserver.isHuaweiMobileServicesAvailable(Branch.getInstance().getApplicationContext())) {
                key = Defines.Jsonkey.OpenAdvertisingID.getKey();
            } else {
                key = Defines.Jsonkey.AAID.getKey();
            }
            this.params_.put(Defines.Jsonkey.AdvertisingIDs.getKey(), new JSONObject().put(key, str));
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
    }

    private void replaceHardwareIdOnValidAdvertisingId() {
        try {
            SystemObserver.UniqueId hardwareID = DeviceInfo.getInstance().getHardwareID();
            this.params_.put(Defines.Jsonkey.HardwareID.getKey(), hardwareID.getId());
            this.params_.put(Defines.Jsonkey.IsHardwareIDReal.getKey(), hardwareID.isReal());
            if (this.params_.has(Defines.Jsonkey.UserData.getKey())) {
                JSONObject jSONObject = this.params_.getJSONObject(Defines.Jsonkey.UserData.getKey());
                if (jSONObject.has(Defines.Jsonkey.AndroidID.getKey())) {
                    jSONObject.put(Defines.Jsonkey.AndroidID.getKey(), hardwareID.getId());
                }
            }
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
    }

    private boolean payloadContainsDeviceIdentifiers(JSONObject jSONObject) {
        return jSONObject.has(Defines.Jsonkey.AndroidID.getKey()) || jSONObject.has(Defines.Jsonkey.RandomizedDeviceToken.getKey());
    }

    private void updateDeviceInfo() {
        JSONObject optJSONObject;
        if (getBranchRemoteAPIVersion() != BRANCH_API_VERSION.V2 || (optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey())) == null) {
            return;
        }
        try {
            optJSONObject.put(Defines.Jsonkey.DeveloperIdentity.getKey(), this.prefHelper_.getIdentity());
            optJSONObject.put(Defines.Jsonkey.RandomizedDeviceToken.getKey(), this.prefHelper_.getRandomizedDeviceToken());
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
    }

    private void updateRequestMetadata() {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = this.prefHelper_.getRequestMetadata().keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, this.prefHelper_.getRequestMetadata().get(next));
            }
            JSONObject optJSONObject = this.params_.optJSONObject(Defines.Jsonkey.Metadata.getKey());
            if (optJSONObject != null) {
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject.put(next2, optJSONObject.get(next2));
                }
            }
            if ((this instanceof ServerRequestRegisterInstall) && this.prefHelper_.getInstallMetadata().length() > 0) {
                Iterator<String> keys3 = this.prefHelper_.getInstallMetadata().keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    this.params_.putOpt(next3, this.prefHelper_.getInstallMetadata().get(next3));
                }
            }
            this.params_.put(Defines.Jsonkey.Metadata.getKey(), jSONObject);
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException. Could not merge metadata, ignoring user metadata. " + e.getMessage());
        }
    }

    private void updateLimitFacebookTracking() {
        boolean isAppTrackingLimited;
        JSONObject optJSONObject = getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1 ? this.params_ : this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey());
        if (optJSONObject == null || !(isAppTrackingLimited = this.prefHelper_.isAppTrackingLimited())) {
            return;
        }
        try {
            optJSONObject.putOpt(Defines.Jsonkey.limitFacebookTracking.getKey(), Boolean.valueOf(isAppTrackingLimited));
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
    }

    private void updateDisableAdNetworkCallouts() {
        boolean adNetworkCalloutsDisabled;
        JSONObject optJSONObject = getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1 ? this.params_ : this.params_.optJSONObject(Defines.Jsonkey.UserData.getKey());
        if (optJSONObject == null || !(adNetworkCalloutsDisabled = this.prefHelper_.getAdNetworkCalloutsDisabled())) {
            return;
        }
        try {
            optJSONObject.putOpt(Defines.Jsonkey.DisableAdNetworkCallouts.getKey(), Boolean.valueOf(adNetworkCalloutsDisabled));
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
    }

    private boolean prioritizeLinkAttribution(JSONObject jSONObject) {
        return Branch.isReferringLinkAttributionForPreinstalledAppsEnabled() && jSONObject.has(Defines.Jsonkey.LinkIdentifier.getKey());
    }

    private void removePreinstallData(JSONObject jSONObject) {
        jSONObject.remove(Defines.PreinstallKey.partner.getKey());
        jSONObject.remove(Defines.PreinstallKey.campaign.getKey());
        jSONObject.remove(Defines.Jsonkey.GooglePlayInstallReferrer.getKey());
    }

    void doFinalUpdateOnMainThread() {
        BranchLogger.v("doFinalUpdateOnMainThread");
        updateRequestMetadata();
        if (shouldUpdateLimitFacebookTracking()) {
            updateLimitFacebookTracking();
        }
        if (shouldAddDMAParams()) {
            addDMAParams();
        }
        addConsumerProtectionAttributionLevel();
        addClientRequestParameters();
    }

    private void addClientRequestParameters() {
        if (this.prefHelper_ != null) {
            try {
                this.params_.put(Defines.Jsonkey.Branch_Sdk_Request_Creation_Time_Stamp.getKey(), this.creation_ts);
                this.params_.put(Defines.Jsonkey.Branch_Sdk_Request_Uuid.getKey(), this.uuid);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void doFinalUpdateOnBackgroundThread() {
        BranchLogger.v("doFinalUpdateOnBackgroundThread");
        if (this instanceof ServerRequestInitSession) {
            ((ServerRequestInitSession) this).updateLinkReferrerParams();
            if (prioritizeLinkAttribution(this.params_)) {
                removePreinstallData(this.params_);
            }
        }
        updateDeviceInfo();
        updateDisableAdNetworkCallouts();
        if (isGAdsParamsRequired()) {
            updateGAdsParams();
        }
    }

    protected boolean doesAppHasInternetPermission(Context context) {
        int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.INTERNET");
        if (checkCallingOrSelfPermission != 0) {
            BranchLogger.v("Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        }
        return checkCallingOrSelfPermission == 0;
    }

    public void onRequestQueued() {
        this.queueWaitTime_ = System.currentTimeMillis();
    }

    public long getQueueWaitTime() {
        if (this.queueWaitTime_ > 0) {
            return System.currentTimeMillis() - this.queueWaitTime_;
        }
        return 0L;
    }

    public void addProcessWaitLock(PROCESS_WAIT_LOCK process_wait_lock) {
        if (process_wait_lock != null) {
            this.locks_.add(process_wait_lock);
        }
    }

    public void removeProcessWaitLock(PROCESS_WAIT_LOCK process_wait_lock) {
        this.locks_.remove(process_wait_lock);
    }

    public String printWaitLocks() {
        return Arrays.toString(this.locks_.toArray());
    }

    public boolean isWaitingOnProcessToFinish() {
        return this.locks_.size() > 0;
    }

    public void onPreExecute() {
        BranchLogger.v("onPreExecute " + this);
        if ((this instanceof ServerRequestRegisterOpen) || (this instanceof ServerRequestLogEvent)) {
            try {
                ReferringUrlUtility referringUrlUtility = new ReferringUrlUtility(this.prefHelper_);
                referringUrlUtility.parseReferringURL(this.prefHelper_.getExternalIntentUri());
                if (this.prefHelper_.getConsumerProtectionAttributionLevel() == Defines.BranchAttributionLevel.FULL || !this.prefHelper_.isAttributionLevelInitialized()) {
                    JSONObject uRLQueryParamsForRequest = referringUrlUtility.getURLQueryParamsForRequest(this);
                    Iterator<String> keys = uRLQueryParamsForRequest.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.params_.put(next, uRLQueryParamsForRequest.get(next));
                    }
                }
            } catch (Exception e) {
                BranchLogger.e("Caught exception in onPreExecute: " + e.getMessage() + " stacktrace " + BranchLogger.stackTraceToString(e));
            }
        }
    }

    protected void updateEnvironment(Context context, JSONObject jSONObject) {
        try {
            String key = (DeviceInfo.getInstance().isPackageInstalled() ? Defines.Jsonkey.NativeApp : Defines.Jsonkey.InstantApp).getKey();
            if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V2) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Defines.Jsonkey.UserData.getKey());
                if (optJSONObject != null) {
                    optJSONObject.put(Defines.Jsonkey.Environment.getKey(), key);
                    return;
                }
                return;
            }
            jSONObject.put(Defines.Jsonkey.Environment.getKey(), key);
        } catch (Exception e) {
            BranchLogger.d(e.getMessage());
        }
    }

    public BRANCH_API_VERSION getBranchRemoteAPIVersion() {
        return BRANCH_API_VERSION.V1;
    }

    boolean isInitializationOrEventRequest() {
        for (Defines.RequestPath requestPath : initializationAndEventRoutes) {
            if (requestPath.equals(this.requestPath_)) {
                return true;
            }
        }
        return false;
    }
}
