package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgyw {
    zzgyw() {
    }

    public static final List zza(Object obj, long j) {
        zzgyk zzgykVar = (zzgyk) zzhaz.zzh(obj, j);
        if (zzgykVar.zzc()) {
            return zzgykVar;
        }
        int size = zzgykVar.size();
        zzgyk zzf = zzgykVar.zzf(size == 0 ? 10 : size + size);
        zzhaz.zzv(obj, j, zzf);
        return zzf;
    }
}
