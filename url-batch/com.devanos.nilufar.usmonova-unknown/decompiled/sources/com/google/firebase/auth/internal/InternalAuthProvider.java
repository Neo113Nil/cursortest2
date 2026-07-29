package com.google.firebase.auth.internal;

import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.internal.InternalTokenProvider;
import o.MU;

/* loaded from: classes.dex */
public interface InternalAuthProvider extends InternalTokenProvider {
    @DeferredApi
    void addIdTokenListener(IdTokenListener idTokenListener);

    @Override // com.google.firebase.internal.InternalTokenProvider
    MU getAccessToken(boolean z);

    @Override // com.google.firebase.internal.InternalTokenProvider
    String getUid();

    void removeIdTokenListener(IdTokenListener idTokenListener);
}
