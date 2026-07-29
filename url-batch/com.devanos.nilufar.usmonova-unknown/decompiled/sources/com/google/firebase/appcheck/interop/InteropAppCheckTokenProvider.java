package com.google.firebase.appcheck.interop;

import o.MU;

/* loaded from: classes.dex */
public interface InteropAppCheckTokenProvider {
    void addAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener);

    MU getLimitedUseToken();

    MU getToken(boolean z);

    void removeAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener);
}
