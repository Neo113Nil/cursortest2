package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgbg {
    private final zzgmh zza;

    private zzgbg(zzgmh zzgmhVar) {
        this.zza = zzgmhVar;
    }

    public static zzgbg zzd() {
        return new zzgbg(zzgmk.zzd());
    }

    private final synchronized int zze() {
        int zza;
        zza = zzggq.zza();
        while (zzg(zza)) {
            zza = zzggq.zza();
        }
        return zza;
    }

    private final synchronized zzgmj zzf(zzgmc zzgmcVar) throws GeneralSecurityException {
        return zzh(zzgby.zzc(zzgmcVar), zzgmcVar.zzi());
    }

    private final synchronized boolean zzg(int i) {
        boolean z;
        Iterator it = this.zza.zzc().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((zzgmj) it.next()).zza() == i) {
                z = true;
                break;
            }
        }
        return z;
    }

    private final synchronized zzgmj zzh(zzglx zzglxVar, int i) throws GeneralSecurityException {
        zzgmi zzd;
        int zze = zze();
        if (i == 2) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzd = zzgmj.zzd();
        zzd.zza(zzglxVar);
        zzd.zzb(zze);
        zzd.zzd(3);
        zzd.zzc(i);
        return (zzgmj) zzd.zzam();
    }

    @Deprecated
    public final synchronized int zza(zzgmc zzgmcVar, boolean z) throws GeneralSecurityException {
        zzgmj zzf;
        zzf = zzf(zzgmcVar);
        this.zza.zza(zzf);
        this.zza.zzb(zzf.zza());
        return zzf.zza();
    }

    public final synchronized zzgbf zzb() throws GeneralSecurityException {
        return zzgbf.zza((zzgmk) this.zza.zzam());
    }

    @Deprecated
    public final synchronized zzgbg zzc(zzgmc zzgmcVar) throws GeneralSecurityException {
        zza(zzgmcVar, true);
        return this;
    }
}
