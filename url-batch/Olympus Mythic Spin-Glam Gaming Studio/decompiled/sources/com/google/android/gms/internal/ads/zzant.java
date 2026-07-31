package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzant {
    public static void zza(zzanu zzanuVar, zzany zzanyVar, zzdu zzduVar) {
        for (int i = 0; i < zzanuVar.zza(); i++) {
            long zzb = zzanuVar.zzb(i);
            List zzc = zzanuVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzanuVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzanuVar.zzb(i + 1) - zzanuVar.zzb(i);
                if (zzb2 > 0) {
                    zzduVar.zza(new zzanr(zzc, zzb, zzb2));
                }
            }
        }
    }
}
