package io.branch.referral;

import android.content.Context;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class ServerRequestRegisterOpen extends ServerRequestInitSession {
    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean shouldRetryOnFail() {
        return false;
    }

    ServerRequestRegisterOpen(Context context, Branch.BranchReferralInitListener branchReferralInitListener, boolean z) {
        super(context, Defines.RequestPath.RegisterOpen, z);
        this.callback_ = branchReferralInitListener;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Defines.Jsonkey.RandomizedDeviceToken.getKey(), this.prefHelper_.getRandomizedDeviceToken());
            jSONObject.put(Defines.Jsonkey.RandomizedBundleToken.getKey(), this.prefHelper_.getRandomizedBundleToken());
            setPost(jSONObject);
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
            this.constructError_ = true;
        }
    }

    ServerRequestRegisterOpen(Defines.RequestPath requestPath, JSONObject jSONObject, Context context, boolean z) {
        super(requestPath, jSONObject, context, z);
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onPreExecute() {
        super.onPreExecute();
        if (Branch.getInstance().isInstantDeepLinkPossible()) {
            if (this.callback_ != null) {
                this.callback_.onInitFinished(Branch.getInstance().getLatestReferringParams(), null);
            }
            Branch.getInstance().requestQueue_.addExtraInstrumentationData(Defines.Jsonkey.InstantDeepLinkSession.getKey(), "true");
            Branch.getInstance().setInstantDeepLinkPossible(false);
        }
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        super.onRequestSucceeded(serverResponse, branch);
        BranchLogger.v("onRequestSucceeded " + this + " " + serverResponse + " on callback " + this.callback_);
        try {
            if (serverResponse.getObject().has(Defines.Jsonkey.LinkClickID.getKey())) {
                this.prefHelper_.setLinkClickID(serverResponse.getObject().getString(Defines.Jsonkey.LinkClickID.getKey()));
            } else {
                this.prefHelper_.setLinkClickID(PrefHelper.NO_STRING_VALUE);
            }
            if (serverResponse.getObject().has(Defines.Jsonkey.Invoke_Features.getKey()) && serverResponse.getObject().getJSONObject(Defines.Jsonkey.Invoke_Features.getKey()).has("enhanced_web_link_ux")) {
                JSONObject jSONObject = serverResponse.getObject().getJSONObject(Defines.Jsonkey.Invoke_Features.getKey());
                BranchLogger.v("Opening browser from open request.");
                branch.openBrowserExperience(jSONObject);
            } else {
                if (serverResponse.getObject().has(Defines.Jsonkey.Data.getKey())) {
                    this.prefHelper_.setSessionParams(serverResponse.getObject().getString(Defines.Jsonkey.Data.getKey()));
                } else {
                    this.prefHelper_.setSessionParams(PrefHelper.NO_STRING_VALUE);
                }
                if (this.callback_ != null && !Branch.getInstance().isIDLSession()) {
                    this.callback_.onInitFinished(branch.getLatestReferringParams(), null);
                }
            }
            this.prefHelper_.setAppVersion(DeviceInfo.getInstance().getAppVersion());
        } catch (Exception e) {
            BranchLogger.w("Caught Exception ServerRequestRegisterOpen onRequestSucceeded: " + e.getMessage());
        }
        onInitSessionCompleted(serverResponse, branch);
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
        if (this.callback_ == null || Branch.getInstance().isIDLSession()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
        } catch (JSONException e) {
            BranchLogger.w("Caught JSONException " + e.getMessage());
        }
        this.callback_.onInitFinished(jSONObject, new BranchError("Trouble initializing Branch. " + this + " failed. " + str, i));
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        if (super.doesAppHasInternetPermission(context)) {
            return false;
        }
        if (this.callback_ == null || Branch.getInstance().isIDLSession()) {
            return true;
        }
        this.callback_.onInitFinished(null, new BranchError("Trouble initializing Branch.", -102));
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
        BranchLogger.v(this + " clearCallbacks " + this.callback_);
        this.callback_ = null;
    }

    @Override // io.branch.referral.ServerRequestInitSession
    public String getRequestActionName() {
        return TtmlNode.TEXT_EMPHASIS_MARK_OPEN;
    }
}
