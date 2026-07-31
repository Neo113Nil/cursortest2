package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzaac implements zzsq {
    private final zzsq zza;
    private final zzsq zzb;

    private zzaac(zzsq zzsqVar, zzsq zzsqVar2) {
        this.zza = zzsqVar;
        this.zzb = zzsqVar2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (bArr.length <= 64) {
            return this.zza.zza(bArr, i);
        }
        return this.zzb.zza(bArr, i);
    }
}
