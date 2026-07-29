package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzglk extends zzglm {
    private zzglk() {
        super(null);
    }

    /* synthetic */ zzglk(zzglj zzgljVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    final List zza(Object obj, long j) {
        zzgkx zzgkxVar = (zzgkx) zzgns.zzh(obj, j);
        if (zzgkxVar.zzc()) {
            return zzgkxVar;
        }
        int size = zzgkxVar.size();
        zzgkx zzd = zzgkxVar.zzd(size == 0 ? 10 : size + size);
        zzgns.zzv(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    final void zzb(Object obj, long j) {
        ((zzgkx) zzgns.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    final void zzc(Object obj, Object obj2, long j) {
        zzgkx zzgkxVar = (zzgkx) zzgns.zzh(obj, j);
        zzgkx zzgkxVar2 = (zzgkx) zzgns.zzh(obj2, j);
        int size = zzgkxVar.size();
        int size2 = zzgkxVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgkxVar.zzc()) {
                zzgkxVar = zzgkxVar.zzd(size2 + size);
            }
            zzgkxVar.addAll(zzgkxVar2);
        }
        if (size > 0) {
            zzgkxVar2 = zzgkxVar;
        }
        zzgns.zzv(obj, j, zzgkxVar2);
    }
}
