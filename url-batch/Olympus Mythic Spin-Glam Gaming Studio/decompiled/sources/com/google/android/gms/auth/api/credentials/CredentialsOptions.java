package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@Deprecated
/* loaded from: classes14.dex */
public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = new Builder().build();

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        public CredentialsOptions build() {
            return new CredentialsOptions(this, null);
        }
    }

    /* synthetic */ CredentialsOptions(Builder builder, zbd zbdVar) {
        super(builder);
    }
}
