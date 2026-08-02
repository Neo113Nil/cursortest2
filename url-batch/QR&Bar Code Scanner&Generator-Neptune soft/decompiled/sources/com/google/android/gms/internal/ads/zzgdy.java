package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgdy implements zzgaq {
    private final zzgbu zza;
    private final zzghn zzb;
    private final zzghn zzc;

    public zzgdy(zzgbu zzgbuVar) {
        zzghn zzghnVar;
        this.zza = zzgbuVar;
        if (zzgbuVar.zzf()) {
            zzgho zzb = zzgfx.zza().zzb();
            zzght zza = zzgfu.zza(zzgbuVar);
            this.zzb = zzb.zza(zza, "daead", "encrypt");
            zzghnVar = zzb.zza(zza, "daead", "decrypt");
        } else {
            zzghnVar = zzgfu.zza;
            this.zzb = zzghnVar;
        }
        this.zzc = zzghnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzc = zzgnv.zzc(this.zza.zza().zzd(), ((zzgaq) this.zza.zza().zzc()).zza(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzc;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
