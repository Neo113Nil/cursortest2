package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgeo implements zzgeq {
    zzgeo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final byte[] zzb() {
        return zzgfd.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new zzgdl(bArr).zzd(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
