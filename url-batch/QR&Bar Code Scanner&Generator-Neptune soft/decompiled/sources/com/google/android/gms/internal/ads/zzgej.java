package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgej implements zzgas {
    final zzgbu zza;

    public zzgej(zzgbu zzgbuVar) {
        this.zza = zzgbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgbu zzgbuVar = this.zza;
        if (zzgbuVar.zza() != null) {
            return zzgnv.zzc(zzgbuVar.zza().zzd(), ((zzgas) this.zza.zza().zzc()).zza(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
