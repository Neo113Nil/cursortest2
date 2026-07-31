package com.google.firebase.auth;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
public abstract class OAuthCredential extends AuthCredential {
    public abstract String getAccessToken();

    public abstract String getIdToken();

    public abstract String getSecret();
}
