package com.google.firebase.auth;

import com.google.firebase.FirebaseException;
import o.AbstractC1473m3;

/* loaded from: classes.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        AbstractC1473m3.k(str);
        this.zza = str;
    }

    public String getErrorCode() {
        return this.zza;
    }
}
