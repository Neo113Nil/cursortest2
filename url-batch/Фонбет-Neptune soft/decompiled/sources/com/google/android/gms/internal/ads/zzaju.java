package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaju {
    public static void zza(zzajv zzajvVar, zzajz zzajzVar, zzdn zzdnVar) {
        for (int i = 0; i < zzajvVar.zza(); i++) {
            long zzb = zzajvVar.zzb(i);
            List zzc = zzajvVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzajvVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzajvVar.zzb(i + 1) - zzajvVar.zzb(i);
                if (zzb2 > 0) {
                    zzdnVar.zza(new zzajs(zzc, zzb, zzb2));
                }
            }
        }
    }
}
