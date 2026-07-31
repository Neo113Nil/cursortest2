package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzaam {
    private final BigInteger zza;

    public static zzaam zza(BigInteger bigInteger, zzch zzchVar) {
        if (zzchVar != null) {
            return new zzaam(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzch zzchVar) {
        if (zzchVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.zza;
    }

    private zzaam(BigInteger bigInteger) {
        this.zza = bigInteger;
    }
}
