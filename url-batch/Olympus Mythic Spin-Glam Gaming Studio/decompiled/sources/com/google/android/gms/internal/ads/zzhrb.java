package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhrb {
    public static zzhpn zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzich zzd;
        zzhfb zzc = ((zzhfd) zzhfeVar).zzc();
        zzhof zzhofVar = new zzhof();
        for (int i = 0; i < zzhfeVar.zzd(); i++) {
            zzhfb zze = ((zzhfd) zzhfeVar).zze(i);
            if (zze.zzb().equals(zzheu.zza)) {
                zzhpn zzhpnVar = (zzhpn) zzhopVar.zza(zze);
                zzhes zza = zze.zza();
                if (zza instanceof zzhqb) {
                    zzd = ((zzhqb) zza).zze();
                } else {
                    if (!(zza instanceof zzhne)) {
                        String name = zza.getClass().getName();
                        String valueOf = String.valueOf(zza.zza());
                        StringBuilder sb = new StringBuilder(name.length() + 59 + valueOf.length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzd = ((zzhne) zza).zzd();
                }
                zzhofVar.zza(zzd, zzhpnVar);
            }
        }
        return new zzhra(zzhofVar.zzb(), (zzhpn) zzhopVar.zza(zzc), null);
    }
}
