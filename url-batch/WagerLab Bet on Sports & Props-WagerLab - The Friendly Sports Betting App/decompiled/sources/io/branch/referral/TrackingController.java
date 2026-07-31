package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TrackingController {
    private boolean trackingDisabled = true;

    TrackingController(Context context) {
        updateTrackingState(context);
    }

    void disableTracking(Context context, boolean z, final Branch.TrackingStateCallback trackingStateCallback) {
        BranchLogger.v("disableTracking context: " + context + " disableTracking: " + z + " callback: " + trackingStateCallback);
        if (this.trackingDisabled == z) {
            if (trackingStateCallback != null) {
                BranchLogger.v("Tracking state is already set to " + z + ". Returning the same to the callback");
                trackingStateCallback.onTrackingStateChanged(this.trackingDisabled, Branch.getInstance().getFirstReferringParams(), null);
                return;
            }
            return;
        }
        this.trackingDisabled = z;
        PrefHelper.getInstance(context).setBool("bnc_tracking_state", Boolean.valueOf(z));
        if (z) {
            BranchLogger.v("Tracking disabled. Clearing all pending requests");
            onTrackingDisabled(context);
            if (trackingStateCallback != null) {
                trackingStateCallback.onTrackingStateChanged(true, null, null);
                return;
            }
            return;
        }
        BranchLogger.v("Tracking enabled. Registering app init");
        onTrackingEnabled(new Branch.BranchReferralInitListener() { // from class: io.branch.referral.TrackingController$$ExternalSyntheticLambda0
            @Override // io.branch.referral.Branch.BranchReferralInitListener
            public final void onInitFinished(JSONObject jSONObject, BranchError branchError) {
                TrackingController.lambda$disableTracking$0(Branch.TrackingStateCallback.this, jSONObject, branchError);
            }
        });
    }

    static /* synthetic */ void lambda$disableTracking$0(Branch.TrackingStateCallback trackingStateCallback, JSONObject jSONObject, BranchError branchError) {
        if (trackingStateCallback != null) {
            trackingStateCallback.onTrackingStateChanged(false, jSONObject, branchError);
        }
    }

    boolean isTrackingDisabled() {
        return this.trackingDisabled;
    }

    public static boolean isTrackingDisabled(Context context) {
        return PrefHelper.getInstance(context).getBool("bnc_tracking_state");
    }

    void updateTrackingState(Context context) {
        this.trackingDisabled = PrefHelper.getInstance(context).getBool("bnc_tracking_state");
    }

    private void onTrackingDisabled(Context context) {
        Branch.getInstance().clearPendingRequests();
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        prefHelper.setSessionID(PrefHelper.NO_STRING_VALUE);
        prefHelper.setLinkClickID(PrefHelper.NO_STRING_VALUE);
        prefHelper.setLinkClickIdentifier(PrefHelper.NO_STRING_VALUE);
        prefHelper.setAppLink(PrefHelper.NO_STRING_VALUE);
        prefHelper.setInstallReferrerParams(PrefHelper.NO_STRING_VALUE);
        prefHelper.setAppStoreReferrer(PrefHelper.NO_STRING_VALUE);
        prefHelper.setAppStoreSource(PrefHelper.NO_STRING_VALUE);
        prefHelper.setGoogleSearchInstallIdentifier(PrefHelper.NO_STRING_VALUE);
        prefHelper.setInitialReferrer(PrefHelper.NO_STRING_VALUE);
        prefHelper.setExternalIntentUri(PrefHelper.NO_STRING_VALUE);
        prefHelper.setExternalIntentExtra(PrefHelper.NO_STRING_VALUE);
        prefHelper.setSessionParams(PrefHelper.NO_STRING_VALUE);
        prefHelper.setAnonID(PrefHelper.NO_STRING_VALUE);
        prefHelper.setReferringUrlQueryParameters(new JSONObject());
        Branch.getInstance().clearPartnerParameters();
    }

    private void onTrackingEnabled(Branch.BranchReferralInitListener branchReferralInitListener) {
        BranchLogger.v("onTrackingEnabled callback: " + branchReferralInitListener);
        Branch branch = Branch.getInstance();
        if (branch != null) {
            branch.registerAppInit(branch.getInstallOrOpenRequest(branchReferralInitListener, true), false);
        }
    }
}
