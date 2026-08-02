package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzglx {
    public static final zzglo zza = new zzglw(null);

    public static zzglu zza(zzgnj zzgnjVar) {
        zzgea zzgeaVar;
        zzglq zzglqVar = new zzglq();
        zzglqVar.zzb(zzgnjVar.zza());
        Iterator it = zzgnjVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgnh zzgnhVar : (List) it.next()) {
                int zzf = zzgnhVar.zzf() - 2;
                if (zzf == 1) {
                    zzgeaVar = zzgea.zza;
                } else if (zzf == 2) {
                    zzgeaVar = zzgea.zzb;
                } else {
                    if (zzf != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgeaVar = zzgea.zzc;
                }
                int zza2 = zzgnhVar.zza();
                String zze = zzgnhVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zzglqVar.zza(zzgeaVar, zza2, zze, zzgnhVar.zzb().name());
            }
        }
        if (zzgnjVar.zzc() != null) {
            zzglqVar.zzc(zzgnjVar.zzc().zza());
        }
        try {
            return zzglqVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
