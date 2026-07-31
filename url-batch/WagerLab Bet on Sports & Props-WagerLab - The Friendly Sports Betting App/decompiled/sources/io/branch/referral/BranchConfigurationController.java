package io.branch.referral;

import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BranchConfigurationController.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lio/branch/referral/BranchConfigurationController;", "", "()V", "getBranchKeySource", "", "getDelayedSessionInitUsed", "", "isBranchKeyFallbackUsed", "isDeferInitForPluginRuntime", "isInstantDeepLinkingEnabled", "isTestModeEnabled", "serializeConfiguration", "Lorg/json/JSONObject;", "setDeferInitForPluginRuntime", "", "deferred", "setDelayedSessionInitUsed", MetricTracker.Action.USED, "setInstantDeepLinkingEnabled", ViewProps.ENABLED, "setTestModeEnabled", "Companion", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BranchConfigurationController {
    public static final String KEY_DEFER_INIT_FOR_PLUGIN_RUNTIME = "bnc_defer_init_for_plugin_runtime";
    public static final String KEY_INSTANT_DEEP_LINKING_ENABLED = "bnc_instant_deep_linking_enabled";

    public final void setDelayedSessionInitUsed(boolean used) {
        Branch branch = Branch.getInstance();
        if (branch != null) {
            branch.prefHelper_.setDelayedSessionInitUsed(used);
        }
    }

    private final boolean getDelayedSessionInitUsed() {
        PrefHelper prefHelper;
        Branch branch = Branch.getInstance();
        if (branch == null || (prefHelper = branch.prefHelper_) == null) {
            return false;
        }
        return prefHelper.getDelayedSessionInitUsed();
    }

    public final boolean isTestModeEnabled() {
        return BranchUtil.isTestModeEnabled();
    }

    public final void setTestModeEnabled(boolean enabled) {
        BranchUtil.setTestMode(enabled);
    }

    public final void setInstantDeepLinkingEnabled(boolean enabled) {
        PrefHelper prefHelper;
        Branch branch = Branch.getInstance();
        if (branch == null || (prefHelper = branch.prefHelper_) == null) {
            return;
        }
        prefHelper.setBool(KEY_INSTANT_DEEP_LINKING_ENABLED, Boolean.valueOf(enabled));
    }

    public final boolean isInstantDeepLinkingEnabled() {
        PrefHelper prefHelper;
        Branch branch = Branch.getInstance();
        if (branch == null || (prefHelper = branch.prefHelper_) == null) {
            return false;
        }
        return prefHelper.getBool(KEY_INSTANT_DEEP_LINKING_ENABLED);
    }

    public final void setDeferInitForPluginRuntime(boolean deferred) {
        PrefHelper prefHelper;
        Branch branch = Branch.getInstance();
        if (branch == null || (prefHelper = branch.prefHelper_) == null) {
            return;
        }
        prefHelper.setBool(KEY_DEFER_INIT_FOR_PLUGIN_RUNTIME, Boolean.valueOf(deferred));
    }

    private final boolean isDeferInitForPluginRuntime() {
        PrefHelper prefHelper;
        Branch branch = Branch.getInstance();
        if (branch == null || (prefHelper = branch.prefHelper_) == null) {
            return false;
        }
        return prefHelper.getBool(KEY_DEFER_INIT_FOR_PLUGIN_RUNTIME);
    }

    public final String getBranchKeySource() {
        PrefHelper prefHelper;
        Branch branch = Branch.getInstance();
        String branchKeySource = (branch == null || (prefHelper = branch.prefHelper_) == null) ? null : prefHelper.getBranchKeySource();
        return branchKeySource == null ? "unknown" : branchKeySource;
    }

    public final boolean isBranchKeyFallbackUsed() {
        return Intrinsics.areEqual(getBranchKeySource(), "branchKey");
    }

    public final JSONObject serializeConfiguration() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expectDelayedSessionInitialization", getDelayedSessionInitUsed());
            jSONObject.put("testMode", isTestModeEnabled());
            jSONObject.put("instantDeepLinkingEnabled", isInstantDeepLinkingEnabled());
            jSONObject.put("deferInitForPluginRuntime", isDeferInitForPluginRuntime());
            jSONObject.put("branch_key_source", getBranchKeySource());
            jSONObject.put("branch_key_fallback_used", isBranchKeyFallbackUsed());
            return jSONObject;
        } catch (NullPointerException e) {
            BranchLogger.w("Error serializing configuration - null reference: " + e.getMessage());
            return new JSONObject();
        } catch (JSONException e2) {
            BranchLogger.w("Error serializing configuration - JSON error: " + e2.getMessage());
            return new JSONObject();
        } catch (Exception e3) {
            BranchLogger.w("Error serializing configuration - unexpected error: " + e3.getMessage());
            return new JSONObject();
        }
    }
}
