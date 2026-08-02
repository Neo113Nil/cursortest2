package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzget implements zzgas {
    private static final byte[] zza = new byte[0];
    private final zzglu zzb;
    private final zzgeu zzc;
    private final zzgeq zzd;
    private final zzgep zze;

    private zzget(zzglu zzgluVar, zzgeu zzgeuVar, zzgep zzgepVar, zzgeq zzgeqVar, byte[] bArr) {
        this.zzb = zzgluVar;
        this.zzc = zzgeuVar;
        this.zze = zzgepVar;
        this.zzd = zzgeqVar;
    }

    static zzget zzb(zzglu zzgluVar) throws GeneralSecurityException {
        if (zzgluVar.zzh().zzD()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzglo zzc = zzgluVar.zzc();
        return new zzget(zzgluVar, zzgex.zzb(zzc), zzgex.zzc(zzc), zzgex.zza(zzc), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzglu zzgluVar = this.zzb;
        zzgeu zzgeuVar = this.zzc;
        zzgep zzgepVar = this.zze;
        zzgeq zzgeqVar = this.zzd;
        zzgev zza2 = zzgeuVar.zza(zzgluVar.zzh().zzE());
        zzger zzc = zzger.zzc(zza2.zza(), zza2.zzb(), zzgeuVar, zzgepVar, zzgeqVar, bArr3);
        return zzgnv.zzc(zzc.zza(), zzc.zzb(bArr, zza));
    }
}
