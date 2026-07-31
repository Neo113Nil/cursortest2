package io.intercom.android.sdk.api;

import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;

/* loaded from: classes8.dex */
public class UserUpdater {
    private final Provider<Api> apiProvider;
    private final IntercomDataLayer dataLayer;
    private OpsMetricTracker opsMetricTracker;

    public UserUpdater(Provider<Api> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer) {
        this.apiProvider = provider;
        this.opsMetricTracker = opsMetricTracker;
        this.dataLayer = intercomDataLayer;
    }

    public synchronized void updateUser(UserUpdateRequest userUpdateRequest, IntercomStatusCallback intercomStatusCallback) {
        this.opsMetricTracker.trackEvent("start", OpsMetricTracker.TIME_TO_COMPLETE_PING);
        if (userUpdateRequest.isValidUpdate()) {
            if (userUpdateRequest.isNewSession()) {
                this.dataLayer.updateSessionStarted();
            }
            this.apiProvider.get().updateUser(userUpdateRequest, intercomStatusCallback);
        }
    }
}
