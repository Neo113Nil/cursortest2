package com.google.firebase.auth;

import android.net.Uri;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
public interface UserInfo {
    String getDisplayName();

    String getEmail();

    String getPhoneNumber();

    Uri getPhotoUrl();

    String getProviderId();

    String getUid();

    boolean isEmailVerified();
}
