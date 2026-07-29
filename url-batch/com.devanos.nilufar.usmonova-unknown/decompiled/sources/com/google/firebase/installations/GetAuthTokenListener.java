package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import o.NU;

/* loaded from: classes.dex */
class GetAuthTokenListener implements StateListener {
    private final NU resultTaskCompletionSource;
    private final Utils utils;

    public GetAuthTokenListener(Utils utils, NU nu) {
        this.utils = utils;
        this.resultTaskCompletionSource = nu;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        this.resultTaskCompletionSource.c(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.resultTaskCompletionSource.b(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
