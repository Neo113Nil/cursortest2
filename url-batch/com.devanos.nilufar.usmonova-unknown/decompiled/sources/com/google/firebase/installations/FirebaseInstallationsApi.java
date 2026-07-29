package com.google.firebase.installations;

import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import o.MU;

/* loaded from: classes.dex */
public interface FirebaseInstallationsApi {
    MU delete();

    MU getId();

    MU getToken(boolean z);

    @DeferredApi
    FidListenerHandle registerFidListener(FidListener fidListener);
}
