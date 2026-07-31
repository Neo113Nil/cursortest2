package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* loaded from: classes5.dex */
public class GoogleSignInResult implements Result {
    private final Status zba;
    private final GoogleSignInAccount zbb;

    public GoogleSignInAccount getSignInAccount() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zba;
    }
}
