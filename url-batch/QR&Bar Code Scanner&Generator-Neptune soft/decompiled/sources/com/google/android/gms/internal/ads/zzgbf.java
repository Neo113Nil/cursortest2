package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgbf {
    private final zzgmk zza;
    private final zzghm zzb = zzghm.zza;

    private zzgbf(zzgmk zzgmkVar) {
        this.zza = zzgmkVar;
    }

    static final zzgbf zza(zzgmk zzgmkVar) throws GeneralSecurityException {
        if (zzgmkVar == null || zzgmkVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzgbf(zzgmkVar);
    }

    public static final zzgbf zzb(zzgbd zzgbdVar) throws GeneralSecurityException {
        zzgbg zzd = zzgbg.zzd();
        zzd.zzc(zzgbdVar.zza());
        return zzd.zzb();
    }

    public final String toString() {
        return zzgbz.zza(this.zza).toString();
    }

    final zzgmk zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzgby.zze(cls);
        if (zze == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
        zzgbz.zzb(this.zza);
        zzgbn zzgbnVar = new zzgbn(zze, null);
        zzgbnVar.zzc(this.zzb);
        for (zzgmj zzgmjVar : this.zza.zzh()) {
            if (zzgmjVar.zzi() == 3) {
                Object zzf = zzgby.zzf(zzgmjVar.zzc(), zze);
                if (zzgmjVar.zza() == this.zza.zzc()) {
                    zzgbnVar.zza(zzf, zzgmjVar);
                } else {
                    zzgbnVar.zzb(zzf, zzgmjVar);
                }
            }
        }
        return zzgby.zzj(zzgbnVar.zzd(), cls);
    }
}
