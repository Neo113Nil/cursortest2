package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgad implements zzfwl {
    private static final byte[] zza = new byte[0];
    private final zzgfe zzb;
    private final zzgaa zzc;
    private final zzgam zzd;
    private final zzfzz zze;

    private zzgad(zzgfe zzgfeVar, zzgam zzgamVar, zzfzz zzfzzVar, zzgaa zzgaaVar, byte[] bArr) {
        this.zzb = zzgfeVar;
        this.zzd = zzgamVar;
        this.zze = zzfzzVar;
        this.zzc = zzgaaVar;
    }

    static zzgad zzb(zzgfe zzgfeVar) throws GeneralSecurityException {
        if (zzgfeVar.zzh().zzD()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzgey zzc = zzgfeVar.zzc();
        return new zzgad(zzgfeVar, zzgaf.zzc(zzc), zzgaf.zzb(zzc), zzgaf.zza(zzc), null);
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgfe zzgfeVar = this.zzb;
        zzgam zzgamVar = this.zzd;
        zzfzz zzfzzVar = this.zze;
        zzgaa zzgaaVar = this.zzc;
        zzgae zza2 = zzgamVar.zza(zzgfeVar.zzh().zzE(), zzgil.zzb());
        zzgab zzc = zzgab.zzc(zza2.zza(), zza2.zzb(), zzgamVar, zzfzzVar, zzgaaVar, bArr3);
        return zzghf.zzc(zzc.zza(), zzc.zzb(bArr, zza));
    }
}
