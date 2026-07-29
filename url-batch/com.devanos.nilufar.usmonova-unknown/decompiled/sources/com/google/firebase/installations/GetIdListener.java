package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import o.NU;

/* loaded from: classes.dex */
class GetIdListener implements StateListener {
    final NU taskCompletionSource;

    public GetIdListener(NU nu) {
        this.taskCompletionSource = nu;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.taskCompletionSource.d(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
