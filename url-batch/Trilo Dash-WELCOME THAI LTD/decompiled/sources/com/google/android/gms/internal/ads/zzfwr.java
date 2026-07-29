package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfwr {
    private final zzgfu zza;

    private zzfwr(zzgfu zzgfuVar) {
        this.zza = zzgfuVar;
    }

    static final zzfwr zza(zzgfu zzgfuVar) throws GeneralSecurityException {
        if (zzgfuVar == null || zzgfuVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzfwr(zzgfuVar);
    }

    public static final zzfwr zzb(zzfwp zzfwpVar) throws GeneralSecurityException {
        zzfws zzd = zzfws.zzd();
        zzd.zzc(zzfwpVar.zza());
        return zzd.zzb();
    }

    public final String toString() {
        return zzfxj.zza(this.zza).toString();
    }

    final zzgfu zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzfxi.zze(cls);
        if (zze == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
        zzfxj.zzb(this.zza);
        zzfxa zzc = zzfxa.zzc(zze);
        for (zzgft zzgftVar : this.zza.zzh()) {
            if (zzgftVar.zzi() == 3) {
                zzfwx zza = zzc.zza(zzfxi.zzf(zzgftVar.zzc(), zze), zzgftVar);
                if (zzgftVar.zza() == this.zza.zzc()) {
                    zzc.zzf(zza);
                }
            }
        }
        return zzfxi.zzi(zzc, cls);
    }
}
