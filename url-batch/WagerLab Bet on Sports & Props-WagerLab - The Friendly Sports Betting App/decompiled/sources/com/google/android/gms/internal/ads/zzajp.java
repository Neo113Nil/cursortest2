package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzajp {
    public static void zza(zzajq zzajqVar, zzaju zzajuVar, zzdf zzdfVar) {
        for (int i = 0; i < zzajqVar.zza(); i++) {
            long zzb = zzajqVar.zzb(i);
            List zzc = zzajqVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzajqVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzajqVar.zzb(i + 1) - zzajqVar.zzb(i);
                if (zzb2 > 0) {
                    zzdfVar.zza(new zzajn(zzc, zzb, zzb2));
                }
            }
        }
    }
}
