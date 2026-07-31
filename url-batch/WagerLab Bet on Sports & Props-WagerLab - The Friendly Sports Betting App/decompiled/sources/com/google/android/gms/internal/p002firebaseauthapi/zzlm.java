package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzlm implements zzlr {
    private final zzdi zza;
    private final int zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlr
    public final int zza() {
        return this.zzb;
    }

    public zzlm(zzdi zzdiVar) {
        this.zza = zzdiVar;
        this.zzb = zzdiVar.zzb() + zzdiVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlr
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr2.length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
        zzba zza = zzzk.zza(zzdd.zze().zza(this.zza).zza(zzaal.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbf.zza())).zzb(zzaal.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzb() + this.zza.zzc()), zzbf.zza())).zza());
        bArr3 = zzln.zza;
        return zza.zza(copyOfRange, bArr3);
    }
}
