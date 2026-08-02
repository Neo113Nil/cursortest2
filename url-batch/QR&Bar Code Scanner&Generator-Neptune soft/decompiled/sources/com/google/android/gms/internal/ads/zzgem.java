package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgem implements zzgny {
    private final String zza;
    private final int zzb;
    private zzgje zzc;
    private zzgig zzd;
    private int zze;
    private zzgjq zzf;

    zzgem(zzgmc zzgmcVar) throws GeneralSecurityException {
        String zzf = zzgmcVar.zzf();
        this.zza = zzf;
        if (zzf.equals(zzgca.zzb)) {
            try {
                zzgjh zze = zzgjh.zze(zzgmcVar.zze(), zzgqq.zza());
                this.zzc = (zzgje) zzgby.zzd(zzgmcVar);
                this.zzb = zze.zza();
                return;
            } catch (zzgrq e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (zzf.equals(zzgca.zza)) {
            try {
                zzgij zzd = zzgij.zzd(zzgmcVar.zze(), zzgqq.zza());
                this.zzd = (zzgig) zzgby.zzd(zzgmcVar);
                this.zze = zzd.zze().zza();
                this.zzb = this.zze + zzd.zzf().zza();
                return;
            } catch (zzgrq e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (!zzf.equals(zzgdx.zza)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf)));
        }
        try {
            zzgjt zze2 = zzgjt.zze(zzgmcVar.zze(), zzgqq.zza());
            this.zzf = (zzgjq) zzgby.zzd(zzgmcVar);
            this.zzb = zze2.zza();
        } catch (zzgrq e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgny
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgny
    public final zzgfi zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzgca.zzb)) {
            zzgjd zzc = zzgje.zzc();
            zzc.zzak(this.zzc);
            zzc.zza(zzgpw.zzw(bArr, 0, this.zzb));
            return new zzgfi((zzgak) zzgby.zzh(this.zza, (zzgje) zzc.zzam(), zzgak.class));
        }
        if (!this.zza.equals(zzgca.zza)) {
            if (!this.zza.equals(zzgdx.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zzgjp zzc2 = zzgjq.zzc();
            zzc2.zzak(this.zzf);
            zzc2.zza(zzgpw.zzw(bArr, 0, this.zzb));
            return new zzgfi((zzgaq) zzgby.zzh(this.zza, (zzgjq) zzc2.zzam(), zzgaq.class));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
        zzgil zzc3 = zzgim.zzc();
        zzc3.zzak(this.zzd.zzf());
        zzc3.zza(zzgpw.zzv(copyOfRange));
        zzgim zzgimVar = (zzgim) zzc3.zzam();
        zzgkz zzc4 = zzgla.zzc();
        zzc4.zzak(this.zzd.zzg());
        zzc4.zza(zzgpw.zzv(copyOfRange2));
        zzgla zzglaVar = (zzgla) zzc4.zzam();
        zzgif zzc5 = zzgig.zzc();
        zzc5.zzc(this.zzd.zza());
        zzc5.zza(zzgimVar);
        zzc5.zzb(zzglaVar);
        return new zzgfi((zzgak) zzgby.zzh(this.zza, (zzgig) zzc5.zzam(), zzgak.class));
    }
}
