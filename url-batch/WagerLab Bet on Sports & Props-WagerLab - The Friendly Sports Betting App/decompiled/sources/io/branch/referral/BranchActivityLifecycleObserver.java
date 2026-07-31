package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.branch.referral.Branch;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
class BranchActivityLifecycleObserver implements Application.ActivityLifecycleCallbacks {
    private int activityCnt_ = 0;
    private Set<String> activitiesOnStack_ = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    BranchActivityLifecycleObserver() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Branch branch = Branch.getInstance();
        BranchLogger.v("onActivityCreated, activity = " + activity + " branch: " + branch + " Activities on stack: " + this.activitiesOnStack_);
        if (branch == null) {
            return;
        }
        branch.setIntentState(Branch.INTENT_STATE.PENDING);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Branch branch = Branch.getInstance();
        BranchLogger.v("onActivityStarted, activity = " + activity + " branch: " + branch + " Activities on stack: " + this.activitiesOnStack_);
        if (branch == null) {
            return;
        }
        branch.currentActivityReference_ = new WeakReference<>(activity);
        branch.setIntentState(Branch.INTENT_STATE.PENDING);
        this.activityCnt_++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Branch branch = Branch.getInstance();
        BranchLogger.v("onActivityResumed, activity = " + activity + " branch: " + branch);
        if (branch == null) {
            return;
        }
        boolean bypassCurrentActivityIntentState = Branch.bypassCurrentActivityIntentState();
        BranchLogger.v("bypassIntentState: " + bypassCurrentActivityIntentState);
        if (!bypassCurrentActivityIntentState) {
            branch.onIntentReady(activity);
        }
        if (branch.getInitState() == Branch.SESSION_STATE.UNINITIALISED && !Branch.disableAutoSessionInitialization) {
            if (Branch.getPluginName() == null) {
                BranchLogger.v("initializing session on user's behalf (onActivityResumed called but SESSION_STATE = UNINITIALISED)");
                Branch.sessionBuilder(activity).isAutoInitialization(true).init();
            } else {
                BranchLogger.v("onActivityResumed called and SESSION_STATE = UNINITIALISED, however this is a " + Branch.getPluginName() + " plugin, so we are NOT initializing session on user's behalf");
            }
        }
        this.activitiesOnStack_.add(activity.toString());
        BranchLogger.v("activityCnt_: " + this.activityCnt_);
        BranchLogger.v("activitiesOnStack_: " + this.activitiesOnStack_);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Branch branch = Branch.getInstance();
        BranchLogger.v("onActivityPaused, activity = " + activity + " branch: " + branch);
        if (branch == null) {
            return;
        }
        if (branch.getShareLinkManager() != null) {
            branch.getShareLinkManager().cancelShareLinkDialog(true);
        }
        BranchLogger.v("activityCnt_: " + this.activityCnt_);
        BranchLogger.v("activitiesOnStack_: " + this.activitiesOnStack_);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Branch branch = Branch.getInstance();
        BranchLogger.v("onActivityStopped, activity = " + activity + " branch: " + branch);
        if (branch == null) {
            return;
        }
        this.activityCnt_--;
        BranchLogger.v("activityCnt_: " + this.activityCnt_);
        if (this.activityCnt_ < 1) {
            branch.setInstantDeepLinkPossible(false);
            branch.closeSessionInternal();
            this.activityCnt_ = 0;
            BranchLogger.v("activityCnt_: reset to 0");
        }
        BranchLogger.v("activitiesOnStack_: " + this.activitiesOnStack_);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Branch branch = Branch.getInstance();
        BranchLogger.v("onActivityDestroyed, activity = " + activity + " branch: " + branch);
        if (branch == null) {
            return;
        }
        if (branch.getCurrentActivity() == activity) {
            branch.currentActivityReference_.clear();
        }
        this.activitiesOnStack_.remove(activity.toString());
        BranchLogger.v("activitiesOnStack_: " + this.activitiesOnStack_);
    }

    boolean isCurrentActivityLaunchedFromStack() {
        Branch branch = Branch.getInstance();
        if (branch == null || branch.getCurrentActivity() == null) {
            return false;
        }
        BranchLogger.v("activitiesOnStack_: " + this.activitiesOnStack_ + " Current Activity: " + branch.getCurrentActivity());
        return this.activitiesOnStack_.contains(branch.getCurrentActivity().toString());
    }
}
