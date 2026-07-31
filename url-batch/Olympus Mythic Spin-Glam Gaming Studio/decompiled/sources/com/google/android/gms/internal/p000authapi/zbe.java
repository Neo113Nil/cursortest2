package com.google.android.gms.internal.p000authapi;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* loaded from: classes6.dex */
public final class zbe implements CredentialRequestResult {
    private final Status zba;

    @Nullable
    private final Credential zbb;

    public zbe(Status status, @Nullable Credential credential) {
        this.zba = status;
        this.zbb = credential;
    }

    @Nullable
    public final Credential getCredential() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zba;
    }
}
