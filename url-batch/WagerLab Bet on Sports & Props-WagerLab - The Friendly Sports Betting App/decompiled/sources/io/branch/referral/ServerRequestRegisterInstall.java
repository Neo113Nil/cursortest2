package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class ServerRequestRegisterInstall extends ServerRequestInitSession {
    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean shouldRetryOnFail() {
        return false;
    }

    ServerRequestRegisterInstall(Context context, Branch.BranchReferralInitListener branchReferralInitListener, boolean z) {
        super(context, Defines.RequestPath.RegisterInstall, z);
        this.callback_ = branchReferralInitListener;
        try {
            setPost(new JSONObject());
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
            this.constructError_ = true;
        }
    }

    ServerRequestRegisterInstall(Defines.RequestPath requestPath, JSONObject jSONObject, Context context, boolean z) {
        super(requestPath, jSONObject, context, z);
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onPreExecute() {
        super.onPreExecute();
        long j = this.prefHelper_.getLong("bnc_referrer_click_ts");
        long j2 = this.prefHelper_.getLong("bnc_install_begin_ts");
        long j3 = this.prefHelper_.getLong("bnc_referrer_click_server_ts");
        long j4 = this.prefHelper_.getLong("bnc_install_begin_server_ts");
        if (j > 0) {
            try {
                getPost().put(Defines.Jsonkey.ClickedReferrerTimeStamp.getKey(), j);
            } catch (JSONException e) {
                BranchLogger.w("Caught JSONException " + e.getMessage());
                return;
            }
        }
        if (j2 > 0) {
            getPost().put(Defines.Jsonkey.InstallBeginTimeStamp.getKey(), j2);
        }
        if (!AppStoreReferrer.getInstallationID().equals(PrefHelper.NO_STRING_VALUE)) {
            getPost().put(Defines.Jsonkey.LinkClickID.getKey(), AppStoreReferrer.getInstallationID());
        }
        if (j3 > 0) {
            getPost().put(Defines.Jsonkey.ClickedReferrerServerTimeStamp.getKey(), j3);
        }
        if (j4 > 0) {
            getPost().put(Defines.Jsonkey.InstallBeginServerTimeStamp.getKey(), j4);
        }
        if (Branch.getInstance() != null) {
            getPost().put(Defines.Jsonkey.OperationalMetrics.getKey(), Branch.getInstance().getConfigurationController().serializeConfiguration());
        }
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        super.onRequestSucceeded(serverResponse, branch);
        try {
            this.prefHelper_.setUserURL(serverResponse.getObject().getString(Defines.Jsonkey.Link.getKey()));
            if (serverResponse.getObject().has(Defines.Jsonkey.Data.getKey())) {
                JSONObject jSONObject = new JSONObject(serverResponse.getObject().getString(Defines.Jsonkey.Data.getKey()));
                if (jSONObject.has(Defines.Jsonkey.Clicked_Branch_Link.getKey()) && jSONObject.getBoolean(Defines.Jsonkey.Clicked_Branch_Link.getKey()) && this.prefHelper_.getInstallParams().equals(PrefHelper.NO_STRING_VALUE)) {
                    this.prefHelper_.setInstallParams(serverResponse.getObject().getString(Defines.Jsonkey.Data.getKey()));
                }
            }
            if (serverResponse.getObject().has(Defines.Jsonkey.LinkClickID.getKey())) {
                this.prefHelper_.setLinkClickID(serverResponse.getObject().getString(Defines.Jsonkey.LinkClickID.getKey()));
            } else {
                this.prefHelper_.setLinkClickID(PrefHelper.NO_STRING_VALUE);
            }
            if (serverResponse.getObject().has(Defines.Jsonkey.Invoke_Features.getKey()) && serverResponse.getObject().getJSONObject(Defines.Jsonkey.Invoke_Features.getKey()).has("enhanced_web_link_ux")) {
                JSONObject jSONObject2 = serverResponse.getObject().getJSONObject(Defines.Jsonkey.Invoke_Features.getKey());
                BranchLogger.v("Opening browser from install request.");
                branch.openBrowserExperience(jSONObject2);
            } else {
                if (serverResponse.getObject().has(Defines.Jsonkey.Data.getKey())) {
                    this.prefHelper_.setSessionParams(serverResponse.getObject().getString(Defines.Jsonkey.Data.getKey()));
                } else {
                    this.prefHelper_.setSessionParams(PrefHelper.NO_STRING_VALUE);
                }
                if (this.callback_ != null) {
                    this.callback_.onInitFinished(branch.getLatestReferringParams(), null);
                }
            }
            this.prefHelper_.setAppVersion(DeviceInfo.getInstance().getAppVersion());
        } catch (Exception e) {
            BranchLogger.w("Caught Exception ServerRequestRegisterInstall onRequestSucceeded: " + e.getMessage());
        }
        onInitSessionCompleted(serverResponse, branch);
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
        if (this.callback_ != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                BranchLogger.w("Caught JSONException " + e.getMessage());
            }
            this.callback_.onInitFinished(jSONObject, new BranchError("Trouble initializing Branch. " + this + " failed. " + str, i));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        if (super.doesAppHasInternetPermission(context)) {
            return false;
        }
        if (this.callback_ == null) {
            return true;
        }
        this.callback_.onInitFinished(null, new BranchError("Trouble initializing Branch.", -102));
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
        BranchLogger.v(this + " clearCallbacks");
        this.callback_ = null;
    }

    @Override // io.branch.referral.ServerRequestInitSession
    public String getRequestActionName() {
        return "install";
    }
}
