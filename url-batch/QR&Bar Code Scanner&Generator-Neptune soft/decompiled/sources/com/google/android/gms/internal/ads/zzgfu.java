package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgfu {
    public static final zzghn zza = new zzgft(null);

    public static zzght zza(zzgbu zzgbuVar) {
        zzgbc zzgbcVar;
        zzghp zzghpVar = new zzghp();
        zzghpVar.zzb(zzgbuVar.zzb());
        Iterator it = zzgbuVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgbo zzgboVar : (List) it.next()) {
                int zze = zzgboVar.zze() - 2;
                if (zze == 1) {
                    zzgbcVar = zzgbc.zza;
                } else if (zze == 2) {
                    zzgbcVar = zzgbc.zzb;
                } else {
                    if (zze != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgbcVar = zzgbc.zzc;
                }
                zzghpVar.zza(zzgbcVar, zzgboVar.zza(), zzgboVar.zzb());
            }
        }
        if (zzgbuVar.zza() != null) {
            zzghpVar.zzc(zzgbuVar.zza().zza());
        }
        try {
            return zzghpVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
