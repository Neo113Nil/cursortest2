package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfzw implements zzghi {
    private final String zza;
    private final int zzb;
    private zzgco zzc;
    private zzgbq zzd;
    private int zze;
    private zzgda zzf;

    zzfzw(zzgfm zzgfmVar) throws GeneralSecurityException {
        String zzf = zzgfmVar.zzf();
        this.zza = zzf;
        if (zzf.equals(zzfxk.zzb)) {
            try {
                zzgcr zze = zzgcr.zze(zzgfmVar.zze(), zzgka.zza());
                this.zzc = (zzgco) zzfxi.zzd(zzgfmVar);
                this.zzb = zze.zza();
                return;
            } catch (zzgla e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (zzf.equals(zzfxk.zza)) {
            try {
                zzgbt zzd = zzgbt.zzd(zzgfmVar.zze(), zzgka.zza());
                this.zzd = (zzgbq) zzfxi.zzd(zzgfmVar);
                this.zze = zzd.zze().zza();
                this.zzb = this.zze + zzd.zzf().zza();
                return;
            } catch (zzgla e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (!zzf.equals(zzfzh.zza)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf)));
        }
        try {
            zzgdd zze2 = zzgdd.zze(zzgfmVar.zze(), zzgka.zza());
            this.zzf = (zzgda) zzfxi.zzd(zzgfmVar);
            this.zzb = zze2.zza();
        } catch (zzgla e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final zzgan zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzfxk.zzb)) {
            zzgcn zzc = zzgco.zzc();
            zzc.zzah(this.zzc);
            zzc.zza(zzgjg.zzw(bArr, 0, this.zzb));
            return new zzgan((zzfwd) zzfxi.zzg(this.zza, (zzgco) zzc.zzaj(), zzfwd.class));
        }
        if (!this.zza.equals(zzfxk.zza)) {
            if (!this.zza.equals(zzfzh.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zzgcz zzc2 = zzgda.zzc();
            zzc2.zzah(this.zzf);
            zzc2.zza(zzgjg.zzw(bArr, 0, this.zzb));
            return new zzgan((zzfwj) zzfxi.zzg(this.zza, (zzgda) zzc2.zzaj(), zzfwj.class));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
        zzgbv zzc3 = zzgbw.zzc();
        zzc3.zzah(this.zzd.zzf());
        zzc3.zza(zzgjg.zzv(copyOfRange));
        zzgbw zzgbwVar = (zzgbw) zzc3.zzaj();
        zzgej zzc4 = zzgek.zzc();
        zzc4.zzah(this.zzd.zzg());
        zzc4.zza(zzgjg.zzv(copyOfRange2));
        zzgek zzgekVar = (zzgek) zzc4.zzaj();
        zzgbp zzc5 = zzgbq.zzc();
        zzc5.zzc(this.zzd.zza());
        zzc5.zza(zzgbwVar);
        zzc5.zzb(zzgekVar);
        return new zzgan((zzfwd) zzfxi.zzg(this.zza, (zzgbq) zzc5.zzaj(), zzfwd.class));
    }
}
