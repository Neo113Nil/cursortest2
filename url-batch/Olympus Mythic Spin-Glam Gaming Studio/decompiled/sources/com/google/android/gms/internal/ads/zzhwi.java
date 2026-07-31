package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhwi extends zzhyn {
    private final zzhwo zza;
    private final zzicj zzb;

    private zzhwi(zzhwo zzhwoVar, zzicj zzicjVar) {
        this.zza = zzhwoVar;
        this.zzb = zzicjVar;
    }

    public static zzhwi zzc(zzhwo zzhwoVar, zzicj zzicjVar) throws GeneralSecurityException {
        if (zzicjVar.zzd() == 32) {
            if (Arrays.equals(zzhwoVar.zzd().zzc(), zzhmi.zza(zzhmi.zzb(zzicjVar.zzc(zzheq.zza()))))) {
                return new zzhwi(zzhwoVar, zzicjVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        int zzd = zzicjVar.zzd();
        StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 65);
        sb.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb.append(zzd);
        throw new GeneralSecurityException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhyn, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza.zzf();
    }

    public final zzhwh zzd() {
        return this.zza.zzf();
    }

    public final zzhwo zze() {
        return this.zza;
    }

    public final zzicj zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhyn
    public final /* synthetic */ zzhyo zzg() {
        return this.zza;
    }
}
