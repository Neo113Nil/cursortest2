package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.validators.DeepLinkRoutingValidator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
abstract class ServerRequestInitSession extends ServerRequest {
    static final String ACTION_INSTALL = "install";
    static final String ACTION_OPEN = "open";
    static final String INITIATED_BY_CLIENT = "INITIATED_BY_CLIENT";
    private static final int STATE_FRESH_INSTALL = 0;
    private static final int STATE_NO_CHANGE = 1;
    private static final int STATE_UPDATE = 2;
    Branch.BranchReferralInitListener callback_;
    private final Context context_;
    boolean initiatedByClient;

    public abstract String getRequestActionName();

    @Override // io.branch.referral.ServerRequest
    protected boolean shouldAddDMAParams() {
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    protected boolean shouldUpdateLimitFacebookTracking() {
        return true;
    }

    ServerRequestInitSession(Context context, Defines.RequestPath requestPath, boolean z) {
        super(context, requestPath);
        this.context_ = context;
        this.initiatedByClient = !z;
    }

    ServerRequestInitSession(Defines.RequestPath requestPath, JSONObject jSONObject, Context context, boolean z) {
        super(requestPath, jSONObject, context);
        this.context_ = context;
        this.initiatedByClient = !z;
    }

    @Override // io.branch.referral.ServerRequest
    protected void setPost(JSONObject jSONObject) throws JSONException {
        super.setPost(jSONObject);
        this.prefHelper_.loadPartnerParams(jSONObject);
        String appVersion = DeviceInfo.getInstance().getAppVersion();
        if (!DeviceInfo.isNullOrEmptyOrBlank(appVersion)) {
            jSONObject.put(Defines.Jsonkey.AppVersion.getKey(), appVersion);
        }
        updateInstallStateAndTimestamps(jSONObject);
        updateEnvironment(this.context_, jSONObject);
        String str = Branch.installDeveloperId;
        if (TextUtils.isEmpty(str) || str.equals(PrefHelper.NO_STRING_VALUE)) {
            return;
        }
        jSONObject.put(Defines.Jsonkey.Identity.getKey(), str);
    }

    static boolean isInitSessionAction(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase(ACTION_INSTALL);
        }
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        Branch.getInstance().unlockSDKInitWaitLock();
    }

    void onInitSessionCompleted(ServerResponse serverResponse, Branch branch) {
        DeepLinkRoutingValidator.validate(branch.currentActivityReference_);
        branch.updateSkipURLFormats();
        BranchLogger.v("onInitSessionCompleted on thread " + Thread.currentThread().getName());
    }

