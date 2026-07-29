package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgig implements zzfwv {
    private final zzgbe zza;
    private final int zzb;

    public zzgig(zzgbe zzgbeVar, int i) throws GeneralSecurityException {
        this.zza = zzgbeVar;
        this.zzb = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzgbeVar.zza(new byte[0], i);
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzghf.zzb(zzb(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza(bArr, this.zzb);
    }
}
