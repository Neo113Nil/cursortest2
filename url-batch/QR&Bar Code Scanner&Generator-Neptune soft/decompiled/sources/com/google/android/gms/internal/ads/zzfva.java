package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfva extends zzfvc {
    zzfva() {
        super(null);
    }

    static final zzfvc zzf(int i) {
        zzfvc zzfvcVar;
        zzfvc zzfvcVar2;
        zzfvc zzfvcVar3;
        if (i < 0) {
            zzfvcVar3 = zzfvc.zzb;
            return zzfvcVar3;
        }
        if (i > 0) {
            zzfvcVar2 = zzfvc.zzc;
            return zzfvcVar2;
        }
        zzfvcVar = zzfvc.zza;
        return zzfvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final zzfvc zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final zzfvc zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final zzfvc zzd(boolean z, boolean z2) {
        return zzf(zzfxr.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final zzfvc zze(boolean z, boolean z2) {
        return zzf(zzfxr.zza(false, false));
    }
}