    void updateLinkReferrerParams() {
        String linkClickIdentifier = this.prefHelper_.getLinkClickIdentifier();
        if (!linkClickIdentifier.equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                getPost().put(Defines.Jsonkey.LinkIdentifier.getKey(), linkClickIdentifier);
            } catch (JSONException e) {
                BranchLogger.w("Caught JSONException " + e.getMessage());
            }
        }
        String googleSearchInstallIdentifier = this.prefHelper_.getGoogleSearchInstallIdentifier();
        if (!googleSearchInstallIdentifier.equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                getPost().put(Defines.Jsonkey.GoogleSearchInstallReferrer.getKey(), googleSearchInstallIdentifier);
            } catch (JSONException e2) {
                BranchLogger.w("Caught JSONException " + e2.getMessage());
            }
        }
        String appStoreReferrer = this.prefHelper_.getAppStoreReferrer();
        if (!appStoreReferrer.equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                getPost().put(Defines.Jsonkey.GooglePlayInstallReferrer.getKey(), appStoreReferrer);
            } catch (JSONException e3) {
                BranchLogger.w("Caught JSONException " + e3.getMessage());
            }
        }
        String appStoreSource = this.prefHelper_.getAppStoreSource();
        if (!PrefHelper.NO_STRING_VALUE.equals(appStoreSource)) {
            try {
                if (appStoreSource.equals(Defines.Jsonkey.Meta_Install_Referrer.getKey())) {
                    getPost().put(Defines.Jsonkey.App_Store.getKey(), Defines.Jsonkey.Google_Play_Store.getKey());
                    getPost().put(Defines.Jsonkey.Is_Meta_Click_Through.getKey(), this.prefHelper_.getIsMetaClickThrough());
                } else {
                    getPost().put(Defines.Jsonkey.App_Store.getKey(), appStoreSource);
                }
            } catch (JSONException e4) {
                BranchLogger.w("Caught JSONException " + e4.getMessage());
            }
        }
        if (this.prefHelper_.isFullAppConversion()) {
            try {
                getPost().put(Defines.Jsonkey.AndroidAppLinkURL.getKey(), this.prefHelper_.getAppLink());
                getPost().put(Defines.Jsonkey.IsFullAppConv.getKey(), true);
            } catch (JSONException e5) {
                BranchLogger.w("Caught JSONException " + e5.getMessage());
            }
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void onPreExecute() {
        super.onPreExecute();
        JSONObject post = getPost();
        try {
            String appLink = this.prefHelper_.getAppLink();
            if (!appLink.equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.AndroidAppLinkURL.getKey(), appLink);
            }
            String pushIdentifier = this.prefHelper_.getPushIdentifier();
            if (!pushIdentifier.equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.AndroidPushIdentifier.getKey(), pushIdentifier);
            }
            String externalIntentUri = this.prefHelper_.getExternalIntentUri();
            if (!externalIntentUri.equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.External_Intent_URI.getKey(), externalIntentUri);
            }
            String externalIntentExtra = this.prefHelper_.getExternalIntentExtra();
            if (!externalIntentExtra.equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.External_Intent_Extra.getKey(), externalIntentExtra);
            }
            String initialReferrer = this.prefHelper_.getInitialReferrer();
            if (!TextUtils.isEmpty(initialReferrer) && !initialReferrer.equals(PrefHelper.NO_STRING_VALUE)) {
                post.put(Defines.Jsonkey.InitialReferrer.getKey(), initialReferrer);
            }
            String webLinkUxTypeUsed = this.prefHelper_.getWebLinkUxTypeUsed();
            long webLinkLoadTime = this.prefHelper_.getWebLinkLoadTime();
            if (!TextUtils.isEmpty(webLinkUxTypeUsed) && !PrefHelper.NO_STRING_VALUE.equals(webLinkUxTypeUsed)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Defines.Jsonkey.UX_Type.getKey(), webLinkUxTypeUsed);
                jSONObject.put(Defines.Jsonkey.URL_Load_MS.getKey(), webLinkLoadTime);
                post.put(Defines.Jsonkey.Web_Link_Context.getKey(), jSONObject);
                this.prefHelper_.setWebLinkUxTypeUsed(null);
                this.prefHelper_.setWebLinkLoadTime(0L);
            }
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
        Branch.expectDelayedSessionInitialization(false);
    }

    private void updateInstallStateAndTimestamps(JSONObject jSONObject) throws JSONException {
        String appVersion = DeviceInfo.getInstance().getAppVersion();
        long firstInstallTime = DeviceInfo.getInstance().getFirstInstallTime();
        long lastUpdateTime = DeviceInfo.getInstance().getLastUpdateTime();
        int i = 2;
        if (PrefHelper.NO_STRING_VALUE.equals(this.prefHelper_.getAppVersion())) {
            if (lastUpdateTime - firstInstallTime < CalendarModelKt.MillisecondsIn24Hours) {
                i = 0;
            }
        } else if (this.prefHelper_.getAppVersion().equals(appVersion)) {
            i = 1;
        }
        jSONObject.put(Defines.Jsonkey.Update.getKey(), i);
        jSONObject.put(Defines.Jsonkey.FirstInstallTime.getKey(), firstInstallTime);
        jSONObject.put(Defines.Jsonkey.LastUpdateTime.getKey(), lastUpdateTime);
        long j = this.prefHelper_.getLong("bnc_original_install_time");
        if (j == 0) {
            this.prefHelper_.setLong("bnc_original_install_time", firstInstallTime);
        } else {
            firstInstallTime = j;
        }
        jSONObject.put(Defines.Jsonkey.OriginalInstallTime.getKey(), firstInstallTime);
        long j2 = this.prefHelper_.getLong("bnc_last_known_update_time");
        if (j2 < lastUpdateTime) {
            this.prefHelper_.setLong("bnc_previous_update_time", j2);
            this.prefHelper_.setLong("bnc_last_known_update_time", lastUpdateTime);
        }
        jSONObject.put(Defines.Jsonkey.PreviousUpdateTime.getKey(), this.prefHelper_.getLong("bnc_previous_update_time"));
    }

    @Override // io.branch.referral.ServerRequest
    protected boolean prepareExecuteWithoutTracking() {
        JSONObject post = getPost();
        if (post.has(Defines.Jsonkey.AndroidAppLinkURL.getKey()) || post.has(Defines.Jsonkey.AndroidPushIdentifier.getKey()) || post.has(Defines.Jsonkey.LinkIdentifier.getKey())) {
            post.remove(Defines.Jsonkey.RandomizedDeviceToken.getKey());
            post.remove(Defines.Jsonkey.RandomizedBundleToken.getKey());
            post.remove(Defines.Jsonkey.External_Intent_Extra.getKey());
            post.remove(Defines.Jsonkey.External_Intent_URI.getKey());
            post.remove(Defines.Jsonkey.FirstInstallTime.getKey());
            post.remove(Defines.Jsonkey.LastUpdateTime.getKey());
            post.remove(Defines.Jsonkey.OriginalInstallTime.getKey());
            post.remove(Defines.Jsonkey.PreviousUpdateTime.getKey());
            post.remove(Defines.Jsonkey.InstallBeginTimeStamp.getKey());
            post.remove(Defines.Jsonkey.ClickedReferrerTimeStamp.getKey());
            post.remove(Defines.Jsonkey.HardwareID.getKey());
            post.remove(Defines.Jsonkey.IsHardwareIDReal.getKey());
            post.remove(Defines.Jsonkey.LocalIP.getKey());
            post.remove(Defines.Jsonkey.ReferrerGclid.getKey());
            post.remove(Defines.Jsonkey.Identity.getKey());
            post.remove(Defines.Jsonkey.AnonID.getKey());
            try {
                post.put(Defines.Jsonkey.TrackingDisabled.getKey(), true);
            } catch (JSONException e) {
                BranchLogger.w("Caught JSONException " + e.getMessage());
            }
            return true;
        }
        return super.prepareExecuteWithoutTracking();
    }

    @Override // io.branch.referral.ServerRequest
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        try {
            json.put(INITIATED_BY_CLIENT, this.initiatedByClient);
            return json;
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
            return json;
        }
    }
}
