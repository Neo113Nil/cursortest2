package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhne extends zzhes {
    private final zzhos zza;

    public zzhne(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        zze(zzhosVar, zzhfrVar);
        this.zza = zzhosVar;
    }

    private static void zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (zzhosVar.zzc().equals(zzhfl.zzb)) {
            return;
        }
        zzhosVar.zzc().equals(zzhfl.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final zzhfj zza() {
        zzhos zzhosVar = this.zza;
        return new zzhnd(zzhosVar.zzg(), zzhosVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhos zzc(zzhfr zzhfrVar) throws GeneralSecurityException {
        zzhos zzhosVar = this.zza;
        zze(zzhosVar, zzhfrVar);
        return zzhosVar;
    }

    public final zzich zzd() throws GeneralSecurityException {
        zzhos zzhosVar = this.zza;
        if (zzhosVar.zzd().equals(zzhfm.zzd)) {
            return zzich.zza(new byte[0]);
        }
        if (zzhosVar.zzd().equals(zzhfm.zzb)) {
            return zzhnx.zzb(zzhosVar.zze().intValue());
        }
        if (zzhosVar.zzd().equals(zzhfm.zzc) || zzhosVar.zzd().equals(zzhfm.zze)) {
            return zzhnx.zza(zzhosVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
